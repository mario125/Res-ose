/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINES;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Mario
 */
public class CPE {
        private int       ID                   ;   
        private int       ITEMS                ;   
        private String    TIPO_OPERACION       ;
        private String    FECHA_REGISTRO       ;
        private int       ID_EMPRESA           ;  
        private int       ID_CLIENTE_CPE       ;   
        private String    TOTAL_GRAVADAS       ;
        private double    TOTAL_INAFECTA       ;
        private double    TOTAL_EXONERADAS     ;
        private double    TOTAL_GRATUITAS      ;
        private double    TOTAL_PERCEPCIONES   ;
        private double    TOTAL_RETENCIONES    ;
        private double    TOTAL_DETRACCIONES   ;
        private double    TOTAL_BONIFICACIONES ;
        private double    TOTAL_DESCUENTO      ;
        private String    SUB_TOTAL            ;
        private String    TOTAL_IGV            ;
        private double    TOTAL_ISC            ;
        private double    TOTAL_OTR_IMP        ;
        private double    TOTAL                ;
        
        private String TOTAL_LETRAS                   ;
        private String NRO_GUIA_REMISION              ;
        private String COD_GUIA_REMISION              ;
        private String NRO_OTR_COMPROBANTE            ;
        private String COD_OTR_COMPROBANTE            ;
        private String OBS_DOC                        ;
        private String HASH_DOC                      ;
        private String TIPO_COMPROBANTE_MODIFICA    ;
        private String NRO_DOCUMENTO_MODIFICA            ;
        private String COD_TIPO_MOTIVO              ;
        private String DESCRIPCION_MOTIVO                ;
        private String NRO_COMPROBANTE               ;
        private String FECHA_DOCUMENTO               ;
        private String COD_TIPO_DOCUMENTO            ;
        private String COD_MONEDA                       ;
        private String NRO_DOCUMENTO_CLIENTE             ;
        private String COD_SUNAT                        ;
        private String RAZON_SOCIAL_CLIENTE              ;
        private String TIPO_DOCUMENTO_CLIENTE            ;
        private String DIRECCION_CLIENTE                ;
        private String CIUDAD_CLIENTE                   ;
        private String COD_PAIS_CLIENTE                  ;
        private String NRO_DOCUMENTO_EMPRESA            ;
        private String TIPO_DOC                         ;
        
        private String TIPO_DOCUMENTO_EMPRESA                               ;
        private String NOMBRE_COMERCIAL_EMPRESA                                  ;
        private String CODIGO_UBIGEO_EMPRESA                                  ;
        private String DIRECCION_EMPRESA                                  ;
        private String DEPARTAMENTO_EMPRESA                                  ;
        private String PROVINCIA_EMPRESA                                 ;
        private String DISTRITO_EMPRESA                                ;
        private String CODIGO_PAIS_EMPRESA                                ;
        private String RAZON_SOCIAL_EMPRESA                                  ;
        private String LOGO_EMP                               ;
        private String FIRMA_EMP                                  ;
        private String WEB_EMP                               ;
        private String USUARIO_SOL_EMPRESA                               ;
        private String PASS_SOL_EMPRESA                               ;
        private String CONTRA                                     ;
        private String CONTRA_FIRMA                   ;
        private String COD_RESPUESTA_SUNAT               ;
        private String DESCRIPCION_RESPUESTA                 ;
        private String PLACA_VEHICULO                        ;
        private String NRO_COMPROBANTE_REF_ANT                   ;
        private String MONEDA_REGU_ANTICIPO                      ;
        private String TIPO_DOCUMENTO_EMP_REGU_ANT                ;
        private String NRO_DOCUMENTO_EMP_REGU_ANT                 ;
        private String ESTADO                            ;
        private String HASH_CPE                                  ;
        private String HASH_CDR                              ;
        private String ID_USUARIO                                ;       
        private String FECHA_VTO                             ;
        private String TELEFONO_PRINCIPAL                                 ;
        private String COD_SUCURSAL                                  ;
        private String DIRECCION_SUCURSAL                    ;
        private String TELEFONO_SUCURSAL                             ;
        private String FORMA_PAGO                                    ;
        private String GLOSA                                 ;
        private String SERIE                                                 ;
        private String NUMERO                                                        ;
        private String RUTA_PDF                                                          ;
        private String RUTA_PDF_2_NUVE                                   ;
        private String ESTADO_DE_DOC                             ;
        private String RUTA_CODIGO_BARRA                         ;
        
        private double MONTO_REGU_ANTICIPO                     ;
        private int  TIPO_PROCESO                   ;        
        private int  FLG_ANTICIPO                   ;
        private int  FLG_REGU_ANTICIPO              ;                  
        private int  TIPO                   ;        
        private int  ID_FORMA_PAGO                  ;
        private int  ID_ALMACEN                     ;      
        private int  ID_REFERENCIA                  ;
        private String  DEPARTAMENTO_CLIENTE                  ;
        private String  PROVINCCIA_CLIENTE                  ;
        private String  DISTRITO_CLIENTE                  ;
        private String  UBIGEO_CLIENTE                  ;
         private String  NOMBRE_DOC                  ;
          private String  VENDEDOR                  ;
    
        public List<CPE_DETALLE> DETALLE;// = new ArrayList<>();

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getITEMS() {
        return ITEMS;
    }

