/* Decompiler 34ms, total 132ms, lines 350 */
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

public class SociosDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Socios soc = new Socios();

    public boolean registrarSocio(Socios cl) {
        String sql = "INSERT INTO socio (cedula, nombre, apellido, accion, telefono,status,a_favor,tipo) VALUES (?,?,?,?,?,0,?,?)";

        boolean var4 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, cl.getCedula());
            this.ps.setString(2, cl.getNombre());
            this.ps.setString(3, cl.getApellido());
            this.ps.setInt(4, cl.getAccion());
            this.ps.setString(5, cl.getTelefono());
            this.ps.setDouble(6, cl.getAFavor());
            this.ps.setInt(7, cl.getTipo());
            this.ps.execute();
            boolean var3 = true;
            return var3;
        } catch (SQLException var14) {
            JOptionPane.showMessageDialog((Component) null, var14.toString());
            var4 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SociosDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    public List listarSocios(String accion) {
        List<Socios> ListaSc = new ArrayList();
        String sql = "Select * From socio ORDER BY tipo ASC";
        String sql2 = "SELECT * FROM socio WHERE accion = ? OR cedula = ?";
        String sql3 = "SELECT * FROM socio WHERE nombre = ?";

        try {
            this.con = this.cn.getConnection();
            if (accion.equalsIgnoreCase("")) {
                this.ps = this.con.prepareStatement(sql);
                this.rs = this.ps.executeQuery();
            } else if (accion.matches("[0-9]+")) {
                this.ps = this.con.prepareStatement(sql2);
                this.ps.setString(1, accion);
                this.ps.setString(2, accion);
                this.rs = this.ps.executeQuery();
            } else if (accion.matches("[a-zA-Z]+")) {
                this.ps = this.con.prepareStatement(sql3);
                this.ps.setString(1, accion);
                this.rs = this.ps.executeQuery();
            }

            while (this.rs.next()) {
                Socios sc = new Socios();
                sc.setId(this.rs.getInt("id_socio"));
                sc.setCedula(this.rs.getInt("cedula"));
                sc.setNombre(this.rs.getString("nombre"));
                sc.setApellido(this.rs.getString("apellido"));
                sc.setAccion(this.rs.getInt("accion"));
                sc.setTelefono(this.rs.getString("telefono"));
                sc.setStatus(this.rs.getInt("status"));
                sc.setAFavor(this.rs.getDouble("a_favor"));
                sc.setTipo(this.rs.getInt("tipo"));
                ListaSc.add(sc);
            }
        } catch (Exception var15) {
            System.out.println(var15.toString());
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (SQLException var14) {
                    Logger.getLogger(CierreDAO.class.getName()).log(Level.SEVERE, (String) null, var14);
                }
            }

        }

        return ListaSc;
    }

    public boolean eliminarSocio(int id, int tipo) {
        String sql = "DELETE FROM socio WHERE id_socio = ? AND tipo = ?";

        boolean var5 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, id);
            this.ps.setInt(2, tipo);
            this.ps.execute();
            boolean var4 = true;
            return var4;
        } catch (SQLException var15) {
            System.out.println(var15.toString());
            var5 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SociosDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    public boolean modificarSocio(Socios sc) {
        String sql = "UPDATE socio SET cedula = ?, nombre = ?, apellido = ?, accion = ?, telefono = ?, status = ?, a_favor = ?, tipo = ? WHERE id_socio = ?";

        boolean var4 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, sc.getCedula());
            this.ps.setString(2, sc.getNombre());
            this.ps.setString(3, sc.getApellido());
            this.ps.setInt(4, sc.getAccion());
            this.ps.setString(5, sc.getTelefono());
            this.ps.setInt(6, sc.getStatus());
            this.ps.setDouble(7, sc.getAFavor());
            System.out.println(sc.getTipo());
            this.ps.setInt(8, sc.getTipo());
            this.ps.setInt(9, sc.getId());
            this.ps.execute();
            boolean var3 = true;
            return var3;
        } catch (SQLException var14) {
            System.out.println(var14.toString());
            var4 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SociosDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    public List buscarSocio(int accion, int tipo) {
        List<Socios> ListaSc = new ArrayList();
        String sql = "Select * From socio WHERE accion = ? AND tipo = ?";

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, accion);
            this.ps.setInt(2, tipo);
            this.rs = this.ps.executeQuery();

            while (this.rs.next()) {
                Socios sc = new Socios();
                sc.setId(this.rs.getInt("id_socio"));
                sc.setCedula(this.rs.getInt("cedula"));
                sc.setNombre(this.rs.getString("nombre"));
                sc.setApellido(this.rs.getString("apellido"));
                sc.setAccion(this.rs.getInt("accion"));
                sc.setTelefono(this.rs.getString("telefono"));
                sc.setStatus(this.rs.getInt("status"));
                sc.setAFavor(this.rs.getDouble("a_favor"));
                sc.setTipo(this.rs.getInt("tipo"));
                ListaSc.add(sc);
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

        return ListaSc;
    }

    public List buscarSocio(String nombre, int tipo) {
        List<Socios> ListaSc = new ArrayList();
        String sql = "Select * From socio WHERE nombre = ? AND tipo = ?";

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setString(1, nombre);
            this.ps.setInt(2, tipo);
            this.rs = this.ps.executeQuery();

            while (this.rs.next()) {
                Socios sc = new Socios();
                sc.setId(this.rs.getInt("id_socio"));
                sc.setCedula(this.rs.getInt("cedula"));
                sc.setNombre(this.rs.getString("nombre"));
                sc.setApellido(this.rs.getString("apellido"));
                sc.setAccion(this.rs.getInt("accion"));
                sc.setTelefono(this.rs.getString("telefono"));
                sc.setStatus(this.rs.getInt("status"));
                sc.setAFavor(this.rs.getDouble("a_favor"));
                sc.setTipo(this.rs.getInt("tipo"));
                ListaSc.add(sc);
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

        return ListaSc;
    }

    public boolean checkCedula(int ci) {
        String sql = "Select * FROM socio WHERE cedula = ?";

        boolean var4 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, ci);
            this.rs = this.ps.executeQuery();
            boolean var3 = this.rs.next();
            return var3;
        } catch (SQLException var14) {
            System.out.println(var14.toString());
            var4 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SociosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (SQLException var13) {
                    System.out.println(var13.toString());
                }
            }

        }

        return var4;
    }

    public boolean checkAccion(int accion) {
        String sql = "Select * FROM socio WHERE accion = ?";

        boolean var4 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, accion);
            this.rs = this.ps.executeQuery();
            boolean var3 = this.rs.next();
            return var3;
        } catch (SQLException var14) {
            System.out.println(var14.toString());
            var4 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SociosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (SQLException var13) {
                    System.out.println(var13.toString());
                }
            }

        }

        return var4;
    }

    public boolean changeStatus(int id, int stat) {
        String sql = "UPDATE socio SET status = ? WHERE id_socio = ?";

        boolean var5 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, stat);
            this.ps.setInt(2, id);
            this.ps.execute();
            boolean var4 = true;
            return var4;
        } catch (SQLException var15) {
            System.out.println(var15.toString());
            var5 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SociosDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    public boolean setAfavor(int socio, Double valor) {
        String sql = "UPDATE socio SET a_favor = ? WHERE id_socio = ?";

        boolean var5 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setDouble(2, (double) socio);
            this.ps.setDouble(1, valor);
            this.ps.execute();
            boolean var4 = true;
            return var4;
        } catch (SQLException var15) {
            JOptionPane.showMessageDialog((Component) null, var15.toString());
            var5 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SociosDAO.class.getName()).log(Level.SEVERE, null, ex);
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
}
