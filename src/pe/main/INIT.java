/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.main;

import BUSINES.CPE_DETALLE;
import BUSINES.CREATE_JSON_FACTURA;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import BUSINES_CONSULTAS.BUSINES_DOCUMET_CLIENT;
import BUSINES_CONSULTAS.BUSINES_NUMBER_LETTER;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
public class INIT extends javax.swing.JFrame {
   
   public static Connection con_mysql;  
   
    public INIT() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("FACTURAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("BOLETA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jButton1)
                .addGap(68, 68, 68)
                .addComponent(jButton2)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CREATE_JSON_FACTURA DE = new CREATE_JSON_FACTURA();   
        CPE_DETALLE DETALLE = new CPE_DETALLE();
        ArrayList<CPE_DETALLE> detalle = new ArrayList<>();
        double TOTAL_GRAVADA=0,SUB_TOTAL=0,TOTAL_iGV=0,TOTAL_OTR_IMPUESTO=0,TOTAL=0;
        ResultSet RS1,RS2,RS3 = null;
        int _Idventa = 0,i = 0;
        
       try {
           RS1=BUSINES_DOCUMET_CLIENT.DATA_DOCUMENT_CLIENTE("F");
           while(RS1.next()){
                DE.setNRO_COMPROBANTE            (RS1.getString("serie")+"-"+ String.valueOf(RS1.getString("correlativo")));                            
                DE.setFECHA_DOCUMENTO            (RS1.getString("fecha"));               
                DE.setCOD_TIPO_DOCUMENTO         (RS1.getString("codigo_doc"));   //01=FACTURA, 03=BOLETA, 07=NOTA CREDITO, 08=NOTA DEBITO                
                DE.setCOD_MONEDA                 ("PEN");    // PEN -USD -EUR   
                DE.setNRO_DOCUMENTO_CLIENTE      (RS1.getString("cli_ruc"));                          
                DE.setRAZON_SOCIAL_CLIENTE       (RS1.getString("cli_rsocial"));                
                DE.setTIPO_DOCUMENTO_CLIENTE     (RS1.getString("cli_tipoDoc"));            //1=DNI,6=RUC                
                DE.setDIRECCION_CLIENTE          (RS1.getString("cli_direccion"));                   
                DE.setDEPARTAMENTO_CLIENTE       (RS1.getString("cli_departamento"));   
                DE.setPROVINCCIA_CLIENTE         (RS1.getString("cli_provincia")); 
                DE.setDISTRITO_CLIENTE           (RS1.getString("cli_distrito")); 
                DE.setUBIGEO_CLIENTE             (RS1.getString("cli_ubigeo"));    
                DE.setCOD_PAIS_CLIENTE           ("PE");   
                DE.setNOMBRE_DOC                 (RS1.getString("nombre"));   
                DE.setVENDEDOR                   (RS1.getString("vendedor"));
                DE.setOBS_DOC                    (RS1.getString("obs"));
                _Idventa=Integer.valueOf         (RS1.getString("venta"));
                
           }
           //_____________________________________EMISOR_____________________
            RS3=BUSINES_DOCUMET_CLIENT.DATA_EMISOR(1);
           while(RS3.next()){
                DE.setNRO_DOCUMENTO_EMPRESA      (RS3.getString("ruc"));                               
                DE.setTIPO_DOCUMENTO_EMPRESA     ("6");                             // 1=dni 6=ruc                            
                DE.setNOMBRE_COMERCIAL_EMPRESA   (RS3.getString("nombre_comercial"));                           
                DE.setCODIGO_UBIGEO_EMPRESA      (RS3.getString("ubigeo"));                               
                DE.setDIRECCION_EMPRESA          (RS3.getString("direccion"));                
                DE.setTELEFONO_PRINCIPAL         ("");               
                DE.setDEPARTAMENTO_EMPRESA       (RS3.getString("departamento"));                               
                DE.setPROVINCIA_EMPRESA          (RS3.getString("provincia"));                               
                DE.setDISTRITO_EMPRESA           (RS3.getString("distrito"));                             
                DE.setCODIGO_PAIS_EMPRESA        ("PE");                             
                DE.setRAZON_SOCIAL_EMPRESA       (RS3.getString("razon_social"));                           
                
           }           
           //________________________________________________________________________
           
             RS2=BUSINES_DOCUMET_CLIENT.DATA_ITEMS(_Idventa);           
           while(RS2.next()){
                DETALLE = new CPE_DETALLE();            
                DETALLE.setITEM                (i+1); 
                DETALLE.setUNIDAD_MEDIDA       (RS2.getString("MEDIDA"));
                DETALLE.setCANTIDAD            (RS2.getDouble("CANTIDAD")); 
                DETALLE.setPRECIO              (RS2.getDouble("PRECIO_IGV")); 
                DETALLE.setIMPORTE             (RS2.getDouble("TOTAL")); 
                DETALLE.setPRECIO_TIPO_CODIGO  ("01"); 
                DETALLE.setIGV                 (RS2.getDouble("TOTAL_IGV")); 
                DETALLE.setISC                 (0); 
                DETALLE.setCOD_TIPO_OPERACION  ("10"); // exonerada = 20 and not is =10
                DETALLE.setCODIGO              (RS2.getString("CODIGO")); 
                DETALLE.setDESCRIPCION         (RS2.getString("PRODUCTO")); 
                DETALLE.setSUB_TOTAL           (RS2.getDouble("SUB_T")); 
                DETALLE.setPRECIO_SIN_IMPUESTO (RS2.getDouble("PRECIO"));
                detalle.add(DETALLE);                 
                //_____________________________________________________     
                TOTAL_GRAVADA=TOTAL_GRAVADA+DETALLE.getSUB_TOTAL();              
                TOTAL=TOTAL+DETALLE.getIMPORTE();               
                TOTAL_iGV=TOTAL_iGV+DETALLE.getIGV();                   
                i++;              
           }  
            DE.DETALLE = detalle;  
            BUSINES_CONSULTAS.BUSINES_NUMBER_LETTER C = new BUSINES_CONSULTAS.BUSINES_NUMBER_LETTER();                     
                DE.setTOTAL_GRAVADAS             (String.valueOf(redondearDecimales(TOTAL_GRAVADA-0.01)));                  
                DE.setSUB_TOTAL                  (String.valueOf(redondearDecimales(TOTAL_GRAVADA-0.01)));                
                DE.setTOTAL_IGV                  (String.valueOf(redondearDecimales(TOTAL_iGV+0.01)));             
                DE.setTOTAL_ISC                  (0);                             
                DE.setTOTAL_OTR_IMP              (0);                             
                DE.setTOTAL                      (Double.valueOf(redondearDecimales(TOTAL)));                  
                DE.setTOTAL_LETRAS               (BUSINES_NUMBER_LETTER.convertNumberToLetter(new BigDecimal(redondearDecimales(TOTAL))));           
             System.out.println( DE.getTOTAL_GRAVADAS()+"\n");
              System.out.println( DE.getSUB_TOTAL()+"\n");
               System.out.println( DE.getTOTAL_IGV()+"\n");
                System.out.println( String.valueOf(redondearDecimales(TOTAL))+"\n");
                 System.out.println( DE.getTOTAL_LETRAS()+"\n");
                
           
           
       } catch (ClassNotFoundException ex) {
            System.out.println( ex);
       } catch (SQLException ex) {
           System.out.println( ex);
       }
  
       
    }//GEN-LAST:event_jButton1ActionPerformed
 public static String redondearDecimales(double valorInicial) {
                 DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
                 separadoresPersonalizados.setDecimalSeparator('.');
                 DecimalFormat formato1 = new DecimalFormat("#.00", separadoresPersonalizados);
                 return formato1.format(valorInicial) ;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(INIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INIT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
