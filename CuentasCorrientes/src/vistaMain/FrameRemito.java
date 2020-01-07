/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaMain;

import Modelo.Cliente;
import Modelo.Obra;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.table.JTableHeader;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;





public class FrameRemito extends javax.swing.JInternalFrame {

  
   
  //  JWebBrowser navergador = new JWebBrowser();
    
    public FrameRemito() {
        initComponents();
      
       tablaRemitos.setDefaultRenderer(Object.class, new Render());
        btnVerFactura.setName("v");
        deleteRemito.setName("d");
      
        
        
        JTableHeader header = tablaRemitos.getTableHeader();
        
        header.setBackground(new Color(24,19,48));
        header.setForeground(new Color(156,39,176));
        header.setFont(new Font("Decker",Font.PLAIN,16));
        header.setBorder(null);
        
        AutoCompleteDecorator.decorate(ComboClientes);
         AutoCompleteDecorator.decorate(ComboObra);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }
    
    public void modificarTabla(){
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        laminaFondo = new javax.swing.JPanel();
        laminaSuperior = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        radioObra2 = new javax.swing.JRadioButton();
        radioCliente2 = new javax.swing.JRadioButton();
        jSeparator6 = new javax.swing.JSeparator();
        txtBuscarRemito2 = new javax.swing.JTextField();
        btnSubirRemito = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        laminaTablaCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRemitos = new javax.swing.JTable();
        laminaLateralFrameRemito = new javax.swing.JPanel();
        ComboObra = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtNumRemito = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ComboClientes = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtImporteRemito = new javax.swing.JTextField();
        JDate = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        checkbox = new javax.swing.JCheckBox();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(0, 0));

        laminaFondo.setLayout(new java.awt.BorderLayout());

