/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VentanaGuia;

/**
 *
 * @author HP
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        panelEtiqueta1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelCuadro1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        panelEtiqueta2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelCuadro2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        panelEstado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelVerificacion = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        panelBotonera = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ejercicios de distribuccion de paneles y layout");
        panelTitulo.add(jLabel1);

        jLabel2.setText("por Duvan Amaya");
        panelTitulo.add(jLabel2);

        getContentPane().add(panelTitulo, java.awt.BorderLayout.PAGE_START);

        panelDatos.setLayout(new java.awt.GridLayout(2, 2));

        jLabel6.setText("Dato1:");

        javax.swing.GroupLayout panelEtiqueta1Layout = new javax.swing.GroupLayout(panelEtiqueta1);
        panelEtiqueta1.setLayout(panelEtiqueta1Layout);
        panelEtiqueta1Layout.setHorizontalGroup(
            panelEtiqueta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelEtiqueta1Layout.setVerticalGroup(
            panelEtiqueta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiqueta1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(39, 39, 39))
        );

        panelDatos.add(panelEtiqueta1);

        javax.swing.GroupLayout panelCuadro1Layout = new javax.swing.GroupLayout(panelCuadro1);
        panelCuadro1.setLayout(panelCuadro1Layout);
        panelCuadro1Layout.setHorizontalGroup(
            panelCuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadro1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCuadro1Layout.setVerticalGroup(
            panelCuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuadro1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        panelDatos.add(panelCuadro1);

        jLabel7.setText("Dato2:");

        javax.swing.GroupLayout panelEtiqueta2Layout = new javax.swing.GroupLayout(panelEtiqueta2);
        panelEtiqueta2.setLayout(panelEtiqueta2Layout);
        panelEtiqueta2Layout.setHorizontalGroup(
            panelEtiqueta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelEtiqueta2Layout.setVerticalGroup(
            panelEtiqueta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        panelDatos.add(panelEtiqueta2);

        javax.swing.GroupLayout panelCuadro2Layout = new javax.swing.GroupLayout(panelCuadro2);
        panelCuadro2.setLayout(panelCuadro2Layout);
        panelCuadro2Layout.setHorizontalGroup(
            panelCuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadro2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCuadro2Layout.setVerticalGroup(
            panelCuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuadro2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        panelDatos.add(panelCuadro2);

        getContentPane().add(panelDatos, java.awt.BorderLayout.CENTER);

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout panelEstadoLayout = new javax.swing.GroupLayout(panelEstado);
        panelEstado.setLayout(panelEstadoLayout);
        panelEstadoLayout.setHorizontalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadoLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(105, 105, 105))
        );
        panelEstadoLayout.setVerticalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(panelEstado, java.awt.BorderLayout.PAGE_END);

        panelVerificacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setText("jCheckBox1");
        panelVerificacion.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jCheckBox2.setText("jCheckBox2");
        panelVerificacion.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        jCheckBox3.setText("jCheckBox3");
        panelVerificacion.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jCheckBox4.setText("jCheckBox4");
        panelVerificacion.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        getContentPane().add(panelVerificacion, java.awt.BorderLayout.LINE_END);

        panelBotonera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        panelBotonera.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jButton2.setText("jButton2");
        panelBotonera.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jButton3.setText("jButton3");
        panelBotonera.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jButton4.setText("jButton4");
        panelBotonera.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        getContentPane().add(panelBotonera, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panelBotonera;
    private javax.swing.JPanel panelCuadro1;
    private javax.swing.JPanel panelCuadro2;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelEtiqueta1;
    private javax.swing.JPanel panelEtiqueta2;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelVerificacion;
    // End of variables declaration//GEN-END:variables
}