    public void setITEMS(int ITEMS) {
        this.ITEMS = ITEMS;
    }

    public String getTIPO_OPERACION() {
        return TIPO_OPERACION;
    }

    public void setTIPO_OPERACION(String TIPO_OPERACION) {
        this.TIPO_OPERACION = TIPO_OPERACION;
    }

    public String getFECHA_REGISTRO() {
        return FECHA_REGISTRO;
    }

    public void setFECHA_REGISTRO(String FECHA_REGISTRO) {
        this.FECHA_REGISTRO = FECHA_REGISTRO;
    }

    public int getID_EMPRESA() {
        return ID_EMPRESA;
    }

    public void setID_EMPRESA(int ID_EMPRESA) {
        this.ID_EMPRESA = ID_EMPRESA;
    }

    public int getID_CLIENTE_CPE() {
        return ID_CLIENTE_CPE;
    }

    public void setID_CLIENTE_CPE(int ID_CLIENTE_CPE) {
        this.ID_CLIENTE_CPE = ID_CLIENTE_CPE;
    }

    public String getTOTAL_GRAVADAS() {
        return TOTAL_GRAVADAS;
    }

    public void setTOTAL_GRAVADAS(String TOTAL_GRAVADAS) {
        this.TOTAL_GRAVADAS = TOTAL_GRAVADAS;
    }

    public double getTOTAL_INAFECTA() {
        return TOTAL_INAFECTA;
    }

    public void setTOTAL_INAFECTA(double TOTAL_INAFECTA) {
        this.TOTAL_INAFECTA = TOTAL_INAFECTA;
    }

    public double getTOTAL_EXONERADAS() {
        return TOTAL_EXONERADAS;
    }

    public void setTOTAL_EXONERADAS(double TOTAL_EXONERADAS) {
        this.TOTAL_EXONERADAS = TOTAL_EXONERADAS;
    }

    public double getTOTAL_GRATUITAS() {
        return TOTAL_GRATUITAS;
    }

    public void setTOTAL_GRATUITAS(double TOTAL_GRATUITAS) {
        this.TOTAL_GRATUITAS = TOTAL_GRATUITAS;
    }

    public double getTOTAL_PERCEPCIONES() {
        return TOTAL_PERCEPCIONES;
    }

    public void setTOTAL_PERCEPCIONES(double TOTAL_PERCEPCIONES) {
        this.TOTAL_PERCEPCIONES = TOTAL_PERCEPCIONES;
    }

    public double getTOTAL_RETENCIONES() {
        return TOTAL_RETENCIONES;
    }

    public void setTOTAL_RETENCIONES(double TOTAL_RETENCIONES) {
        this.TOTAL_RETENCIONES = TOTAL_RETENCIONES;
    }

    public double getTOTAL_DETRACCIONES() {
        return TOTAL_DETRACCIONES;
    }

    public void setTOTAL_DETRACCIONES(double TOTAL_DETRACCIONES) {
        this.TOTAL_DETRACCIONES = TOTAL_DETRACCIONES;
    }

    public double getTOTAL_BONIFICACIONES() {
        return TOTAL_BONIFICACIONES;
    }

    public void setTOTAL_BONIFICACIONES(double TOTAL_BONIFICACIONES) {
        this.TOTAL_BONIFICACIONES = TOTAL_BONIFICACIONES;
    }

    public double getTOTAL_DESCUENTO() {
        return TOTAL_DESCUENTO;
    }

    public void setTOTAL_DESCUENTO(double TOTAL_DESCUENTO) {
        this.TOTAL_DESCUENTO = TOTAL_DESCUENTO;
    }

    public String getSUB_TOTAL() {
        return SUB_TOTAL;
    }

    public void setSUB_TOTAL(String SUB_TOTAL) {
        this.SUB_TOTAL = SUB_TOTAL;
    }

    public String getTOTAL_IGV() {
        return TOTAL_IGV;
    }

    public void setTOTAL_IGV(String TOTAL_IGV) {
        this.TOTAL_IGV = TOTAL_IGV;
    }

    public double getTOTAL_ISC() {
        return TOTAL_ISC;
    }

    public void setTOTAL_ISC(double TOTAL_ISC) {
        this.TOTAL_ISC = TOTAL_ISC;
    }

    public double getTOTAL_OTR_IMP() {
        return TOTAL_OTR_IMP;
    }

    public void setTOTAL_OTR_IMP(double TOTAL_OTR_IMP) {
        this.TOTAL_OTR_IMP = TOTAL_OTR_IMP;
    }

    public double getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(double TOTAL) {
        this.TOTAL = TOTAL;
    }

    public String getTOTAL_LETRAS() {
        return TOTAL_LETRAS;
    }

    public void setTOTAL_LETRAS(String TOTAL_LETRAS) {
        this.TOTAL_LETRAS = TOTAL_LETRAS;
    }

    public String getNRO_GUIA_REMISION() {
        return NRO_GUIA_REMISION;
    }

    public void setNRO_GUIA_REMISION(String NRO_GUIA_REMISION) {
        this.NRO_GUIA_REMISION = NRO_GUIA_REMISION;
    }

    public String getCOD_GUIA_REMISION() {
        return COD_GUIA_REMISION;
    }

