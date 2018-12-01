/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUSINES;

import java.util.List;

/**
 *
 * @author Mario
 */
public class CPE_BAJA {
    private String NRO_DOCUMENTO_EMPRESA    ; 
    private String RAZON_SOCIAL             ; 
    private String TIPO_DOCUMENTO           ; 
    private String CODIGO                   ; 
    private String SERIE                    ; 
    private String SECUENCIA                ; 
    private String FECHA_REFERENCIA         ; 
    private String FECHA_BAJA               ; 
    private  Integer TIPO_PROCESO           ; 
    private String TICKET                   ; 
    private String USUARIO_SOL_EMPRESA      ; 
    private String PASS_SOL_EMPRESA         ; 
    private String CONTRA_FIRMA             ; 
    private String COD_RESPUESTA            ; 
    private String UBIGEO                   ; 
    private String DEPARTAMENTO             ; 
    private String PROVINCIA                ; 
    private String DISTRITO                 ; 
    private String DIRECCION                ; 
    private String DESCRIPCION_RESPUESTA    ; 
    private String HASH_CPE                 ; 
    private String HASH_CDR                 ; 
    private String FIRMA_EMP                ; 

    /**
     *
     */
    public List<CPE_DETALLE_BAJA> DETALLE;  // = new ArrayList<>();
    public CPE_BAJA(){
        
    }
            

    public CPE_BAJA(String NRO_DOCUMENTO_EMPRESA, String RAZON_SOCIAL, String TIPO_DOCUMENTO, String CODIGO, String SERIE, String SECUENCIA, String FECHA_REFERENCIA, String FECHA_BAJA, Integer TIPO_PROCESO, String TICKET, String USUARIO_SOL_EMPRESA, String PASS_SOL_EMPRESA, String CONTRA_FIRMA, String COD_RESPUESTA, String UBIGEO, String DEPARTAMENTO, String PROVINCIA, String DISTRITO, String DIRECCION, String DESCRIPCION_RESPUESTA, String HASH_CPE, String HASH_CDR, String FIRMA_EMP, List<CPE_DETALLE_BAJA> DETALLE) {
        this.NRO_DOCUMENTO_EMPRESA = NRO_DOCUMENTO_EMPRESA;
        this.RAZON_SOCIAL = RAZON_SOCIAL;
        this.TIPO_DOCUMENTO = TIPO_DOCUMENTO;
        this.CODIGO = CODIGO;
        this.SERIE = SERIE;
        this.SECUENCIA = SECUENCIA;
        this.FECHA_REFERENCIA = FECHA_REFERENCIA;
        this.FECHA_BAJA = FECHA_BAJA;
        this.TIPO_PROCESO = TIPO_PROCESO;
        this.TICKET = TICKET;
        this.USUARIO_SOL_EMPRESA = USUARIO_SOL_EMPRESA;
        this.PASS_SOL_EMPRESA = PASS_SOL_EMPRESA;
        this.CONTRA_FIRMA = CONTRA_FIRMA;
        this.COD_RESPUESTA = COD_RESPUESTA;
        this.UBIGEO = UBIGEO;
        this.DEPARTAMENTO = DEPARTAMENTO;
        this.PROVINCIA = PROVINCIA;
        this.DISTRITO = DISTRITO;
        this.DIRECCION = DIRECCION;
        this.DESCRIPCION_RESPUESTA = DESCRIPCION_RESPUESTA;
        this.HASH_CPE = HASH_CPE;
        this.HASH_CDR = HASH_CDR;
        this.FIRMA_EMP = FIRMA_EMP;
        this.DETALLE = DETALLE;
    }

    public String getNRO_DOCUMENTO_EMPRESA() {
        return NRO_DOCUMENTO_EMPRESA;
    }

    public void setNRO_DOCUMENTO_EMPRESA(String NRO_DOCUMENTO_EMPRESA) {
        this.NRO_DOCUMENTO_EMPRESA = NRO_DOCUMENTO_EMPRESA;
    }

    public String getRAZON_SOCIAL() {
        return RAZON_SOCIAL;
    }

    public void setRAZON_SOCIAL(String RAZON_SOCIAL) {
        this.RAZON_SOCIAL = RAZON_SOCIAL;
    }

    public String getTIPO_DOCUMENTO() {
        return TIPO_DOCUMENTO;
    }

    public void setTIPO_DOCUMENTO(String TIPO_DOCUMENTO) {
        this.TIPO_DOCUMENTO = TIPO_DOCUMENTO;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getSERIE() {
        return SERIE;
    }

    public void setSERIE(String SERIE) {
        this.SERIE = SERIE;
    }

    public String getSECUENCIA() {
        return SECUENCIA;
    }

    public void setSECUENCIA(String SECUENCIA) {
        this.SECUENCIA = SECUENCIA;
    }

    public String getFECHA_REFERENCIA() {
        return FECHA_REFERENCIA;
    }

    public void setFECHA_REFERENCIA(String FECHA_REFERENCIA) {
        this.FECHA_REFERENCIA = FECHA_REFERENCIA;
    }

    public String getFECHA_BAJA() {
        return FECHA_BAJA;
    }

    public void setFECHA_BAJA(String FECHA_BAJA) {
        this.FECHA_BAJA = FECHA_BAJA;
    }

    public Integer getTIPO_PROCESO() {
        return TIPO_PROCESO;
    }

    public void setTIPO_PROCESO(Integer TIPO_PROCESO) {
        this.TIPO_PROCESO = TIPO_PROCESO;
    }

    public String getTICKET() {
        return TICKET;
    }

    public void setTICKET(String TICKET) {
        this.TICKET = TICKET;
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

    public String getCONTRA_FIRMA() {
        return CONTRA_FIRMA;
    }

    public void setCONTRA_FIRMA(String CONTRA_FIRMA) {
        this.CONTRA_FIRMA = CONTRA_FIRMA;
    }

    public String getCOD_RESPUESTA() {
        return COD_RESPUESTA;
    }

    public void setCOD_RESPUESTA(String COD_RESPUESTA) {
        this.COD_RESPUESTA = COD_RESPUESTA;
    }

    public String getUBIGEO() {
        return UBIGEO;
    }

    public void setUBIGEO(String UBIGEO) {
        this.UBIGEO = UBIGEO;
    }

    public String getDEPARTAMENTO() {
        return DEPARTAMENTO;
    }

    public void setDEPARTAMENTO(String DEPARTAMENTO) {
        this.DEPARTAMENTO = DEPARTAMENTO;
    }

    public String getPROVINCIA() {
        return PROVINCIA;
    }

    public void setPROVINCIA(String PROVINCIA) {
        this.PROVINCIA = PROVINCIA;
    }

    public String getDISTRITO() {
        return DISTRITO;
    }

    public void setDISTRITO(String DISTRITO) {
        this.DISTRITO = DISTRITO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getDESCRIPCION_RESPUESTA() {
        return DESCRIPCION_RESPUESTA;
    }

    public void setDESCRIPCION_RESPUESTA(String DESCRIPCION_RESPUESTA) {
        this.DESCRIPCION_RESPUESTA = DESCRIPCION_RESPUESTA;
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

    public String getFIRMA_EMP() {
        return FIRMA_EMP;
    }

    public void setFIRMA_EMP(String FIRMA_EMP) {
        this.FIRMA_EMP = FIRMA_EMP;
    }

    public List<CPE_DETALLE_BAJA> getDETALLE() {
        return DETALLE;
    }

    public void setDETALLE(List<CPE_DETALLE_BAJA> DETALLE) {
        this.DETALLE = DETALLE;
    }
    
    
    
    
}
