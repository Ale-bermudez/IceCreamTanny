package vistas;

import java.awt.Color;
import static java.awt.Color.RED;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modelo.Detalle;
import modelo.Productos;
import modelo.ProductosDAO;
import modelo.Socios;
import modelo.SociosDAO;
import modelo.Venta;
import modelo.VentaDAO;
import modelo.Deuda;
import modelo.DeudaDAO;
import modelo.Cierre;
import modelo.CierreDAO;
import modelo.Eventos;
import modelo.Pdf;
import modelo.Login;

public class Sistema extends javax.swing.JFrame {

    private Double divisa;
    private Double fondo;

    DefaultTableModel modeloSocios = new DefaultTableModel();
    DefaultTableModel modeloVenta = new DefaultTableModel();
    DefaultTableModel modeloProductos = new DefaultTableModel();
    DefaultTableModel modeloCierre = new DefaultTableModel();
    DefaultTableModel modeloVentasRealizadas = new DefaultTableModel();

    Socios cl = new Socios();
    SociosDAO client = new SociosDAO();

    Productos pro = new Productos();
    ProductosDAO proDao = new ProductosDAO();

    Venta v = new Venta();
    VentaDAO vDao = new VentaDAO();

    Detalle dv = new Detalle();
    Deuda deu = new Deuda();

    DeudaDAO deuDAO = new DeudaDAO();
    Eventos event = new Eventos();

    Cierre cr = new Cierre();
    CierreDAO crDao = new CierreDAO();

    Login lg = new Login();

    Pdf pdf = new Pdf();

    int metodo = 0;

    final ImageIcon mas = new ImageIcon(this.getClass().getResource("/img/mas.png"));
    final ImageIcon menos = new ImageIcon(this.getClass().getResource("/img/menos.png"));
    final ImageIcon eliminar = new ImageIcon(this.getClass().getResource("/img/eliminar.png"));

    Double dolar = 0.0D;

    public Sistema(Double divisa, Double fondo) {
        this.initComponents();
        this.setIconImage((new ImageIcon(this.getClass().getResource("/img/logo.png"))).getImage());
        this.setLocationRelativeTo((Component) null);
        this.crearBotones();

        this.modeloSocios = (DefaultTableModel) this.TableSocios.getModel();
        this.modeloVenta = (DefaultTableModel) this.tablaVentas.getModel();
        this.modeloProductos = (DefaultTableModel) this.tablaProductos.getModel();
        this.modeloCierre = (DefaultTableModel) this.tablaCierre.getModel();
        this.modeloVentasRealizadas = (DefaultTableModel) this.tablaVentasRealizadas.getModel();

        this.txtDivisa.setText(divisa.toString());
        this.txtFondo.setText(fondo.toString());
        this.dolar = Double.parseDouble(this.txtDivisa.getText());
        this.txtID.setVisible(false);
        this.txtIDproductos.setVisible(false);
        this.txtIdProducto2.setVisible(false);
        this.txtIdSocio.setVisible(false);
        this.tipoTxt.setVisible(false);
        this.idCierre.setVisible(false);
        this.txtFondo.setVisible(false);
        this.modoAnterior.setVisible(false);
        this.totalBolivares.setDisabledTextColor(Color.BLACK);
        this.totalDolares.setDisabledTextColor(Color.BLACK);
        this.aFavortxt.setDisabledTextColor(Color.BLACK);
        this.txtFfondo.setDisabledTextColor(Color.BLACK);
        this.scrollPane.setHorizontalScrollBarPolicy(30);
        this.scrollPane.setVerticalScrollBarPolicy(21);
        this.TableSocios.setRowHeight(30);

    }

    public Sistema() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        MenuPanel = new javax.swing.JPanel();
        ventaBoton = new javax.swing.JButton();
        sociosBoton = new javax.swing.JButton();
        productosBoton = new javax.swing.JButton();
        configBoton = new javax.swing.JButton();
        logoLb = new javax.swing.JLabel();
        DivisaLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtFondo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDivisa = new javax.swing.JLabel();
        configBoton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        PanelPrincipal = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        lbAccion = new javax.swing.JLabel();
        txtAccion2 = new javax.swing.JTextField();
        lbStatus = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lbNombre = new javax.swing.JLabel();
        txtIdSocio = new javax.swing.JTextField();
        txtIdProducto2 = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtProductos2 = new javax.swing.JTextField();
        lbProducto = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        lbCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btAgregar = new javax.swing.JButton();
        lbTotalbs = new javax.swing.JLabel();
        totalBolivares = new javax.swing.JTextField();
        lbTotaldivisa = new javax.swing.JLabel();
        totalDolares = new javax.swing.JTextField();
        cobrarButton = new javax.swing.JButton();
        guardarDeuda = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        PanelButtonsMenu = new javax.swing.JPanel();
        txtNombreSocio = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aFavortxt = new javax.swing.JTextField();
        tarjeta = new javax.swing.JCheckBox();
        efectivo = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        comboTipo1 = new javax.swing.JComboBox<>();
        pm = new javax.swing.JCheckBox();
        PanelSocios = new javax.swing.JPanel();
        lbCedula = new javax.swing.JLabel();
        lbNombreSocio = new javax.swing.JLabel();
        lbApellido = new javax.swing.JLabel();
        lbAccionSocio = new javax.swing.JLabel();
        lbTelefono = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtAccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableSocios = new javax.swing.JTable();
        guardarSocio = new javax.swing.JButton();
        eliminarSocio = new javax.swing.JButton();
        modificarSocio = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        limpiarBoton = new javax.swing.JButton();
        lbTituloSocio = new javax.swing.JLabel();
        lbAfavor = new javax.swing.JLabel();
        txtAfavorSoc = new javax.swing.JTextField();
        buscaSocio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        socioChb = new javax.swing.JRadioButton();
        consesionarioChb = new javax.swing.JRadioButton();
        trabajadorChb = new javax.swing.JRadioButton();
        tipoTxt = new javax.swing.JTextField();
        lbImageSocios = new javax.swing.JLabel();
        txtStatusSocio = new javax.swing.JTextField();
        jrAdmin = new javax.swing.JRadioButton();
        PanelProductos = new javax.swing.JPanel();
        lbNombreProd = new javax.swing.JLabel();
        lbPrecioDivisa = new javax.swing.JLabel();
        lbPorcentaje = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtPorcentaje = new javax.swing.JTextField();
        bGuardarProd = new javax.swing.JButton();
        bEliminarProd = new javax.swing.JButton();
        bModificarProd = new javax.swing.JButton();
        bNuevoProd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        txtIDproductos = new javax.swing.JTextField();
        lbTituloProductos = new javax.swing.JLabel();
        buscaProducto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PanelCierres = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCierre = new javax.swing.JTable();
        lbTituloProductos1 = new javax.swing.JLabel();
        TotalEfect = new javax.swing.JTextField();
        totalEfectivoCierre = new javax.swing.JLabel();
        totalTarjetaCierre = new javax.swing.JLabel();
        TotalTarj = new javax.swing.JTextField();
        TotalTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        idCierre = new javax.swing.JTextField();
        totalFondo = new javax.swing.JLabel();
        TotalFondoTxt = new javax.swing.JTextField();
        fondoLb = new javax.swing.JLabel();
        fondoTxt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        pmCierre = new javax.swing.JLabel();
        pmTxtCierre = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Lapso = new javax.swing.JComboBox<>();
        searchProd = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbTituloProductos2 = new javax.swing.JLabel();
        lbMiselanius = new javax.swing.JLabel();
        lbDatosventas = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaVentasRealizadas = new javax.swing.JTable();
        modoTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pmTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tarjTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        efecTxt = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtTarjeta2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEfectivo2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPm2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtSub = new javax.swing.JTextField();
        idVentatxt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtFfondo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        modoAnterior = new javax.swing.JTextField();
        totalTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ice Cream Tanny");
        setBackground(new java.awt.Color(108, 0, 0));
        setMinimumSize(new java.awt.Dimension(1440, 850));
        setPreferredSize(new java.awt.Dimension(1440, 850));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPanel.setBackground(new java.awt.Color(84, 18, 18));