    public void setCOD_GUIA_REMISION(String COD_GUIA_REMISION) {
        this.COD_GUIA_REMISION = COD_GUIA_REMISION;
    }

    public String getNRO_OTR_COMPROBANTE() {
        return NRO_OTR_COMPROBANTE;
    }

    public void setNRO_OTR_COMPROBANTE(String NRO_OTR_COMPROBANTE) {
        this.NRO_OTR_COMPROBANTE = NRO_OTR_COMPROBANTE;
    }

    public String getCOD_OTR_COMPROBANTE() {
        return COD_OTR_COMPROBANTE;
    }

    public void setCOD_OTR_COMPROBANTE(String COD_OTR_COMPROBANTE) {
        this.COD_OTR_COMPROBANTE = COD_OTR_COMPROBANTE;
    }

    public String getOBS_DOC() {
        return OBS_DOC;
    }

    public void setOBS_DOC(String OBS_DOC) {
        this.OBS_DOC = OBS_DOC;
    }

    public String getHASH_DOC() {
        return HASH_DOC;
    }

    public void setHASH_DOC(String HASH_DOC) {
        this.HASH_DOC = HASH_DOC;
    }

    public String getTIPO_COMPROBANTE_MODIFICA() {
        return TIPO_COMPROBANTE_MODIFICA;
    }

    public void setTIPO_COMPROBANTE_MODIFICA(String TIPO_COMPROBANTE_MODIFICA) {
        this.TIPO_COMPROBANTE_MODIFICA = TIPO_COMPROBANTE_MODIFICA;
    }

    public String getNRO_DOCUMENTO_MODIFICA() {
        return NRO_DOCUMENTO_MODIFICA;
    }

    public void setNRO_DOCUMENTO_MODIFICA(String NRO_DOCUMENTO_MODIFICA) {
        this.NRO_DOCUMENTO_MODIFICA = NRO_DOCUMENTO_MODIFICA;
    }

    public String getCOD_TIPO_MOTIVO() {
        return COD_TIPO_MOTIVO;
    }

    public void setCOD_TIPO_MOTIVO(String COD_TIPO_MOTIVO) {
        this.COD_TIPO_MOTIVO = COD_TIPO_MOTIVO;
    }

    public String getDESCRIPCION_MOTIVO() {
        return DESCRIPCION_MOTIVO;
    }

    public void setDESCRIPCION_MOTIVO(String DESCRIPCION_MOTIVO) {
        this.DESCRIPCION_MOTIVO = DESCRIPCION_MOTIVO;
    }

    public String getNRO_COMPROBANTE() {
        return NRO_COMPROBANTE;
    }

    public void setNRO_COMPROBANTE(String NRO_COMPROBANTE) {
        this.NRO_COMPROBANTE = NRO_COMPROBANTE;
    }

    public String getFECHA_DOCUMENTO() {
        return FECHA_DOCUMENTO;
    }

    public void setFECHA_DOCUMENTO(String FECHA_DOCUMENTO) {
        this.FECHA_DOCUMENTO = FECHA_DOCUMENTO;
    }

    public String getCOD_TIPO_DOCUMENTO() {
        return COD_TIPO_DOCUMENTO;
    }

    public void setCOD_TIPO_DOCUMENTO(String COD_TIPO_DOCUMENTO) {
        this.COD_TIPO_DOCUMENTO = COD_TIPO_DOCUMENTO;
    }

    public String getCOD_MONEDA() {
        return COD_MONEDA;
    }

    public void setCOD_MONEDA(String COD_MONEDA) {
        this.COD_MONEDA = COD_MONEDA;
    }

    public String getNRO_DOCUMENTO_CLIENTE() {
        return NRO_DOCUMENTO_CLIENTE;
    }

    public void setNRO_DOCUMENTO_CLIENTE(String NRO_DOCUMENTO_CLIENTE) {
        this.NRO_DOCUMENTO_CLIENTE = NRO_DOCUMENTO_CLIENTE;
    }

    public String getCOD_SUNAT() {
        return COD_SUNAT;
    }

    public void setCOD_SUNAT(String COD_SUNAT) {
        this.COD_SUNAT = COD_SUNAT;
    }

    public String getRAZON_SOCIAL_CLIENTE() {
        return RAZON_SOCIAL_CLIENTE;
    }

    public void setRAZON_SOCIAL_CLIENTE(String RAZON_SOCIAL_CLIENTE) {
        this.RAZON_SOCIAL_CLIENTE = RAZON_SOCIAL_CLIENTE;
    }

    public String getTIPO_DOCUMENTO_CLIENTE() {
        return TIPO_DOCUMENTO_CLIENTE;
    }

    public void setTIPO_DOCUMENTO_CLIENTE(String TIPO_DOCUMENTO_CLIENTE) {
        this.TIPO_DOCUMENTO_CLIENTE = TIPO_DOCUMENTO_CLIENTE;
    }

    public String getDIRECCION_CLIENTE() {
        return DIRECCION_CLIENTE;
    }

    public void setDIRECCION_CLIENTE(String DIRECCION_CLIENTE) {
        this.DIRECCION_CLIENTE = DIRECCION_CLIENTE;
    }

    public String getCIUDAD_CLIENTE() {
        return CIUDAD_CLIENTE;
    }

    public void setCIUDAD_CLIENTE(String CIUDAD_CLIENTE) {
        this.CIUDAD_CLIENTE = CIUDAD_CLIENTE;
    }

