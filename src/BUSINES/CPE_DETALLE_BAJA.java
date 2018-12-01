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
public class CPE_DETALLE_BAJA{
    private Integer ITEM      ;
    private String TIPO_COMPROBANTE ;
    private String SERIE;
    private String NUMERO           ;  
    private String DESCRIPCION           ; 


  

    public Integer getITEM() {
        return ITEM;
    }

    public String getSERIE() {
        return SERIE;
    }

    public void setSERIE(String SERIE) {
        this.SERIE = SERIE;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public void setITEM(Integer ITEM) {
        this.ITEM = ITEM;
    }

    public String getTIPO_COMPROBANTE() {
        return TIPO_COMPROBANTE;
    }

    public void setTIPO_COMPROBANTE(String TIPO_COMPROBANTE) {
        this.TIPO_COMPROBANTE = TIPO_COMPROBANTE;
    }

   

    public String getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(String NUMERO) {
        this.NUMERO = NUMERO;
    }


}