        laminaSuperior.setBackground(new java.awt.Color(0, 0, 16));
        laminaSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("URW Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("Buscar");
        laminaSuperior.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 17, -1, -1));

        radioObra2.setBackground(new java.awt.Color(0, 0, 16));
        buttonGroup2.add(radioObra2);
        radioObra2.setFont(new java.awt.Font("URW Gothic", 0, 14)); // NOI18N
        radioObra2.setForeground(new java.awt.Color(204, 204, 255));
        radioObra2.setText("Obra");
        laminaSuperior.add(radioObra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(529, 22, 80, -1));

        radioCliente2.setBackground(new java.awt.Color(0, 0, 16));
        buttonGroup2.add(radioCliente2);
        radioCliente2.setFont(new java.awt.Font("URW Gothic", 0, 14)); // NOI18N
        radioCliente2.setForeground(new java.awt.Color(204, 204, 255));
        radioCliente2.setSelected(true);
        radioCliente2.setText("Cliente");
        laminaSuperior.add(radioCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 22, 80, -1));
        laminaSuperior.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 42, 170, 10));

        txtBuscarRemito2.setBackground(new java.awt.Color(0, 0, 16));
        txtBuscarRemito2.setBorder(null);
        laminaSuperior.add(txtBuscarRemito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 12, 170, 30));

        btnSubirRemito.setBackground(new java.awt.Color(0, 0, 16));
        btnSubirRemito.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        btnSubirRemito.setText("Subir remito");
        btnSubirRemito.setBorder(null);
        btnSubirRemito.setBorderPainted(false);
        btnSubirRemito.setContentAreaFilled(false);
        btnSubirRemito.setFocusPainted(false);
        btnSubirRemito.setOpaque(true);
        btnSubirRemito.setRolloverIcon(new javax.swing.ImageIcon("/home/ferc/NetBeansProjects/CtaCorrientes/CuentasCorrientes/src/iconosMaxi/arrow_up.png")); // NOI18N
        laminaSuperior.add(btnSubirRemito, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 160, 40));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.setFocusPainted(false);
        btnGuardar.setFocusTraversalPolicyProvider(true);
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon("/home/ferc/NetBeansProjects/CtaCorrientes/CuentasCorrientes/src/iconosMaxi/add1.png")); // NOI18N
        btnGuardar.setRolloverSelectedIcon(new javax.swing.ImageIcon("/home/ferc/NetBeansProjects/CtaCorrientes/CuentasCorrientes/src/iconosMaxi/add1.png")); // NOI18N
        laminaSuperior.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 120, -1));

        laminaFondo.add(laminaSuperior, java.awt.BorderLayout.PAGE_START);

        laminaTablaCenter.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tablaRemitos.setBackground(new java.awt.Color(0, 0, 16));
        tablaRemitos.setFont(new java.awt.Font("URW Gothic", 0, 12)); // NOI18N
        tablaRemitos.setForeground(new java.awt.Color(255, 255, 255));
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

        laminaTablaCenter.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        laminaLateralFrameRemito.setBackground(new java.awt.Color(0, 0, 16));
        laminaLateralFrameRemito.setPreferredSize(new java.awt.Dimension(356, 540));
        laminaLateralFrameRemito.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboObra.setEditable(true);
        ComboObra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ComboObra.setLightWeightPopupEnabled(false);
        laminaLateralFrameRemito.add(ComboObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 220, 30));

        jLabel1.setFont(new java.awt.Font("URW Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Num.R");
        laminaLateralFrameRemito.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 70, 30));

        txtNumRemito.setBackground(new java.awt.Color(0, 0, 16));
        txtNumRemito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNumRemito.setForeground(new java.awt.Color(255, 255, 255));
        txtNumRemito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumRemito.setBorder(null);
        laminaLateralFrameRemito.add(txtNumRemito, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 210, 40));

        jLabel3.setFont(new java.awt.Font("URW Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Fecha");
        laminaLateralFrameRemito.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, -1));

        jLabel4.setFont(new java.awt.Font("URW Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Obra");
        laminaLateralFrameRemito.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 50, -1));

        jLabel6.setFont(new java.awt.Font("URW Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Cliente");
        laminaLateralFrameRemito.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        ComboClientes.setEditable(true);
        ComboClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ComboClientes.setLightWeightPopupEnabled(false);
        laminaLateralFrameRemito.add(ComboClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 220, 30));

        jLabel11.setFont(new java.awt.Font("URW Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Importe");
        laminaLateralFrameRemito.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));
        laminaLateralFrameRemito.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 210, 10));
        laminaLateralFrameRemito.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 210, 10));

        txtImporteRemito.setBackground(new java.awt.Color(0, 0, 16));
        txtImporteRemito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtImporteRemito.setForeground(new java.awt.Color(255, 255, 255));
        txtImporteRemito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtImporteRemito.setBorder(null);
        laminaLateralFrameRemito.add(txtImporteRemito, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 160, 30));

        JDate.setBackground(new java.awt.Color(0, 0, 16));
        JDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JDate.setForeground(new java.awt.Color(255, 255, 255));
        JDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JDate.setBorder(null);
        laminaLateralFrameRemito.add(JDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 210, 40));
        laminaLateralFrameRemito.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 210, 10));

        checkbox.setBackground(new java.awt.Color(0, 0, 16));
        checkbox.setFont(new java.awt.Font("URW Gothic", 0, 14)); // NOI18N
        checkbox.setForeground(new java.awt.Color(204, 204, 255));
        checkbox.setText("Cierre cuenta");
        laminaLateralFrameRemito.add(checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, 40));

        laminaTablaCenter.add(laminaLateralFrameRemito, java.awt.BorderLayout.LINE_END);

        laminaFondo.add(laminaTablaCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(laminaFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laminaFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public JButton btnVerFactura = new JButton(new ImageIcon(getClass().getResource("/VIOLETA/acrobat.png")));
     public JButton deleteRemito = new JButton (new ImageIcon(getClass().getResource("/cyan/trash_can.png")));

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<Cliente> ComboClientes;
    public javax.swing.JComboBox<Obra> ComboObra;
    public javax.swing.JTextField JDate;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnSubirRemito;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JCheckBox checkbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel laminaFondo;
    public javax.swing.JPanel laminaLateralFrameRemito;
    public javax.swing.JPanel laminaSuperior;
    private javax.swing.JPanel laminaTablaCenter;
    public javax.swing.JRadioButton radioCliente2;
    public javax.swing.JRadioButton radioObra2;
    public javax.swing.JTable tablaRemitos;
    public javax.swing.JTextField txtBuscarRemito2;
    public javax.swing.JTextField txtImporteRemito;
    public javax.swing.JTextField txtNumRemito;
    // End of variables declaration//GEN-END:variables
}