    public String getCOD_PAIS_CLIENTE() {
        return COD_PAIS_CLIENTE;
    }

    public void setCOD_PAIS_CLIENTE(String COD_PAIS_CLIENTE) {
        this.COD_PAIS_CLIENTE = COD_PAIS_CLIENTE;
    }

    public String getNRO_DOCUMENTO_EMPRESA() {
        return NRO_DOCUMENTO_EMPRESA;
    }

    public void setNRO_DOCUMENTO_EMPRESA(String NRO_DOCUMENTO_EMPRESA) {
        this.NRO_DOCUMENTO_EMPRESA = NRO_DOCUMENTO_EMPRESA;
    }

    public String getTIPO_DOC() {
        return TIPO_DOC;
    }

    public void setTIPO_DOC(String TIPO_DOC) {
        this.TIPO_DOC = TIPO_DOC;
    }

    public String getTIPO_DOCUMENTO_EMPRESA() {
        return TIPO_DOCUMENTO_EMPRESA;
    }

    public void setTIPO_DOCUMENTO_EMPRESA(String TIPO_DOCUMENTO_EMPRESA) {
        this.TIPO_DOCUMENTO_EMPRESA = TIPO_DOCUMENTO_EMPRESA;
    }

    public String getNOMBRE_COMERCIAL_EMPRESA() {
        return NOMBRE_COMERCIAL_EMPRESA;
    }

    public void setNOMBRE_COMERCIAL_EMPRESA(String NOMBRE_COMERCIAL_EMPRESA) {
        this.NOMBRE_COMERCIAL_EMPRESA = NOMBRE_COMERCIAL_EMPRESA;
    }

    public String getCODIGO_UBIGEO_EMPRESA() {
        return CODIGO_UBIGEO_EMPRESA;
    }

    public void setCODIGO_UBIGEO_EMPRESA(String CODIGO_UBIGEO_EMPRESA) {
        this.CODIGO_UBIGEO_EMPRESA = CODIGO_UBIGEO_EMPRESA;
    }

    public String getDIRECCION_EMPRESA() {
        return DIRECCION_EMPRESA;
    }

    public void setDIRECCION_EMPRESA(String DIRECCION_EMPRESA) {
        this.DIRECCION_EMPRESA = DIRECCION_EMPRESA;
    }

    public String getDEPARTAMENTO_EMPRESA() {
        return DEPARTAMENTO_EMPRESA;
    }

    public void setDEPARTAMENTO_EMPRESA(String DEPARTAMENTO_EMPRESA) {
        this.DEPARTAMENTO_EMPRESA = DEPARTAMENTO_EMPRESA;
    }

    public String getPROVINCIA_EMPRESA() {
        return PROVINCIA_EMPRESA;
    }

    public void setPROVINCIA_EMPRESA(String PROVINCIA_EMPRESA) {
        this.PROVINCIA_EMPRESA = PROVINCIA_EMPRESA;
    }

    public String getDISTRITO_EMPRESA() {
        return DISTRITO_EMPRESA;
    }

    public void setDISTRITO_EMPRESA(String DISTRITO_EMPRESA) {
        this.DISTRITO_EMPRESA = DISTRITO_EMPRESA;
    }

    public String getCODIGO_PAIS_EMPRESA() {
        return CODIGO_PAIS_EMPRESA;
    }

    public void setCODIGO_PAIS_EMPRESA(String CODIGO_PAIS_EMPRESA) {
        this.CODIGO_PAIS_EMPRESA = CODIGO_PAIS_EMPRESA;
    }

    public String getRAZON_SOCIAL_EMPRESA() {
        return RAZON_SOCIAL_EMPRESA;
    }

    public void setRAZON_SOCIAL_EMPRESA(String RAZON_SOCIAL_EMPRESA) {
        this.RAZON_SOCIAL_EMPRESA = RAZON_SOCIAL_EMPRESA;
    }

    public String getLOGO_EMP() {
        return LOGO_EMP;
    }

    public void setLOGO_EMP(String LOGO_EMP) {
        this.LOGO_EMP = LOGO_EMP;
    }

    public String getFIRMA_EMP() {
        return FIRMA_EMP;
    }

    public void setFIRMA_EMP(String FIRMA_EMP) {
        this.FIRMA_EMP = FIRMA_EMP;
    }

    public String getWEB_EMP() {
        return WEB_EMP;
    }

    public void setWEB_EMP(String WEB_EMP) {
        this.WEB_EMP = WEB_EMP;
    }

    public String getUSUARIO_SOL_EMPRESA() {
        return USUARIO_SOL_EMPRESA;
    }

    public void setUSUARIO_SOL_EMPRESA(String USUARIO_SOL_EMPRESA) {
        this.USUARIO_SOL_EMPRESA = USUARIO_SOL_EMPRESA;
    }

    public String getPASS_SOL_EMPRESA() {
        return PASS_SOL_EMPRESA;
    }

    public void setPASS_SOL_EMPRESA(String PASS_SOL_EMPRESA) {
        this.PASS_SOL_EMPRESA = PASS_SOL_EMPRESA;
    }

    public String getCONTRA() {
        return CONTRA;
    }

    public void setCONTRA(String CONTRA) {
        this.CONTRA = CONTRA;
    }

