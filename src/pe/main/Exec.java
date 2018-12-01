package pe.main;

import BUSINES.CPE_DETALLE;
import BUSINES.CPE_config;
import pe.threads.TestRunnable;
import BUSINES.CREATE_JSON_FACTURA;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.threads.proceso_EFACT;

public class Exec {
    
  
     

	public static void main(String[] args) throws Exception {
            INIT ini = new INIT();
            ini.show();
            String mensaje;            
            String ruta_doc;
            String _token_;



 CREATE_JSON_FACTURA DE = new CREATE_JSON_FACTURA();
 

 
 
 
 
 
 
 
 
        DE.setTIPO_OPERACION             ("");        
        DE.setNRO_GUIA_REMISION          ("");                               
        DE.setCOD_GUIA_REMISION          ("");                               
        DE.setNRO_OTR_COMPROBANTE        ("");                               
        DE.setCOD_OTR_COMPROBANTE        ("");                               
                             
        //==============PARA PLAA DE VEHICULO=============

//        DE.setPLACA_VEHICULO             ("");                               
//        //========================DATOS NOTA CREDITO/NOTA DEBITO==
//        DE.setTIPO_COMPROBANTE_MODIFICA  ("");                               
//        DE.setNRO_DOCUMENTO_MODIFICA     ("");                               
//        DE.setCOD_TIPO_MOTIVO            ("");                               
//        DE.setDESCRIPCION_MOTIVO         ("");                               
        //========================DATOS DEL CIENTE================
       
        
 //========================DATOS DE LA EMPRESA    ================
        DE.setNRO_DOCUMENTO_EMPRESA      ("10447915125");                               
        DE.setTIPO_DOCUMENTO_EMPRESA     ("6");                             // obligatorio------------------------------1=dni 6=ruc                            
        DE.setNOMBRE_COMERCIAL_EMPRESA   ("JUANITO PEREZ LUNADO");          //  nombre comercial------------------------------= "-"                   
        DE.setCODIGO_UBIGEO_EMPRESA      ("151050");                        // obligatorio------------------------------1=dni 6=ruc       
        DE.setDIRECCION_EMPRESA          ("DIRECION PRUEBA");                // obligatorio------------------------------1=dni 6=ruc
        DE.setTELEFONO_PRINCIPAL         ("917-615-990");                // obligatorio------------------------------1=dni 6=ruc
        DE.setDEPARTAMENTO_EMPRESA       ("LIMA");                               // obligatorio------------------------------1=dni 6=ruc
        DE.setPROVINCIA_EMPRESA          ("LIMA");                               // obligatorio------------------------------1=dni 6=ruc
        DE.setDISTRITO_EMPRESA           ("SURCO");                              // obligatorio------------------------------1=dni 6=ruc
        DE.setCODIGO_PAIS_EMPRESA        ("PE");                               // obligatorio------------------------------1=dni 6=ruc
        DE.setRAZON_SOCIAL_EMPRESA       ("SCIMIC TECHNOLOGIES SAC");           // obligatorio------------------------------1=dni 6=ruc
        DE.setTIPO_PROCESO (2);   
         CPE_DETALLE DETALLE = new CPE_DETALLE();
        ArrayList<CPE_DETALLE> detalle = new ArrayList<>();
        for (int i = 0; i < 2-1; i++) {
            DETALLE = new CPE_DETALLE();            
            DETALLE.setITEM                (i+1); //
            DETALLE.setUNIDAD_MEDIDA       ("NIU"); //
            DETALLE.setCANTIDAD            (2); //
            DETALLE.setPRECIO              (2); //
            DETALLE.setIMPORTE             (2); //
            DETALLE.setPRECIO_TIPO_CODIGO  ("01"); 
            DETALLE.setIGV                 (2); //
            DETALLE.setISC                 (0); 
            DETALLE.setCOD_TIPO_OPERACION  (""); // exonerada = 20 and not is =10
            DETALLE.setCODIGO              (""); //
            DETALLE.setDESCRIPCION         (""); //
            DETALLE.setSUB_TOTAL           (12); //
            DETALLE.setPRECIO_SIN_IMPUESTO (12);   //   
            detalle.add(DETALLE);
        }
          DE.DETALLE = detalle;
           Map<String, String> diccionario = new LinkedHashMap<>();
    try {
        //CREAR O OBTENER RUTA DE CARPETAS PARA DOCUMENTOS
        
        ruta_doc = ruta_directorio("f");   
        String nombre_ar=DE.getNRO_DOCUMENTO_EMPRESA()+"-"+DE.getCOD_TIPO_DOCUMENTO()+"-"+DE.getNRO_COMPROBANTE();
        diccionario= DE.CREATE_DOC(DE,ruta_doc,nombre_ar);       
       if("ok".equals(diccionario.get("msj"))){
           proceso_EFACT pro = new proceso_EFACT();
           _token_= pro.GET_TOKEN();
           if(_token_!=null){
               String envio = "";
               
           }else{
               String envio = "TOKEN NO GENERADO";
           }
           
           
       }
       
       
       
    } catch (IOException ex) {
      
    }
      
       
	}
        
        
        
        
        
         public static String ruta_directorio(String doc) throws IOException{
             String  ruta=new  File(".").getCanonicalPath()+"\\CPE-SUNAT\\";  
            if("f".equals(doc)){
               ruta=ruta+"JSON_FACTURAS\\";
                File folder = new File(ruta);                
                if (folder.exists()) {                     
                    return ruta;
                }else{
                    folder.mkdirs();
                    return ruta;
                }
            }
            if("b".equals(doc)){
                 ruta=ruta+"JSON_BOLETAS\\";
                File folder = new File(ruta);                
                if (folder.exists()) {                     
                    return ruta;
                }else{
                    folder.mkdirs();
                    return ruta;
                }              
                
            }
            if("nc".equals(doc)){
                 ruta=ruta+"JSON_NOTA_CREDITO\\";
                File folder = new File(ruta);                
                if (folder.exists()) {                     
                    return ruta;
                }else{
                    folder.mkdirs();
                    return ruta;
                }                
            }
            if("nd".equals(doc)){
                 ruta=ruta+"JSON_NOTA_DEBITO\\";
                File folder = new File(ruta);                
                if (folder.exists()) {                     
                    return ruta;
                }else{
                    folder.mkdirs();
                    return ruta;
                }                
                
            }            
            return "";
        }
        
       
}