        ventaBoton.setBackground(new java.awt.Color(108, 0, 0));
        ventaBoton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        ventaBoton.setForeground(new java.awt.Color(255, 255, 255));
        ventaBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Carrito-de-compras.png"))); // NOI18N
        ventaBoton.setText("Ventas  ");
        ventaBoton.setBorderPainted(false);
        ventaBoton.setFocusPainted(false);
        ventaBoton.setPreferredSize(new java.awt.Dimension(75, 25));
        ventaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaBotonActionPerformed(evt);
            }
        });

        sociosBoton.setBackground(new java.awt.Color(108, 0, 0));
        sociosBoton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        sociosBoton.setForeground(new java.awt.Color(255, 255, 255));
        sociosBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clientes.png"))); // NOI18N
        sociosBoton.setText("Socios  ");
        sociosBoton.setBorderPainted(false);
        sociosBoton.setFocusPainted(false);
        sociosBoton.setMaximumSize(new java.awt.Dimension(75, 25));
        sociosBoton.setMinimumSize(new java.awt.Dimension(75, 25));
        sociosBoton.setPreferredSize(new java.awt.Dimension(75, 25));
        sociosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sociosBotonActionPerformed(evt);
            }
        });

        productosBoton.setBackground(new java.awt.Color(108, 0, 0));
        productosBoton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        productosBoton.setForeground(new java.awt.Color(255, 255, 255));
        productosBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        productosBoton.setText("Productos  ");
        productosBoton.setBorderPainted(false);
        productosBoton.setFocusPainted(false);
        productosBoton.setMaximumSize(new java.awt.Dimension(75, 25));
        productosBoton.setMinimumSize(new java.awt.Dimension(75, 25));
        productosBoton.setPreferredSize(new java.awt.Dimension(75, 25));
        productosBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosBotonActionPerformed(evt);
            }
        });

        configBoton.setBackground(new java.awt.Color(108, 0, 0));
        configBoton.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        configBoton.setForeground(new java.awt.Color(255, 255, 255));
        configBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/torta.png"))); // NOI18N
        configBoton.setText("Cerrar Caja   ");
        configBoton.setBorderPainted(false);
        configBoton.setFocusPainted(false);
        configBoton.setMaximumSize(new java.awt.Dimension(75, 25));
        configBoton.setMinimumSize(new java.awt.Dimension(75, 25));
        configBoton.setPreferredSize(new java.awt.Dimension(75, 25));
        configBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configBotonActionPerformed(evt);
            }
        });

        logoLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N

        DivisaLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DivisaLabel.setForeground(new java.awt.Color(255, 255, 255));
        DivisaLabel.setText("Precio Divisa");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(268, 10));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(234, 10));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(213, 10));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(233, 10));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(127, 10));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jLabel12.setText("Create By Alejandro Bermudez");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cambiar Precio");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        txtDivisa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDivisa.setForeground(new java.awt.Color(255, 255, 255));

        configBoton1.setBackground(new java.awt.Color(108, 0, 0));
        configBoton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        configBoton1.setForeground(new java.awt.Color(255, 255, 255));
        configBoton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ayuda.png"))); // NOI18N
        configBoton1.setText("Miscelaneos");
        configBoton1.setBorderPainted(false);
        configBoton1.setFocusPainted(false);
        configBoton1.setMaximumSize(new java.awt.Dimension(75, 25));
        configBoton1.setMinimumSize(new java.awt.Dimension(75, 25));
        configBoton1.setPreferredSize(new java.awt.Dimension(75, 25));
        configBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configBoton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoLb, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addGroup(MenuPanelLayout.createSequentialGroup()
                            .addComponent(DivisaLabel)
                            .addGap(18, 18, 18)
                            .addComponent(txtDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13))
                        .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(configBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(productosBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sociosBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ventaBoton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(configBoton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                        .addComponent(txtFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(logoLb)))
                .addGap(27, 27, 27)
                .addComponent(ventaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sociosBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productosBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(configBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(configBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DivisaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        getContentPane().add(MenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 900));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/encabezado.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1180, 140));

        tabbedPane.setBackground(new java.awt.Color(108, 0, 0));
        tabbedPane.setPreferredSize(new java.awt.Dimension(1314, 700));
        tabbedPane.setRequestFocusEnabled(false);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(1314, 700));

        tablaVentas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Precio", "Cantidad", "Sub-Total", "Fecha", "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVentas.setGridColor(new java.awt.Color(0, 0, 0));
        tablaVentas.setSelectionBackground(new java.awt.Color(153, 0, 0));
        tablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaVentas);
        if (tablaVentas.getColumnModel().getColumnCount() > 0) {
            tablaVentas.getColumnModel().getColumn(0).setResizable(false);
            tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaVentas.getColumnModel().getColumn(1).setResizable(false);
            tablaVentas.getColumnModel().getColumn(2).setResizable(false);
            tablaVentas.getColumnModel().getColumn(3).setResizable(false);
            tablaVentas.getColumnModel().getColumn(4).setResizable(false);
            tablaVentas.getColumnModel().getColumn(5).setResizable(false);
            tablaVentas.getColumnModel().getColumn(5).setPreferredWidth(600);
            tablaVentas.getColumnModel().getColumn(6).setMinWidth(24);
            tablaVentas.getColumnModel().getColumn(6).setPreferredWidth(24);
            tablaVentas.getColumnModel().getColumn(6).setMaxWidth(24);
            tablaVentas.getColumnModel().getColumn(7).setMinWidth(24);
            tablaVentas.getColumnModel().getColumn(7).setPreferredWidth(24);
            tablaVentas.getColumnModel().getColumn(7).setMaxWidth(24);
            tablaVentas.getColumnModel().getColumn(8).setMinWidth(24);
            tablaVentas.getColumnModel().getColumn(8).setPreferredWidth(24);
            tablaVentas.getColumnModel().getColumn(8).setMaxWidth(24);
        }

        lbAccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbAccion.setText("Accion o Nombre");

        txtAccion2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAccion2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccion2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAccion2KeyTyped(evt);
            }
        });

        lbStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbStatus.setText("Status");
        lbStatus.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lbNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNombre.setText("Nombre del Socio");

        txtIdSocio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIdSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdSocioActionPerformed(evt);
            }
        });

        txtPrecioVenta.setEditable(false);
        txtPrecioVenta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtProductos2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        txtProductos2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductos2KeyReleased(evt);
            }
        });

        lbProducto.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbProducto.setText("Nombre del producto");

        lbPrecio.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbPrecio.setText("Precio");

        lbCantidad.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbCantidad.setText("Cantidad");

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        btAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        lbTotalbs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTotalbs.setText("Total Bolivares");

        totalBolivares.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        totalBolivares.setText("Bs.");
        totalBolivares.setEnabled(false);
        totalBolivares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBolivaresActionPerformed(evt);
            }
        });

        lbTotaldivisa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTotaldivisa.setText("Total en Dolares");

        totalDolares.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        totalDolares.setText("$");
        totalDolares.setEnabled(false);

        cobrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money.png"))); // NOI18N
        cobrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobrarButtonActionPerformed(evt);
            }
        });

        guardarDeuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        guardarDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDeudaActionPerformed(evt);
            }
        });

        scrollPane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelButtonsMenuLayout = new javax.swing.GroupLayout(PanelButtonsMenu);
        PanelButtonsMenu.setLayout(PanelButtonsMenuLayout);
        PanelButtonsMenuLayout.setHorizontalGroup(
            PanelButtonsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1287, Short.MAX_VALUE)
        );
        PanelButtonsMenuLayout.setVerticalGroup(
            PanelButtonsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        scrollPane.setViewportView(PanelButtonsMenu);

        txtNombreSocio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombreSocio.setEnabled(false);
        txtNombreSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreSocioActionPerformed(evt);
            }
        });

        txtStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(0, 102, 51));
        txtStatus.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Modo de Pago: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Saldo");

        aFavortxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        aFavortxt.setForeground(new java.awt.Color(0, 102, 51));
        aFavortxt.setText("0");
        aFavortxt.setEnabled(false);
        aFavortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aFavortxtActionPerformed(evt);
            }
        });

        tarjeta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tarjeta.setText("Tarjeta");

        efectivo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        efectivo.setText("Efectivo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Tipo");

        comboTipo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboTipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Socio", "Trabajador", "Concesionario", "Administracion" }));
        comboTipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipo1ActionPerformed(evt);
            }
        });

        pm.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pm.setText("Pago Movil");

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(lbAccion)
                        .addGap(18, 18, 18)
                        .addComponent(txtAccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbStatus)
                        .addGap(18, 18, 18)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbProducto)
                                    .addComponent(lbPrecio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(txtProductos2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIdProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(lbCantidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(pm))
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(efectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbTotaldivisa)
                                            .addComponent(lbTotalbs))
                                        .addGap(22, 22, 22)
                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(totalDolares, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(totalBolivares, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                            .addComponent(aFavortxt)))
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(guardarDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cobrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(53, 53, 53))))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbAccion)
                        .addComponent(txtAccion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(comboTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbStatus)
                        .addComponent(txtNombreSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProductos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbProducto)
                                    .addComponent(txtIdProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbPrecio)
                                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbCantidad)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aFavortxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTotalbs)
                            .addComponent(totalBolivares, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTotaldivisa)
                            .addComponent(totalDolares, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tarjeta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(efectivo)
                            .addComponent(pm))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guardarDeuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cobrarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(104, 104, 104))
        );

        tabbedPane.addTab("tab1", PanelPrincipal);

        PanelSocios.setBackground(new java.awt.Color(255, 255, 255));
        PanelSocios.setPreferredSize(new java.awt.Dimension(1314, 700));

        lbCedula.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCedula.setText("Cedula");

        lbNombreSocio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNombreSocio.setText("Nombre");

        lbApellido.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbApellido.setText("Apellido");

        lbAccionSocio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAccionSocio.setText("Acción");

        lbTelefono.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTelefono.setText("Teléfono");

        txtCedula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCedula.setText("0");
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtAccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAccion.setSelectionColor(new java.awt.Color(153, 0, 51));
        txtAccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAccionKeyTyped(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        TableSocios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TableSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Cedula", "Nombre", "Apellido", "Acción", "Teléfono", "Status", "A Favor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableSocios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TableSocios.setSelectionBackground(new java.awt.Color(153, 0, 0));
        TableSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableSociosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableSocios);
        if (TableSocios.getColumnModel().getColumnCount() > 0) {
            TableSocios.getColumnModel().getColumn(0).setMinWidth(50);
            TableSocios.getColumnModel().getColumn(0).setPreferredWidth(5);
            TableSocios.getColumnModel().getColumn(0).setMaxWidth(50);
            TableSocios.getColumnModel().getColumn(1).setMinWidth(50);
            TableSocios.getColumnModel().getColumn(1).setPreferredWidth(80);
            TableSocios.getColumnModel().getColumn(1).setMaxWidth(50);
            TableSocios.getColumnModel().getColumn(2).setMinWidth(120);
            TableSocios.getColumnModel().getColumn(2).setPreferredWidth(120);
            TableSocios.getColumnModel().getColumn(2).setMaxWidth(120);
            TableSocios.getColumnModel().getColumn(3).setMinWidth(120);
            TableSocios.getColumnModel().getColumn(3).setPreferredWidth(120);
            TableSocios.getColumnModel().getColumn(3).setMaxWidth(120);
            TableSocios.getColumnModel().getColumn(4).setMinWidth(120);
            TableSocios.getColumnModel().getColumn(4).setPreferredWidth(120);
            TableSocios.getColumnModel().getColumn(4).setMaxWidth(120);
            TableSocios.getColumnModel().getColumn(5).setMinWidth(80);
            TableSocios.getColumnModel().getColumn(5).setPreferredWidth(5080);
            TableSocios.getColumnModel().getColumn(5).setMaxWidth(80);
            TableSocios.getColumnModel().getColumn(6).setMinWidth(100);
            TableSocios.getColumnModel().getColumn(6).setPreferredWidth(100);
            TableSocios.getColumnModel().getColumn(6).setMaxWidth(100);
            TableSocios.getColumnModel().getColumn(7).setMinWidth(80);
            TableSocios.getColumnModel().getColumn(7).setMaxWidth(80);
            TableSocios.getColumnModel().getColumn(8).setMinWidth(60);
            TableSocios.getColumnModel().getColumn(8).setPreferredWidth(60);
            TableSocios.getColumnModel().getColumn(8).setMaxWidth(60);
        }

        guardarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        guardarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarSocioActionPerformed(evt);
            }
        });
        guardarSocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guardarSocioKeyPressed(evt);
            }
        });

        eliminarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        eliminarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarSocioActionPerformed(evt);
            }
        });

        modificarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        modificarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarSocioActionPerformed(evt);
            }
        });

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID.setEnabled(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        limpiarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        limpiarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBotonActionPerformed(evt);
            }
        });

        lbTituloSocio.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        lbTituloSocio.setForeground(new java.awt.Color(102, 0, 0));
        lbTituloSocio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloSocio.setText("Lista de Socios");

        lbAfavor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAfavor.setText("A favor...");

        txtAfavorSoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAfavorSoc.setText("0");
        txtAfavorSoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAfavorSocKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAfavorSocKeyReleased(evt);
            }
        });

        buscaSocio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buscaSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaSocioActionPerformed(evt);
            }
        });
        buscaSocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscaSocioKeyReleased(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N

        buttonGroup1.add(socioChb);
        socioChb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        socioChb.setText("Socio");
        socioChb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socioChbActionPerformed(evt);
            }
        });

        buttonGroup1.add(consesionarioChb);
        consesionarioChb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        consesionarioChb.setText("Concesionario");
        consesionarioChb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consesionarioChbActionPerformed(evt);
            }
        });
        consesionarioChb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consesionarioChbKeyPressed(evt);
            }
        });

        buttonGroup1.add(trabajadorChb);
        trabajadorChb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        trabajadorChb.setText("Trabajador");
        trabajadorChb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajadorChbActionPerformed(evt);
            }
        });

        lbImageSocios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Socios.png"))); // NOI18N

        buttonGroup1.add(jrAdmin);
        jrAdmin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jrAdmin.setText("Administracion");

        javax.swing.GroupLayout PanelSociosLayout = new javax.swing.GroupLayout(PanelSocios);
        PanelSocios.setLayout(PanelSociosLayout);
        PanelSociosLayout.setHorizontalGroup(
            PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSociosLayout.createSequentialGroup()
                .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelSociosLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelSociosLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buscaSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelSociosLayout.createSequentialGroup()
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelSociosLayout.createSequentialGroup()
                                    .addComponent(trabajadorChb)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jrAdmin))
                                .addGroup(PanelSociosLayout.createSequentialGroup()
                                    .addComponent(socioChb)
                                    .addGap(4, 4, 4)
                                    .addComponent(consesionarioChb)))
                            .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelSociosLayout.createSequentialGroup()
                                    .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelSociosLayout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(lbCedula))
                                        .addComponent(lbNombreSocio, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbTelefono, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(PanelSociosLayout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(lbAccionSocio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSociosLayout.createSequentialGroup()
                                    .addComponent(lbAfavor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAfavorSoc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(PanelSociosLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lbImageSocios, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtStatusSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSociosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelSociosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(lbTituloSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(168, 168, 168))))
                    .addGroup(PanelSociosLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(guardarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(modificarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(limpiarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(eliminarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelSociosLayout.setVerticalGroup(
            PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSociosLayout.createSequentialGroup()
                .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSociosLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lbTituloSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelSociosLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbImageSocios, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStatusSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelSociosLayout.createSequentialGroup()
                                .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscaSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(socioChb)
                            .addComponent(consesionarioChb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trabajadorChb)
                            .addComponent(jrAdmin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCedula))
                        .addGap(18, 18, 18)
                        .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelSociosLayout.createSequentialGroup()
                                .addComponent(lbNombreSocio)
                                .addGap(18, 18, 18)
                                .addComponent(lbApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelSociosLayout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAccionSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTelefono))
                        .addGap(18, 18, 18)
                        .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAfavor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAfavorSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(limpiarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("tab2", PanelSocios);

        PanelProductos.setBackground(new java.awt.Color(255, 255, 255));
        PanelProductos.setPreferredSize(new java.awt.Dimension(1314, 700));

        lbNombreProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNombreProd.setText("Nombre del Producto");

        lbPrecioDivisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPrecioDivisa.setText("Precio en Divisas");

        lbPorcentaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPorcentaje.setText("Porcentaje de ganancia (%)");

        txtNombreProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        txtPorcentaje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPorcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPorcentajeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentajeKeyTyped(evt);
            }
        });

        bGuardarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GuardarTodo.png"))); // NOI18N
        bGuardarProd.setMaximumSize(new java.awt.Dimension(50, 20));
        bGuardarProd.setMinimumSize(new java.awt.Dimension(50, 20));
        bGuardarProd.setPreferredSize(new java.awt.Dimension(50, 20));
        bGuardarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarProdActionPerformed(evt);
            }
        });

        bEliminarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        bEliminarProd.setMaximumSize(new java.awt.Dimension(50, 20));
        bEliminarProd.setMinimumSize(new java.awt.Dimension(50, 20));
        bEliminarProd.setPreferredSize(new java.awt.Dimension(50, 20));
        bEliminarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarProdActionPerformed(evt);
            }
        });

        bModificarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        bModificarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarProdActionPerformed(evt);
            }
        });

        bNuevoProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        bNuevoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoProdActionPerformed(evt);
            }
        });

        tablaProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre del Producto", "Precio Divisas", "Precio Bolivar", "Porcentaje de Ganancia", "Precio Total $", "Precio Total Bs"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setGridColor(new java.awt.Color(255, 255, 255));
        tablaProductos.setSelectionBackground(new java.awt.Color(102, 0, 0));
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setResizable(false);
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaProductos.getColumnModel().getColumn(1).setResizable(false);
            tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(140);
            tablaProductos.getColumnModel().getColumn(2).setResizable(false);
            tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaProductos.getColumnModel().getColumn(3).setResizable(false);
            tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tablaProductos.getColumnModel().getColumn(4).setResizable(false);
            tablaProductos.getColumnModel().getColumn(4).setPreferredWidth(160);
            tablaProductos.getColumnModel().getColumn(5).setResizable(false);
            tablaProductos.getColumnModel().getColumn(5).setPreferredWidth(100);
            tablaProductos.getColumnModel().getColumn(6).setResizable(false);
            tablaProductos.getColumnModel().getColumn(6).setPreferredWidth(110);
        }

        txtIDproductos.setEnabled(false);

        lbTituloProductos.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        lbTituloProductos.setForeground(new java.awt.Color(102, 0, 0));
        lbTituloProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloProductos.setText("Lista de Productos");

        buscaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaProductoActionPerformed(evt);
            }
        });
        buscaProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscaProductoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscaProductoKeyTyped(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N

        javax.swing.GroupLayout PanelProductosLayout = new javax.swing.GroupLayout(PanelProductos);
        PanelProductos.setLayout(PanelProductosLayout);
        PanelProductosLayout.setHorizontalGroup(
            PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelProductosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTituloProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
            .addGroup(PanelProductosLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelProductosLayout.createSequentialGroup()
                        .addComponent(bModificarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bEliminarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProductosLayout.createSequentialGroup()
                        .addComponent(bGuardarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bNuevoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
            .addGroup(PanelProductosLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNombreProd)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(lbPrecioDivisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIDproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(lbPorcentaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelProductosLayout.setVerticalGroup(
            PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbTituloProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbPorcentaje)
                        .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProductosLayout.createSequentialGroup()
                        .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbPrecioDivisa)
                                .addComponent(txtIDproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbNombreProd)
                                .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProductosLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bGuardarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bNuevoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bModificarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bEliminarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelProductosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        tabbedPane.addTab("tab3", PanelProductos);

        PanelCierres.setBackground(new java.awt.Color(255, 255, 255));
        PanelCierres.setPreferredSize(new java.awt.Dimension(1314, 700));

        tablaCierre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tablaCierre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Punto", "Efectivo", "P.M", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCierreMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaCierre);
        if (tablaCierre.getColumnModel().getColumnCount() > 0) {
            tablaCierre.getColumnModel().getColumn(0).setMinWidth(50);
            tablaCierre.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaCierre.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaCierre.getColumnModel().getColumn(1).setMinWidth(120);
            tablaCierre.getColumnModel().getColumn(1).setPreferredWidth(120);
            tablaCierre.getColumnModel().getColumn(1).setMaxWidth(120);
            tablaCierre.getColumnModel().getColumn(2).setMinWidth(100);
            tablaCierre.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaCierre.getColumnModel().getColumn(2).setMaxWidth(100);
            tablaCierre.getColumnModel().getColumn(3).setMinWidth(100);
            tablaCierre.getColumnModel().getColumn(3).setPreferredWidth(100);
            tablaCierre.getColumnModel().getColumn(3).setMaxWidth(100);
            tablaCierre.getColumnModel().getColumn(4).setMinWidth(100);
            tablaCierre.getColumnModel().getColumn(4).setPreferredWidth(100);
            tablaCierre.getColumnModel().getColumn(4).setMaxWidth(100);
            tablaCierre.getColumnModel().getColumn(5).setMinWidth(80);
            tablaCierre.getColumnModel().getColumn(5).setPreferredWidth(80);
            tablaCierre.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        lbTituloProductos1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        lbTituloProductos1.setForeground(new java.awt.Color(102, 0, 0));
        lbTituloProductos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloProductos1.setText("Cierres de Caja");

        TotalEfect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TotalEfect.setEnabled(false);

        totalEfectivoCierre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalEfectivoCierre.setText("Total Efectivo");

        totalTarjetaCierre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalTarjetaCierre.setText("Total Tarjeta");

        TotalTarj.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TotalTarj.setEnabled(false);

        TotalTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TotalTxt.setText("0.0");
        TotalTxt.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        jButton2.setText("Imprimir Cierre");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        totalFondo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalFondo.setText("Total con Fondo");

        TotalFondoTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TotalFondoTxt.setEnabled(false);

        fondoLb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fondoLb.setText("Fondo de caja");

        fondoTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fondoTxt.setEnabled(false);

        jButton3.setText("Cierre Semanal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        pmCierre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pmCierre.setText("Total Pago Movil");

        pmTxtCierre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pmTxtCierre.setEnabled(false);

        javax.swing.GroupLayout PanelCierresLayout = new javax.swing.GroupLayout(PanelCierres);
        PanelCierres.setLayout(PanelCierresLayout);
        PanelCierresLayout.setHorizontalGroup(
            PanelCierresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCierresLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(idCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelCierresLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbTituloProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelCierresLayout.createSequentialGroup()
                .addGroup(PanelCierresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCierresLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fondoLb)
                        .addGap(18, 18, 18)
                        .addComponent(fondoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(PanelCierresLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(PanelCierresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCierresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PanelCierresLayout.createSequentialGroup()
                            .addComponent(totalEfectivoCierre)
                            .addGap(18, 18, 18)
                            .addComponent(TotalEfect, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelCierresLayout.createSequentialGroup()
                            .addComponent(totalTarjetaCierre)
                            .addGap(18, 18, 18)
                            .addComponent(TotalTarj, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelCierresLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelCierresLayout.createSequentialGroup()
                            .addComponent(pmCierre)
                            .addGap(18, 18, 18)
                            .addComponent(pmTxtCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelCierresLayout.createSequentialGroup()
                            .addComponent(totalFondo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TotalFondoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCierresLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(438, 438, 438))
        );
        PanelCierresLayout.setVerticalGroup(
            PanelCierresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCierresLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelCierresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTituloProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelCierresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCierresLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(PanelCierresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fondoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fondoLb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelCierresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCierresLayout.createSequentialGroup()
                                .addGroup(PanelCierresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(totalEfectivoCierre)
                                    .addComponent(TotalEfect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelCierresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(totalTarjetaCierre)
                                    .addComponent(TotalTarj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelCierresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pmCierre)
                                    .addComponent(pmTxtCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addGroup(PanelCierresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(97, 97, 97)
                                .addGroup(PanelCierresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCierresLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(PanelCierresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalFondo)
                            .addComponent(TotalFondoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("tab4", PanelCierres);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/print.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Lapso de tiempo");

        Lapso.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Lapso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lapso", "1 Dia", "7 dias", "15 dias", "1 Mes", "3 Meses", "6 Meses", "9 Meses", "1 Año" }));

        searchProd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Nombre de Producto");

        lbTituloProductos2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        lbTituloProductos2.setForeground(new java.awt.Color(102, 0, 0));
        lbTituloProductos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloProductos2.setText("Obtener datos de Productos");

        lbMiselanius.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        lbMiselanius.setForeground(new java.awt.Color(102, 0, 0));
        lbMiselanius.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMiselanius.setText("Miscelaneos");

        lbDatosventas.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        lbDatosventas.setForeground(new java.awt.Color(102, 0, 0));
        lbDatosventas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDatosventas.setText("Ventas Realizadas");

        tablaVentasRealizadas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaVentasRealizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Modo", "Total PM", "Total Efectivo", "Total Tarjeta", "Total", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVentasRealizadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentasRealizadasMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablaVentasRealizadas);
        if (tablaVentasRealizadas.getColumnModel().getColumnCount() > 0) {
            tablaVentasRealizadas.getColumnModel().getColumn(0).setMinWidth(50);
            tablaVentasRealizadas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaVentasRealizadas.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaVentasRealizadas.getColumnModel().getColumn(1).setMinWidth(100);
            tablaVentasRealizadas.getColumnModel().getColumn(1).setPreferredWidth(100);
            tablaVentasRealizadas.getColumnModel().getColumn(1).setMaxWidth(100);
            tablaVentasRealizadas.getColumnModel().getColumn(2).setMinWidth(100);
            tablaVentasRealizadas.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaVentasRealizadas.getColumnModel().getColumn(2).setMaxWidth(100);
            tablaVentasRealizadas.getColumnModel().getColumn(3).setMinWidth(100);
            tablaVentasRealizadas.getColumnModel().getColumn(3).setPreferredWidth(100);
            tablaVentasRealizadas.getColumnModel().getColumn(3).setMaxWidth(100);
            tablaVentasRealizadas.getColumnModel().getColumn(4).setMinWidth(100);
            tablaVentasRealizadas.getColumnModel().getColumn(4).setPreferredWidth(100);
            tablaVentasRealizadas.getColumnModel().getColumn(4).setMaxWidth(100);
            tablaVentasRealizadas.getColumnModel().getColumn(5).setMinWidth(120);
            tablaVentasRealizadas.getColumnModel().getColumn(5).setPreferredWidth(120);
            tablaVentasRealizadas.getColumnModel().getColumn(5).setMaxWidth(120);
            tablaVentasRealizadas.getColumnModel().getColumn(6).setResizable(false);
            tablaVentasRealizadas.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        modoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modoTxtActionPerformed(evt);
            }
        });

        jLabel5.setText("Modo");

        jLabel14.setText("Total Pago Movil");

        pmTxt.setEnabled(false);

        jLabel15.setText("Total Tarjeta");

        tarjTxt.setEnabled(false);

        jLabel16.setText("Total Efectivo");

        efecTxt.setEnabled(false);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtTarjeta2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTarjeta2.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Total en Tarjetas");

        txtEfectivo2.setEditable(false);
        txtEfectivo2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEfectivo2.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Total en efectivo");

        txtPm2.setEditable(false);
        txtPm2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPm2.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Total en pago movil");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Sub-Total del dia");

        txtSub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSub.setEnabled(false);

        jLabel20.setText("Cambiar Fondo");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        txtFfondo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Fondo de Caja");

        modoAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modoAnteriorActionPerformed(evt);
            }
        });

        totalTxt.setEditable(false);
        totalTxt.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(lbMiselanius, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(lbTituloProductos2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                            .addComponent(jButton1)
                                            .addGap(53, 53, 53))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGap(36, 36, 36)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Lapso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(searchProd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel20)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addGap(36, 36, 36)
                                                .addComponent(txtFfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(6, 6, 6)))))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(271, 271, 271)
                                .addComponent(lbDatosventas, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(idVentatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(modoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(modoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(efecTxt)
                                    .addComponent(tarjTxt)
                                    .addComponent(pmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalTxt))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTarjeta2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtPm2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSub, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEfectivo2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(270, 270, 270))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbMiselanius, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTituloProductos2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDatosventas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(searchProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Lapso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)))
                        .addGap(21, 21, 21)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTarjeta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEfectivo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel14)
                    .addComponent(pmTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tarjTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idVentatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(efecTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(modoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        tabbedPane.addTab("tab5", jPanel8);

        getContentPane().add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 1160, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void guardarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarSocioActionPerformed
        guardarSocio();
    }//GEN-LAST:event_guardarSocioActionPerformed

    private void sociosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sociosBotonActionPerformed
        if (this.tablaVentas.getRowCount() == 0) {
            this.txtAccion.setEnabled(false);
            this.limpiarTxtClient();
            this.limpiarSocios();
            this.listarSocios();
            this.tabbedPane.setSelectedIndex(1);
        } else if (!"".equals(this.txtAccion2.getText()) && this.tablaVentas.getRowCount() > 0) {
            this.guardarDeuda();
            this.limpiarVentas();
            this.limpiarSocios();
            this.listarSocios();
            this.tabbedPane.setSelectedIndex(1);
        } else {
            JOptionPane.showMessageDialog((Component) null, "Debe completar la venta");
        }

    }//GEN-LAST:event_sociosBotonActionPerformed

    private void TableSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableSociosMouseClicked
        int fila = this.TableSocios.rowAtPoint(evt.getPoint());
        this.txtID.setText(this.TableSocios.getValueAt(fila, 0).toString());
        this.tipoTxt.setText(this.TableSocios.getValueAt(fila, 1).toString());
        this.txtCedula.setText(this.TableSocios.getValueAt(fila, 2).toString());
        this.txtNombre.setText(this.TableSocios.getValueAt(fila, 3).toString());
        this.txtApellido.setText(this.TableSocios.getValueAt(fila, 4).toString());
        this.txtAccion.setText(this.TableSocios.getValueAt(fila, 5).toString());
        this.txtTelefono.setText(this.TableSocios.getValueAt(fila, 6).toString());
        this.txtStatusSocio.setText(this.TableSocios.getValueAt(fila, 7).toString());
        this.txtAfavorSoc.setText(this.TableSocios.getValueAt(fila, 8).toString());

        if (Double.parseDouble(this.TableSocios.getValueAt(fila, 1).toString()) == 1.0D) {
            this.socioChb.setSelected(true);
            this.consesionarioChb.setSelected(false);
            this.trabajadorChb.setSelected(false);
            this.jrAdmin.setSelected(false);
        } else if (Double.parseDouble(this.TableSocios.getValueAt(fila, 1).toString()) == 2.0D) {
            this.socioChb.setSelected(false);
            this.consesionarioChb.setSelected(true);
            this.trabajadorChb.setSelected(false);
            this.jrAdmin.setSelected(false);
        } else if (Double.parseDouble(this.TableSocios.getValueAt(fila, 1).toString()) == 3.0D) {
            this.socioChb.setSelected(false);
            this.consesionarioChb.setSelected(false);
            this.trabajadorChb.setSelected(true);
            this.jrAdmin.setSelected(false);
        } else if (Double.parseDouble(this.TableSocios.getValueAt(fila, 1).toString()) == 4.0D) {
            this.socioChb.setSelected(false);
            this.consesionarioChb.setSelected(false);
            this.trabajadorChb.setSelected(false);
            this.jrAdmin.setSelected(true);
        }


    }//GEN-LAST:event_TableSociosMouseClicked

    private void eliminarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarSocioActionPerformed

        if (!"".equals(this.txtCedula.getText())) {
            int pregunta = JOptionPane.showConfirmDialog((Component) null, "Esta seguro de Eliminar?");
            if (pregunta == 0) {
                int ID = Integer.parseInt(this.txtID.getText());
                this.client.eliminarSocio(ID, Integer.parseInt(this.tipoTxt.getText()));
                this.deuDAO.eliminarDeuda(ID);
                this.limpiarSocios();
                this.listarSocios();
                this.limpiarTxtClient();
                JOptionPane.showMessageDialog((Component) null, "Socio Eliminado!!");
            } else {
                JOptionPane.showMessageDialog((Component) null, "Los campos estan vacios.");
            }
        }

    }//GEN-LAST:event_eliminarSocioActionPerformed

    private void modificarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarSocioActionPerformed
        if ("".equals(this.txtCedula.getText())) {
            JOptionPane.showMessageDialog((Component) null, "Los campos estan vacios,");
        } else {
            if (this.trabajadorChb.isSelected()) {
                this.cl.setTipo(3);
                this.cl.setAccion(0);
            } else if (this.consesionarioChb.isSelected()) {
                this.cl.setTipo(2);
                this.cl.setAccion(0);
            } else if (this.socioChb.isSelected()) {
                this.cl.setTipo(1);
                this.cl.setAccion(Integer.parseInt(this.txtAccion.getText()));
            } else if (this.jrAdmin.isSelected()) {
                this.cl.setTipo(4);
                this.cl.setAccion(0);
            }

            this.cl.setId(Integer.parseInt(this.txtID.getText()));
            this.cl.setCedula(Integer.parseInt(this.txtCedula.getText()));
            this.cl.setNombre(this.txtNombre.getText());
            this.cl.setApellido(this.txtApellido.getText());
            this.cl.setTelefono(this.txtTelefono.getText());
            if (this.txtStatusSocio.getText().equals("Libre")) {
                this.cl.setStatus(0);
            } else {
                this.cl.setStatus(1);
            }

            this.cl.setAFavor(Double.parseDouble(this.txtAfavorSoc.getText()));
            this.client.modificarSocio(this.cl);
            JOptionPane.showMessageDialog((Component) null, "Socio Modificado con Exito!");
            this.limpiarSocios();
            this.limpiarTxtClient();
            this.listarSocios();
        }

    }//GEN-LAST:event_modificarSocioActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void limpiarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBotonActionPerformed
        // TODO add your handling code here:
        limpiarTxtClient();
    }//GEN-LAST:event_limpiarBotonActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void bGuardarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarProdActionPerformed
        this.guardarProducto();
        this.limpiarTxtProd();
        this.limpiarDetalles();
        this.listarProductos();

    }//GEN-LAST:event_bGuardarProdActionPerformed

    private void productosBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosBotonActionPerformed

        if (this.tablaVentas.getRowCount() == 0) {
            this.limpiarTxtProd();
            this.limpiarDetalles();
            this.listarProductos();
            this.tabbedPane.setSelectedIndex(2);
        } else if (!"".equals(this.txtAccion2.getText()) && this.tablaVentas.getRowCount() > 0) {
            this.guardarDeuda();
            this.limpiarVentas();
            this.limpiarDetalles();
            this.listarProductos();
            this.tabbedPane.setSelectedIndex(2);
        } else {
            JOptionPane.showMessageDialog((Component) null, "Debe completar la venta");
        }

    }//GEN-LAST:event_productosBotonActionPerformed

    private void ventaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaBotonActionPerformed

        if (this.tabbedPane.getSelectedIndex() != 0) {
            this.limpiarDatosSocio();
            this.crearBotones();
            this.tabbedPane.setSelectedIndex(0);
        }

    }//GEN-LAST:event_ventaBotonActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        int fila = this.tablaProductos.rowAtPoint(evt.getPoint());
        this.txtIDproductos.setText(this.tablaProductos.getValueAt(fila, 0).toString());
        this.txtNombreProducto.setText(this.tablaProductos.getValueAt(fila, 1).toString().toLowerCase());
        this.txtPrecio.setText(this.tablaProductos.getValueAt(fila, 2).toString());
        this.txtPorcentaje.setText(this.tablaProductos.getValueAt(fila, 4).toString());

    }//GEN-LAST:event_tablaProductosMouseClicked

    private void bModificarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarProdActionPerformed
        if (!"".equals(this.txtNombreProducto.getText()) && !"".equals(this.txtPrecio.getText()) && !"".equals(this.txtPorcentaje.getText())) {
            this.pro.setId(Integer.parseInt(this.txtIDproductos.getText()));
            this.pro.setNombre(this.txtNombreProducto.getText());
            this.pro.setPrecio(Double.parseDouble(this.txtPrecio.getText()));
            this.pro.setPorcentaje(Integer.parseInt(this.txtPorcentaje.getText()));
            if (!"".equals(this.txtNombreProducto.getText()) || !"".equals(this.txtPrecio.getText()) || !"".equals(this.txtPorcentaje.getText())) {
                this.proDao.modificarProducto(this.pro);
                JOptionPane.showMessageDialog((Component) null, "Producto Modificado con Exito!");
                this.limpiarTxtProd();
                this.limpiarDetalles();
                this.listarProductos();
            }
        } else {
            JOptionPane.showMessageDialog((Component) null, "Los campos estan vacios,");
        }

    }//GEN-LAST:event_bModificarProdActionPerformed

    private void bEliminarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarProdActionPerformed
        if (!"".equals(this.txtNombreProducto.getText())) {
            int pregunta = JOptionPane.showConfirmDialog((Component) null, "Esta seguro de Eliminar?");
            if (pregunta == 0) {
                int ID = Integer.parseInt(this.txtIDproductos.getText());
                this.proDao.eliminarProducto(ID);
                this.limpiarTxtProd();
                this.limpiarDetalles();
                this.listarProductos();
                JOptionPane.showMessageDialog((Component) null, "Producto Eliminado!!");
            } else {
                JOptionPane.showMessageDialog((Component) null, "Los campos estan vacios.");
            }
        }


    }//GEN-LAST:event_bEliminarProdActionPerformed

    private void bNuevoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoProdActionPerformed
        // TODO add your handling code here:
        limpiarTxtProd();
    }//GEN-LAST:event_bNuevoProdActionPerformed

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        // TODO add your handling code here:
        agregarProductosTablaVentas();
    }//GEN-LAST:event_btAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        buscarSocio();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cobrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobrarButtonActionPerformed

        double total = Double.parseDouble(this.totalDolares.getText());
        if (this.tablaVentas.getRowCount() > 0) {
            if (!this.tarjeta.isSelected() && !this.efectivo.isSelected() && !this.pm.isSelected()) {
                JOptionPane.showMessageDialog((Component) null, "Debe seleccionar un metodo de pago.");
            } else if (!this.txtIdSocio.getText().equals("")) {
                int socio = Integer.parseInt(this.txtIdSocio.getText());
                boolean deudor = this.deuDAO.buscaSocio(socio);
                if (deudor) {
                    this.client.changeStatus(socio, 0);
                    this.deuDAO.eliminarDeuda(socio);
                }

                this.pago(total);
                this.limpiarTxtTotales();
                this.limpiarVentas();
            } else {
                this.pago(total);
                this.limpiarTxtTotales();
                this.limpiarVentas();
            }
        } else if (Double.parseDouble(this.aFavortxt.getText()) < 0.0D) {
            Double t = Double.parseDouble(this.aFavortxt.getText()) * -1.0D;
            this.totalDolares.setText(t.toString());
            this.pago(t);
            this.limpiarTxtTotales();
            this.limpiarVentas();
        } else {
            JOptionPane.showMessageDialog((Component) null, "Debe ingresar un producto.");
        }


    }//GEN-LAST:event_cobrarButtonActionPerformed

    private void guardarDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDeudaActionPerformed
        if (!this.txtIdSocio.getText().equals("")) {
            this.guardarDeuda();
            this.limpiarVentas();
        } else {
            JOptionPane.showMessageDialog((Component) null, "Por Favor, ingrese un nÃºmero de socio!");
        }

        this.limpiarDatosSocio();


    }//GEN-LAST:event_guardarDeudaActionPerformed

    private void totalBolivaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBolivaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalBolivaresActionPerformed

    private void configBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configBotonActionPerformed
        if (this.tablaVentas.getRowCount() == 0) {
            int confirm = JOptionPane.showConfirmDialog((Component) null, "Esta seguro de cerrar la caja?");
            if (confirm == 0) {
                String fondo = this.txtFondo.getText();
                this.fondoTxt.setText(fondo);
                this.cerrarCaja();
                this.limpiarCierre();
                this.listarCierre();
                this.tabbedPane.setSelectedIndex(3);
            }
        } else {
            JOptionPane.showMessageDialog((Component) null, "Debe completa la venta.!");
        }

    }//GEN-LAST:event_configBotonActionPerformed

    private void txtAccion2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccion2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccion2KeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        // TODO add your handling code here:
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        // TODO add your handling code here:
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtAccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccionKeyTyped
        // TODO add your handling code here:
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtAccionKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        event.numberDecimalKeyPress(evt, txtPrecio);
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtPorcentajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeKeyTyped
        // TODO add your handling code here:
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtPorcentajeKeyTyped

    private void txtIdSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdSocioActionPerformed

    private void buscaSocioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaSocioKeyReleased
        // TODO add your handling code here:
        if (evt.getSource() == buscaSocio) {
            limpiarSocios();
            listarSocios();
        }
    }//GEN-LAST:event_buscaSocioKeyReleased

    private void buscaProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaProductoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaProductoKeyTyped

    private void buscaProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaProductoKeyReleased
        // TODO add your handling code here:
        if (evt.getSource() == buscaProducto) {
            limpiarDetalles();
            listarProductos();
        }
    }//GEN-LAST:event_buscaProductoKeyReleased

    private void aFavortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aFavortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aFavortxtActionPerformed

    private void buscaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaProductoActionPerformed

    private void buscaSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaSocioActionPerformed

    private void consesionarioChbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consesionarioChbKeyPressed
        // TODO add your handling code here:
        txtAccion.setEnabled(false);
    }//GEN-LAST:event_consesionarioChbKeyPressed

    private void consesionarioChbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consesionarioChbActionPerformed
        // TODO add your handling code here:
        txtAccion.setEnabled(false);
    }//GEN-LAST:event_consesionarioChbActionPerformed

    private void socioChbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socioChbActionPerformed
        // TODO add your handling code here:
        txtAccion.setEnabled(true);
    }//GEN-LAST:event_socioChbActionPerformed

    private void trabajadorChbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajadorChbActionPerformed
        // TODO add your handling code here:
        txtAccion.setEnabled(false);
    }//GEN-LAST:event_trabajadorChbActionPerformed

    private void comboTipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipo1ActionPerformed

    private void tablaCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCierreMouseClicked
        int fila = this.tablaCierre.rowAtPoint(evt.getPoint());
        this.idCierre.setText(this.tablaCierre.getValueAt(fila, 0).toString());
        this.pmTxtCierre.setText(this.preciofinal((Double) this.tablaCierre.getValueAt(fila, 4)).toString());
        this.TotalEfect.setText(this.preciofinal((Double) this.tablaCierre.getValueAt(fila, 3)).toString());
        this.TotalTarj.setText(this.preciofinal((Double) this.tablaCierre.getValueAt(fila, 2)).toString());
        this.TotalTxt.setText(this.preciofinal((Double) this.tablaCierre.getValueAt(fila, 5)).toString());

    }//GEN-LAST:event_tablaCierreMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String tiempo = Lapso.getSelectedItem().toString();
        List<Productos> list = proDao.buscarDatos(searchProd.getText());
        switch (tiempo) {
            case "Lapso":
                pdf.pdfProductos(list.get(0).getId(), searchProd.getText(), 1);
                break;
            case "1 Dia":
                pdf.pdfProductos(list.get(0).getId(), searchProd.getText(), 1);
                break;
            case "7 dias":
                pdf.pdfProductos(list.get(0).getId(), searchProd.getText(), 7);
                break;
            case "15 dias":
                pdf.pdfProductos(list.get(0).getId(), searchProd.getText(), 15);
                break;
            case "1 Mes":
                pdf.pdfProductos(list.get(0).getId(), searchProd.getText(), 30);
                break;
            case "3 Meses":
                pdf.pdfProductos(list.get(0).getId(), searchProd.getText(), 90);
                break;
            case "6 Meses":
                pdf.pdfProductos(list.get(0).getId(), searchProd.getText(), 180);
                break;
            case "9 Meses":
                pdf.pdfProductos(list.get(0).getId(), searchProd.getText(), 270);
                break;
            case "1 Año":
                pdf.pdfProductos(list.get(0).getId(), searchProd.getText(), 365);
                break;

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pdf.pdfCierres(Integer.parseInt(idCierre.getText()));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tablaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasMouseClicked

        int fila = this.tablaVentas.rowAtPoint(evt.getPoint());
        int columna = this.tablaVentas.columnAtPoint(evt.getPoint());
        String fecha = LocalDate.now().toString();
        String fecha2 = this.tablaVentas.getValueAt(fila, 5).toString();

        int cantidad;
        Double precio;
        Double sub_total;

        if (columna == 6 && fecha.equals(fecha2)) {

            System.out.println("suma");
            cantidad = (Integer) this.tablaVentas.getValueAt(fila, 3) + 1;
            precio = (Double) this.tablaVentas.getValueAt(fila, 2);
            sub_total = precio * (double) cantidad;
            this.tablaVentas.setValueAt(sub_total, fila, 4);
            this.tablaVentas.setValueAt(cantidad, fila, 3);

        } else if (columna == 7 && LocalDate.now().toString().equals(this.tablaVentas.getValueAt(fila, 5).toString())) {
            cantidad = (Integer) this.tablaVentas.getValueAt(fila, 3) - 1;
            precio = (Double) this.tablaVentas.getValueAt(fila, 2);
            sub_total = precio * (double) cantidad;
            if (cantidad == 0) {
                this.modeloVenta.removeRow(fila);
            } else {
                this.tablaVentas.setValueAt(sub_total, fila, 4);
                this.tablaVentas.setValueAt(cantidad, fila, 3);
            }
        } else if (columna == 8) {
            if (this.txtStatus.getText().equals("DEUDOR")) {
                int confirm = JOptionPane.showConfirmDialog((Component) null, "Desea eliminar este producto de la deuda?");
                if (confirm == 0) {
                    String j = this.tablaVentas.getValueAt(fila, 0).toString();
                    int js = Integer.parseInt(j);
                    int socio = Integer.parseInt(this.txtIdSocio.getText());
                    boolean exits = this.deuDAO.buscarProducto(socio, js);
                    if (exits) {
                        this.deuDAO.eliminarProducto(Integer.parseInt(this.txtIdSocio.getText()), js);
                        this.modeloVenta.removeRow(fila);
                        if (this.modeloVenta.getRowCount() == 0) {
                            this.client.changeStatus(Integer.parseInt(this.txtIdSocio.getText()), 0);
                        }
                    } else if (!exits) {
                        this.modeloVenta.removeRow(fila);
                    }
                }
            } else {
                this.modeloVenta.removeRow(fila);
            }
        }

        this.tablaVentas.setDefaultRenderer(Object.class, new Sistema.IconCellRenderer());
        this.actualizarTotal();

    }//GEN-LAST:event_tablaVentasMouseClicked

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            agregarProductosTablaVentas();
        }
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void txtAccion2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccion2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            buscarSocio();
        }

    }//GEN-LAST:event_txtAccion2KeyPressed

    private void guardarSocioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guardarSocioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarSocioKeyPressed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            guardarSocio();
        }
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtAfavorSocKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAfavorSocKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10) {
            this.guardarSocio();
        }

    }//GEN-LAST:event_txtAfavorSocKeyPressed

    private void txtPorcentajeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeKeyPressed
        if (evt.getKeyCode() == 10) {
            this.guardarProducto();
            this.limpiarTxtProd();
            this.limpiarDetalles();
            this.listarProductos();
        }

    }//GEN-LAST:event_txtPorcentajeKeyPressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        String precioNuevo = JOptionPane.showInputDialog((Component) null, "Nuevo Precio de la Divisa: ");
        this.txtDivisa.setText(precioNuevo);


    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        pdf.pdfCierreSemanal();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNombreSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreSocioActionPerformed

    private void txtProductos2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductos2KeyReleased
        // TODO add your handling code here:
        if (evt.getSource() == txtProductos2) {
            listarProductos2();
        }
    }//GEN-LAST:event_txtProductos2KeyReleased

    private void modoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modoTxtActionPerformed

    private void configBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configBoton1ActionPerformed

        if (this.tablaVentas.getRowCount() == 0) {
            this.limpiarProdc();
            this.listarVentas();
            this.txtFfondo.setText(this.txtFondo.getText());
            this.tabbedPane.setSelectedIndex(4);
            
            
        } else if (!"".equals(this.txtAccion2.getText()) && this.tablaVentas.getRowCount() > 0) {
            this.guardarDeuda();
            this.limpiarVentas();
            this.listarVentas();
            this.txtFfondo.setText(this.txtFondo.getText());
            this.tabbedPane.setSelectedIndex(4);
           
            
        } else {
            JOptionPane.showMessageDialog((Component) null, "Debe completar la venta");
        }

    }//GEN-LAST:event_configBoton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        boolean aprobar = false;

        this.v.setId(Integer.parseInt(this.idVentatxt.getText()));
        Double total = Double.parseDouble(this.totalTxt.getText());
        String anterior = this.modoAnterior.getText().toString();
        byte var6 = -1;

        switch (anterior) {
            case "tarjeta":
                if (anterior.equals("tarjeta")) {
                    var6 = 0;
                }
                break;
            case "efectivo":
                if (anterior.equals("efectivo")) {
                    var6 = 1;
                }
                break;
            case "pm-efc":
                if (anterior.equals("pm-efc")) {
                    var6 = 4;
                }
                break;
            case "tj-efc":
                if (anterior.equals("tj-efc")) {
                    var6 = 2;
                }
                break;
            case "pago movil":
                if (anterior.equals("pago movil")) {
                    var6 = 3;
                }
        }

        switch (var6) {
            case 0:
                aprobar = this.chageModoVenta(this.modoTxt.getText().toString(), total);
                break;
            case 1:
                aprobar = this.chageModoVenta(this.modoTxt.getText().toString(), total);
                break;
            case 2:
                aprobar = this.chageModoVenta(this.modoTxt.getText().toString(), total);
                break;
            case 3:
                aprobar = this.chageModoVenta(this.modoTxt.getText().toString(), total);
                break;
            case 4:
                aprobar = this.chageModoVenta(this.modoTxt.getText().toString(), total);
        }

        if (aprobar) {
            this.vDao.modificarVenta(this.v);
            this.limpiarProdc();
            this.listarVentas();
            this.limpiarMisc();
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void tablaVentasRealizadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasRealizadasMouseClicked
        int fila = this.tablaVentasRealizadas.rowAtPoint(evt.getPoint());
        this.idVentatxt.setText(this.tablaVentasRealizadas.getValueAt(fila, 0).toString());
        this.modoTxt.setText(this.tablaVentasRealizadas.getValueAt(fila, 1).toString());
        this.modoAnterior.setText(this.tablaVentasRealizadas.getValueAt(fila, 1).toString());
        this.pmTxt.setText(preciofinal((Double) this.tablaVentasRealizadas.getValueAt(fila, 2)).toString());
        this.tarjTxt.setText(preciofinal((Double) this.tablaVentasRealizadas.getValueAt(fila, 4)).toString());
        this.efecTxt.setText(preciofinal((Double)this.tablaVentasRealizadas.getValueAt(fila, 3)).toString());
        this.totalTxt.setText(preciofinal((Double) this.tablaVentasRealizadas.getValueAt(fila, 5)).toString());

    }//GEN-LAST:event_tablaVentasRealizadasMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(null, "Seguro que desea Eliminar esta venta?");
        if (option == 0) {

            vDao.eliminarVenta(Integer.parseInt(idVentatxt.getText()));
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        String precioNuevo = JOptionPane.showInputDialog((Component) null, "Nuevo fondo: ");
        this.txtFondo.setText(precioNuevo);
        this.txtFfondo.setText(precioNuevo);

    }//GEN-LAST:event_jLabel20MouseClicked

    private void modoAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modoAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modoAnteriorActionPerformed

    private void txtAfavorSocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAfavorSocKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAfavorSocKeyReleased

    public Double getDivisa() {
        return divisa;
    }

    public void setDivisa(Double divisa) {
        this.divisa = divisa;
    }

    public Double getFondo() {
        return fondo;
    }

    public void setFondo(Double fondo) {
        this.fondo = fondo;
    }

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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema(0.0, 0.0).setVisible(true);
            }
        });
    }

    private javax.swing.JTable tabla;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DivisaLabel;
    private javax.swing.JComboBox<String> Lapso;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel PanelButtonsMenu;
    private javax.swing.JPanel PanelCierres;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelProductos;
    private javax.swing.JPanel PanelSocios;
    private javax.swing.JTable TableSocios;
    private javax.swing.JTextField TotalEfect;
    private javax.swing.JTextField TotalFondoTxt;
    private javax.swing.JTextField TotalTarj;
    private javax.swing.JTextField TotalTxt;
    private javax.swing.JTextField aFavortxt;
    private javax.swing.JButton bEliminarProd;
    private javax.swing.JButton bGuardarProd;
    private javax.swing.JButton bModificarProd;
    private javax.swing.JButton bNuevoProd;
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btnBuscar;
    public javax.swing.JTextField buscaProducto;
    public javax.swing.JTextField buscaSocio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cobrarButton;
    private javax.swing.JComboBox<String> comboTipo1;
    private javax.swing.JButton configBoton;
    private javax.swing.JButton configBoton1;
    private javax.swing.JRadioButton consesionarioChb;
    private javax.swing.JTextField efecTxt;
    private javax.swing.JCheckBox efectivo;
    private javax.swing.JButton eliminarSocio;
    private javax.swing.JLabel fondoLb;
    private javax.swing.JTextField fondoTxt;
    private javax.swing.JButton guardarDeuda;
    private javax.swing.JButton guardarSocio;
    private javax.swing.JTextField idCierre;
    private javax.swing.JTextField idVentatxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton jrAdmin;
    private javax.swing.JLabel lbAccion;
    private javax.swing.JLabel lbAccionSocio;
    private javax.swing.JLabel lbAfavor;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbCedula;
    private javax.swing.JLabel lbDatosventas;
    private javax.swing.JLabel lbImageSocios;
    private javax.swing.JLabel lbMiselanius;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombreProd;
    private javax.swing.JLabel lbNombreSocio;
    private javax.swing.JLabel lbPorcentaje;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbPrecioDivisa;
    private javax.swing.JLabel lbProducto;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTituloProductos;
    private javax.swing.JLabel lbTituloProductos1;
    private javax.swing.JLabel lbTituloProductos2;
    private javax.swing.JLabel lbTituloSocio;
    private javax.swing.JLabel lbTotalbs;
    private javax.swing.JLabel lbTotaldivisa;
    private javax.swing.JButton limpiarBoton;
    private javax.swing.JLabel logoLb;
    private javax.swing.JButton modificarSocio;
    private javax.swing.JTextField modoAnterior;
    private javax.swing.JTextField modoTxt;
    private javax.swing.JCheckBox pm;
    private javax.swing.JLabel pmCierre;
    private javax.swing.JTextField pmTxt;
    private javax.swing.JTextField pmTxtCierre;
    private javax.swing.JButton productosBoton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField searchProd;
    private javax.swing.JRadioButton socioChb;
    private javax.swing.JButton sociosBoton;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tablaCierre;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTable tablaVentasRealizadas;
    private javax.swing.JTextField tarjTxt;
    private javax.swing.JCheckBox tarjeta;
    private javax.swing.JTextField tipoTxt;
    private javax.swing.JTextField totalBolivares;
    private javax.swing.JTextField totalDolares;
    private javax.swing.JLabel totalEfectivoCierre;
    private javax.swing.JLabel totalFondo;
    private javax.swing.JLabel totalTarjetaCierre;
    private javax.swing.JTextField totalTxt;
    private javax.swing.JRadioButton trabajadorChb;
    private javax.swing.JTextField txtAccion;
    private javax.swing.JTextField txtAccion2;
    private javax.swing.JTextField txtAfavorSoc;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JLabel txtDivisa;
    private javax.swing.JTextField txtEfectivo2;
    private javax.swing.JTextField txtFfondo;
    private javax.swing.JTextField txtFondo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDproductos;
    private javax.swing.JTextField txtIdProducto2;
    private javax.swing.JTextField txtIdSocio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtNombreSocio;
    private javax.swing.JTextField txtPm2;
    private javax.swing.JTextField txtPorcentaje;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtProductos2;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtStatusSocio;
    private javax.swing.JTextField txtSub;
    private javax.swing.JTextField txtTarjeta2;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JButton ventaBoton;
    // End of variables declaration//GEN-END:variables

    private void cerrarCaja() {
        List<Venta> listarVent = this.vDao.obtenerVentas();
        Double tarjeta = 0.0D;
        Double efectivo = 0.0D;
        Double pm = 0.0D;

        for (int i = 0; i < listarVent.size(); ++i) {
            if (((Venta) listarVent.get(i)).getCheckCaja() == 0) {
                this.vDao.checkCaja(listarVent.get(i).getId());
                switch (listarVent.get(i).getModo()) {
                    case 0:
                        tarjeta = tarjeta + listarVent.get(i).getTotal();
                        break;
                    case 1:
                        efectivo = efectivo + listarVent.get(i).getTotal();
                        break;
                    case 2:
                        efectivo = efectivo + listarVent.get(i).getTotal_efectivo();
                        tarjeta = tarjeta + listarVent.get(i).getTotal_tarjeta();
                        break;
                    case 3:
                        pm = pm + listarVent.get(i).getTotal();
                        break;
                    case 4:
                        efectivo = efectivo + listarVent.get(i).getTotal_efectivo();
                        pm = pm + listarVent.get(i).getPagoMovil();
                }
            }
        }

        Double total = tarjeta + efectivo + pm;
        Double totalFondo = total + Double.parseDouble(this.txtFondo.getText());
        this.TotalFondoTxt.setText(totalFondo.toString());
        this.registrarCierre(preciofinal(total), preciofinal(efectivo), preciofinal(tarjeta), preciofinal(pm));
    }

    private void listarSocios() {
        List<Socios> ListarSc = this.client.listarSocios(this.buscaSocio.getText());
        this.modeloSocios = (DefaultTableModel) this.TableSocios.getModel();
        Object[] ob = new Object[9];

        for (int i = 0; i < ListarSc.size(); ++i) {
            ob[0] = ((Socios) ListarSc.get(i)).getId();
            ob[1] = ((Socios) ListarSc.get(i)).getTipo();
            ob[2] = ((Socios) ListarSc.get(i)).getCedula();
            ob[3] = ((Socios) ListarSc.get(i)).getNombre();
            ob[4] = ((Socios) ListarSc.get(i)).getApellido();
            ob[5] = ((Socios) ListarSc.get(i)).getAccion();
            ob[6] = ((Socios) ListarSc.get(i)).getTelefono();
            if (((Socios) ListarSc.get(i)).getStatus() == 0) {
                ob[7] = "Libre";
            } else {
                ob[7] = "DEUDOR";
            }

            ob[8] = ((Socios) ListarSc.get(i)).getAFavor();
            this.modeloSocios.addRow(ob);
        }

        this.TableSocios.setModel(this.modeloSocios);
    }

    private void listarProductos() {
        List<Productos> ListarPro = this.proDao.listarProductos(this.buscaProducto.getText());
        this.modeloProductos = (DefaultTableModel) this.tablaProductos.getModel();
        Object[] obj = new Object[8];

        for (int i = 0; i < ListarPro.size(); ++i) {
            obj[0] = ((Productos) ListarPro.get(i)).getId();
            String nombre = upperCaseFirst(((Productos) ListarPro.get(i)).getNombre());
            obj[1] = nombre;
            obj[2] = ((Productos) ListarPro.get(i)).getPrecio();
            obj[3] = ((Productos) ListarPro.get(i)).getPrecio() * this.dolar;
            obj[4] = ((Productos) ListarPro.get(i)).getPorcentaje();
            obj[5] = ((Productos) ListarPro.get(i)).getPrecio() + ((Productos) ListarPro.get(i)).getPrecio() * (double) ((Productos) ListarPro.get(i)).getPorcentaje() / 100.0D;
            obj[6] = (((Productos) ListarPro.get(i)).getPrecio() + ((Productos) ListarPro.get(i)).getPrecio() * (double) ((Productos) ListarPro.get(i)).getPorcentaje() / 100.0D) * this.dolar;
            this.modeloProductos.addRow(obj);
        }

        this.tablaProductos.setModel(this.modeloProductos);
    }

    private void listarProductos2() {
        List<Productos> ListarPro = this.proDao.listarProductos(this.txtProductos2.getText());
        int porcentaje = ((Productos) ListarPro.get(0)).getPorcentaje();
        Double total = ((Productos) ListarPro.get(0)).getPrecio() * (double) porcentaje / 100.0D + ((Productos) ListarPro.get(0)).getPrecio();
        this.txtPrecioVenta.setText(total.toString());
        this.txtIdProducto2.setText(String.valueOf(((Productos) ListarPro.get(0)).getId()));
        this.txtCantidad.setText("1");
    }

    private void listarDeudas(int socio) {
        List<Deuda> listarDeuda = this.deuDAO.listarDeuda(socio);
        this.modeloVenta = (DefaultTableModel) this.tablaVentas.getModel();
        Object[] obj = new Object[9];

        for (int i = 0; i < listarDeuda.size(); ++i) {
            obj[0] = ((Deuda) listarDeuda.get(i)).getId_producto();
            obj[1] = ((Deuda) listarDeuda.get(i)).getNombre();
            obj[2] = ((Deuda) listarDeuda.get(i)).getPrecio();
            obj[3] = ((Deuda) listarDeuda.get(i)).getCantidad_producto();
            obj[4] = preciofinal(listarDeuda.get(i).getCantidad_producto() * listarDeuda.get(i).getPrecio());
            obj[5] = ((Deuda) listarDeuda.get(i)).getFecha();
            
            if (LocalDate.now().toString().equals(((Deuda) listarDeuda.get(i)).getFecha())) {
                obj[6] = new JLabel(this.mas);
                obj[7] = new JLabel(this.menos);
            }

            obj[8] = new JLabel(this.eliminar);
            this.tablaVentas.setDefaultRenderer(Object.class, new Sistema.IconCellRenderer());
            this.modeloVenta.addRow(obj);
        }

        this.tablaVentas.setModel(this.modeloVenta);
    }

    private void listarCierre() {
        List<Cierre> listarCr = this.crDao.listaCierre();
        this.modeloCierre = (DefaultTableModel) this.tablaCierre.getModel();
        Object[] ob = new Object[6];

        for (int i = 0; i < listarCr.size(); ++i) {
            ob[0] = listarCr.get(i).getId();
            ob[1] = listarCr.get(i).getFecha();
            ob[2] = preciofinal(listarCr.get(i).getTotal_punto());
            ob[3] = preciofinal(listarCr.get(i).getTotal_efectivo());
            ob[4] = preciofinal(listarCr.get(i).getPm());
            ob[5] = preciofinal(listarCr.get(i).getTotal_conjunto());
            this.modeloCierre.addRow(ob);
        }

        this.tablaCierre.setModel(this.modeloCierre);
    }

    private void listarVentas() {
        List<Venta> listarVent = this.vDao.obtenerVentas();
        this.modeloVentasRealizadas = (DefaultTableModel) this.tablaVentasRealizadas.getModel();
        Object[] ob = new Object[6];
        Double tTarjeta = 0.0D;
        Double tEfectivo = 0.0D;
        Double tPm = 0.0D;
        Double tSub = 0.0D;

        for (int i = 0; i < listarVent.size(); ++i) {
            ob[0] = ((Venta) listarVent.get(i)).getId();
            if (((Venta) listarVent.get(i)).getModo() == 0) {
                ob[1] = "tarjeta";
            } else if (((Venta) listarVent.get(i)).getModo() == 1) {
                ob[1] = "efectivo";
            } else if (((Venta) listarVent.get(i)).getModo() == 2) {
                ob[1] = "tj-efc";
            } else if (((Venta) listarVent.get(i)).getModo() == 3) {
                ob[1] = "pago movil";
            } else if (((Venta) listarVent.get(i)).getModo() == 4) {
                ob[1] = "pm-efc";
            }

            ob[2] = ((Venta) listarVent.get(i)).getPagoMovil();
            ob[3] = ((Venta) listarVent.get(i)).getTotal_efectivo();
            ob[4] = ((Venta) listarVent.get(i)).getTotal_tarjeta();
            ob[5] = ((Venta) listarVent.get(i)).getTotal();
            tTarjeta = preciofinal(tTarjeta + listarVent.get(i).getTotal_tarjeta());
            tEfectivo = preciofinal(tEfectivo +  listarVent.get(i).getTotal_efectivo());
            tPm = preciofinal(tPm +  listarVent.get(i).getPagoMovil());
            tSub = preciofinal(tSub + listarVent.get(i).getTotal());
            this.modeloVentasRealizadas.addRow(ob);
        }

        this.txtTarjeta2.setText(tTarjeta.toString());
        this.txtEfectivo2.setText(tEfectivo.toString());
        this.txtPm2.setText(tPm.toString());
        this.txtSub.setText(tSub.toString());
        this.tablaVentasRealizadas.setModel(this.modeloVentasRealizadas);
    }

    private void limpiarProdc() {
        while (this.modeloVentasRealizadas.getRowCount() > 0) {
            this.modeloVentasRealizadas.removeRow(0);
        }

    }

    private void limpiarSocios() {
        while (this.modeloSocios.getRowCount() > 0) {
            this.modeloSocios.removeRow(0);
        }

    }

    private void limpiarVentas() {
        while (this.modeloVenta.getRowCount() > 0) {
            this.modeloVenta.removeRow(0);
        }

    }

    private void limpiarCierre() {
        while (this.modeloCierre.getRowCount() > 0) {
            this.modeloCierre.removeRow(0);
        }

    }

    private void limpiarDetalles() {
        while (this.modeloProductos.getRowCount() > 0) {
            this.modeloProductos.removeRow(0);
        }

    }

    private void crearBotones() {
        List<Productos> listar = this.proDao.listarProductos("");
        Object[] ob = new Object[2];
        this.PanelButtonsMenu.removeAll();
        GridLayout layout = new GridLayout(4, 2);
        this.PanelButtonsMenu.setLayout(layout);

        for (int i = 0; i < listar.size(); ++i) {
            ob[0] = ((Productos) listar.get(i)).getId();
            ob[1] = ((Productos) listar.get(i)).getNombre();
            JButton Boton = new JButton(((Productos) listar.get(i)).getNombre());
            int fontSize = 18;
            Boton.setName(((Productos) listar.get(i)).getNombre());
            Boton.setFont(new Font("Tahoma", 1, fontSize));
            Boton.addActionListener((e) -> {
                String envio = Boton.getName();
                List<Productos> lista = this.proDao.buscarDatos(envio);

                for (int j = 0; j < lista.size(); ++j) {
                    int ID = ((Productos) lista.get(j)).getId();
                    Double precio = ((Productos) lista.get(j)).getPrecio();
                    int porcentaje = ((Productos) lista.get(j)).getPorcentaje();
                    double total = precio * (double) porcentaje / 100.0D + precio;
                    this.txtIdProducto2.setText(String.valueOf(ID));
                    this.txtProductos2.setText(((Productos) lista.get(j)).getNombre());
                    this.txtPrecioVenta.setText(String.valueOf(total));
                    this.txtCantidad.setText("1");
                    this.txtCantidad.grabFocus();
                }

            });
            this.PanelButtonsMenu.add(Boton);
            this.PanelButtonsMenu.repaint();
        }

    }

    private void registrarVenta(double pago) {
        String cliente = this.txtIdSocio.getText();
        if (cliente.equals("")) {
            cliente = "0";
        }

        Double total = 0.0D;
        total = Double.parseDouble(this.totalDolares.getText());
        if (this.metodo == 0) {
            this.v.setTotal_tarjeta(total);
            this.v.setTotal_efectivo(0.0D);
            this.v.setPagoMovil(0.0D);
        } else if (this.metodo == 1) {
            this.v.setTotal_efectivo(total);
            this.v.setTotal_tarjeta(0.0D);
            this.v.setPagoMovil(0.0D);
        } else if (this.metodo == 3) {
            this.v.setPagoMovil(pago);
            this.v.setTotal_efectivo(0.0D);
            this.v.setTotal_tarjeta(0.0D);
        }

        this.v.setCliente(Integer.parseInt(cliente));
        this.v.setPrecio_divisa(this.dolar);
        this.v.setTotal(total);
        this.v.setModo(this.metodo);
        this.vDao.registrarVenta(this.v);
        this.registrarDetalle();
    }

    private void registrarVenta(double totalApagar, double pago) {
        String cliente = this.txtIdSocio.getText();
        if (cliente.equals("")) {
            cliente = "0";
        }

        if (this.metodo == 2) {
            this.v.setTotal_efectivo(pago);
            this.v.setTotal_tarjeta(this.preciofinal(totalApagar - pago));
            this.v.setPagoMovil(0.0D);
        } else if (this.metodo == 4) {
            this.v.setTotal_efectivo(pago);
            this.v.setTotal_tarjeta(0.0D);
            this.v.setPagoMovil(this.preciofinal(totalApagar - pago));
        }

        this.v.setCliente(Integer.parseInt(cliente));
        this.v.setPrecio_divisa(this.dolar);
        this.v.setTotal(totalApagar);
        this.v.setModo(this.metodo);
        this.vDao.registrarVenta(this.v);
        this.registrarDetalle();
    }

    private void registrarCierre(Double total, Double efec, Double punto, Double pm) {
        if (total > 0.0D) {
            this.cr.setTotal_conjunto(total);
            this.cr.setTotal_efectivo(efec);
            this.cr.setTotal_punto(punto);
            this.cr.setPm(pm);
            List<Cierre> listaCr = this.crDao.buscarCierre(this.crDao.idCierre());
            this.crDao.registrarCierre(this.cr);
        } else {
            JOptionPane.showMessageDialog((Component) null, "No se han realizado ventas el dia de hoy!");
        }

    }

    private void registrarDetalle() {
        int id_detalle = this.vDao.idVenta();

        for (int i = 0; i < this.tablaVentas.getRowCount(); ++i) {
            int id = Integer.parseInt(this.tablaVentas.getValueAt(i, 0).toString());
            int cant = Integer.parseInt(this.tablaVentas.getValueAt(i, 3).toString());
            Double precio = Double.parseDouble(this.tablaVentas.getValueAt(i, 2).toString());
            this.dv.setId_producto(id);
            this.dv.setCantidad(cant);
            this.dv.setPrecio(precio);
            this.dv.setId_detalle(id_detalle);
            this.vDao.registrarDetalle(this.dv);
        }

    }

    private void limpiarTxtClient() {
        this.txtID.setText("");
        this.tipoTxt.setText("");
        this.buscaSocio.setText("");
        this.txtCedula.setText("");
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.txtAccion.setText("");
        this.txtTelefono.setText("");
        this.txtAfavorSoc.setText("0");
        this.txtStatusSocio.setText("");
    }

    private void limpiarTxtProd() {
        this.buscaProducto.setText("");
        this.txtIDproductos.setText("");
        this.txtNombreProducto.setText("");
        this.txtPrecio.setText("");
        this.txtPorcentaje.setText("");
    }

    private void limpiarTxtFront() {
        this.txtProductos2.setText("");
        this.txtPrecioVenta.setText("");
        this.txtCantidad.setText("");
    }

    private void limpiarTxtTotales() {
        this.totalBolivares.setText("Bs");
        this.totalDolares.setText("$");
    }

    private void limpiarDatosSocio() {
        this.txtAccion2.setText("");
        this.txtIdSocio.setText("");
        this.txtNombreSocio.setText("");
        this.txtStatus.setText("");
        this.aFavortxt.setText("0");
    }

    private void limpiarMisc() {
        this.searchProd.setText("");
        this.modoTxt.setText("");
        this.idVentatxt.setText("");
        this.modoAnterior.setText("");
        this.pmTxt.setText("");
        this.tarjTxt.setText("");
        this.efecTxt.setText("");
        this.totalTxt.setText("");
    }

    private boolean chageModoVenta(String modo, Double total) {
        if (!modo.equals("tarjeta") && !modo.equals("0")) {
            if (!modo.equals("efectivo") && !modo.equals("1")) {
                if (!modo.equals("tj-efc") && !modo.equals("2")) {
                    if (!modo.equals("pago movil") && !modo.equals("3")) {
                        if (!modo.equals("pm-efc") && !modo.equals("4")) {
                            JOptionPane.showMessageDialog((Component) null, "Debe escribir un metodo de pago correcto:\n 0.-tarjeta \n1.-efectivo\n2.-tj-efc\n3.-pago movil\n4.-pm-efc");
                            return false;
                        } else if (Double.parseDouble(this.tarjTxt.getText()) == 0.0D && Double.parseDouble(this.efecTxt.getText()) != 0.0D && Double.parseDouble(this.pmTxt.getText()) != 0.0D) {
                            if (total == Double.parseDouble(this.pmTxt.getText()) + Double.parseDouble(this.efecTxt.getText())) {
                                this.v.setModo(4);
                                this.v.setTotal_efectivo(Double.parseDouble(this.efecTxt.getText()));
                                this.v.setTotal_tarjeta(Double.parseDouble(this.tarjTxt.getText()));
                                this.v.setPagoMovil(Double.parseDouble(this.pmTxt.getText()));
                                return true;
                            } else {
                                JOptionPane.showMessageDialog((Component) null, "El monto debe ser igual al monto anterior");
                                return false;
                            }
                        } else {
                            JOptionPane.showMessageDialog((Component) null, "Los campos de Pago Movil y Efectivo deben poseer un monto mayor a 0\nLos demas campos deben ser igual a 0");
                            return false;
                        }
                    } else if (Double.parseDouble(this.tarjTxt.getText()) == 0.0D && Double.parseDouble(this.efecTxt.getText()) == 0.0D && Double.parseDouble(this.pmTxt.getText()) != 0.0D) {
                        if (total == Double.parseDouble(this.tarjTxt.getText())) {
                            this.v.setModo(3);
                            this.v.setTotal_efectivo(Double.parseDouble(this.efecTxt.getText()));
                            this.v.setTotal_tarjeta(Double.parseDouble(this.tarjTxt.getText()));
                            this.v.setPagoMovil(Double.parseDouble(this.pmTxt.getText()));
                            return true;
                        } else {
                            JOptionPane.showMessageDialog((Component) null, "El monto debe ser igual al monto anterior");
                            return false;
                        }
                    } else {
                        JOptionPane.showMessageDialog((Component) null, "El campo de Pago Movil debe poseer un monto mayor a 0\nLos demas campos deben ser igual a 0");
                        return false;
                    }
                } else if (Double.parseDouble(this.tarjTxt.getText()) != 0.0D && Double.parseDouble(this.efecTxt.getText()) != 0.0D && Double.parseDouble(this.pmTxt.getText()) == 0.0D) {
                    if (total == Double.parseDouble(this.tarjTxt.getText()) + Double.parseDouble(this.efecTxt.getText())) {
                        this.v.setModo(2);
                        this.v.setTotal_efectivo(Double.parseDouble(this.efecTxt.getText()));
                        this.v.setTotal_tarjeta(Double.parseDouble(this.tarjTxt.getText()));
                        this.v.setPagoMovil(Double.parseDouble(this.pmTxt.getText()));
                        return true;
                    } else {
                        JOptionPane.showMessageDialog((Component) null, "El monto debe ser igual al monto anterior");
                        return false;
                    }
                } else {
                    JOptionPane.showMessageDialog((Component) null, "Los campo de TARJETA y EFECTIVO deben poseer un monto mayor a 0\nLos demas campos deben ser igual a 0");
                    return false;
                }
            } else if (Double.parseDouble(this.tarjTxt.getText()) == 0.0D && Double.parseDouble(this.efecTxt.getText()) != 0.0D && Double.parseDouble(this.pmTxt.getText()) == 0.0D) {
                if (total == Double.parseDouble(this.efecTxt.getText())) {
                    this.v.setModo(1);
                    this.v.setTotal_efectivo(Double.parseDouble(this.efecTxt.getText()));
                    this.v.setTotal_tarjeta(Double.parseDouble(this.tarjTxt.getText()));
                    this.v.setPagoMovil(Double.parseDouble(this.pmTxt.getText()));
                    return true;
                } else {
                    JOptionPane.showMessageDialog((Component) null, "El monto debe ser igual al monto anterior");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog((Component) null, "El campo EFECTIVO debe poseer un monto mayor a 0\nLos demas campos deben ser igual a 0");
                return false;
            }
        } else if (Double.parseDouble(this.tarjTxt.getText()) != 0.0D && Double.parseDouble(this.efecTxt.getText()) == 0.0D && Double.parseDouble(this.pmTxt.getText()) == 0.0D) {
            if (total == Double.parseDouble(this.tarjTxt.getText())) {
                this.v.setModo(0);
                this.v.setTotal_efectivo(Double.parseDouble(this.efecTxt.getText()));
                this.v.setTotal_tarjeta(Double.parseDouble(this.tarjTxt.getText()));
                this.v.setPagoMovil(Double.parseDouble(this.pmTxt.getText()));
                return true;
            } else {
                JOptionPane.showMessageDialog((Component) null, "El monto debe ser igual al monto anterior");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog((Component) null, "El campo TARJETA debe poseer un monto mayor a 0\nLos demas campos deben ser igual a 0");
            return false;
        }
    }

    private void actualizarTotal() {
        Double totalF = 0.0D;
        Double bolivar = 0.0D;
        Double aFavor = Double.parseDouble(this.aFavortxt.getText());
        if (aFavor < 0.0D) {
            totalF = totalF + aFavor * -1.0D;
        }

        for (int i = 0; i < this.tablaVentas.getRowCount(); ++i) {
            double b = (Double) this.tablaVentas.getValueAt(i, 4);
            totalF = totalF + b;
        }

        if (aFavor > 0.0D) {
            aFavor = aFavor - totalF;
            if (aFavor <= 0.0D) {
                if (aFavor == 0.0D) {
                    this.limpiarVentas();
                    this.aFavortxt.setText("0");
                    this.client.setAfavor(Integer.parseInt(this.txtIdSocio.getText()), 0.0D);
                    this.actualizarTotal();
                } else {
                    this.limpiarVentas();
                    this.aFavortxt.setText(aFavor.toString());
                    this.aFavortxt.setDisabledTextColor(Color.red);
                    this.client.setAfavor(Integer.parseInt(this.txtIdSocio.getText()), this.preciofinal(aFavor));
                    this.actualizarTotal();
                }
            } else if (aFavor > 0.0D) {
                this.limpiarVentas();
                this.client.setAfavor(Integer.parseInt(this.txtIdSocio.getText()), this.preciofinal(aFavor));
                this.aFavortxt.setText(this.preciofinal(aFavor).toString());
            }
        } else {
            this.totalDolares.setText(String.valueOf(this.preciofinal(totalF)));
            bolivar = totalF * Double.parseDouble(this.txtDivisa.getText());
            this.totalBolivares.setText(String.valueOf(this.preciofinal(bolivar)));
        }

    }

    private void agregarProductosTablaVentas() {
        if (!"".equals(this.txtProductos2.getText()) && !"".equals(this.txtCantidad.getText())) {
            this.modeloVenta = (DefaultTableModel) this.tablaVentas.getModel();
            if (Double.parseDouble(this.aFavortxt.getText().toString()) > 0.0D) {
                Double var10001 = this.preciofinal((double) Integer.parseInt(this.txtCantidad.getText()) * Double.parseDouble(this.txtPrecioVenta.getText()));
                JOptionPane.showMessageDialog((Component) null, "Se redujo del monto a favor " + var10001);
                if (Double.parseDouble(this.aFavortxt.getText().toString()) < 0.0D) {
                    this.aFavortxt.setDisabledTextColor(Color.red);
                }
            }

            boolean change = false;
            int opt = 0;

            String checkTotal = totalDolares.getText();

            if (txtIdSocio != null) {
                if (totalDolares.equals("$") && Double.parseDouble(totalDolares.getText()) >= 20) {
                    opt = JOptionPane.showConfirmDialog(null, "El Socio tiene una cuenta ELEVADA, Desea agregar el producto? ");

                }
            }

            if (opt == 0) {
                for (int i = 0; i < this.tablaVentas.getRowCount(); ++i) {
                    if (String.valueOf(this.tablaVentas.getValueAt(i, 5)).equals(String.valueOf(LocalDate.now())) && String.valueOf(this.tablaVentas.getValueAt(i, 0)).equals(String.valueOf(this.txtIdProducto2.getText()))) {
                        int cant;
                        if (Integer.parseInt(this.txtCantidad.getText()) == 1) {
                            cant = (Integer) this.tablaVentas.getValueAt(i, 3);
                            this.tablaVentas.setValueAt(cant + 1, i, 3);
                            ++cant;
                            this.tablaVentas.setValueAt(this.preciofinal((double) cant * Double.parseDouble(this.txtPrecioVenta.getText())), i, 4);
                            change = true;
                        } else {
                            cant = (Integer) this.tablaVentas.getValueAt(i, 3) + Integer.parseInt(this.txtCantidad.getText());
                            this.tablaVentas.setValueAt(cant, i, 3);
                            this.tablaVentas.setValueAt(this.preciofinal((double) cant * Double.parseDouble(this.txtPrecioVenta.getText())), i, 4);
                            this.tablaVentas.setValueAt(new JLabel(this.mas), i, 6);
                            this.tablaVentas.setValueAt(new JLabel(this.menos), i, 7);
                            this.tablaVentas.setValueAt(new JLabel(this.eliminar), i, 8);
                            change = true;
                        }
                    }
                }

                if (!change) {
                    Object[] ob = new Object[]{this.txtIdProducto2.getText(), this.txtProductos2.getText(), Double.parseDouble(this.txtPrecioVenta.getText()), Integer.parseInt(this.txtCantidad.getText()), this.preciofinal((double) Integer.parseInt(this.txtCantidad.getText()) * Double.parseDouble(this.txtPrecioVenta.getText())), LocalDate.now(), new JLabel(this.mas), new JLabel(this.menos), new JLabel(this.eliminar)};
                    this.tablaVentas.setDefaultRenderer(Object.class, new Sistema.IconCellRenderer());
                    this.modeloVenta.addRow(ob);
                    this.tablaVentas.setModel(this.modeloVenta);
                }

                this.limpiarTxtFront();
                this.actualizarTotal();
            }

        } else {
            JOptionPane.showMessageDialog((Component) null, "Complete Los Campos Necesarios.");
        }

    }

    private void buscarSocio() {
        List<Socios> buscarSocio = new ArrayList();
        if (this.tablaVentas.getRowCount() > 0) {
            this.guardarDeuda();
            this.limpiarVentas();
        }

        if (!"".equals(this.txtAccion2.getText())) {
            String combo = this.comboTipo1.getSelectedItem().toString();
            int tipo = 0;

            switch (combo) {
                case "Socio":
                    tipo = 1;
                    break;
                case "Trabajador":
                    tipo = 3;
                    break;
                case "Concesionario":
                    tipo = 2;
                    break;
                case "Administracion":
                    tipo = 4;
                    break;
            }

            if (this.txtAccion2.getText().matches("[a-zA-Z]+")) {
                buscarSocio = this.client.buscarSocio(this.txtAccion2.getText(), tipo);
            } else if (this.txtAccion2.getText().matches("[0-9]+")) {
                buscarSocio = this.client.buscarSocio(Integer.parseInt(this.txtAccion2.getText()), tipo);
            }

            if (buscarSocio.size() == 0) {
                this.txtAccion2.setText("");
                this.txtIdSocio.setText("");
                this.txtNombreSocio.setText("");
                this.txtStatus.setText("");
                this.aFavortxt.setText("0");
            } else {
                for (int i = 0; i < ((List) buscarSocio).size(); ++i) {
                    this.txtIdSocio.setText(String.valueOf(((Socios) ((List) buscarSocio).get(i)).getId()));
                    this.txtNombreSocio.setText(((Socios) ((List) buscarSocio).get(i)).getNombre());
                    if (((Socios) ((List) buscarSocio).get(i)).getStatus() == 0) {
                        this.txtStatus.setDisabledTextColor(new Color(0, 102, 51));
                        this.txtStatus.setText("LIBRE");
                    } else {
                        this.txtStatus.setDisabledTextColor(Color.RED);
                        this.txtStatus.setText("DEUDOR");
                    }

                    if ((buscarSocio).get(i).getAFavor() > 0.0D) {
                        this.aFavortxt.setDisabledTextColor(new Color(0, 102, 51));
                    } else {
                        this.aFavortxt.setDisabledTextColor(Color.RED);
                    }

                    this.aFavortxt.setText(String.valueOf(preciofinal(buscarSocio.get(i).getAFavor())));
                    this.limpiarVentas();
                    this.listarDeudas(Integer.parseInt(this.txtIdSocio.getText()));
                    this.actualizarTotal();
                    if (Double.parseDouble(totalDolares.getText()) >= 20.0) {
                        JOptionPane.showMessageDialog(null, "Este Socio Posee una Cuenta Alta, RECUERDE NOTIFICAR!");
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un número de acción valido.");
        }

    }

    private void guardarSocio() {
        if (this.trabajadorChb.isSelected()) {
            this.cl.setTipo(3);
            this.cl.setAccion(0);
        } else if (this.consesionarioChb.isSelected()) {
            this.cl.setTipo(2);
            this.cl.setAccion(0);
        } else if (this.socioChb.isSelected()) {
            this.cl.setTipo(1);
            this.cl.setAccion(Integer.parseInt(this.txtAccion.getText()));
        } else if (this.jrAdmin.isSelected()) {
            this.cl.setTipo(4);
            this.cl.setAccion(0);
        }

        if (this.trabajadorChb.isSelected() && this.consesionarioChb.isSelected() && this.socioChb.isSelected()) {
            JOptionPane.showMessageDialog((Component) null, "Debe selecionar un tipo de comprador.");
        } else if ("".equals(this.txtAccion.getText()) && this.socioChb.isSelected()) {
            JOptionPane.showMessageDialog((Component) null, "Debe completar el cuadro Accion.");
        } else {
            boolean check = false;
            if (this.socioChb.isSelected()) {
                int accion = this.cl.getAccion();
                check = this.client.checkAccion(accion);
                if (!check) {
                    check = this.client.checkCedula(Integer.parseInt(this.txtCedula.getText()));
                }
            } else {
                check = this.client.checkCedula(Integer.parseInt(this.txtCedula.getText()));
            }

            if (!check) {
                this.cl.setCedula(Integer.parseInt(this.txtCedula.getText()));
                this.cl.setNombre(this.txtNombre.getText());
                this.cl.setApellido(this.txtApellido.getText());
                this.cl.setTelefono(this.txtTelefono.getText());
                this.cl.setStatus(0);
                this.cl.setAFavor(Double.parseDouble(this.txtAfavorSoc.getText()));
                this.client.registrarSocio(this.cl);
                JOptionPane.showMessageDialog((Component) null, "Socio Registrado!");
                this.limpiarSocios();
                this.listarSocios();
                this.limpiarTxtClient();
            } else {
                JOptionPane.showMessageDialog((Component) null, "Este socio ya esta registrado");
                this.limpiarTxtClient();
            }
        }

    }

    private void guardarProducto() {
        if ("".equals(this.txtNombreProducto.getText()) && "".equals(this.txtPrecio.getText()) && "".equals(this.txtPorcentaje.getText())) {
            JOptionPane.showMessageDialog((Component) null, "Los campos estan vacios.!");
        } else {
            boolean check = false;
            check = this.proDao.checkProduc(this.txtNombreProducto.getText());
            if (!check) {
                this.pro.setNombre(this.txtNombreProducto.getText());
                this.pro.setPrecio(Double.parseDouble(this.txtPrecio.getText()));
                this.pro.setPorcentaje(Integer.parseInt(this.txtPorcentaje.getText()));
                this.proDao.registrarProductos(this.pro);
                JOptionPane.showMessageDialog((Component) null, "Producto agregado con exito");
                this.limpiarProdc();
                this.limpiarTxtProd();
                this.listarProductos();
            } else {
                this.limpiarTxtProd();
                JOptionPane.showMessageDialog((Component) null, "El producto ya existe.!");
            }
        }

    }

    private void registrarVenta2(double pago) {
        String cliente = this.txtIdSocio.getText();
        if (cliente.equals("")) {
            cliente = "0";
        }

        this.v.setTotal_efectivo(pago);
        this.v.setTotal_tarjeta(0.0D);
        this.v.setPagoMovil(0.0D);
        this.v.setCliente(Integer.parseInt(cliente));
        this.v.setPrecio_divisa(this.dolar);
        this.v.setTotal(pago);
        this.v.setModo(this.metodo);
        this.vDao.registrarVenta(this.v);
        this.registrarDetalle();
    }

    private void pago(double totalApagar) {
        double subTotal = 0.0D;
        int socio = 0;
        if (!this.txtIdSocio.getText().equals("")) {
            socio = Integer.parseInt(this.txtIdSocio.getText());
        }

        totalApagar = this.preciofinal(totalApagar);
        if (totalApagar > 0.0D) {
            int sel;
            if (this.tarjeta.isSelected() && !this.efectivo.isSelected() && !this.pm.isSelected()) {
                this.metodo = 0;
                sel = JOptionPane.showConfirmDialog((Component) null, "Desea completar el pago por Tarjeta?");
                if (sel == 0) {
                    this.client.setAfavor(socio, 0.0D);
                    this.client.changeStatus(socio, 0);
                    this.registrarVenta(totalApagar);
                    this.limpiarTxtTotales();
                    this.limpiarVentas();
                    this.limpiarDatosSocio();
                }
            } else if (this.pm.isSelected() && !this.efectivo.isSelected() && !this.tarjeta.isSelected()) {
                this.metodo = 3;
                sel = JOptionPane.showConfirmDialog((Component) null, "Desea completar el pago por pago movil?");
                if (sel == 0) {
                    this.client.setAfavor(socio, 0.0D);
                    this.client.changeStatus(socio, 0);
                    this.registrarVenta(totalApagar);
                    this.limpiarTxtTotales();
                    this.limpiarVentas();
                    this.limpiarDatosSocio();
                }
            } else {
                Double var10001;
                double pago;
                if (!this.tarjeta.isSelected() && this.efectivo.isSelected() && !this.pm.isSelected()) {
                    this.metodo = 1;
                    pago = Double.parseDouble(JOptionPane.showInputDialog((Component) null, "Con cuanto va a pagar?."));
                    subTotal = totalApagar - pago;
                    subTotal = this.preciofinal(subTotal);
                    if (subTotal > 0.0D) {
                        var10001 = this.preciofinal(subTotal * this.dolar);
                        JOptionPane.showMessageDialog((Component) null, "Faltan " + var10001 + "bs o " + this.preciofinal(subTotal) + "$");
                        sel = JOptionPane.showConfirmDialog((Component) null, "Desea completar el pago?");
                        if (sel != 0 && !this.txtIdSocio.getText().equals("")) {
                            subTotal = this.preciofinal(subTotal * -1.0D);
                            this.client.setAfavor(socio, subTotal);
                            this.client.changeStatus(socio, 1);
                            
                            this.registrarVenta2(pago);
                            this.limpiarTxtTotales();
                            this.limpiarVentas();
                            this.limpiarDatosSocio();
                        } else {
                            var10001 = this.preciofinal(subTotal * this.dolar);
                            JOptionPane.showMessageDialog((Component) null, "El total a pagar es de : " + var10001 + " bs");
                            this.metodo = 2;
                            this.client.setAfavor(socio, 0.0D);
                            this.client.changeStatus(socio, 0);
                            this.registrarVenta(totalApagar, pago);
                            this.limpiarTxtTotales();
                            this.limpiarVentas();
                            this.limpiarDatosSocio();
                        }
                    } else if (subTotal < 0.0D) {
                        var10001 = this.preciofinal(subTotal * -1.0D);
                        JOptionPane.showMessageDialog((Component) null, "El vuelto es " + var10001 + "$ o " + this.preciofinal(subTotal * this.dolar * -1.0D) + " bs");
                        if (!this.txtIdSocio.getText().equals("")) {
                            sel = JOptionPane.showConfirmDialog((Component) null, "Desea dejar abonado?");
                            if (sel == 0) {
                                String afavor = JOptionPane.showInputDialog("Cuanto desea abonar?");
                                this.client.setAfavor(Integer.parseInt(this.txtIdSocio.getText()), Double.parseDouble(afavor));
                                totalApagar += Double.parseDouble(afavor);
                            }

                            this.client.changeStatus(socio, 0);
                        }

                        this.registrarVenta(totalApagar);
                        this.limpiarTxtTotales();
                        this.limpiarVentas();
                        this.limpiarDatosSocio();
                    } else if (subTotal == 0.0D) {
                        this.registrarVenta(totalApagar);
                        this.limpiarTxtTotales();
                        this.limpiarVentas();
                        this.limpiarDatosSocio();
                        this.client.setAfavor(socio, 0.0D);
                        this.client.changeStatus(socio, 0);
                    }
                } else if (this.tarjeta.isSelected() && this.efectivo.isSelected()) {
                    this.metodo = 2;
                    pago = Double.parseDouble(JOptionPane.showInputDialog((Component) null, "Cuanto pagara en Efectivo?: ."));
                    subTotal = totalApagar - pago;
                    var10001 = this.preciofinal(subTotal * this.dolar);
                    JOptionPane.showMessageDialog((Component) null, "El total a pagar en tarjeta es: " + var10001);
                    this.registrarVenta(totalApagar, pago);
                    this.limpiarTxtTotales();
                    this.limpiarVentas();
                    this.limpiarDatosSocio();
                    this.client.setAfavor(socio, 0.0D);
                    this.client.changeStatus(socio, 0);
                } else if (this.pm.isSelected() && this.efectivo.isSelected()) {
                    this.metodo = 4;
                    pago = Double.parseDouble(JOptionPane.showInputDialog((Component) null, "Cuanto pagara en Efectivo?: ."));
                    subTotal = totalApagar - pago;
                    var10001 = this.preciofinal(subTotal * this.dolar);
                    JOptionPane.showMessageDialog((Component) null, "El total a pagar en Pago movil es: " + var10001);
                    this.registrarVenta(totalApagar, pago);
                    this.limpiarTxtTotales();
                    this.limpiarVentas();
                    this.limpiarDatosSocio();
                    this.client.setAfavor(socio, 0.0D);
                    this.client.changeStatus(socio, 0);
                }
            }
        }

    }

    private void guardarDeuda() {
        int socio = Integer.parseInt(this.txtIdSocio.getText());
        this.modeloVenta = (DefaultTableModel) this.tablaVentas.getModel();
        boolean deudor = this.deuDAO.buscaSocio(socio);
        int i;
        int id;
        int cant;
        Object fecha;
        if (deudor) {
            this.deuDAO.eliminarProducto(socio);

            for (i = 0; i < this.tablaVentas.getRowCount(); ++i) {
                id = Integer.valueOf(this.tablaVentas.getValueAt(i, 0).toString());
                cant = (Integer) this.tablaVentas.getValueAt(i, 3);
                fecha = this.tablaVentas.getValueAt(i, 5);
                this.deuDAO.registrarDeuda(socio, id, cant, fecha);
            }

            this.limpiarTxtTotales();
        } else if (!deudor) {
            for (i = 0; i < this.tablaVentas.getRowCount(); ++i) {
                id = Integer.valueOf(this.tablaVentas.getValueAt(i, 0).toString());
                cant = (Integer) this.tablaVentas.getValueAt(i, 3);
                fecha = this.tablaVentas.getValueAt(i, 5);
                this.deuDAO.registrarDeuda(socio, id, cant, fecha);
            }

            this.client.changeStatus(socio, 1);
            this.limpiarTxtTotales();
        }

        JOptionPane.showMessageDialog((Component) null, "Deuda Guardada Con Exito!!");
    }

    private Double preciofinal(Double numero) {
        return (double) Math.round(numero * Math.pow(10.0D, 2.0D)) / Math.pow(10.0D, 2.0D);
    }

    public static String upperCaseFirst(String val) {
        char[] arr = val.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);
    }

    public class IconCellRenderer extends DefaultTableCellRenderer {

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof JLabel) {
                JLabel label = (JLabel) value;
                label.setOpaque(true);
                return label;
            } else {
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        }
    }

    public class myFontRender extends DefaultTableCellRenderer {

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            component.setForeground(Color.BLACK);
            return component;
        }
    }
}
