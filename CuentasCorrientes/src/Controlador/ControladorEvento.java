package Controlador;

import Modelo.BaseDatos;
import Modelo.Cliente;
import Modelo.CrearCarpetaCliente;
import Modelo.Obra;
import Modelo.Remito;
import vistaMain.FrameCliente;
import vistaMain.FrameObra;
import vistaMain.FrameRemito;
import vistaMain.Principal;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ControladorEvento {

    Principal principal;
    FrameObra frameObra;
    FrameRemito frameRemito;
    FrameCliente frameCliente;

    private BaseDatos bd;
    private DefaultTableModel modeloTablaRemitos = new DefaultTableModel();

    private DefaultComboBoxModel modeloComboObra = new DefaultComboBoxModel();
    private DefaultComboBoxModel modeloComboClientes = new DefaultComboBoxModel();
    private final String rutaPrincipal1 = "C:/Users/maxid/remitos";
    private final String rutaPrincipal = "/home/ferc/Imagenes/remitos";
    private CrearCarpetaCliente createFile;
    String rutaRemito = "";
    String seleccion1 = "";

    private String path = null;

    public ControladorEvento(Principal principal, BaseDatos bd, FrameCliente frameCliente, FrameObra frameObra,
                                                                                    FrameRemito frameRemito) {

        this.principal = principal;
        this.bd = bd;

        this.frameCliente = frameCliente;
        this.frameObra = frameObra;
        this.frameRemito = frameRemito;

        cargarModeloTabla();

        cargarModeloCombocliente();

        cargarModeloComboObra();

        //MODIFICAR EL CLIENTE
        this.frameCliente.btnModificarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int id = (frameCliente.comboClientes.getSelectedIndex() + 1);

                System.out.println(id);

                String nombre = JOptionPane.showInputDialog("Modificar Cliente");

                Cliente n = new Cliente(id, nombre);

                bd.modificarCliente(n);

                refrescarClientes(n);

            }

        });
        //ELIMINAR CLIENTE
        this.frameCliente.btnEliminarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int indice = frameCliente.comboClientes.getSelectedIndex() + 1;

                Cliente n = new Cliente(indice);

                if (n != null) {
                    bd.eliminaCliente(n);

                    refrescarClientes(n);
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede eliminar" + n);
                }

            }

        });

        this.principal.btnLabelObra.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {

                principal.escritorio.removeAll();
                principal.escritorio.repaint();
                principal.escritorio.add(frameObra, BorderLayout.CENTER);

                frameObra.show();


            }

        });

        this.principal.btnRemito1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                principal.escritorio.removeAll();
                principal.escritorio.repaint();
                principal.escritorio.add(frameRemito, BorderLayout.CENTER);

                frameRemito.show();

            }

        });

        this.principal.btnLabelCliente.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {

                principal.escritorio.removeAll();
                principal.escritorio.repaint();
                principal.escritorio.add(frameCliente, BorderLayout.CENTER);

                frameCliente.show();

            }

        });

        frameObra.lblInsertarObra.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {

                Obra obra = enviarObra();
                bd.insertNuevaObra(obra);

            }

        });

        frameCliente.btnInsertaCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Cliente nuevoCliente = enviarCliente();
                bd.insertNuevoCliente(nuevoCliente);

                refrescarClientes(nuevoCliente);
            }

        });

        this.frameRemito.btnSubirRemito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double importe = 0;

                createFile = new CrearCarpetaCliente();
                File remito = getFile();
                String nombreCarpetaObra = frameRemito.ComboObra.getSelectedItem().toString();
                String path = "";
                int idCliente = frameRemito.ComboClientes.getSelectedIndex() + 1;
                int idObra = frameRemito.ComboObra.getSelectedIndex() + 1;
                String pathRemito = remito.getAbsolutePath();
                String numRemito = frameRemito.txtNumRemito.getText();
                String fechaRemito = frameRemito.JDate.getText();

                String nombreRemito = remito.getName();
                String nombreCarpetaCliente = frameRemito.ComboClientes.getSelectedItem().toString();

                if (numRemito != null || fechaRemito != null) {
                    //createFile.crearCarpeta(nombreCarpetaCliente, nombreCarpetaObra);
                    createFile.crearCarpeta(rutaPrincipal + "/" + nombreCarpetaCliente, nombreCarpetaObra);
                    createFile.renameFile(pathRemito, rutaPrincipal + "/" + nombreCarpetaCliente + "/" + nombreCarpetaObra + "/" + numRemito + " " + fechaRemito + ".pdf");
                    createFile.moveFile(pathRemito, rutaPrincipal + "/" + nombreCarpetaCliente + "/" + nombreCarpetaObra + "/" + nombreRemito);
                    //createFile.moveFile(pathRemito, rutaPrincipal);

                    System.out.println(pathRemito + " -- " + rutaPrincipal + "/" + nombreCarpetaCliente + "/" + nombreCarpetaObra + "/" + nombreRemito);

                    if (frameRemito.checkbox.isSelected()) {
                        importe = Double.parseDouble(frameRemito.txtImporteRemito.getText());
                    } else {
                        importe = 0;
                    }
                    insertaRemito(numRemito, fechaRemito, rutaPrincipal + "/" + nombreCarpetaCliente + "/" + nombreCarpetaObra + "/" + numRemito + " " + fechaRemito + ".pdf", idObra, idCliente, importe);

                }
            }

        });

        frameRemito.checkbox.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                boolean state = frameRemito.checkbox.isSelected();

                if (state == true) {
                    frameRemito.txtImporteRemito.setEnabled(true);
                } else {
                    frameRemito.txtImporteRemito.setEnabled(false);
                }

            }
        });

        frameRemito.ComboClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frameRemito.ComboObra.setModel(modeloComboObra);

                modeloComboObra.removeAllElements();

                ArrayList<Obra> listaObra = bd.selectObra(frameRemito.ComboClientes.getSelectedIndex() + 1);

                for (Obra c : listaObra) {

                    modeloComboObra.addElement(c);

                }

            }

        });

        this.frameRemito.txtBuscarRemito2.addKeyListener(new KeyAdapter() {

            public void keyReleased(KeyEvent e) {

                limpiarTabla();

                String criterio = frameRemito.txtBuscarRemito2.getText();

                recibeCTAPorCriterio(criterio);

                frameRemito.tablaRemitos.setModel(modeloTablaRemitos);
            }

        });

        this.frameRemito.tablaRemitos.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent evt) {

                int rown = frameRemito.tablaRemitos.rowAtPoint(evt.getPoint());
                int column = frameRemito.tablaRemitos.getColumnModel().getColumnIndexAtX(evt.getX());
                int row = evt.getY() / frameRemito.tablaRemitos.getRowHeight();

                if (row < frameRemito.tablaRemitos.getRowCount() && row >= 0 && column < frameRemito.tablaRemitos.getColumnCount() && column >= 0) {
                    Object value = frameRemito.tablaRemitos.getValueAt(row, column);

                    if (value instanceof JButton) {

                        ((JButton) value).doClick();
                        JButton boton = (JButton) value;

                        if (boton.getName().equals("v")) {

                            String numRemito = (String) frameRemito.tablaRemitos.getValueAt(rown, 3);

                            System.out.println(numRemito);
                            verRemito(numRemito);

                            try {
                                Desktop.getDesktop().open(new File(rutaRemito));
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "El remito o carpeta no se encuentran\n verifique si no ha eliminado nada ");

                            }
                        } else if (boton.getName().equals("d")) {

                       
                          Object idCliente = frameRemito.tablaRemitos.getValueAt(rown, 0);
                        
                            
                            bd.borrarRemito(idCliente);
                            
                           
                        }

                    }
                }

            }

        });
    }

    //HACE REFRESCO DE COMBOBOX DE CLIENTE
    private void refrescarClientes(Cliente c) {
        frameCliente.comboClientes.addItem(c);
        frameCliente.comboClientes.setModel(modeloComboClientes);
        modeloComboClientes.setSelectedItem(c);

    }

    public void recibeCTAPorCriterio(String criterio) {

        ResultSet rs = null;

        if (frameRemito.radioCliente2.isSelected()) {

            rs = bd.dameCtaPorCliente(criterio);
        } else {

            rs = bd.dameCtaPorObra(criterio);
        }
        try {

            ResultSetMetaData metaData = rs.getMetaData();
            int numColumnas = metaData.getColumnCount();

            while (rs.next()) {

                Object fila[] = new Object[numColumnas + 1];

                for (int i = 0; i < numColumnas; i++) {

                    fila[0] = rs.getObject(1);
                    fila[1] = rs.getObject(2);
                    fila[2] = rs.getObject(3);
                    fila[3] = rs.getObject(4);
                    fila[4] = rs.getObject(5);
                    fila[5] = this.frameRemito.btnVerFactura;
                    fila[6] = this.frameRemito.deleteRemito;

                }

                modeloTablaRemitos.addRow(fila);

            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public void recibeCTAPorCliente(String cliente) {

        ResultSet rs = null;

        rs = bd.dameCtaPorCliente2(cliente);
        try {

            ResultSetMetaData metaData = rs.getMetaData();
            int numColumnas = metaData.getColumnCount();

            while (rs.next()) {

                Object fila[] = new Object[numColumnas + 1];

                for (int i = 0; i < numColumnas; i++) {

                    fila[0] = rs.getObject(1);
                    fila[1] = rs.getObject(2);
                    fila[2] = rs.getObject(3);
                    fila[3] = rs.getObject(4);
                    fila[4] = rs.getObject(5);
                    fila[5] = this.frameRemito.btnVerFactura;
                    fila[6] = this.frameRemito.deleteRemito;
                    

                }

                modeloTablaRemitos.addRow(fila);

            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public void recibeCTAPorClienteyObra(String cliente, String obra) {

        ResultSet rs = null;

        rs = bd.dameCtaPorClienteyObra(cliente, obra);
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int numColumnas = metaData.getColumnCount();

            while (rs.next()) {

                Object fila[] = new Object[numColumnas + 1];

                for (int i = 0; i < numColumnas; i++) {

                    fila[0] = rs.getObject(1);
                    fila[1] = rs.getObject(2);
                    fila[2] = rs.getObject(3);
                    fila[3] = rs.getObject(4);
                    fila[4] = rs.getObject(5);
                    fila[5] = this.frameRemito.btnVerFactura;
                    fila[6] = this.frameRemito.deleteRemito;

                }

                modeloTablaRemitos.addRow(fila);

            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public void limpiarTabla() {
        int filas = modeloTablaRemitos.getRowCount();

        if (filas > 0) {

            for (int i = filas - 1; i >= 0; i--) {
                modeloTablaRemitos.removeRow(i);
            }
        }

    }

    public Cliente enviarCliente() {

        String nombreCliente = frameCliente.txtNombreCliente.getText();
        String telCliente = frameCliente.txtTelCliente.getText();
        String email = frameCliente.txtEmailCliente.getText();
        boolean esInst = false;

        if (frameCliente.CheckTrue.isSelected()) {
            esInst = true;
        } else {
            esInst = false;

        }

        Cliente cliente = new Cliente(nombreCliente, telCliente, email, esInst);

        return cliente;

    }

    public Obra enviarObra() {

        String nuevaObra = frameObra.txtNuevaObra.getText();

        int idCliente = frameObra.comboClientes.getSelectedIndex() + 1;

        Obra obra = new Obra(nuevaObra, idCliente);

        return obra;

    }

    public void cargarModeloTabla() {

      // modeloTablaRemitos.addColumn("Id");
        modeloTablaRemitos.addColumn("Cliente");
        modeloTablaRemitos.addColumn("Obra");
        modeloTablaRemitos.addColumn("Instalador");
        modeloTablaRemitos.addColumn("N°remito");
        modeloTablaRemitos.addColumn("Importe");
        modeloTablaRemitos.addColumn("Pdf");
        modeloTablaRemitos.addColumn("Delete");

      //  TableColumnModel columnModel = frameRemito.tablaRemitos.getColumnModel();

    }
//MODELO DE COMBOBOX DE CLIENTE

    private void cargarModeloCombocliente() {
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        listaCliente = bd.selectClientes();

        for (Cliente c : listaCliente) {
            modeloComboClientes.addElement(c);

        }
        frameRemito.ComboClientes.setModel(modeloComboClientes);
        frameCliente.comboClientes.setModel(modeloComboClientes);
        frameObra.comboClientes.setModel(modeloComboClientes);
    }
//MODELO DE COMBOBOX DE OBRA 

    private void cargarModeloComboObra() {
        ArrayList<Obra> listaObra = new ArrayList<>();
        listaObra = bd.selectObra();

        for (Obra c : listaObra) {
            modeloComboObra.addElement(c);

        }
        frameRemito.ComboObra.setModel(modeloComboObra);

    }

    //OBTIENE EL NOMBRE DEL ARCHIVO 
    public File getFile() {

        JFileChooser fc = new JFileChooser();

        int seleccion = fc.showOpenDialog(frameRemito);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            fichero = fc.getSelectedFile();

            //System.out.println(path);
        } else if (seleccion == JFileChooser.CANCEL_OPTION) {

        }
        return fichero;

    }

    public void verRemito(String numRemito) {

        ImageIcon ImagenGasto = null;

        byte[] b = null;

        try {

            ResultSet rs = bd.getRemito(numRemito);

            while (rs.next()) {

                rutaRemito = rs.getString("ARCHIVO");
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public void insertaRemito(String numRemito, String fechaRemito, String rutaArchivo, int idObra, int idCliente, double importe) {

        Remito remito = new Remito(numRemito, fechaRemito, idObra, idCliente, rutaArchivo, importe);

        bd.insertRemito(remito);

    }

    private File fichero;

}
