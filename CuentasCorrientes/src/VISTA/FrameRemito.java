/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import Modelo.Cliente;
import Modelo.Obra;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;





public class FrameRemito extends javax.swing.JInternalFrame {

  
    
  //  JWebBrowser navergador = new JWebBrowser();
    
    public FrameRemito() {
        initComponents();
        //this.webPane.setLayout(new BorderLayout());
        //navergador.navigate("");
        //this.webPane.add(navergador,BorderLayout.CENTER);
         tablaRemitos.setDefaultRenderer(Object.class, new Render());
        btnVerFactura.setName("v");
        
        AutoCompleteDecorator.decorate(ComboClientes);
         AutoCompleteDecorator.decorate(ComboObra);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        laminaClienteRemitosGenerales = new javax.swing.JPanel();
        ComboObra = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtNumRemito = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBuscarRemito = new javax.swing.JTextField();
        ComboClientes = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnSubirRemito = new javax.swing.JButton();
        radioObra = new javax.swing.JRadioButton();
        radioCliente = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRemitos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtImporteRemito = new javax.swing.JTextField();
        checkbox = new javax.swing.JCheckBox();
        JData = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setBorder(null);

        laminaClienteRemitosGenerales.setBackground(new java.awt.Color(0, 0, 16));
        laminaClienteRemitosGenerales.setPreferredSize(new java.awt.Dimension(629, 400));
        laminaClienteRemitosGenerales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboObra.setEditable(true);
        ComboObra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ComboObra.setLightWeightPopupEnabled(false);
        laminaClienteRemitosGenerales.add(ComboObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 170, 30));

        jLabel1.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 198, 36));
        jLabel1.setText("Num.R");
        laminaClienteRemitosGenerales.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        txtNumRemito.setBackground(new java.awt.Color(0, 0, 16));
        txtNumRemito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNumRemito.setForeground(new java.awt.Color(255, 255, 255));
        txtNumRemito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumRemito.setText("0000000");
        txtNumRemito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        laminaClienteRemitosGenerales.add(txtNumRemito, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 170, 40));

        jLabel3.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 198, 36));
        jLabel3.setText("Fecha");
        laminaClienteRemitosGenerales.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 60, -1));

        jLabel4.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 198, 36));
        jLabel4.setText("Obra");
        laminaClienteRemitosGenerales.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 50, -1));

        jLabel5.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 198, 36));
        jLabel5.setText("Buscar");
        laminaClienteRemitosGenerales.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 198, 36));
        jLabel6.setText("Cliente");
        laminaClienteRemitosGenerales.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtBuscarRemito.setEditable(false);
        txtBuscarRemito.setBackground(new java.awt.Color(0, 0, 16));
        txtBuscarRemito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtBuscarRemito.setForeground(new java.awt.Color(51, 204, 255));
        txtBuscarRemito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscarRemito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtBuscarRemito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarRemitoActionPerformed(evt);
            }
        });
        laminaClienteRemitosGenerales.add(txtBuscarRemito, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 170, 30));

        ComboClientes.setEditable(true);
        ComboClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ComboClientes.setLightWeightPopupEnabled(false);
        laminaClienteRemitosGenerales.add(ComboClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 170, 30));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosMaxi/addgris.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.setFocusPainted(false);
        btnGuardar.setFocusTraversalPolicyProvider(true);
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosMaxi/add1.png"))); // NOI18N
        btnGuardar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosMaxi/add1.png"))); // NOI18N
        laminaClienteRemitosGenerales.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 60, 40));

        btnSubirRemito.setBackground(new java.awt.Color(0, 0, 16));
        btnSubirRemito.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        btnSubirRemito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosMaxi/arrow_upblack.png"))); // NOI18N
        btnSubirRemito.setBorder(null);
        btnSubirRemito.setBorderPainted(false);
        btnSubirRemito.setContentAreaFilled(false);
        btnSubirRemito.setFocusPainted(false);
        btnSubirRemito.setOpaque(true);
        btnSubirRemito.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosMaxi/arrow_up.png"))); // NOI18N
        laminaClienteRemitosGenerales.add(btnSubirRemito, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 150, 40));

        radioObra.setBackground(new java.awt.Color(0, 0, 16));
        buttonGroup2.add(radioObra);
        radioObra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioObra.setForeground(new java.awt.Color(0, 198, 36));
        radioObra.setText("Obra");
        laminaClienteRemitosGenerales.add(radioObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 80, -1));

        radioCliente.setBackground(new java.awt.Color(0, 0, 16));
        buttonGroup2.add(radioCliente);
        radioCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioCliente.setForeground(new java.awt.Color(0, 198, 36));
        radioCliente.setSelected(true);
        radioCliente.setText("Cliente");
        laminaClienteRemitosGenerales.add(radioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 70, -1));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tablaRemitos.setBackground(new java.awt.Color(0, 0, 16));
        tablaRemitos.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        tablaRemitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaRemitos.setFocusable(false);
        tablaRemitos.setGridColor(new java.awt.Color(0, 0, 0));
        tablaRemitos.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablaRemitos.setRowHeight(25);
        tablaRemitos.setSelectionBackground(new java.awt.Color(0, 0, 16));
        tablaRemitos.setSelectionForeground(new java.awt.Color(0, 198, 36));
        jScrollPane1.setViewportView(tablaRemitos);

        laminaClienteRemitosGenerales.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 800, 250));

        jLabel11.setFont(new java.awt.Font("Decker", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 198, 36));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Importe");
        laminaClienteRemitosGenerales.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        txtImporteRemito.setEditable(false);
        txtImporteRemito.setBackground(new java.awt.Color(0, 0, 16));
        txtImporteRemito.setBorder(null);
        txtImporteRemito.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtImporteRemito.setEnabled(false);
        laminaClienteRemitosGenerales.add(txtImporteRemito, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 170, 30));

        checkbox.setBackground(new java.awt.Color(0, 0, 16));
        checkbox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkbox.setForeground(new java.awt.Color(0, 198, 36));
        checkbox.setText("Cierre cuenta");
        laminaClienteRemitosGenerales.add(checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        JData.setBackground(new java.awt.Color(0, 0, 0));
        laminaClienteRemitosGenerales.add(JData, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 170, 30));
        laminaClienteRemitosGenerales.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 170, 20));
        laminaClienteRemitosGenerales.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 170, 10));
        laminaClienteRemitosGenerales.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 170, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laminaClienteRemitosGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(laminaClienteRemitosGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarRemitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarRemitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarRemitoActionPerformed

     public JButton btnVerFactura = new JButton(new ImageIcon(getClass().getResource("/iconosMaxi/acrobat.png")));

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<Cliente> ComboClientes;
    public javax.swing.JComboBox<Obra> ComboObra;
    public com.toedter.calendar.JDateChooser JData;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnSubirRemito;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JCheckBox checkbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JPanel laminaClienteRemitosGenerales;
    public javax.swing.JRadioButton radioCliente;
    public javax.swing.JRadioButton radioObra;
    public javax.swing.JTable tablaRemitos;
    public javax.swing.JTextField txtBuscarRemito;
    public javax.swing.JTextField txtImporteRemito;
    public javax.swing.JTextField txtNumRemito;
    // End of variables declaration//GEN-END:variables
}
