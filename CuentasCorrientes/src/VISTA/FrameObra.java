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
public class FrameObra extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameObra
     */
    public FrameObra() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        laminaObra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNuevaObra = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblInsertarObra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboClientes = new javax.swing.JComboBox<>();
        laminaObraarriba = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBorder(null);
        setTitle("Nueva Obra");

        laminaObra.setBackground(new java.awt.Color(51, 51, 51));
        laminaObra.setPreferredSize(new java.awt.Dimension(629, 419));
        laminaObra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("Nombre :");
        laminaObra.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtNuevaObra.setBackground(new java.awt.Color(51, 51, 51));
        txtNuevaObra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNuevaObra.setForeground(new java.awt.Color(51, 204, 255));
        txtNuevaObra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNuevaObra.setBorder(null);
        laminaObra.add(txtNuevaObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 353, 32));
        laminaObra.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 350, 10));

        lblInsertarObra.setFont(new java.awt.Font("Decker", 0, 24)); // NOI18N
        lblInsertarObra.setForeground(new java.awt.Color(204, 204, 204));
        lblInsertarObra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInsertarObra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cyan/arrow_up.png"))); // NOI18N
        lblInsertarObra.setText("Insertar");
        lblInsertarObra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInsertarObra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        laminaObra.add(lblInsertarObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 150, 140));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("Cliente:");
        laminaObra.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        comboClientes.setBackground(new java.awt.Color(51, 51, 51));
        comboClientes.setForeground(new java.awt.Color(255, 255, 255));
        laminaObra.add(comboClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 350, 40));

        laminaObraarriba.setBackground(new java.awt.Color(51, 204, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Decker", 0, 36)); // NOI18N
        jLabel2.setText("Nueva Obra:");

        javax.swing.GroupLayout laminaObraarribaLayout = new javax.swing.GroupLayout(laminaObraarriba);
        laminaObraarriba.setLayout(laminaObraarribaLayout);
        laminaObraarribaLayout.setHorizontalGroup(
            laminaObraarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laminaObraarribaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(582, Short.MAX_VALUE))
        );
        laminaObraarribaLayout.setVerticalGroup(
            laminaObraarribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laminaObraarribaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        laminaObra.add(laminaObraarriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laminaObra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laminaObra, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<Cliente> comboClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JPanel laminaObra;
    public javax.swing.JPanel laminaObraarriba;
    public javax.swing.JLabel lblInsertarObra;
    public javax.swing.JTextField txtNuevaObra;
    // End of variables declaration//GEN-END:variables
}
