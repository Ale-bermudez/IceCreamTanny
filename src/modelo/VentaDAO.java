/* Decompiler 26ms, total 131ms, lines 264 */
package modelo;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentaDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public int idVenta() {
        int id = 0;
        String sql = "Select MAX(id_venta) FROM ventas";

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.rs = this.ps.executeQuery();
            if (this.rs.next()) {
                id = this.rs.getInt(1);
            }
        } catch (SQLException var12) {
            System.out.println(var12.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (Exception var13) {
                    JOptionPane.showMessageDialog((Component) null, var13.toString());
                }
            }

        }

        return id;
    }

    public int registrarVenta(Venta v) {
        String sql = "INSERT INTO ventas (cliente, total,total_efectivo,total_tarjeta, fecha, modo,precio_divisa,checkCaja,pago_movil) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, v.getCliente());
            this.ps.setDouble(2, v.getTotal());
            this.ps.setDouble(3, v.getTotal_efectivo());
            this.ps.setDouble(4, v.getTotal_tarjeta());
            this.ps.setObject(5, LocalDate.now());
            this.ps.setInt(6, v.getModo());
            this.ps.setDouble(7, v.getPrecio_divisa());
            this.ps.setInt(8, 0);
            this.ps.setDouble(9, v.getPagoMovil());
            this.ps.execute();
        } catch (SQLException var12) {
            System.out.println(var12.toString() + " Venta");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (Exception var13) {
                    JOptionPane.showMessageDialog((Component) null, var13.toString());
                }
            }

        }

        return this.r;
    }

    public int registrarDetalle(Detalle dv) {
        String sql = "INSERT INTO detalle (id_producto,cantidad,precio,fecha,id_venta) VALUES (?,?,?,?,?)";

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, dv.getId_producto());
            this.ps.setInt(2, dv.getCantidad());
            this.ps.setDouble(3, dv.getPrecio());
            this.ps.setObject(4, LocalDate.now());
            this.ps.setInt(5, dv.getId_detalle());
            this.ps.execute();
        } catch (SQLException var12) {
            System.out.println(var12.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (Exception var13) {
                    JOptionPane.showMessageDialog((Component) null, var13.toString());
                }
            }

        }

        return this.r;
    }

    public List obtenerVentas() {
        String sql = "SELECT * FROM ventas WHERE checkCaja = 0";
        ArrayList listVent = new ArrayList();

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.rs = this.ps.executeQuery();

            while (this.rs.next()) {
                Venta vt = new Venta();
                vt.setId(this.rs.getInt("id_venta"));
                vt.setCliente(this.rs.getInt("cliente"));
                vt.setPrecio_divisa(this.rs.getDouble("precio_divisa"));
                vt.setModo(this.rs.getInt("modo"));
                vt.setTotal(this.rs.getDouble("total"));
                vt.setTotal_efectivo(this.rs.getDouble("total_efectivo"));
                vt.setTotal_tarjeta(this.rs.getDouble("total_tarjeta"));
                vt.setCheckCaja(this.rs.getInt("checkCaja"));
                vt.setPagoMovil(this.rs.getDouble("pago_movil"));
                listVent.add(vt);
            }
        } catch (SQLException var12) {
            System.out.println(var12.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (Exception var13) {
                    JOptionPane.showMessageDialog((Component) null, var13.toString());
                }
            }

        }

        return listVent;
    }

    public boolean checkCaja(int id) {
        String sql = "UPDATE ventas SET checkCaja = ? WHERE id_venta = ?";

        boolean var4 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, 1);
            this.ps.setInt(2, id);
            this.ps.execute();
            boolean var3 = true;
            return var3;
        } catch (SQLException var14) {
            System.out.println(var14.toString());
            var4 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (Exception var13) {
                    JOptionPane.showMessageDialog((Component) null, var13.toString());
                }
            }

        }

        return var4;
    }

    public List obtenerProducto(int id, Object fecha) {
        String sql = "SELECT * FROM detalle WHERE id_producto = ? AND fecha > ? AND fecha <= ?";
        String sql2 = "SELECT * FROM detalle WHERE id_producto = ? AND fecha = ?";
        ArrayList listDetalle = new ArrayList();

        try {
            this.con = this.cn.getConnection();
            if (fecha.equals(LocalDate.now())) {
                this.ps = this.con.prepareStatement(sql2);
                this.ps.setInt(1, id);
                this.ps.setObject(2, LocalDate.now());
                this.rs = this.ps.executeQuery();
            } else {
                this.ps = this.con.prepareStatement(sql);
                this.ps.setInt(1, id);
                this.ps.setObject(2, fecha);
                this.ps.setObject(3, LocalDate.now());
                this.rs = this.ps.executeQuery();
            }

            while (this.rs.next()) {
                Detalle vt = new Detalle();
                vt.setId_detalle(this.rs.getInt("id_detalle"));
                vt.setId_producto(this.rs.getInt("id_producto"));
                vt.setCantidad(this.rs.getInt("cantidad"));
                vt.setPrecio(this.rs.getDouble("precio"));
                vt.setId_venta(this.rs.getInt("id_venta"));
                vt.setFecha(this.rs.getObject("fecha"));
                listDetalle.add(vt);
            }
        } catch (SQLException var15) {
            System.out.println(var15.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (Exception var13) {
                    JOptionPane.showMessageDialog((Component) null, var13.toString());
                }
            }

        }

        return listDetalle;
    }

    public boolean eliminarVenta(int id) {
        String sql = "DELETE FROM ventas WHERE id_venta = ?";

        boolean var4 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, id);
            this.ps.execute();
            boolean var3 = true;
            return var3;
        } catch (SQLException var14) {
            System.out.println(var14.toString());
            var4 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (Exception var13) {
                    JOptionPane.showMessageDialog((Component) null, var13.toString());
                }
            }

        }

        return var4;
    }

    public boolean modificarVenta(Venta v) {
        String sql = "UPDATE ventas SET modo = ?, pago_movil = ?, total_tarjeta = ?, total_efectivo = ? WHERE id_venta = ?";

        boolean var4 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, v.getModo());
            this.ps.setDouble(2, v.getPagoMovil());
            this.ps.setDouble(3, v.getTotal_tarjeta());
            this.ps.setDouble(4, v.getTotal_efectivo());
            this.ps.setInt(5, v.getId());
            this.ps.execute();
            boolean var3 = true;
            return var3;
        } catch (SQLException var14) {
            System.out.println(var14.toString());
            var4 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (Exception var13) {
                    JOptionPane.showMessageDialog((Component) null, var13.toString());
                }
            }

        }

        return var4;
    }
}
