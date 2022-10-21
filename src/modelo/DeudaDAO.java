/* Decompiler 26ms, total 124ms, lines 264 */
package modelo;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DeudaDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ResultSet rs2;
    ProductosDAO prod;
    int r;

    public int registrarDeuda(int socio, int producto, int cantidad, Object fecha) {
        String sql = "INSERT INTO deuda (id_socio, id_producto, cantidad_producto,fecha) VALUES (?,?,?,?)";

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, socio);
            this.ps.setInt(2, producto);
            this.ps.setInt(3, cantidad);
            this.ps.setObject(4, fecha);
            this.ps.execute();
        } catch (SQLException var15) {
            System.out.println(var15.toString() + "DEUDA REGISTRAR!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeudaDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    public List listarDeuda(int socio) {
        List<Deuda> ListaPro = new ArrayList();
        String sql = "Select * From deuda WHERE id_socio = ?";

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, socio);
            this.rs = this.ps.executeQuery();
            int id_producto = 0;

            String var5 = " ";

            while (this.rs.next()) {
                Deuda pro = new Deuda();
                pro.setId_deuda(this.rs.getInt("id_deuda"));
                pro.setId_producto(this.rs.getInt("id_producto"));
                pro.setCantidad_producto(this.rs.getInt("cantidad_producto"));
                pro.setNombre(this.nombreProducto(this.rs.getInt("id_producto")));
                pro.setPrecio(this.precioProducto(this.rs.getInt("id_producto")));
                pro.setFecha(this.rs.getObject("fecha"));
                System.out.println(rs.getObject("fecha"));
                ListaPro.add(pro);
            }
        } catch (Exception var15) {
            System.out.println(var15.toString() + "DEUDA listar!");
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (Exception var13) {
                    JOptionPane.showMessageDialog((Component) null, var13.toString());
                }
            }

        }

        return ListaPro;
    }

    public String nombreProducto(int id) {
        String sql = "Select * From producto WHERE id_producto = ?";
        String nombre = "vacio";

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, id);
            this.rs2 = this.ps.executeQuery();
            if (this.rs2.next()) {
                nombre = this.rs2.getString(2);
            }
        } catch (Exception var13) {
            System.out.println(var13.toString() + "DEUDA busca productos!");
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (Exception var13) {
                    JOptionPane.showMessageDialog((Component) null, var13.toString());
                }
            }

        }

        return nombre;
    }

    public double precioProducto(int id) {
        String sql = "Select * FROM producto WHERE id_producto = ?";
        double precio = 0.0D;

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, id);
            this.rs2 = this.ps.executeQuery();
            if (this.rs2.next()) {
                precio = this.rs2.getDouble(3);
            }
        } catch (Exception var14) {
            System.out.println(var14.toString() + "DEUDA precio producto!");
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (Exception var13) {
                    JOptionPane.showMessageDialog((Component) null, var13.toString());
                }
            }

        }

        return precio;
    }

    public boolean eliminarProducto(int id) {
        String sql = "DELETE FROM deuda WHERE id_socio = ?";

        boolean var4 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, id);
            boolean var3 = this.ps.execute();
            return var3;
        } catch (SQLException var14) {
            System.out.println(var14.toString());
            var4 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeudaDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    public boolean buscarProducto(int id, int producto) {
        String sql = "SELECT * FROM deuda WHERE id_socio = ? AND id_producto = ?";

        boolean var5 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, id);
            this.ps.setInt(2, producto);
            this.rs = this.ps.executeQuery();
            boolean var4 = this.rs.next();
            return var4;
        } catch (SQLException var15) {
            System.out.println(var15.toString());
            var5 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeudaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (Exception var13) {
                    JOptionPane.showMessageDialog((Component) null, var13.toString());
                }
            }

        }

        return var5;
    }

    public boolean eliminarProducto(int id, int producto) {
        String sql = "DELETE FROM deuda WHERE id_socio = ? AND id_producto = ?";

        boolean var5 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, id);
            this.ps.setInt(2, producto);
            boolean var4 = this.ps.execute();
            return var4;
        } catch (SQLException var15) {
            System.out.println(var15.toString());
            var5 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeudaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (Exception var13) {
                    JOptionPane.showMessageDialog((Component) null, var13.toString());
                }
            }

        }

        return var5;
    }

    public boolean buscaSocio(int id) {
        String sql = "Select * FROM deuda WHERE id_socio = ?";

        boolean var4 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, id);
            this.rs = this.ps.executeQuery();
            boolean var3 = this.rs.next();
            return var3;
        } catch (SQLException var14) {
            System.out.println(var14.toString());
            var4 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeudaDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    public boolean eliminarDeuda(int id) {
        String sql = "DELETE FROM deuda WHERE id_socio = ?";

        boolean var4 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, id);
            this.ps.execute();
            boolean var3 = true;
            return var3;
        } catch (SQLException var14) {
            System.out.println(var14.toString() + "DEUDA eliminar deuda2!");
            var4 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DeudaDAO.class.getName()).log(Level.SEVERE, null, ex);
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