    public String getCONTRA_FIRMA() {
        return CONTRA_FIRMA;
    }

    public void setCONTRA_FIRMA(String CONTRA_FIRMA) {
        this.CONTRA_FIRMA = CONTRA_FIRMA;
    }

    public String getCOD_RESPUESTA_SUNAT() {
        return COD_RESPUESTA_SUNAT;
    }

    public void setCOD_RESPUESTA_SUNAT(String COD_RESPUESTA_SUNAT) {
        this.COD_RESPUESTA_SUNAT = COD_RESPUESTA_SUNAT;
    }

    public String getDESCRIPCION_RESPUESTA() {
        return DESCRIPCION_RESPUESTA;
    }

    public void setDESCRIPCION_RESPUESTA(String DESCRIPCION_RESPUESTA) {
        this.DESCRIPCION_RESPUESTA = DESCRIPCION_RESPUESTA;
    }

    public String getPLACA_VEHICULO() {
        return PLACA_VEHICULO;
    }

    public void setPLACA_VEHICULO(String PLACA_VEHICULO) {
        this.PLACA_VEHICULO = PLACA_VEHICULO;
    }

    public String getNRO_COMPROBANTE_REF_ANT() {
        return NRO_COMPROBANTE_REF_ANT;
    }

    public void setNRO_COMPROBANTE_REF_ANT(String NRO_COMPROBANTE_REF_ANT) {
        this.NRO_COMPROBANTE_REF_ANT = NRO_COMPROBANTE_REF_ANT;
    }

    public String getMONEDA_REGU_ANTICIPO() {
        return MONEDA_REGU_ANTICIPO;
    }

    public void setMONEDA_REGU_ANTICIPO(String MONEDA_REGU_ANTICIPO) {
        this.MONEDA_REGU_ANTICIPO = MONEDA_REGU_ANTICIPO;
    }

    public String getTIPO_DOCUMENTO_EMP_REGU_ANT() {
        return TIPO_DOCUMENTO_EMP_REGU_ANT;
    }

    public void setTIPO_DOCUMENTO_EMP_REGU_ANT(String TIPO_DOCUMENTO_EMP_REGU_ANT) {
        this.TIPO_DOCUMENTO_EMP_REGU_ANT = TIPO_DOCUMENTO_EMP_REGU_ANT;
    }

    public String getNRO_DOCUMENTO_EMP_REGU_ANT() {
        return NRO_DOCUMENTO_EMP_REGU_ANT;
    }

