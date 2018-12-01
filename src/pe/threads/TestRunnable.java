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

public class TestRunnable implements Runnable {

	private String ticket = null;
	private boolean statusOk = false;
	private String accessToken = "";
	private final String usuario;
	private final String password;
	private final String path;
	private String Consulta;
	private final String pathReport;
	private final File folder;
	private final boolean statusdoc=false;
	private final StringBuilder output = new StringBuilder("");
	
	private final String PATH_REPORT = "/home/soporte/Escritorio/NOTAS_CREDITOS.csv";
	private final String PATH_DESTINY = "/home/ffalcon/Documentos/OSE-SEND/";
//	private String DEV_TOKEN = "https://ose-gw1.efact.pe/api-efact-ose/oauth/token";
//	private String DEV_POST_DOCUMENT = "https://ose-gw1.efact.pe/api-efact-ose/v1/document/";
//	private String DEV_CDR  ="https://ose-gw1.efact.pe/api-efact-ose/v1/cdr/";
//	private String DEV_XML ="https://ose-gw1.efact.pe/api-efact-ose/v1/xml/";
//	private String DEV_PDF ="https://ose-gw1.efact.pe/api-efact-ose/v1/pdf/";
	
	private final String DEV_TOKEN = "https://ose-gw1.efact.pe:443/api-efact-ose/oauth/token";
	private final String DEV_POST_DOCUMENT = "https://ose-gw1.efact.pe:443/api-efact-ose/v1/document/";
	private final String DEV_CDR ="https://ose-gw1.efact.pe:443/api-efact-ose/v1/cdr/";
	private final String DEV_XML ="https://ose-gw1.efact.pe:443/api-efact-ose/v1/xml/";
	private final String DEV_PDF ="https://ose-gw1.efact.pe:443/api-efact-ose/v1/pdf/";
	private final String DEV_TICKET ="https://ose-gw1.efact.pe:443/api-efact-ose/v1/ticket/";

	private CloseableHttpClient httpclient = null;
    

	public TestRunnable(String usuario, String password, String path, String pathReport,String ticket2, String Consulta) throws Exception {
		this.usuario = usuario;
		this.password = password;
		this.path = path;
		this.ticket=ticket2;
		this.pathReport = pathReport;
		this.Consulta =Consulta;
		this.folder = new File(this.path);
		token();
	}

