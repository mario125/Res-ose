package pe.bean;

public class OseGeneralBean {

	private String urlToken;
	private String urlPostDocument;
	private String urlGetCdr;
	
	public OseGeneralBean (String urlToken, String urlPostDocument, String urlGetCdr){
		this.urlToken = urlToken;
		this.urlPostDocument = urlPostDocument;
		this.urlGetCdr = urlGetCdr;
	}
	
	public OseGeneralBean (){
		
	}
	
	public String getUrlToken() {
		return urlToken;
	}
	public void setUrlToken(String urlToken) {
		this.urlToken = urlToken;
	}
	public String getUrlPostDocument() {
		return urlPostDocument;
	}
	public void setUrlPostDocument(String urlPostDocument) {
		this.urlPostDocument = urlPostDocument;
	}
	public String getUrlGetCdr() {
		return urlGetCdr;
	}
	public void setUrlGetCdr(String urlGetCdr) {
		this.urlGetCdr = urlGetCdr;
	}
}
