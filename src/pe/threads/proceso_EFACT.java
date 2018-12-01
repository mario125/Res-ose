/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.threads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.UnsupportedEncodingException;
import BUSINES.CPE_config;
/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class proceso_EFACT {   
    private String TOKEN;
     
	private CloseableHttpClient httpclient = null;
        private boolean statusOk = false;
        private String ticket=null;
        private final StringBuilder output = new StringBuilder("");
        CPE_config config = new CPE_config();

 

    public proceso_EFACT() {
    }
    
    public   String GET_TOKEN() throws UnsupportedEncodingException, IOException, Exception{
                System.out.println("OBTENIENDO TOKEN PARA USUARIO: " + config.getUserName());		
		httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(config.getURL_TOKEN());		
		httpPost.setHeader("Authorization", "Basic " + config.getAuthorization());
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("grant_type", "password"));
		params.add(new BasicNameValuePair("username", config.getUserName()));
		params.add(new BasicNameValuePair("password", config.getPassword()));
		httpPost.setEntity(new UrlEncodedFormEntity(params));
		String json = null;
		try {
			json = httpclient.execute(httpPost, new StringResponseHandler());			
			ObjectMapper mapper = new ObjectMapper();
			JsonNode rootNodeToker = mapper.readTree(json);
			TOKEN = rootNodeToker.path("access_token").asText();
			System.out.println("Token Generado : " + TOKEN);
                        return TOKEN;
		} catch (ClientProtocolException e) {			
			return null;
		}       
    }
    public void postDocument(String accesstoken ,String path, String filename) throws ParseException, IOException {
		// Se establece el cliente POST para el servidor de autenticación
		
		this.output.append(filename).append("|");
		HttpPost post = new HttpPost(config.getURL_DOC());

		// Se agrega un Header de autorización con el token recibido por el
		// servidor de autenticación
		post.setHeader("Authorization", "Bearer " + accesstoken);

		// Se adjuntarán los documentos electrónicos en el body de la petición
		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		byte[] xml = Files.readAllBytes(Paths.get(path + filename));

		builder.addBinaryBody("file", xml, ContentType.create("text/xml"), filename);
		HttpEntity entity = builder.build();
		post.setEntity(entity);

		// se envía el documento electrónico a la plataforma Efact OSE
		HttpResponse response = httpclient.execute(post);

		// Se valida el código de estado de la petición
		int status = response.getStatusLine().getStatusCode();
		String msj = response.getStatusLine().getReasonPhrase();
		System.out.println("\tResponse : Status Code: " + status + " | Msj : " + msj);
		// Se valida que sea el status correcto
		ObjectMapper mapper = new ObjectMapper();

		HttpEntity entity2 = response.getEntity();
		String code = null;
		// Se obtiene el resultado del response
		String jsonResponse = entity2 != null ? EntityUtils.toString(entity2) : null;
		JsonNode rootNodeResponse = mapper.readTree(jsonResponse);
		// Se valida que sea el status correcto
		if (status == 200) {
			System.out.println("\tOK");
			this.statusOk = true;
			code = rootNodeResponse.path("code").asText();
			this.ticket = rootNodeResponse.path("description").asText();
			if (code.equals("0")){
				this.output.append(code).append("|").append(this.ticket).append("|");
			} else {
				this.output.append(code).append("|").append(this.ticket).append("|").append("\n");
			}
			System.out.println("\tCode : " + code);
			System.out.println("\tTicket : " + this.ticket);
		} else {
			this.statusOk = false;
			System.out.println("        ERROR");
			code = rootNodeResponse.path("code").asText();
			this.ticket = rootNodeResponse.path("description").asText();
			this.output.append("CODE : ").append(code).append("|").append(this.ticket).append("|").append("\n");
			System.out.println("\tCode : " + code);
			System.out.println("\tDescripcion : " + this.ticket);
		}
	}

    private static class StringResponseHandler implements ResponseHandler<String> {
		@Override
		public String handleResponse(HttpResponse response) throws IOException {
			int status = response.getStatusLine().getStatusCode();
			if (status >= 200 && status < 300) {
				HttpEntity entity = response.getEntity();
				return entity != null ? EntityUtils.toString(entity) : null;
			} else {
				throw new ClientProtocolException("Unexpected response status: " + status);
			}
		}
	}
    

    
        

   
        
    

}
