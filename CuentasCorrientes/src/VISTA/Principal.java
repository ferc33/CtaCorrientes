/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import java.awt.Color;

/**
 *
 * @author maxid
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        
//new CambiaPanel(escritorio,frameObra);
       
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBack = new java.awt.Panel();
        escritorio = new javax.swing.JDesktopPane();
        panelMenu = new javax.swing.JPanel();
        btnRemito1 = new rsbuttom.RSButtonMetro();
        btnLabelObra = new rsbuttom.RSButtonMetro();
        btnVerRemito = new rsbuttom.RSButtonMetro();
        btnLabelCliente = new rsbuttom.RSButtonMetro();
        jPanel1 = new javax.swing.JPanel();
        btnLamina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        panelBack.setBackground(new java.awt.Color(255, 255, 255));

        escritorio.setPreferredSize(new java.awt.Dimension(640, 410));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRemito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collection.png"))); // NOI18N
        btnRemito1.setText("REMITO                      +");
        btnRemito1.setActionCommand("");
        btnRemito1.setColorHover(new java.awt.Color(204, 204, 204));
        btnRemito1.setColorNormal(new java.awt.Color(214, 217, 223));
        btnRemito1.setColorPressed(new java.awt.Color(204, 204, 204));
        btnRemito1.setColorTextHover(new java.awt.Color(128, 128, 131));
        btnRemito1.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btnRemito1.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btnRemito1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRemito1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRemito1.setIconTextGap(25);
        btnRemito1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRemito1MousePressed(evt);
            }
        });
        panelMenu.add(btnRemito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 250, 50));

        btnLabelObra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        btnLabelObra.setText("OBRA                         +");
        btnLabelObra.setActionCommand("");
        btnLabelObra.setColorHover(new java.awt.Color(204, 204, 204));
        btnLabelObra.setColorNormal(new java.awt.Color(214, 217, 223));
        btnLabelObra.setColorPressed(new java.awt.Color(204, 204, 204));
        btnLabelObra.setColorTextHover(new java.awt.Color(128, 128, 131));
        btnLabelObra.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btnLabelObra.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btnLabelObra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLabelObra.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLabelObra.setIconTextGap(25);
        panelMenu.add(btnLabelObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 250, 50));

        btnVerRemito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        btnVerRemito.setText("CUENTA CORRIENTE   +");
        btnVerRemito.setActionCommand("");
        btnVerRemito.setColorHover(new java.awt.Color(204, 204, 204));
        btnVerRemito.setColorNormal(new java.awt.Color(214, 217, 223));
        btnVerRemito.setColorPressed(new java.awt.Color(204, 204, 204));
        btnVerRemito.setColorTextHover(new java.awt.Color(128, 128, 131));
        btnVerRemito.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btnVerRemito.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btnVerRemito.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVerRemito.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVerRemito.setIconTextGap(25);
        btnVerRemito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVerRemitoMousePressed(evt);
            }
        });
        panelMenu.add(btnVerRemito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 250, 50));

        btnLabelCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/market.png"))); // NOI18N
        btnLabelCliente.setText("CLIENTE                     +");
        btnLabelCliente.setActionCommand("");
        btnLabelCliente.setColorHover(new java.awt.Color(204, 204, 204));
        btnLabelCliente.setColorNormal(new java.awt.Color(214, 217, 223));
        btnLabelCliente.setColorPressed(new java.awt.Color(204, 204, 204));
        btnLabelCliente.setColorTextHover(new java.awt.Color(128, 128, 131));
        btnLabelCliente.setColorTextNormal(new java.awt.Color(128, 128, 131));
        btnLabelCliente.setColorTextPressed(new java.awt.Color(128, 128, 131));
        btnLabelCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLabelCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLabelCliente.setIconTextGap(25);
        panelMenu.add(btnLabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 250, 40));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(null);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLamina.setBackground(new java.awt.Color(51, 51, 51));
        btnLamina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        btnLamina.setBorder(null);
        btnLamina.setContentAreaFilled(false);
        btnLamina.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLamina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaminaActionPerformed(evt);
            }
        });
        jPanel1.add(btnLamina, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 50));

        javax.swing.GroupLayout panelBackLayout = new javax.swing.GroupLayout(panelBack);
        panelBack.setLayout(panelBackLayout);
        panelBackLayout.setHorizontalGroup(
            panelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackLayout.createSequentialGroup()
                .addGroup(panelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBackLayout.createSequentialGroup()
                        .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelBackLayout.setVerticalGroup(
            panelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemito1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemito1MousePressed
        this.btnLabelObra.setSelected(false);
        this.btnRemito1.setSelected(true);
        this.btnLabelCliente.setSelected(false);
        this.btnVerRemito.setSelected(false);
    }//GEN-LAST:event_btnRemito1MousePressed

    private void btnVerRemitoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerRemitoMousePressed

    }//GEN-LAST:event_btnVerRemitoMousePressed

    private void btnLaminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaminaActionPerformed
         int posicion = this.panelMenu.getX();
        if(posicion > -1 ){
            Animacion.Animacion.mover_izquierda(0, -270, 2, 2, panelMenu);
        }else{
            Animacion.Animacion.mover_derecha(-270, 0, 2, 2, panelMenu);
        }
    }//GEN-LAST:event_btnLaminaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rsbuttom.RSButtonMetro btnLabelCliente;
    public rsbuttom.RSButtonMetro btnLabelObra;
    public javax.swing.JButton btnLamina;
    public rsbuttom.RSButtonMetro btnRemito1;
    public rsbuttom.RSButtonMetro btnVerRemito;
    public javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel jPanel1;
    public java.awt.Panel panelBack;
    public javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
    public FrameObra frameObra;
    public FrameVerRemitos frameRemitos=new FrameVerRemitos();
    public rsbuttom.RSButtonMetro btnObra;
    public rsbuttom.RSButtonMetro btnRemito;
    

}
