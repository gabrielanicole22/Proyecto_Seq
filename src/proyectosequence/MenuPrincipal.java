/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectosequence;

/**
 *
 * @author Gabriela Mejía
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    SistemaUsuarios sistemaUsuarios;

    public MenuPrincipal() {
        initComponents();
        sistemaUsuarios = new SistemaUsuarios();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void setSistemaUsuarios(SistemaUsuarios sistema) {
        sistemaUsuarios = sistema;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInicioSesion = new javax.swing.JLabel();
        btnRegistroUsuarios = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInicioSesion.setText("Inicio de Sesión");
        btnInicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioSesionMouseClicked(evt);
            }
        });

        btnRegistroUsuarios.setText("Registro de Usuarios");
        btnRegistroUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroUsuariosMouseClicked(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        lblTitulo.setText("Menu Principal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistroUsuarios)
                            .addComponent(btnInicioSesion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lblTitulo)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitulo)
                .addGap(35, 35, 35)
                .addComponent(btnInicioSesion)
                .addGap(27, 27, 27)
                .addComponent(btnRegistroUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioSesionMouseClicked
        // TODO add your handling code here:
        new MenuLogin(sistemaUsuarios, this).setVisible(true);
    }//GEN-LAST:event_btnInicioSesionMouseClicked

    private void btnRegistroUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroUsuariosMouseClicked
        // TODO add your handling code here:
        new MenuRegistrarse(sistemaUsuarios, this).setVisible(true);
    }//GEN-LAST:event_btnRegistroUsuariosMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnInicioSesion;
    private javax.swing.JLabel btnRegistroUsuarios;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}