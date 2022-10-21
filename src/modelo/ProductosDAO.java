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

public class ProductosDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrarProductos(Productos pro) {
        String sql = "INSERT INTO producto (nombre, precio, porcentaje) VALUES (?,?,?)";

        boolean var4 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setString(1, pro.getNombre());
            this.ps.setDouble(2, pro.getPrecio());
            this.ps.setInt(3, pro.getPorcentaje());
            this.ps.execute();
            boolean var3 = true;
            return var3;
        } catch (SQLException var14) {
            System.out.println(var14.toString());
            var4 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    public List listarProductos(String nombre) {
        List<Productos> ListaPro = new ArrayList();
        String sql = "Select * From producto ORDER BY nombre ASC";
        String sql2 = "SELECT * FROM producto WHERE nombre = ?";

        try {
            this.con = this.cn.getConnection();
            if (nombre.equalsIgnoreCase("")) {
                this.ps = this.con.prepareStatement(sql);
                this.rs = this.ps.executeQuery();
            } else {
                this.ps = this.con.prepareStatement(sql2);
                this.ps.setString(1, nombre);
                this.rs = this.ps.executeQuery();
            }

            while (this.rs.next()) {
                Productos pro = new Productos();
                pro.setId(this.rs.getInt("id_producto"));
                pro.setNombre(this.rs.getString("nombre"));
                pro.setPrecio(this.rs.getDouble("precio"));
                pro.setPorcentaje(this.rs.getInt("porcentaje"));
                ListaPro.add(pro);
            }
        } catch (Exception var14) {
            System.out.println(var14.toString());
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

    public boolean modificarProducto(Productos pro) {
        String sql = "UPDATE producto SET nombre = ?, precio = ?, porcentaje = ? WHERE id_producto = ?";

        boolean var4 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setString(1, pro.getNombre());
            this.ps.setDouble(2, pro.getPrecio());
            this.ps.setInt(3, pro.getPorcentaje());
            this.ps.setInt(4, pro.getId());
            this.ps.execute();
            boolean var3 = true;
            return var3;
        } catch (SQLException var14) {
            System.out.println(var14.toString());
            var4 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    public boolean eliminarProducto(int id) {
        String sql = "DELETE FROM producto WHERE id_producto = ?";

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
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    public List buscarDatos(String nombre) {
        List<Productos> ListaPro = new ArrayList();
        String sql = "Select * From producto WHERE nombre = ?";

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setString(1, nombre);
            this.rs = this.ps.executeQuery();

            while (this.rs.next()) {
                Productos pro = new Productos();
                pro.setId(this.rs.getInt("id_producto"));
                pro.setNombre(this.rs.getString("nombre"));
                pro.setPrecio(this.rs.getDouble("precio"));
                pro.setPorcentaje(this.rs.getInt("porcentaje"));
                ListaPro.add(pro);
            }
        } catch (Exception var13) {
            System.out.println(var13.toString());
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

    public List buscarDatos(int id) {
        List<Productos> ListaPro = new ArrayList();
        String sql = "Select * From producto WHERE id_producto = ?";

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, id);
            this.rs = this.ps.executeQuery();

            while (this.rs.next()) {
                Productos pro = new Productos();
                pro.setId(this.rs.getInt("id_producto"));
                pro.setNombre(this.rs.getString("nombre"));
                pro.setPrecio(this.rs.getDouble("precio"));
                pro.setPorcentaje(this.rs.getInt("porcentaje"));
                ListaPro.add(pro);
            }
        } catch (Exception var13) {
            System.out.println(var13.toString());
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

    public boolean checkProduc(String producto) {
        String sql = "Select * FROM producto WHERE nombre = ?";

        boolean var4 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setString(1, producto);
            this.rs = this.ps.executeQuery();
            boolean var3 = this.rs.next();
            return var3;
        } catch (SQLException var14) {
            System.out.println(var14.toString());
            var4 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
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