	@Override
	public void run() {
		System.out.println("Ejecutando para el usuario : " + this.usuario);
		System.out.println("********************************************");
		try {
			File[] files = folder.listFiles();
			if(this.ticket!=null && this.ticket.equals("") && this.ticket.isEmpty() &&
					this.Consulta!=null && this.Consulta.equals("") && this.Consulta.isEmpty()) {
				System.out.println("No se ingreso ticket>>");
				int c = 1;
				for (File f : files) {
					if(f.getName().endsWith(".xml") || f.getName().endsWith(".csv")|| f.getName().endsWith(".json")) {
						System.err.println(f.getName());
						
						String als= f.getName();
						int s = als.length();
						String Pa = als.substring(0,(s-4));
						System.err.println("Enviado " + c + " de " + files.length + " documentos");
						System.out.println("Enviando archivo : " + Pa.toString() + "- Location : " + f.getAbsolutePath());
						postDocument(f.getName());
						Thread.sleep(10000); 
						getCDR(Pa);
						Thread.sleep(4000);
						getXML(Pa);
						Thread.sleep(4000);
						getPDF(Pa);
						System.out.println("=========================================================================");
						Thread.sleep(300);
						c++;
					}
				}
			}else if(this.Consulta!=null && this.Consulta.equals("") && this.Consulta.isEmpty()){
				System.out.println("Si engreso ticket >>" + this.ticket);
				this.statusOk=true;
				getCDR(null);
				Thread.sleep(4000);
				getXML(null);
				Thread.sleep(4000);
				getPDF(null);
				System.out.println("=========================================================================");
				Thread.sleep(900);
			}else{
				String[] val=this.Consulta.split(",");
				for(int i = 0; i<val.length;i++){
					this.Consulta=val[i].toString();
				System.out.println("Documento en consulta >> "+this.Consulta);
				getTicket(this.Consulta);
				System.out.println("=========================================================================");
				Thread.sleep(900);
				}
			}
			
			FileOutputStream fos = new FileOutputStream(new File(this.pathReport));
			fos.write(this.output.toString().getBytes());
			fos.close();

		} catch (InterruptedException e) {
			// TODO: handle exception
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void token() throws Exception {
		System.out.println("Obteniendo token del usuario PSE : " + this.usuario);
		String resource = DEV_TOKEN;
		httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(resource);
		// Se codifica a base 64 las credenciasles de la aplicación cliente
		// Para las pruebas las credenciales son -> client:secret
		String credentials = Base64.getEncoder().encodeToString("client:secret".getBytes("UTF-8"));
		httpPost.setHeader("Authorization", "Basic " + credentials);

		// Se agregan los datos de autenticación para la plataforma Efact OSE
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair("grant_type", "password"));
		params.add(new BasicNameValuePair("username", this.usuario));
		params.add(new BasicNameValuePair("password", this.password));
		httpPost.setEntity(new UrlEncodedFormEntity(params));

		// Se envía la petición y se recibe el json con el token
		String json = null;
		try {
			json = httpclient.execute(httpPost, new StringResponseHandler());
			// En caso de enviar datos correcto se obtiene el token de
			// autenticación
			ObjectMapper mapper = new ObjectMapper();
			JsonNode rootNodeToker = mapper.readTree(json);
			this.accessToken = rootNodeToker.path("access_token").asText();
			System.out.println("Token Generado : " + this.accessToken);

		} catch (ClientProtocolException e) {
			// En caso de error de autenticación retornará una excepción
			throw new Exception(e);

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

	public void postDocument(String fileName) throws ParseException, IOException {
		// Se establece el cliente POST para el servidor de autenticación
		System.out.println("POST : " + DEV_POST_DOCUMENT);
		this.output.append(fileName).append("|");
		HttpPost post = new HttpPost(DEV_POST_DOCUMENT);

		// Se agrega un Header de autorización con el token recibido por el
		// servidor de autenticación
		post.setHeader("Authorization", "Bearer " + this.accessToken);

		// Se adjuntarán los documentos electrónicos en el body de la petición
		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
		byte[] xml = Files.readAllBytes(Paths.get(this.path + fileName));

		builder.addBinaryBody("file", xml, ContentType.create("text/xml"), fileName);
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

	private void getCDR(String filename) throws IOException {
		if (this.statusOk) {
			System.out.println("GET : "+ DEV_CDR + this.ticket);
			HttpGet httpget = new HttpGet(DEV_CDR + this.ticket);
			// Se agrega un Header de autorización con el token recibido por el
			// servidor de autenticación
			httpget.setHeader("Authorization", "Bearer " + this.accessToken);
			// Se envía la petición a la plataforma Efact OSE
			HttpResponse response = httpclient.execute(httpget);

			// Se valida el código de estado de la petición
			int status = response.getStatusLine().getStatusCode();
			System.out.println("\tSTATUS CODE: " + status);
			HttpEntity entity = response.getEntity();
			
			if (status == 200) {
				if(filename==null || filename.equals(null)) {
					System.out.println("Buscando por ticket");
					File myFile = new File(PATH_DESTINY+"R-"+this.ticket+".xml");
	//				File myFile = new File("/home/adiaz/Escritorio/ose-cdr-dev/"+filename);
					if (entity != null) {
						try (FileOutputStream outstream = new FileOutputStream(myFile);){
						entity.writeTo(outstream);
						this.output.append("CDR : ").append("\n");
						}
					}
				}else {
					File myFile = new File(PATH_DESTINY+"R-"+filename+".xml");
	//				File myFile = new File("/home/adiaz/Escritorio/ose-cdr-dev/"+filename);
					if (entity != null) {
						try (FileOutputStream outstream = new FileOutputStream(myFile);){
							entity.writeTo(outstream);
							this.output.append("CDR : ").append("\n");
						}
					}
				}
			} else {
				String code = null;
				String descripcion = null;
				ObjectMapper mapper = new ObjectMapper();
				// Se obtiene el resultado del response
				String jsonResponse = entity != null ? EntityUtils.toString(entity) : null;
				JsonNode rootNodeResponse = null;
				rootNodeResponse = mapper.readTree(jsonResponse);
				System.out.println("\tERROR");
				code = rootNodeResponse.path("code").asText();
				descripcion = rootNodeResponse.path("description").asText();
				
				descripcion = descripcion.replaceAll(System.getProperty("line.separator")," ");
				this.output.append(code).append("|").append(StringUtils.chomp(descripcion)).append("\n");
				System.out.println("\tCode : " + code);
				System.out.println("\tDescripcion : " + descripcion);
			}
		}
	}
	
	private void getXML(String filename) throws IOException{
		if(this.statusOk) {
			System.out.println("GET : "+ DEV_XML + this.ticket);
			HttpGet httpget = new HttpGet(DEV_XML + this.ticket);
			// Se agrega un Header de autorización con el token recibido por el
			// servidor de autenticación
			httpget.setHeader("Authorization", "Bearer " + this.accessToken);
			// Se envía la petición a la plataforma Efact OSE
			HttpResponse response = httpclient.execute(httpget);

			// Se valida el código de estado de la petición
			int status = response.getStatusLine().getStatusCode();
			System.out.println("\tSTATUS CODE: " + status);
			HttpEntity entity = response.getEntity();
			
			if (status == 200) {
				if(filename==null || filename.equals(null)) {
					System.out.println("Buscando por ticket");
					File myFile = new File(PATH_DESTINY+this.ticket+".xml");
	//				File myFile = new File("/home/adiaz/Escritorio/ose-cdr-dev/"+filename);
					if (entity != null) {
						try (FileOutputStream outstream = new FileOutputStream(myFile);){
						entity.writeTo(outstream);
						this.output.append("CDR : ").append("\n");
						}
					}
				}else {
					File myFile = new File(PATH_DESTINY+filename+".xml");
	//				File myFile = new File("/home/adiaz/Escritorio/ose-cdr-dev/"+filename);
					if (entity != null) {
						try (FileOutputStream outstream = new FileOutputStream(myFile);){
							entity.writeTo(outstream);
							this.output.append("CDR : ").append("\n");
						}
					}
				}
			}
			else {
				String code = null;
				String descripcion = null;
				ObjectMapper mapper = new ObjectMapper();
				// Se obtiene el resultado del response
				String jsonResponse = entity != null ? EntityUtils.toString(entity) : null;
				JsonNode rootNodeResponse = null;
				rootNodeResponse = mapper.readTree(jsonResponse);
				System.out.println("\tERROR");
				code = rootNodeResponse.path("code").asText();
				descripcion = rootNodeResponse.path("description").asText();
				
				descripcion = descripcion.replaceAll(System.getProperty("line.separator")," ");
				this.output.append(code).append("|").append(StringUtils.chomp(descripcion)).append("\n");
				System.out.println("\tCode : " + code);
				System.out.println("\tDescripcion : " + descripcion);
			}
		}
	}
	private void getPDF(String filename) throws IOException{
//		this.statusOk=true;
		if(this.statusOk) {
//			this.ticket="56b238e7-046e-41d5-9df4-a6a8d9f3ca32";
			System.out.println("GET : "+ DEV_PDF + this.ticket);
			HttpGet httpget = new HttpGet(DEV_PDF + this.ticket);
			// Se agrega un Header de autorización con el token recibido por el
			// servidor de autenticación
			httpget.setHeader("Authorization", "Bearer " + this.accessToken);
			// Se envía la petición a la plataforma Efact OSE
			HttpResponse response = httpclient.execute(httpget);

			// Se valida el código de estado de la petición
			int status = response.getStatusLine().getStatusCode();
			System.out.println("\tSTATUS CODE: " + status);
			HttpEntity entity = response.getEntity();
			
			if (status == 200) {
				if(filename==null || filename.equals(null)) {
					System.out.println("Buscando por ticket");
					File myFile = new File(PATH_DESTINY+this.ticket+".pdf");
	//				File myFile = new File("/home/adiaz/Escritorio/ose-cdr-dev/"+filename);
					if (entity != null) {
						try (FileOutputStream outstream = new FileOutputStream(myFile);){
						entity.writeTo(outstream);
						this.output.append("CDR : ").append("\n");
						}
					}
				}else {
					File myFile = new File(PATH_DESTINY+filename+".pdf");
	//				File myFile = new File("/home/adiaz/Escritorio/ose-cdr-dev/"+filename);
					if (entity != null) {
						try (FileOutputStream outstream = new FileOutputStream(myFile);){
							entity.writeTo(outstream);
							this.output.append("CDR : ").append("\n");
						}
					}
				}
			}
			else {
				String code = null;
				String descripcion = null;
				ObjectMapper mapper = new ObjectMapper();
				// Se obtiene el resultado del response
				String jsonResponse = entity != null ? EntityUtils.toString(entity) : null;
				JsonNode rootNodeResponse = null;
				rootNodeResponse = mapper.readTree(jsonResponse);
				System.out.println("\tERROR");
				code = rootNodeResponse.path("code").asText();
				descripcion = rootNodeResponse.path("description").asText();
				
				descripcion = descripcion.replaceAll(System.getProperty("line.separator")," ");
				this.output.append(code).append("|").append(StringUtils.chomp(descripcion)).append("\n");
				System.out.println("\tCode : " + code);
				System.out.println("\tDescripcion : " + descripcion);
			}
		}
	}
	
	private void getTicket(String fileName) throws IOException{
		System.out.println("GET : " + DEV_TICKET+ this.usuario+"-"+this.Consulta);
//		this.output.append(fileName).append("|");
		HttpGet post = new HttpGet(DEV_TICKET+this.Consulta);

		// Se agrega un Header de autorización con el token recibido por el
		// servidor de autenticación
		post.setHeader("Authorization", "Bearer " + this.accessToken);

		// Se adjuntarán los documentos electrónicos en el body de la petición
//		MultipartEntityBuilder builder = MultipartEntityBuilder.create();
//		builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
//		byte[] xml = Files.readAllBytes(Paths.get(this.path + fileName));
//
//		builder.addBinaryBody("file", xml, ContentType.create("text/xml"), fileName);
//		HttpEntity entity = builder.build();
//		post.setEntity(entity);

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
		
		JsonNode rootNodeResponse = mapper.readTree(jsonResponse.replace("[", "").replace("]",""));
		// Se valida que sea el status correcto
		if (status == 200) {
			System.out.println("\tOK");
			this.statusOk = true;
			
			this.ticket=rootNodeResponse.path("tickets").asText();
			System.out.println("\tTicket : " + this.ticket);
			this.getPDF(fileName);
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
}