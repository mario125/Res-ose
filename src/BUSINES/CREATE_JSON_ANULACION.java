/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINES;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class CREATE_JSON_ANULACION extends CPE_BAJA{
      
        private String rutaRAIZ ;//= System.IO.Path.Combine(System.AppDomain.CurrentDomain.BaseDirectory, "");
        private String TOKEN ;
        private String TIKET;
        private String HASH;
        private String XML;
        private String RUC_EMISOR;
        private String SERIE;
        private String json;
        
        private LocalDateTime locaDate = LocalDateTime.now();
        private int hora  = locaDate.getHour();
        private int minutos = locaDate.getMinute();
        private int segundos = locaDate.getSecond();
        

    public CREATE_JSON_ANULACION() {
    }
    public Map<String, String> CREATE_ANULACION_JSON(CPE_BAJA da) throws IOException{
        Map<String, String> diccionario = new LinkedHashMap<>();
        rutaRAIZ=new  File(".").getCanonicalPath()+"\\CPE-SUNAT\\ANULACION\\";
        
        json ="{\n" +
  "        \"_D\" : \"urn:sunat:names:specification:ubl:peru:schema:xsd:VoidedDocuments-1\",\n" +
  "        \"_S\" : \"urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2\",\n" +
  "        \"_B\" : \"urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2\",\n" +
  "        \"_E\" : \"urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2\",\n" +
  "        \"_SUNAT\" : \"urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1\",\n" +
  "        \"VoidedDocuments\" : [ \n" +
  "            {\n" +
  "                \"UBLVersionID\" : [ \n" +
  "                    {\n" +
  "                        \"IdentifierContent\" : \"2.0\"\n" +
  "                    }\n" +
  "                ],\n" +
  "                \"CustomizationID\" : [ \n" +
  "                    {\n" +
  "                        \"IdentifierContent\" : \"1.0\"\n" +
  "                    }\n" +
  "                ],\n" +
  "                \"ID\" : [ \n" +
  "                    {\n" +
  "                        \"IdentifierContent\" : \""; json = json + da.getSERIE() +  "\"\n" +
  "                    }\n" +
  "                ],\n" +
  "                \"ReferenceDate\" : [ \n" +
  "                    {\n" +
  "                        \"DateContent\" : \""; json = json + da.getFECHA_REFERENCIA()+ "\"\n" +
  "                    }\n" +
  "                ],\n" +
  "                \"IssueDate\" : [           \n" +
  "                    {                       \n" +
  "                        \"DateContent\" : \""; json = json + da.getFECHA_BAJA()+          "\"\n" +
  "                    }                        \n" +
  "                ],\n" +
  "                \"Signature\" : [ \n" +
  "                    {\n" +
  "                        \"ID\" : [ \n" +
  "                            {\n" +
  "                                \"IdentifierContent\" : \"IDSignature\"\n" +
  "                            }\n" +
  "                        ],\n" +
  "                        \"SignatoryParty\" : [ \n" +
  "                            {\n" +
  "                                \"PartyIdentification\" : [ \n" +
  "                                    {\n" +
  "                                        \"ID\" : [ \n" +
  "                                            {\n" +
  "                                                \"IdentifierContent\" : \""; json = json + da.getNRO_DOCUMENTO_EMPRESA()+ "\"\n" +
  "                                            }\n" +
  "                                        ]\n" +
  "                                    }\n" +
  "                                ],\n" +
  "                                \"PartyName\" : [ \n" +
  "                                    {\n" +
  "                                        \"Name\" : [ \n" +
  "                                            {\n" +
  "                                                \"TextContent\" : \""; json = json + da.getRAZON_SOCIAL()+ "\"\n" +
  "                                            }\n" +
  "                                        ]\n" +
  "                                    }\n" +
  "                                ]\n" +
  "                            }\n" +
  "                        ],\n" +
  "                        \"DigitalSignatureAttachment\" : [ \n" +
  "                            {\n" +
  "                                \"ExternalReference\" : [ \n" +
  "                                    {\n" +
  "                                        \"URI\" : [ \n" +
  "                                            {\n" +
  "                                                \"TextContent\" : \"IDSignature\"\n" +
  "                                            }\n" +
  "                                        ]\n" +
  "                                    }\n" +
  "                                ]\n" +
  "                            }\n" +
  "                        ]\n" +
  "                    }\n" +
  "                ],\n" +
  "                \"AccountingSupplierParty\" : [ \n" +
  "                    {\n" +
  "                        \"CustomerAssignedAccountID\" : [ \n" +
  "                            {\n" +
  "                                \"IdentifierContent\" : \""; json = json + da.getNRO_DOCUMENTO_EMPRESA() + "\"\n" +
  "                            }\n" +
  "                        ],\n" +
  "                        \"AdditionalAccountID\" : [ \n" +
  "                            {\n" +
  "                                \"IdentifierContent\" : \""; json = json + da.getTIPO_DOCUMENTO()+"\"\n" +
  "                            }\n" +
  "                        ],\n" +
  "                        \"Party\" : [ \n" +
  "                            {\n" +
  "                                \"PostalAddress\" : [ \n" +
  "                                    {\n" +
  "                                        \"ID\" : [ \n" +
  "                                            {\n" +
  "                                                \"IdentifierContent\" : \""; json = json + da.getUBIGEO() + "\"\n" +
  "                                            }\n" +
  "                                        ],\n" +
  "                                        \"StreetName\" : [ \n" +
  "                                            {\n" +
  "                                                \"TextContent\" : \""; json = json + da.getDIRECCION()+ "\"\n" +
  "                                            }\n" +
  "                                        ],\n" +
  "                                        \"CityName\" : [ \n" +
  "                                            {\n" +
  "                                                \"TextContent\" : \""; json = json + da.getDEPARTAMENTO()+ "\"\n" +
  "                                            }\n" +
  "                                        ],\n" +
  "                                        \"CountrySubentity\" : [ \n" +
  "                                            {\n" +
  "                                                \"TextContent\" : \""; json = json + da.getPROVINCIA() + "\"\n" +
  "                                            }\n" +
  "                                        ],\n" +
  "                                        \"District\" : [ \n" +
  "                                            {\n" +
  "                                                \"TextContent\" : \""; json = json + da.getDISTRITO() + "\"\n" +
  "                                            }\n" +
  "                                        ],\n" +
  "                                        \"Country\" : [ \n" +
  "                                            {\n" +
  "                                                \"IdentificationCode\" : [ \n" +
  "                                                    {\n" +
  "                                                        \"CodeContent\" : \"PE\"\n" +
  "                                                    }\n" +
  "                                                ]\n" +
  "                                            }\n" +
  "                                        ]\n" +
  "                                    }\n" +
  "                                ],\n" +
  "                                \"PartyLegalEntity\" : [ \n" +
  "                                    {\n" +
  "                                        \"RegistrationName\" : [ \n" +
  "                                            {\n" +
  "                                                \"TextContent\" : \""; json = json + da.getRAZON_SOCIAL() + "\"\n" +
  "                                            }\n" +
  "                                        ]\n" +
  "                                    }\n" +
  "                                ]\n" +
  "                            }\n" +
  "                        ]\n" +
  "                    }\n" +
  "                ],\n" +
  "                \"VoidedDocumentsLine\" : [ \n" +
  "               {\n";
         String Coma=",";
         String No_Coma="";
         int contador=da.DETALLE.size()-1;
              for (int i = 0; i <= da.DETALLE.size()- 1; i++)
              {
                  json = json + "\n" +
  "                        \"LineID\" : [ \n" +
  "                            {\n" +
  "                                \"IdentifierContent\" : 1\n" +
  "                            }\n" +
  "                        ],\n" +
  "                        \"DocumentTypeCode\" : [ \n" +
  "                            {\n" +
  "                                \"CodeContent\" : \""; json = json + da.DETALLE.get(i).getTIPO_COMPROBANTE()+ "\"\n" +
  "                            }\n" +
  "                        ],\n" +
  "                        \"DocumentSerialID\" : [ \n" +
  "                            {\n" +
  "                                \"TextContent\" : \""; json = json + da.DETALLE.get(i).getSERIE() + "\"\n" +
  "                            }\n" +
  "                        ],\n" +
  "                        \"DocumentNumberID\" : [ \n" +
  "                            {\n" +
  "                                \"TextContent\" : \""; json = json + da.DETALLE.get(i).getNUMERO() + "\"\n" +
  "                            }\n" +
  "                        ],\n" +
  "                        \"VoidReasonDescription\" : [ \n" +
  "                            {\n" +
  "                                \"TextContent\" : \""; json = json + da.DETALLE.get(i).getDESCRIPCION() + "\"\n" +
  "                            }\n" +
  "                        ]\n";
  
                  if (da.DETALLE.size()>1) {
                           
                            if (i!=contador){
                       json=json + Coma;  
                          
                      }else{
                            //System.out.println("Entro");
                           json=json+ "";
                          break;
                            }   
                            
                      }else{
                            json=json+ No_Coma;
                     }//else 
                 
          
                json=json+ "\n" ;
                
             }
             json = json +"}\n" +
  "                ]\n" +
  "            }\n" +
  "        ]\n" +
  "    }";

                BufferedWriter writer = null;
                writer = new BufferedWriter( new FileWriter(rutaRAIZ+"JSON.json"));
                System.out.println ("RUTA DE JSON:"+rutaRAIZ);
                writer.write(json);
                try
                {
                    if ( writer != null)
                        writer.close( );
                }
                catch ( IOException e)
                {
                }
           
                 return diccionario;
    }   
    
}
