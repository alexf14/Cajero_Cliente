package vista;

import javax.swing.ImageIcon;

public class Pantalla_Principal extends javax.swing.JFrame {

    public Pantalla_Principal() {
        initComponents();
        setLocationRelativeTo(null);
        logo.setIcon(new ImageIcon("..\\Cajero_Cliente\\Imagenes\\logoPequenno.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        bienvenido = new javax.swing.JLabel();
        ultimaOperacion = new javax.swing.JLabel();
        buttonConsultar = new javax.swing.JButton();
        buttonReintegro = new javax.swing.JButton();
        buttonIngreso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(99, 11, 10));

        logo.setIcon(new ImageIcon("..\\Cajero_Cliente\\Imagenes\\logoPequenno.png"));

        bienvenido.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        bienvenido.setForeground(new java.awt.Color(0, 0, 0));
        bienvenido.setText("BIENVENIDO ");
        bienvenido.setRequestFocusEnabled(false);

        ultimaOperacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ultimaOperacion.setForeground(new java.awt.Color(0, 0, 0));
        ultimaOperacion.setText("ULTIIMA OPERACIÓN ");

        buttonConsultar.setText("CONSULTAR CAJERO");

        buttonReintegro.setText("REINTEGRO");

        buttonIngreso.setText("INGRESO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonReintegro, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(230, 230, 230))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bienvenido)
                        .addGap(100, 100, 100)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(ultimaOperacion)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bienvenido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(ultimaOperacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(buttonConsultar)
                .addGap(60, 60, 60)
                .addComponent(buttonReintegro)
                .addGap(60, 60, 60)
                .addComponent(buttonIngreso)
                .addGap(33, 33, 33))
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido;
    private javax.swing.JButton buttonConsultar;
    private javax.swing.JButton buttonIngreso;
    private javax.swing.JButton buttonReintegro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel ultimaOperacion;
    // End of variables declaration//GEN-END:variables
}
