/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practica7_listasenlazadas_transacciones;

import javax.swing.JOptionPane;

/**
 *
 * @author SebasCarlosama
 */
public class Interfaz extends javax.swing.JFrame {

    /*Atributos*/
    private Transaccion transaccion;
    private Lista_Lineal lista_lineal;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_numero_cuenta = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_informacion = new javax.swing.JTextArea();
        btn_reporte = new javax.swing.JButton();
        btn_ingresar_inicio = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_ingresar_final = new javax.swing.JButton();
        txt_tipo_transaccion = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        btn_IngresarOrdenado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Listas Enlazadas");

        jLabel2.setText("Realizado por: Erick Sebastian Carlosama");

        jLabel3.setText("Ingresar infromacion de transacción:");

        jLabel4.setText("Número de cuenta:");

        jLabel5.setText("Fecha:");

        jLabel6.setText("Tipo de Transaccion:");

        jLabel7.setText("Cantidad:");

        txt_numero_cuenta.setText("22221354");

        txt_fecha.setText("21/12/2022");
        txt_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaActionPerformed(evt);
            }
        });

        txt_informacion.setColumns(20);
        txt_informacion.setRows(5);
        jScrollPane1.setViewportView(txt_informacion);

        btn_reporte.setText("Reporte");
        btn_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteActionPerformed(evt);
            }
        });

        btn_ingresar_inicio.setText("Ingresar Inicio");
        btn_ingresar_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresar_inicioActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_ingresar_final.setText("Ingresar Final");
        btn_ingresar_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresar_finalActionPerformed(evt);
            }
        });

        txt_tipo_transaccion.setText("deposito");
        txt_tipo_transaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipo_transaccionActionPerformed(evt);
            }
        });

        txt_cantidad.setText("20.84");
        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });

        btn_IngresarOrdenado.setText("Ingresar");
        btn_IngresarOrdenado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarOrdenadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_numero_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(txt_tipo_transaccion))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 152, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btn_ingresar_inicio)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ingresar_final)
                        .addGap(39, 39, 39)
                        .addComponent(btn_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reporte))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btn_IngresarOrdenado, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_numero_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_tipo_transaccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btn_IngresarOrdenado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar_final)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_reporte)
                    .addComponent(btn_ingresar_inicio))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void txt_tipo_transaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipo_transaccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipo_transaccionActionPerformed

    private void btn_ingresar_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar_inicioActionPerformed
        try {
            int numero_cuenta = Integer.parseInt(txt_numero_cuenta.getText());
            String fehca = txt_fecha.getText();
            String tipo_transaccion = txt_tipo_transaccion.getText();
            double cantidad = Double.parseDouble(txt_cantidad.getText());
            transaccion = new Transaccion(numero_cuenta, fehca, tipo_transaccion, cantidad);
            if (lista_lineal == null) {
                lista_lineal = new Lista_Lineal();
            }
            lista_lineal.IngresarInicio(transaccion);
            txt_informacion.setText("Transaccion ingresada:\n" + transaccion.toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, veifique los datos");
        }


    }//GEN-LAST:event_btn_ingresar_inicioActionPerformed

    private void btn_ingresar_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar_finalActionPerformed
        try {
            int numero_cuenta = Integer.parseInt(txt_numero_cuenta.getText());
            String fehca = txt_fecha.getText();
            String tipo_transaccion = txt_tipo_transaccion.getText();
            double cantidad = Double.parseDouble(txt_cantidad.getText());
            transaccion = new Transaccion(numero_cuenta, fehca, tipo_transaccion, cantidad);
            if (lista_lineal == null) {
                lista_lineal = new Lista_Lineal();
            }
            lista_lineal.IngresarFinal(transaccion);
            txt_informacion.setText("Transaccion ingresada:\n" + transaccion.toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, veifique los datos");
        }
    }//GEN-LAST:event_btn_ingresar_finalActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        try {
            if (lista_lineal != null) {
                lista_lineal.Retirar();
                txt_informacion.setText("Se retiro exitosamente");

            } else {
                txt_informacion.setText("No hay nodos para eliminar");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteActionPerformed
        try {
            if (lista_lineal != null) {
                System.out.println(lista_lineal.toString());
                txt_informacion.setText(lista_lineal.toString());
            } else {
                txt_informacion.setText("No hay elementos en la lista");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_reporteActionPerformed

    private void btn_IngresarOrdenadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarOrdenadoActionPerformed
        try {
            int numero_cuenta = Integer.parseInt(txt_numero_cuenta.getText());
            String fehca = txt_fecha.getText();
            String tipo_transaccion = txt_tipo_transaccion.getText();
            double cantidad = Double.parseDouble(txt_cantidad.getText());
            transaccion = new Transaccion(numero_cuenta, fehca, tipo_transaccion, cantidad);
            if (lista_lineal == null) {
                lista_lineal = new Lista_Lineal();
            }
            lista_lineal.IngresarOrdenado(transaccion);
            txt_informacion.setText("Transaccion ingresada:\n" + transaccion.toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error, veifique los datos");
        }
        
    }//GEN-LAST:event_btn_IngresarOrdenadoActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_IngresarOrdenado;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_ingresar_final;
    private javax.swing.JButton btn_ingresar_inicio;
    private javax.swing.JButton btn_reporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextArea txt_informacion;
    private javax.swing.JTextField txt_numero_cuenta;
    private javax.swing.JTextField txt_tipo_transaccion;
    // End of variables declaration//GEN-END:variables
}
