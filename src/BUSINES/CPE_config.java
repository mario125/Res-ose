/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINES;


/**
 *
 * @author Mario
 */
public class CPE_config extends CPE{

          String URL_DOC   = "https://ose.efact.pe/api-efact-ose/v1/document";
          String URL_TOKEN = "https://ose.efact.pe/api-efact-ose/oauth/token";
          String URL_CDR   = "https://ose.efact.pe/api-efact-ose/v1/cdr/";
          String URL_XML   = "https://ose.efact.pe/api-efact-ose/v1/xml/";
        
          String userName          = "20505161051";
          String password          = "c4792ca2681ca4bb762400ff12892f78199a382c10b7249e2af6936aa6c234dd";       
          String authorization     = "Y2xpZW50OnNlY3JldA==";

    public CPE_config() {
        
    }


    public String getURL_DOC() {
        return URL_DOC;
    }

    public String getURL_TOKEN() {
        return URL_TOKEN;
    }

    public String getURL_CDR() {
        return URL_CDR;
    }

    public String getURL_XML() {
        return URL_XML;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getAuthorization() {
        return authorization;
    }
       
       
       
       
       
 
    
}
