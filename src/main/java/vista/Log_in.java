package vista;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Log_in extends javax.swing.JFrame {
    codigo.Tarjeta t = new codigo.Tarjeta();
    
    public Log_in() {
        initComponents();        
        logo.setIcon(new ImageIcon("..\\Cajero_Cliente\\Imagenes\\logo.png"));
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        numeroTarjeta = new javax.swing.JLabel();
        fechaCaducidad = new javax.swing.JLabel();
        cvs = new javax.swing.JLabel();
        pin = new javax.swing.JLabel();
        txtNumeroTarjeta = new javax.swing.JTextField();
        txtFechaCaducidad = new javax.swing.JTextField();
        txtCvs = new javax.swing.JTextField();
        pinPass = new javax.swing.JPasswordField();
        identificar_button = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(99, 11, 10));

        jPanel2.setBackground(new java.awt.Color(167, 20, 17));

        numeroTarjeta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        numeroTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        numeroTarjeta.setText("Número tarjeta");

        fechaCaducidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fechaCaducidad.setForeground(new java.awt.Color(0, 0, 0));
        fechaCaducidad.setText("Fecha caducidad");

        cvs.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cvs.setForeground(new java.awt.Color(0, 0, 0));
        cvs.setText("CVS");

        pin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pin.setForeground(new java.awt.Color(0, 0, 0));
        pin.setText("PIN");
        pin.setRequestFocusEnabled(false);

        txtNumeroTarjeta.setBackground(new java.awt.Color(255, 255, 255));

        txtFechaCaducidad.setBackground(new java.awt.Color(255, 255, 255));

        txtCvs.setBackground(new java.awt.Color(255, 255, 255));

        pinPass.setBackground(new java.awt.Color(255, 255, 255));

        identificar_button.setText("IDENTIFICAR");
        identificar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificar_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroTarjeta)
                            .addComponent(fechaCaducidad))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(152, 152, 152)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cvs, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pinPass, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCvs, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(identificar_button, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroTarjeta)
                    .addComponent(cvs)
                    .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCvs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaCaducidad)
                    .addComponent(txtFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pin)
                    .addComponent(pinPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(identificar_button)
                .addContainerGap())
        );

        logo.setIcon(new ImageIcon("..\\Cajero_Cliente\\Imagenes\\logo.png"));

        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setText("XX/XX/XX");

        hora.setForeground(new java.awt.Color(0, 0, 0));
        hora.setText("HH:MM:SS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hora)
                        .addGap(182, 182, 182))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hora, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void identificar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificar_buttonActionPerformed
        if(txtNumeroTarjeta.getText().equals("") || txtFechaCaducidad.getText().equals("") || txtCvs.getText().equals("") || pinPass.getText().equals("")){
            JOptionPane.showMessageDialog(null, " Rellena todos los campos para poder iniciar sesión");
        }else{
            if(t.validar(txtNumeroTarjeta.getText(), txtCvs.getText(), pinPass.getText(), txtFechaCaducidad.getText()) == true){
                Pantalla_Principal p = new Pantalla_Principal();
                p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
                p.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Los datos introducidos no son válidos");
            }
        }
    }//GEN-LAST:event_identificar_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cvs;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fechaCaducidad;
    private javax.swing.JLabel hora;
    private javax.swing.JButton identificar_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel numeroTarjeta;
    private javax.swing.JLabel pin;
    private javax.swing.JPasswordField pinPass;
    private javax.swing.JTextField txtCvs;
    private javax.swing.JTextField txtFechaCaducidad;
    private javax.swing.JTextField txtNumeroTarjeta;
    // End of variables declaration//GEN-END:variables
}
