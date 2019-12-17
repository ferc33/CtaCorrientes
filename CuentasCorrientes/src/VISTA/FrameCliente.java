/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import Modelo.Cliente;

/**
 *
 * @author maxid
 */
public class FrameCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameCliente
     */
    public FrameCliente() {
        initComponents();
         ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        laminaCliente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtEmailCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtTelCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CheckTrue = new javax.swing.JCheckBox();
        CheckFalse = new javax.swing.JCheckBox();
        txtNombreCliente = new javax.swing.JTextField();
        btnInsertaCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboClientes = new javax.swing.JComboBox<>();
        btnEliminarCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(840, 440));

        laminaCliente.setBackground(new java.awt.Color(12, 0, 47));
        laminaCliente.setPreferredSize(new java.awt.Dimension(850, 440));
        laminaCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        laminaCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 39));

        jSeparator2.setBackground(new java.awt.Color(153, 204, 255));
        laminaCliente.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 260, 10));

        jLabel4.setBackground(new java.awt.Color(153, 204, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tel :");
        laminaCliente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(153, 204, 255));
        laminaCliente.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 260, 10));

        txtEmailCliente.setBackground(new java.awt.Color(12, 0, 47));
        txtEmailCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmailCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtEmailCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmailCliente.setBorder(null);
        laminaCliente.add(txtEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 260, 30));

        jLabel5.setBackground(new java.awt.Color(153, 204, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail :");
        laminaCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 70, -1));

        jSeparator5.setBackground(new java.awt.Color(153, 204, 255));
        laminaCliente.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 260, 10));

        txtTelCliente.setBackground(new java.awt.Color(12, 0, 47));
        txtTelCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTelCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtTelCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelCliente.setBorder(null);
        txtTelCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelClienteActionPerformed(evt);
            }
        });
        laminaCliente.add(txtTelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 260, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cyan/icons8-admin-settings-male-50.png"))); // NOI18N
        laminaCliente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 50, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cyan/icons8-iphone-50.png"))); // NOI18N
        laminaCliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 50, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cyan/icons8-send-email-50-2.png"))); // NOI18N
        laminaCliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 50, 50));

        jLabel2.setBackground(new java.awt.Color(153, 204, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Instalador :");
        laminaCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        CheckTrue.setBackground(new java.awt.Color(12, 0, 47));
        buttonGroup1.add(CheckTrue);
        CheckTrue.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        CheckTrue.setForeground(new java.awt.Color(255, 255, 255));
        CheckTrue.setText("SI");
        laminaCliente.add(CheckTrue, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 40, 30));

        CheckFalse.setBackground(new java.awt.Color(12, 0, 47));
        buttonGroup1.add(CheckFalse);
        CheckFalse.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        CheckFalse.setForeground(new java.awt.Color(255, 255, 255));
        CheckFalse.setText("NO");
        laminaCliente.add(CheckFalse, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, 30));

        txtNombreCliente.setBackground(new java.awt.Color(12, 0, 47));
        txtNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreCliente.setBorder(null);
        laminaCliente.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 260, 30));

        btnInsertaCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnInsertaCliente.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btnInsertaCliente.setForeground(new java.awt.Color(51, 255, 255));
        btnInsertaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosMaxi/arrow_right.png"))); // NOI18N
        btnInsertaCliente.setText("Añadir");
        btnInsertaCliente.setBorder(null);
        btnInsertaCliente.setContentAreaFilled(false);
        btnInsertaCliente.setFocusPainted(false);
        btnInsertaCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosMaxi/auto_correct.png"))); // NOI18N
        btnInsertaCliente.setRequestFocusEnabled(false);
        btnInsertaCliente.setRolloverEnabled(false);
        laminaCliente.add(btnInsertaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 180, 40));

        jPanel2.setBackground(new java.awt.Color(42, 44, 110));

        jLabel1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel1.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 207, 154));
        jLabel1.setText("Nuevo cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1)
                .addContainerGap(656, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        laminaCliente.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 980, 70));

        comboClientes.setBackground(new java.awt.Color(12, 0, 47));
        comboClientes.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        comboClientes.setForeground(new java.awt.Color(255, 255, 255));
        laminaCliente.add(comboClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, 310, 40));

        btnEliminarCliente.setBackground(new java.awt.Color(12, 0, 47));
        btnEliminarCliente.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cyan/delete.png"))); // NOI18N
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.setBorder(null);
        btnEliminarCliente.setBorderPainted(false);
        btnEliminarCliente.setFocusPainted(false);
        btnEliminarCliente.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnEliminarCliente.setOpaque(false);
        btnEliminarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/cyan/delete.png"))); // NOI18N
        btnEliminarCliente.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/cyan/deleteRojo.png"))); // NOI18N
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        laminaCliente.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 150, 60));

        btnModificarCliente.setBackground(new java.awt.Color(12, 0, 47));
        btnModificarCliente.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        btnModificarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cyan/modificar.png"))); // NOI18N
        btnModificarCliente.setText("Modificar ");
        btnModificarCliente.setBorder(null);
        btnModificarCliente.setFocusPainted(false);
        btnModificarCliente.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnModificarCliente.setOpaque(false);
        btnModificarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/cyan/modificarRojo.png"))); // NOI18N
        laminaCliente.add(btnModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 170, 60));

        getContentPane().add(laminaCliente, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelClienteActionPerformed
        
    }//GEN-LAST:event_txtTelClienteActionPerformed


       
    // </editor-fold>                        

                                               

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        this.btnLabelModificar.setSelected(false);
        this.btnLabelEliminar.setSelected(true);

    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    public rsbuttom.RSButtonMetro btnLabelEliminar;
    public rsbuttom.RSButtonMetro btnLabelModificar;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox CheckFalse;
    public javax.swing.JCheckBox CheckTrue;
    public javax.swing.JButton btnEliminarCliente;
    public javax.swing.JButton btnInsertaCliente;
    public javax.swing.JButton btnModificarCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<Cliente> comboClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel laminaCliente;
    public javax.swing.JTextField txtEmailCliente;
    public javax.swing.JTextField txtNombreCliente;
    public javax.swing.JTextField txtTelCliente;
    // End of variables declaration//GEN-END:variables
}