    public void setNRO_DOCUMENTO_EMP_REGU_ANT(String NRO_DOCUMENTO_EMP_REGU_ANT) {
        this.NRO_DOCUMENTO_EMP_REGU_ANT = NRO_DOCUMENTO_EMP_REGU_ANT;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public String getHASH_CPE() {
        return HASH_CPE;
    }

    public void setHASH_CPE(String HASH_CPE) {
        this.HASH_CPE = HASH_CPE;
    }

    public String getHASH_CDR() {
        return HASH_CDR;
    }

    public void setHASH_CDR(String HASH_CDR) {
        this.HASH_CDR = HASH_CDR;
    }

    public String getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(String ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    public String getFECHA_VTO() {
        return FECHA_VTO;
    }

    public void setFECHA_VTO(String FECHA_VTO) {
        this.FECHA_VTO = FECHA_VTO;
    }

    public String getTELEFONO_PRINCIPAL() {
        return TELEFONO_PRINCIPAL;
    }

    public void setTELEFONO_PRINCIPAL(String TELEFONO_PRINCIPAL) {
        this.TELEFONO_PRINCIPAL = TELEFONO_PRINCIPAL;
    }

    public String getCOD_SUCURSAL() {
        return COD_SUCURSAL;
    }

    public void setCOD_SUCURSAL(String COD_SUCURSAL) {
        this.COD_SUCURSAL = COD_SUCURSAL;
    }

    public String getDIRECCION_SUCURSAL() {
        return DIRECCION_SUCURSAL;
    }

    public void setDIRECCION_SUCURSAL(String DIRECCION_SUCURSAL) {
        this.DIRECCION_SUCURSAL = DIRECCION_SUCURSAL;
    }

    public String getTELEFONO_SUCURSAL() {
        return TELEFONO_SUCURSAL;
    }

    public void setTELEFONO_SUCURSAL(String TELEFONO_SUCURSAL) {
        this.TELEFONO_SUCURSAL = TELEFONO_SUCURSAL;
    }

    public String getFORMA_PAGO() {
        return FORMA_PAGO;
    }

    public void setFORMA_PAGO(String FORMA_PAGO) {
        this.FORMA_PAGO = FORMA_PAGO;
    }

    public String getGLOSA() {
        return GLOSA;
    }

    public void setGLOSA(String GLOSA) {
        this.GLOSA = GLOSA;
    }

    public String getSERIE() {
        return SERIE;
    }

    public void setSERIE(String SERIE) {
        this.SERIE = SERIE;
    }

    public String getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(String NUMERO) {
        this.NUMERO = NUMERO;
    }

    public String getRUTA_PDF() {
        return RUTA_PDF;
    }

    public void setRUTA_PDF(String RUTA_PDF) {
        this.RUTA_PDF = RUTA_PDF;
    }

    public String getRUTA_PDF_2_NUVE() {
        return RUTA_PDF_2_NUVE;
    }

    public void setRUTA_PDF_2_NUVE(String RUTA_PDF_2_NUVE) {
        this.RUTA_PDF_2_NUVE = RUTA_PDF_2_NUVE;
    }

    public String getESTADO_DE_DOC() {
        return ESTADO_DE_DOC;
    }

    public void setESTADO_DE_DOC(String ESTADO_DE_DOC) {
        this.ESTADO_DE_DOC = ESTADO_DE_DOC;
    }

    public String getRUTA_CODIGO_BARRA() {
        return RUTA_CODIGO_BARRA;
    }

    public void setRUTA_CODIGO_BARRA(String RUTA_CODIGO_BARRA) {
        this.RUTA_CODIGO_BARRA = RUTA_CODIGO_BARRA;
    }

    public double getMONTO_REGU_ANTICIPO() {
        return MONTO_REGU_ANTICIPO;
    }

    public void setMONTO_REGU_ANTICIPO(double MONTO_REGU_ANTICIPO) {
        this.MONTO_REGU_ANTICIPO = MONTO_REGU_ANTICIPO;
    }

    public int getTIPO_PROCESO() {
        return TIPO_PROCESO;
    }

    public void setTIPO_PROCESO(int TIPO_PROCESO) {
        this.TIPO_PROCESO = TIPO_PROCESO;
    }

    public int getFLG_ANTICIPO() {
        return FLG_ANTICIPO;
    }

    public void setFLG_ANTICIPO(int FLG_ANTICIPO) {
        this.FLG_ANTICIPO = FLG_ANTICIPO;
    }

    public int getFLG_REGU_ANTICIPO() {
        return FLG_REGU_ANTICIPO;
    }

    public void setFLG_REGU_ANTICIPO(int FLG_REGU_ANTICIPO) {
        this.FLG_REGU_ANTICIPO = FLG_REGU_ANTICIPO;
    }

    public int getTIPO() {
        return TIPO;
    }

    public void setTIPO(int TIPO) {
        this.TIPO = TIPO;
    }

    public int getID_FORMA_PAGO() {
        return ID_FORMA_PAGO;
    }

    public void setID_FORMA_PAGO(int ID_FORMA_PAGO) {
        this.ID_FORMA_PAGO = ID_FORMA_PAGO;
    }

    public int getID_ALMACEN() {
        return ID_ALMACEN;
    }

    public void setID_ALMACEN(int ID_ALMACEN) {
        this.ID_ALMACEN = ID_ALMACEN;
    }

    public int getID_REFERENCIA() {
        return ID_REFERENCIA;
    }

    public void setID_REFERENCIA(int ID_REFERENCIA) {
        this.ID_REFERENCIA = ID_REFERENCIA;
    }

    public String getDEPARTAMENTO_CLIENTE() {
        return DEPARTAMENTO_CLIENTE;
    }

    public void setDEPARTAMENTO_CLIENTE(String DEPARTAMENTO_CLIENTE) {
        this.DEPARTAMENTO_CLIENTE = DEPARTAMENTO_CLIENTE;
    }

    public String getPROVINCCIA_CLIENTE() {
        return PROVINCCIA_CLIENTE;
    }

    public void setPROVINCCIA_CLIENTE(String PROVINCCIA_CLIENTE) {
        this.PROVINCCIA_CLIENTE = PROVINCCIA_CLIENTE;
    }

    public String getDISTRITO_CLIENTE() {
        return DISTRITO_CLIENTE;
    }

    public void setDISTRITO_CLIENTE(String DISTRITO_CLIENTE) {
        this.DISTRITO_CLIENTE = DISTRITO_CLIENTE;
    }

    public String getUBIGEO_CLIENTE() {
        return UBIGEO_CLIENTE;
    }

    public void setUBIGEO_CLIENTE(String UBIGEO_CLIENTE) {
        this.UBIGEO_CLIENTE = UBIGEO_CLIENTE;
    }

    public String getNOMBRE_DOC() {
        return NOMBRE_DOC;
    }

    public void setNOMBRE_DOC(String NOMBRE_DOC) {
        this.NOMBRE_DOC = NOMBRE_DOC;
    }

    public String getVENDEDOR() {
        return VENDEDOR;
    }

    public void setVENDEDOR(String VENDEDOR) {
        this.VENDEDOR = VENDEDOR;
    }

    public List<CPE_DETALLE> getDETALLE() {
        return DETALLE;
    }

    public void setDETALLE(List<CPE_DETALLE> DETALLE) {
        this.DETALLE = DETALLE;
    }
    public CPE(){
        
    }

    public CPE(int ID, int ITEMS, String TIPO_OPERACION, String FECHA_REGISTRO, int ID_EMPRESA, int ID_CLIENTE_CPE, String TOTAL_GRAVADAS, double TOTAL_INAFECTA, double TOTAL_EXONERADAS, double TOTAL_GRATUITAS, double TOTAL_PERCEPCIONES, double TOTAL_RETENCIONES, double TOTAL_DETRACCIONES, double TOTAL_BONIFICACIONES, double TOTAL_DESCUENTO, String SUB_TOTAL, String TOTAL_IGV, double TOTAL_ISC, double TOTAL_OTR_IMP, double TOTAL, String TOTAL_LETRAS, String NRO_GUIA_REMISION, String COD_GUIA_REMISION, String NRO_OTR_COMPROBANTE, String COD_OTR_COMPROBANTE, String OBS_DOC, String HASH_DOC, String TIPO_COMPROBANTE_MODIFICA, String NRO_DOCUMENTO_MODIFICA, String COD_TIPO_MOTIVO, String DESCRIPCION_MOTIVO, String NRO_COMPROBANTE, String FECHA_DOCUMENTO, String COD_TIPO_DOCUMENTO, String COD_MONEDA, String NRO_DOCUMENTO_CLIENTE, String COD_SUNAT, String RAZON_SOCIAL_CLIENTE, String TIPO_DOCUMENTO_CLIENTE, String DIRECCION_CLIENTE, String CIUDAD_CLIENTE, String COD_PAIS_CLIENTE, String NRO_DOCUMENTO_EMPRESA, String TIPO_DOC, String TIPO_DOCUMENTO_EMPRESA, String NOMBRE_COMERCIAL_EMPRESA, String CODIGO_UBIGEO_EMPRESA, String DIRECCION_EMPRESA, String DEPARTAMENTO_EMPRESA, String PROVINCIA_EMPRESA, String DISTRITO_EMPRESA, String CODIGO_PAIS_EMPRESA, String RAZON_SOCIAL_EMPRESA, String LOGO_EMP, String FIRMA_EMP, String WEB_EMP, String USUARIO_SOL_EMPRESA, String PASS_SOL_EMPRESA, String CONTRA, String CONTRA_FIRMA, String COD_RESPUESTA_SUNAT, String DESCRIPCION_RESPUESTA, String PLACA_VEHICULO, String NRO_COMPROBANTE_REF_ANT, String MONEDA_REGU_ANTICIPO, String TIPO_DOCUMENTO_EMP_REGU_ANT, String NRO_DOCUMENTO_EMP_REGU_ANT, String ESTADO, String HASH_CPE, String HASH_CDR, String ID_USUARIO, String FECHA_VTO, String TELEFONO_PRINCIPAL, String COD_SUCURSAL, String DIRECCION_SUCURSAL, String TELEFONO_SUCURSAL, String FORMA_PAGO, String GLOSA, String SERIE, String NUMERO, String RUTA_PDF, String RUTA_PDF_2_NUVE, String ESTADO_DE_DOC, String RUTA_CODIGO_BARRA, double MONTO_REGU_ANTICIPO, int TIPO_PROCESO, int FLG_ANTICIPO, int FLG_REGU_ANTICIPO, int TIPO, int ID_FORMA_PAGO, int ID_ALMACEN, int ID_REFERENCIA, String DEPARTAMENTO_CLIENTE, String PROVINCCIA_CLIENTE, String DISTRITO_CLIENTE, String UBIGEO_CLIENTE, String NOMBRE_DOC, String VENDEDOR, List<CPE_DETALLE> DETALLE) {
        this.ID = ID;
        this.ITEMS = ITEMS;
        this.TIPO_OPERACION = TIPO_OPERACION;
        this.FECHA_REGISTRO = FECHA_REGISTRO;
        this.ID_EMPRESA = ID_EMPRESA;
        this.ID_CLIENTE_CPE = ID_CLIENTE_CPE;
        this.TOTAL_GRAVADAS = TOTAL_GRAVADAS;
        this.TOTAL_INAFECTA = TOTAL_INAFECTA;
        this.TOTAL_EXONERADAS = TOTAL_EXONERADAS;
        this.TOTAL_GRATUITAS = TOTAL_GRATUITAS;
        this.TOTAL_PERCEPCIONES = TOTAL_PERCEPCIONES;
        this.TOTAL_RETENCIONES = TOTAL_RETENCIONES;
        this.TOTAL_DETRACCIONES = TOTAL_DETRACCIONES;
        this.TOTAL_BONIFICACIONES = TOTAL_BONIFICACIONES;
        this.TOTAL_DESCUENTO = TOTAL_DESCUENTO;
        this.SUB_TOTAL = SUB_TOTAL;
        this.TOTAL_IGV = TOTAL_IGV;
        this.TOTAL_ISC = TOTAL_ISC;
        this.TOTAL_OTR_IMP = TOTAL_OTR_IMP;
        this.TOTAL = TOTAL;
        this.TOTAL_LETRAS = TOTAL_LETRAS;
        this.NRO_GUIA_REMISION = NRO_GUIA_REMISION;
        this.COD_GUIA_REMISION = COD_GUIA_REMISION;
        this.NRO_OTR_COMPROBANTE = NRO_OTR_COMPROBANTE;
        this.COD_OTR_COMPROBANTE = COD_OTR_COMPROBANTE;
        this.OBS_DOC = OBS_DOC;
        this.HASH_DOC = HASH_DOC;
        this.TIPO_COMPROBANTE_MODIFICA = TIPO_COMPROBANTE_MODIFICA;
        this.NRO_DOCUMENTO_MODIFICA = NRO_DOCUMENTO_MODIFICA;
        this.COD_TIPO_MOTIVO = COD_TIPO_MOTIVO;
        this.DESCRIPCION_MOTIVO = DESCRIPCION_MOTIVO;
        this.NRO_COMPROBANTE = NRO_COMPROBANTE;
        this.FECHA_DOCUMENTO = FECHA_DOCUMENTO;
        this.COD_TIPO_DOCUMENTO = COD_TIPO_DOCUMENTO;
        this.COD_MONEDA = COD_MONEDA;
        this.NRO_DOCUMENTO_CLIENTE = NRO_DOCUMENTO_CLIENTE;
        this.COD_SUNAT = COD_SUNAT;
        this.RAZON_SOCIAL_CLIENTE = RAZON_SOCIAL_CLIENTE;
        this.TIPO_DOCUMENTO_CLIENTE = TIPO_DOCUMENTO_CLIENTE;
        this.DIRECCION_CLIENTE = DIRECCION_CLIENTE;
        this.CIUDAD_CLIENTE = CIUDAD_CLIENTE;
        this.COD_PAIS_CLIENTE = COD_PAIS_CLIENTE;
        this.NRO_DOCUMENTO_EMPRESA = NRO_DOCUMENTO_EMPRESA;
        this.TIPO_DOC = TIPO_DOC;
        this.TIPO_DOCUMENTO_EMPRESA = TIPO_DOCUMENTO_EMPRESA;
        this.NOMBRE_COMERCIAL_EMPRESA = NOMBRE_COMERCIAL_EMPRESA;
        this.CODIGO_UBIGEO_EMPRESA = CODIGO_UBIGEO_EMPRESA;
        this.DIRECCION_EMPRESA = DIRECCION_EMPRESA;
        this.DEPARTAMENTO_EMPRESA = DEPARTAMENTO_EMPRESA;
        this.PROVINCIA_EMPRESA = PROVINCIA_EMPRESA;
        this.DISTRITO_EMPRESA = DISTRITO_EMPRESA;
        this.CODIGO_PAIS_EMPRESA = CODIGO_PAIS_EMPRESA;
        this.RAZON_SOCIAL_EMPRESA = RAZON_SOCIAL_EMPRESA;
        this.LOGO_EMP = LOGO_EMP;
        this.FIRMA_EMP = FIRMA_EMP;
        this.WEB_EMP = WEB_EMP;
        this.USUARIO_SOL_EMPRESA = USUARIO_SOL_EMPRESA;
        this.PASS_SOL_EMPRESA = PASS_SOL_EMPRESA;
        this.CONTRA = CONTRA;
        this.CONTRA_FIRMA = CONTRA_FIRMA;
        this.COD_RESPUESTA_SUNAT = COD_RESPUESTA_SUNAT;
        this.DESCRIPCION_RESPUESTA = DESCRIPCION_RESPUESTA;
        this.PLACA_VEHICULO = PLACA_VEHICULO;
        this.NRO_COMPROBANTE_REF_ANT = NRO_COMPROBANTE_REF_ANT;
        this.MONEDA_REGU_ANTICIPO = MONEDA_REGU_ANTICIPO;
        this.TIPO_DOCUMENTO_EMP_REGU_ANT = TIPO_DOCUMENTO_EMP_REGU_ANT;
        this.NRO_DOCUMENTO_EMP_REGU_ANT = NRO_DOCUMENTO_EMP_REGU_ANT;
        this.ESTADO = ESTADO;
        this.HASH_CPE = HASH_CPE;
        this.HASH_CDR = HASH_CDR;
        this.ID_USUARIO = ID_USUARIO;
        this.FECHA_VTO = FECHA_VTO;
        this.TELEFONO_PRINCIPAL = TELEFONO_PRINCIPAL;
        this.COD_SUCURSAL = COD_SUCURSAL;
        this.DIRECCION_SUCURSAL = DIRECCION_SUCURSAL;
        this.TELEFONO_SUCURSAL = TELEFONO_SUCURSAL;
        this.FORMA_PAGO = FORMA_PAGO;
        this.GLOSA = GLOSA;
        this.SERIE = SERIE;
        this.NUMERO = NUMERO;
        this.RUTA_PDF = RUTA_PDF;
        this.RUTA_PDF_2_NUVE = RUTA_PDF_2_NUVE;
        this.ESTADO_DE_DOC = ESTADO_DE_DOC;
        this.RUTA_CODIGO_BARRA = RUTA_CODIGO_BARRA;
        this.MONTO_REGU_ANTICIPO = MONTO_REGU_ANTICIPO;
        this.TIPO_PROCESO = TIPO_PROCESO;
        this.FLG_ANTICIPO = FLG_ANTICIPO;
        this.FLG_REGU_ANTICIPO = FLG_REGU_ANTICIPO;
        this.TIPO = TIPO;
        this.ID_FORMA_PAGO = ID_FORMA_PAGO;
        this.ID_ALMACEN = ID_ALMACEN;
        this.ID_REFERENCIA = ID_REFERENCIA;
        this.DEPARTAMENTO_CLIENTE = DEPARTAMENTO_CLIENTE;
        this.PROVINCCIA_CLIENTE = PROVINCCIA_CLIENTE;
        this.DISTRITO_CLIENTE = DISTRITO_CLIENTE;
        this.UBIGEO_CLIENTE = UBIGEO_CLIENTE;
        this.NOMBRE_DOC = NOMBRE_DOC;
        this.VENDEDOR = VENDEDOR;
        this.DETALLE = DETALLE;
    }
        
        
       
 

}
