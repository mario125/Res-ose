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
public class CPE_DETALLE {
          private  int ID_DETALLE          ;     
          private  int ID_CABECERA         ;     
          private  int ITEM                ;     
          private  String UNIDAD_MEDIDA       ;    
          private  double CANTIDAD            ;    
          private  double PRECIO              ;     
          private  double IMPORTE             ;     
          private  String PRECIO_TIPO_CODIGO  ;   
          private  double IGV                 ;     
          private  double ISC                 ;     
          private  String COD_TIPO_OPERACION  ;     
          private  String CODIGO              ;    
          private  String DESCRIPCION         ;   
          private  double DESCUENTO           ;    
          private  double SUB_TOTAL           ;   
          private  double PRECIO_SIN_IMPUESTO ;    
        /////////Campos Aumentados////////
          private  int TIPO                ;    
          private  String ID_USUARIO          ; 
    public void setID_DETALLE(int ID_DETALLE) {
        this.ID_DETALLE = ID_DETALLE;
    }
    public int getID_DETALLE() {
        return ID_DETALLE;
    }
    public void setID_CABECERA(int ID_CABECERA) {
        this.ID_CABECERA = ID_CABECERA;
    }
    public int getID_CABECERA() {
        return ID_CABECERA;
    }
    public void setITEM(int ITEM) {
        this.ITEM = ITEM;
    }
    public int getITEM() {
        return ITEM;
    }
    public void setUNIDAD_MEDIDA(String UNIDAD_MEDIDA) {
        this.UNIDAD_MEDIDA = UNIDAD_MEDIDA;
    }
    public String getUNIDAD_MEDIDA() {
        return UNIDAD_MEDIDA;
    }
    public void setCANTIDAD(double CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }
    public double getCANTIDAD() {
        return CANTIDAD;
    }
    public void setPRECIO(double PRECIO) {
        this.PRECIO = PRECIO;
    }
    public double getPRECIO() {
        return PRECIO;
    }
    public void setIMPORTE(double IMPORTE) {
        this.IMPORTE = IMPORTE;
    }
    public double getIMPORTE() {
        return IMPORTE;
    }
    public void setPRECIO_TIPO_CODIGO(String PRECIO_TIPO_CODIGO) {
        this.PRECIO_TIPO_CODIGO = PRECIO_TIPO_CODIGO;
    }
    public String getPRECIO_TIPO_CODIGO() {
        return PRECIO_TIPO_CODIGO;
    }
    public void setIGV(double IGV) {
        this.IGV = IGV;
    }
    public double getIGV() {
        return IGV;
    }
    public void setISC(double ISC) {
        this.ISC = ISC;
    }
    public double getISC() {
        return ISC;
    }
    public void setCOD_TIPO_OPERACION(String COD_TIPO_OPERACION) {
        this.COD_TIPO_OPERACION = COD_TIPO_OPERACION;
    }
    public String getCOD_TIPO_OPERACION() {
        return COD_TIPO_OPERACION;
    }
    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }
    public String getCODIGO() {
        return CODIGO;
    }
    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }
    public String getDESCRIPCION() {
        return DESCRIPCION;
    }
    public void setDESCUENTO(double DESCUENTO) {
        this.DESCUENTO = DESCUENTO;
    }
    public double getDESCUENTO() {
        return DESCUENTO;
    }
    public void setSUB_TOTAL(double SUB_TOTAL) {
        this.SUB_TOTAL = SUB_TOTAL;
    }
    public double getSUB_TOTAL() {
        return SUB_TOTAL;
    }
    public void setPRECIO_SIN_IMPUESTO(double PRECIO_SIN_IMPUESTO) {
        this.PRECIO_SIN_IMPUESTO = PRECIO_SIN_IMPUESTO;
    }
    public double getPRECIO_SIN_IMPUESTO() {
        return PRECIO_SIN_IMPUESTO;
    }
    public void setTIPO(int TIPO) {
        this.TIPO = TIPO;
    }
    public int getTIPO() {
        return TIPO;
    }
    public void setID_USUARIO(String ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }
    public String getID_USUARIO() {
        return ID_USUARIO;
    }  
   

}
