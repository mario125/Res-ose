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
import pe.threads.TestRunnable;

public class CREATE_JSON_FACTURA extends CPE_config{
      
        private String rutaRAIZ ;//= System.IO.Path.Combine(System.AppDomain.CurrentDomain.BaseDirectory, "");
        private String TOKEN ;
        private String TIKET;
        private String HASH;
        private String XML;
        private String RUC_EMISOR;
        private String SERIE;
        private String JSON;
        
        private final LocalDateTime locaDate = LocalDateTime.now();
        private final int hora  = locaDate.getHour();
        private final int minutos = locaDate.getMinute();
        private final int segundos = locaDate.getSecond();
         CPE_config config = new CPE_config();
        

    public CREATE_JSON_FACTURA() {
    }
    public Map<String, String> CREATE_FACTURA_BOLERTA_JSON(CPE_config da,String ruta,String nombre) throws IOException, Exception{
        Map<String, String> diccionario = new LinkedHashMap<>();      
        
        JSON ="{\n" +
        "  \"_D\": \"urn:oasis:names:specification:ubl:schema:xsd:Invoice-2\",\n" +
        "  \"_S\": \"urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2\",\n" +
        "  \"_B\": \"urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2\",\n" +
        "  \"_E\": \"urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2\",\n" +
        "  \"Invoice\": [\n" +
        "    {\n" +
        "      \"UBLVersionID\": [\n" +
        "        {\n" +
        "          \"IdentifierContent\": \"2.1\"\n" +
        "        }\n" +
        "      ],\n" +
        "      \"CustomizationID\": [\n" +
        "        {\n" +
        "          \"IdentifierContent\": \"2.0\"\n" +
        "        }\n" +
        "      ],\n" +
        "      \"ProfileID\": [\n" +
        "        {\n" +
        "          \"IdentifierContent\": \"";JSON =JSON+100+"\",\n" +
        "          \"IdentificationSchemeNameText\": \"SUNAT:Identificador de Tipo de Operación\",\n" +
        "          \"IdentificationSchemeAgencyNameText\": \"PE:SUNAT\",\n" +
        "          \"IdentificationSchemeUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo17\"\n" +
        "        }\n" +
        "      ],\n" +
        "      \"ID\": [\n" +
        "        {\n" +
        "          \"IdentifierContent\":\""; JSON = JSON + da.getNRO_COMPROBANTE() +"\"\n" +
        "        }\n" +
        "      ],\n" +
        "      \"IssueDate\": [\n" +
        "        {\n" +
        "          \"DateContent\": \""; JSON = JSON + da.getFECHA_DOCUMENTO() + "\"\n" +
        "        }\n" +
        "      ],\n" +
        "      \"IssueTime\": [\n" +
        "        {\n" +
        "          \"DateTimeContent\": \""; JSON = JSON + hora  + ":"+ minutos +":"+segundos +"\"\n" +
        "        }\n" +
        "      ],\n" +
        "      \"InvoiceTypeCode\": [\n" +
        "        {\n" +
        "          \"CodeContent\": \""; JSON = JSON + da.getCOD_TIPO_DOCUMENTO()+"\",\n" +
        "          \"CodeListSchemeUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo01\",\n" +
        "          \"CodeListNameText\": \"SUNAT:Identificador de Tipo de Documento\",\n" +
        "          \"CodeListAgencyNameText\": \"PE:SUNAT\"\n" +
        "        }\n" +
        "      ],\n" +
        "      \"Note\": [\n" +
        "        {\n" +
        "          \"TextContent\": \""; JSON = JSON +da.getTOTAL_LETRAS()+ "\",\n" +
        "          \"LanguageLocaleIdentifier\": \"1000\"\n" +
        "        }\n" +
        "      ],\n" +
        "      \"DocumentCurrencyCode\": [\n" +
        "        {\n" +
        "          \"CodeContent\": \""; JSON =JSON + da.getCOD_MONEDA() + "\",\n" +
        "          \"CodeListIdentifier\": \"ISO 4217 Alpha\",\n" +
        "          \"CodeListNameText\": \"Currency\",\n" +
        "          \"CodeListAgencyNameText\": \"United Nations Economic Commission for Europe\"\n" +
        "        }\n" +
        "      ],\n" +
        "      \"LineCountNumeric\": [\n" +
        "        {\n" +
        "          \"NumericContent\":"; JSON = JSON + da.getITEMS()+"\n" +
        "        }\n" +
        "      ],\n" +
        "      \"Signature\": [\n" +
        "        {\n" +
        "          \"ID\": [\n" +
        "            {\n" +
        "              \"IdentifierContent\": \"IDSignature\"\n" +
        "            }\n" +
        "          ],\n" +
        "          \"SignatoryParty\": [\n" +
        "            {\n" +
        "              \"PartyIdentification\": [\n" +
        "                {\n" +
        "                  \"ID\": [\n" +
        "                    {\n" +
        "                      \"IdentifierContent\": \""; JSON = JSON + da.getNRO_DOCUMENTO_EMPRESA() + "\"\n" +
        "                    }\n" +
        "                  ]\n" +
        "                }\n" +
        "              ],\n" +
        "              \"PartyName\": [\n" +
        "                {\n" +
        "                  \"Name\": [\n" +
        "                    {\n" +
        "                      \"TextContent\": \"";JSON = JSON + da.getRAZON_SOCIAL_EMPRESA() + "\"\n" +
        "                    }\n" +
        "                  ]\n" +
        "                }\n" +
        "              ]\n" +
        "            }\n" +
        "          ],\n" +
        "          \"DigitalSignatureAttachment\": [\n" +
        "            {\n" +
        "              \"ExternalReference\": [\n" +
        "                {\n" +
        "                  \"URI\": [\n" +
        "                    {\n" +
        "                      \"TextContent\": \"IDSignature\"\n" +
        "                    }\n" +
        "                  ]\n" +
        "                }\n" +
        "              ]\n" +
        "            }\n" +
        "          ]\n" +
        "        }\n" +
        "      ],\n" +
        "      \"AccountingSupplierParty\": [\n" +
        "        {\n" +
        "          \"Party\": [\n" +
        "            {\n" +
        "              \"PartyName\": [\n" +
        "                {\n" +
        "                  \"Name\": [\n" +
        "                    {\n" +
        "                      \"TextContent\": \""; JSON = JSON + da.getNOMBRE_COMERCIAL_EMPRESA()  +  "\"\n" +
        "                    }\n" +
        "                  ]\n" +
        "                }\n" +
        "              ],\n" +
        "              \"PostalAddress\": [\n" +
        "                {\n" +
        "                  \"ID\": [\n" +
        "                    {\n" +
        "                      \"IdentifierContent\": \""; JSON = JSON + da.getCODIGO_UBIGEO_EMPRESA() + "\"\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"StreetName\": [\n" +
        "                    {\n" +
        "                      \"TextContent\": \""; JSON = JSON + da.getDIRECCION_EMPRESA() + "\"\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"CityName\": [\n" +
        "                    {\n" +
        "                      \"TextContent\": \"";JSON = JSON + da.getDEPARTAMENTO_EMPRESA() + "\"\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"CountrySubentity\": [\n" +
        "                    {\n" +
        "                      \"TextContent\": \"";JSON = JSON + da.getPROVINCIA_EMPRESA() + "\"\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"District\": [\n" +
        "                    {\n" +
        "                      \"TextContent\": \""; JSON = JSON + da.getDISTRITO_EMPRESA() + "\"\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"Country\": [\n" +
        "                    {\n" +
        "                      \"IdentificationCode\": [\n" +
        "                        {\n" +
        "                          \"IdentifierContent\": \"";JSON = JSON + da.getCODIGO_PAIS_EMPRESA() + "\"\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ]\n" +
        "                }\n" +
        "              ],\n" +
        "              \"PartyTaxScheme\": [\n" +
        "                {\n" +
        "                  \"RegistrationName\": [\n" +
        "                    {\n" +
        "                      \"TextContent\": \""; JSON = JSON + da.getRAZON_SOCIAL_EMPRESA() + "\"\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"CompanyID\": [\n" +
        "                    {\n" +
        "                      \"IdentifierContent\": \""; JSON = JSON + da.getNRO_DOCUMENTO_EMPRESA() + "\",\n" +
        "                      \"IdentificationSchemeIdentifier\": \""; JSON = JSON + da.getTIPO_DOCUMENTO_EMPRESA() + "\",\n" +
        "                      \"IdentificationSchemeNameText\": \"SUNAT:Identificador de Documento de Identidad\",\n" +
        "                      \"IdentificationSchemeAgencyNameText\": \"PE:SUNAT\",\n" +
        "                      \"IdentificationSchemeUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo06\"\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"RegistrationAddress\": [\n" +
        "                    {\n" +
        "                      \"AddressTypeCode\": [\n" +
        "                        {\n" +
        "                          \"CodeContent\": \"0001\"\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"TaxScheme\": [\n" +
        "                    {\n" +
        "                      \"ID\": [\n" +
        "                        {\n" +
        "                          \"IdentifierContent\": \"-\"\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ]\n" +
        "                }\n" +
        "              ]\n" +
        "            }\n" +
        "          ]\n" +
        "        }\n" +
        "      ],\n" +
        "      \"AccountingCustomerParty\": [\n" +
        "        {\n" +
        "          \"Party\": [\n" +
        "            {\n" +
        "              \"PostalAddress\": [\n" +
        "                {\n" +
        "                  \"ID\": [\n" +
        "                    {\n" +
        "                      \"IdentifierContent\": \"\"\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"StreetName\": [\n" +
        "                    {\n" +
        "                      \"TextContent\": \""; JSON = JSON + da.getDIRECCION_CLIENTE() + "\"\n" +
        "                    }\n" +
        "                  ]\n" +
        "                }\n" +
        "              ],\n" +
        "              \"PartyTaxScheme\": [\n" +
        "                {\n" +
        "                  \"RegistrationName\": [\n" +
        "                    {\n" +
        "                      \"TextContent\": \""; JSON = JSON + da.getRAZON_SOCIAL_CLIENTE() + "\"\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"CompanyID\": [\n" +
        "                    {\n" +
        "                      \"IdentifierContent\": \""; JSON = JSON + da.getNRO_DOCUMENTO_CLIENTE() + "\",\n" +
        "                      \"IdentificationSchemeIdentifier\": \"";JSON = JSON + da.getTIPO_DOCUMENTO_CLIENTE() + "\",\n" +
        "                      \"IdentificationSchemeNameText\": \"SUNAT:Identificador de Documento de Identidad\",\n" +
        "                      \"IdentificationSchemeAgencyNameText\": \"PE:SUNAT\",\n" +
        "                      \"IdentificationSchemeUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo06\"\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"RegistrationAddress\": [\n" +
        "                    {\n" +
        "                      \"AddressTypeCode\": [\n" +
        "                        {\n" +
        "                          \"CodeContent\": \"0001\"\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"TaxScheme\": [\n" +
        "                    {\n" +
        "                      \"ID\": [\n" +
        "                        {\n" +
        "                          \"IdentifierContent\": \"-\"\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ]\n" +
        "                }\n" +
        "              ],\n" +
        "              \"Contact\": [\n" +
        "                {\n" +
        "                  \"ElectronicMail\": [\n" +
        "                    {\n" +
        "                      \"TextContent\": \"fmontes@efact.pe\"\n" +
        "                    }\n" +
        "                  ]\n" +
        "                }\n" +
        "              ]\n" +
        "            }\n" +
        "          ]\n" +
        "        }\n" +
        "      ],\n" +
        "      \"TaxTotal\": [\n" +
        "        {\n" +
        "          \"TaxAmount\": [\n" +
        "            {\n" +
        "              \"AmountContent\": \"";JSON = JSON + da.getTOTAL_IGV() + "\",\n" +
        "              \"AmountCurrencyIdentifier\": \"PEN\"\n" +
        "            }\n" +
        "          ],\n" +
        "          \"TaxSubtotal\": [\n" +
        "            {\n" +
        "              \"TaxableAmount\": [\n" +
        "                {\n" +
        "                  \"AmountContent\": \""; JSON = JSON + da.getSUB_TOTAL() + "\",\n" +
        "                  \"AmountCurrencyIdentifier\": \"PEN\"\n" +
        "                }\n" +
        "              ],\n" +
        "              \"TaxAmount\": [\n" +
        "                {\n" +
        "                  \"AmountContent\": \""; JSON = JSON + da.getTOTAL_IGV() + "\",\n" +
        "                  \"AmountCurrencyIdentifier\": \"PEN\"\n" +
        "                }\n" +
        "              ],\n" +
        "              \"TaxCategory\": [\n" +
        "                {\n" +
        "                  \"ID\": [\n" +
        "                    {\n" +
        "                      \"IdentifierContent\": \"S\",\n" +
        "                      \"IdentificationSchemeIdentifier\": \"UN/ECE 5305\",\n" +
        "                      \"IdentificationSchemeNameText\": \"Tax Category Identifier\",\n" +
        "                      \"IdentificationSchemeAgencyNameText\": \"United Nations Economic Commission for Europe\"\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"Percent\": [\n" +
        "                    {\n" +
        "                      \"NumericContent\": 18\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"TaxScheme\": [\n" +
        "                    {\n" +
        "                      \"ID\": [\n" +
        "                        {\n" +
        "                          \"IdentifierContent\": \"1000\",\n" +
        "                          \"IdentificationSchemeIdentifier\": \"UN/ECE 5153\",\n" +
        "                          \"IdentificationSchemeAgencyIdentifier\": \"6\"\n" +
        "                        }\n" +
        "                      ],\n" +
        "                      \"Name\": [\n" +
        "                        {\n" +
        "                          \"TextContent\": \"IGV\"\n" +
        "                        }\n" +
        "                      ],\n" +
        "                      \"TaxTypeCode\": [\n" +
        "                        {\n" +
        "                          \"CodeContent\": \"VAT\"\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ]\n" +
        "                }\n" +
        "              ]\n" +
        "            }\n" +
        "          ]\n" +
        "        }\n" +
        "      ],\n" +
        "      \"LegalMonetaryTotal\": [\n" +
        "        {\n" +
        "          \"LineExtensionAmount\": [\n" +
        "            {\n" +
        "              \"AmountContent\": \""; JSON = JSON + da.getTOTAL() + "\",\n" +
        "              \"AmountCurrencyIdentifier\": \"PEN\"\n" +
        "            }\n" +
        "          ],\n" +
        "          \"TaxInclusiveAmount\": [\n" +
        "            {\n" +
        "              \"AmountContent\": \"";JSON = JSON + da.getTOTAL_GRAVADAS() + "\",\n" +
        "              \"AmountCurrencyIdentifier\": \""; JSON = JSON + da.getCOD_MONEDA() + "\"\n" +
        "            }\n" +
        "          ],\n" +
        "          \"PayableAmount\": [\n" +
        "            {\n" +
        "              \"AmountContent\": \""; JSON = JSON + da.getTOTAL_GRAVADAS() + "\",\n" +
        "              \"AmountCurrencyIdentifier\": \""; JSON = JSON + da.getCOD_MONEDA() + "\"\n" +
        "            }\n" +
        "          ]\n" +
        "        }\n" +
        "      ],\n" +


        "      \"InvoiceLine\": [\n"; 
        
         String Coma=",";
        String No_Coma="";
         int contador=da.DETALLE.size()-1;

                for (int i = 0; i <= da.DETALLE.size()-1; i++)
                  {
                         //contador=i;
                      System.out.println("Bluce " + i);

                    JSON = JSON +"{\n" +
        "          \"ID\": [\n" +
        "            {\n" +
        "              \"IdentifierContent\":"; JSON=JSON+ da.DETALLE.get(i).getITEM() + "\n" +
        "            }\n" +
        "          ],\n" +
        "          \"Note\": [\n" +
        "            {\n" +
        "              \"TextContent\": \"";JSON = JSON + da.DETALLE.get(i).getUNIDAD_MEDIDA()+ "\"\n" +
        "            }\n" +
        "          ],\n" +
        "          \"InvoicedQuantity\": [\n" +
        "            {\n" +
        "              \"QuantityContent\": \""; JSON = JSON + da.DETALLE.get(i).getCANTIDAD()+ "\",\n" +
        "              \"QuantityUnitCode\": \""; JSON = JSON + da.DETALLE.get(i).getUNIDAD_MEDIDA()+"\",\n" +
        "              \"QuantityUnitCodeListIdentifier\": \"UN/ECE rec 20\",\n" +
        "              \"QuantityUnitCodeListAgencyNameText\": \"United Nations Economic Commission for Europe\"\n" +
        "            }\n" +
        "          ],\n" +
        "          \"LineExtensionAmount\": [\n" +
        "            {\n" +
        "              \"AmountContent\": \""; JSON = JSON + da.DETALLE.get(i).getPRECIO_SIN_IMPUESTO()+ "\",\n" +
        "              \"AmountCurrencyIdentifier\": \"";JSON = JSON + da.getCOD_MONEDA()+ "\"\n" +
        "            }\n" +
        "          ],\n" +
        "          \"PricingReference\": [\n" +
        "            {\n" +
        "              \"AlternativeConditionPrice\": [\n" +
        "                {\n" +
        "                  \"PriceAmount\": [\n" +
        "                    {\n" +
        "                      \"AmountContent\": \""; JSON = JSON + da.DETALLE.get(i).getSUB_TOTAL()+ "\",\n" +
        "                      \"AmountCurrencyIdentifier\":\""; JSON = JSON + da.getCOD_MONEDA()+ "\"\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"PriceTypeCode\": [\n" +
        "                    {\n" +
        "                      \"CodeContent\": \"01\",\n" +
        "                      \"CodeListNameText\": \"SUNAT:Indicador de Tipo de Precio\",\n" +
        "                      \"CodeListAgencyNameText\": \"PE:SUNAT\",\n" +
        "                      \"CodeListUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo16\"\n" +
        "                    }\n" +
        "                  ]\n" +
        "                }\n" +
        "              ]\n" +
        "            }\n" +
        "          ],\n" +
        "          \"TaxTotal\": [\n" +
        "            {\n" +
        "              \"TaxAmount\": [\n" +
        "                {\n" +
        "                  \"AmountContent\": \""; JSON = JSON + da.DETALLE.get(i).getIGV()+ "\",\n" +
        "                  \"AmountCurrencyIdentifier\": \""; JSON = JSON + da.getCOD_MONEDA()+ "\"\n" +
        "                }\n" +
        "              ],\n" +
        "              \"TaxSubtotal\": [\n" +
        "                {\n" +
        "                  \"TaxableAmount\": [\n" +
        "                    {\n" +
        "                      \"AmountContent\": \""; JSON = JSON + da.DETALLE.get(i).getIMPORTE()+ "\",\n" +
        "                      \"AmountCurrencyIdentifier\": \""; JSON = JSON + da.getCOD_MONEDA()+ "\"\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"TaxAmount\": [\n" +
        "                    {\n" +
        "                      \"AmountContent\": \""; JSON = JSON + da.DETALLE.get(i).getIGV()+ "\",\n" +
        "                      \"AmountCurrencyIdentifier\": \""; JSON = JSON + da.getCOD_MONEDA()+ "\"\n" +
        "                    }\n" +
        "                  ],\n" +
        "                  \"TaxCategory\": [\n" +
        "                    {\n" +
        "                      \"ID\": [\n" +
        "                        {\n" +
        "                          \"IdentifierContent\": \"S\",\n" +
        "                          \"IdentificationSchemeIdentifier\": \"UN/ECE 5305\",\n" +
        "                          \"IdentificationSchemeNameText\": \"Tax Category Identifier\",\n" +
        "                          \"IdentificationSchemeAgencyNameText\": \"United Nations Economic Commission for Europe\"\n" +
        "                        }\n" +
        "                      ],\n" +
        "                      \"TaxExemptionReasonCode\": [\n" +
        "                        {\n" +
        "                          \"CodeContent\": \""; JSON = JSON + da.DETALLE.get(i).getCOD_TIPO_OPERACION()+  "\",\n" +
        "                          \"CodeListAgencyNameText\": \"PE:SUNAT\",\n" +
        "                          \"CodeListNameText\": \"SUNAT:Codigo de Tipo de Afectación del IGV\",\n" +
        "                          \"CodeListUniformResourceIdentifier\": \"urn:pe:gob:sunat:cpe:see:gem:catalogos:catalogo07\"\n" +
        "                        }\n" +
        "                      ],\n" +
        "                      \"TaxScheme\": [\n" +
        "                        {\n" +
        "                          \"ID\": [\n" +
        "                            {\n" +
        "                              \"IdentifierContent\": \"1000\",\n" +
        "                              \"IdentificationSchemeIdentifier\": \"UN/ECE 5153\",\n" +
        "                              \"IdentificationSchemeAgencyIdentifier\": \"6\"\n" +
        "                            }\n" +
        "                          ],\n" +
        "                          \"Name\": [\n" +
        "                            {\n" +
        "                              \"TextContent\": \"IGV\"\n" +
        "                            }\n" +
        "                          ],\n" +
        "                          \"TaxTypeCode\": [\n" +
        "                            {\n" +
        "                              \"CodeContent\": \"VAT\"\n" +
        "                            }\n" +
        "                          ]\n" +
        "                        }\n" +
        "                      ]\n" +
        "                    }\n" +
        "                  ]\n" +
        "                }\n" +
        "              ]\n" +
        "            }\n" +
        "          ],\n" +
        "          \"Item\": [\n" +
        "            {\n" +
        "              \"Description\": [\n" +
        "                {\n" +
        "                  \"TextContent\": \"";JSON = JSON + da.DETALLE.get(i).getDESCRIPCION()+ "\"\n" +
        "                }\n" +
        "              ],\n" +
        "              \"SellersItemIdentification\": [\n" +
        "                {\n" +
        "                  \"ID\": [\n" +
        "                    {\n" +
        "                      \"IdentifierContent\": \"";JSON = JSON + da.DETALLE.get(i).getCODIGO()+ "\"\n" +
        "                    }\n" +
        "                  ]\n" +
        "                }\n" +
        "              ]\n" +
        "            }\n" +
        "          ],\n" +
        "          \"Price\": [\n" +
        "            {\n" +
        "              \"PriceAmount\": [\n" +
        "                {\n" +
        "                  \"AmountContent\": \""; JSON = JSON + da.DETALLE.get(i).getPRECIO()+ "\",\n" +
        "                  \"AmountCurrencyIdentifier\": \"PEN\"\n" +
        "                }\n" +
        "              ]\n" +
        "            }\n" +
        "          ]\n" +
        "        }\n" ;
                 
 if (da.DETALLE.size()>1) {
                           
                            if (i!=contador){
                                System.out.println("SI COMA");
                                JSON=JSON + Coma;  
                          
                                }else{
                                    System.out.println("NO COMA");
                                    JSON=JSON+ "";
                                break;
                                 }   
                            
                            }else{
                             //       System.out.println("NO COMA");
                            JSON=JSON+ No_Coma;
                            }//else 
                 
          
                JSON=JSON+ "\n" ;

                }

         JSON = JSON +"      ]\n" +
        "    }\n" +
        "  ]\n" +
        "}";

                BufferedWriter writer = null;
                String proceso="null";
                writer = new BufferedWriter( new FileWriter(ruta+nombre));
                System.out.println ("RUTA DE JSON:"+ruta+nombre);
                writer.write(JSON);
                try
                {
                    if ( writer != null){
                        writer.close( );
                        proceso="ok";
                    }                      
                    
                }
                catch ( IOException e)
                {
                }
                diccionario.put("url",ruta+nombre);
                diccionario.put("msj",proceso);  
           
                 return diccionario;
    }
    public Map<String, String> CREATE_DOC(CPE_config da,String ruta,String nombre) throws IOException, Exception{
        Map<String, String> diccionario = new LinkedHashMap<>();
        diccionario=CREATE_FACTURA_BOLERTA_JSON(da,ruta,nombre);
        
        return diccionario;
    }
        

    
    
}
