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

public class CierreDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public int idCierre() {
        int id = 0;
        String sql = "Select MAX(id_cierre) FROM cierre";

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.rs = this.ps.executeQuery();
            if (this.rs.next()) {
                id = this.rs.getInt(1);
            }
        } catch (SQLException var12) {
            System.out.println(var12.toString() + " Cierre");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CierreDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    public boolean registrarCierre(Cierre cr) {
        String sql = "INSERT INTO cierre (total_punto, total_efectivo, total_conjunto, fecha, pago_movil) VALUES (?,?,?,?,?)";

        boolean var4 = false;
        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setDouble(1, cr.getTotal_punto());
            this.ps.setDouble(2, cr.getTotal_efectivo());
            this.ps.setDouble(3, cr.getTotal_conjunto());
            this.ps.setObject(4, LocalDate.now());
            this.ps.setDouble(5, cr.getPm());
            this.ps.execute();
            boolean var3 = true;
            return var3;
        } catch (SQLException var14) {
            System.out.println(var14.toString() + " Cierre");
            var4 = false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CierreDAO.class.getName()).log(Level.SEVERE, null, ex);
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

    public List listaCierre() {
        List<Cierre> listaCr = new ArrayList();
        String sql = "Select * From cierre ORDER BY id_cierre DESC";

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.rs = this.ps.executeQuery();

            while (this.rs.next()) {
                Cierre cr = new Cierre();
                cr.setId(this.rs.getInt("id_cierre"));
                cr.setTotal_efectivo(this.rs.getDouble("total_efectivo"));
                cr.setTotal_punto(this.rs.getDouble("total_punto"));
                cr.setTotal_conjunto(this.rs.getDouble("total_conjunto"));
                cr.setFecha(this.rs.getObject("fecha"));
                cr.setPm(this.rs.getDouble("pago_movil"));
                listaCr.add(cr);
            }
        } catch (Exception var12) {
            System.out.println(var12.toString() + " Cierre listar");
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (Exception var13) {
                    JOptionPane.showMessageDialog((Component) null, var13.toString());
                }
            }

        }

        return listaCr;
    }

    public List buscarCierre(int id) {
        List<Cierre> listaCr = new ArrayList();
        String sql = "Select * From cierre WHERE id_cierre = ?";

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.ps.setInt(1, id);
            this.rs = this.ps.executeQuery();

            while (this.rs.next()) {
                Cierre cr = new Cierre();
                cr.setId(this.rs.getInt("id_cierre"));
                cr.setTotal_efectivo(this.rs.getDouble("total_efectivo"));
                cr.setTotal_punto(this.rs.getDouble("total_punto"));
                cr.setTotal_conjunto(this.rs.getDouble("total_conjunto"));
                cr.setFecha(this.rs.getObject("fecha"));
                cr.setPm(this.rs.getDouble("pago_movil"));
                listaCr.add(cr);
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

        return listaCr;
    }

    public List buscarCierreSemanal(String fecha) {
        List<Cierre> listaCr = new ArrayList();
        String fch = fecha;

        try {
            this.con = this.cn.getConnection();
            String sql = "Select * From cierre WHERE fecha > ? AND fecha <= ?";
            this.ps = this.con.prepareStatement(sql);
            this.ps.setObject(1, fch);
            this.ps.setObject(2, LocalDate.now());
            this.rs = this.ps.executeQuery();

            while (this.rs.next()) {
                Cierre cr = new Cierre();
                cr.setId(this.rs.getInt("id_cierre"));
                cr.setTotal_efectivo(this.rs.getDouble("total_efectivo"));
                cr.setTotal_punto(this.rs.getDouble("total_punto"));
                cr.setTotal_conjunto(this.rs.getDouble("total_conjunto"));
                cr.setFecha(this.rs.getObject("fecha"));
                cr.setPm(this.rs.getDouble("pago_movil"));
                listaCr.add(cr);
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

        return listaCr;
    }

    public List buscarCierreTotal() {
        List<Cierre> listaCr = new ArrayList();
        String sql = "Select * From cierre";

        try {
            this.con = this.cn.getConnection();
            this.ps = this.con.prepareStatement(sql);
            this.rs = this.ps.executeQuery();

            while (this.rs.next()) {
                Cierre cr = new Cierre();
                cr.setId(this.rs.getInt("id_cierre"));
                cr.setTotal_efectivo(this.rs.getDouble("total_efectivo"));
                cr.setTotal_punto(this.rs.getDouble("total_punto"));
                cr.setTotal_conjunto(this.rs.getDouble("total_conjunto"));
                cr.setFecha(this.rs.getObject("fecha"));
                cr.setPm(this.rs.getDouble("pago_movil"));
                listaCr.add(cr);
            }
        } catch (Exception var12) {
            System.out.println(var12.toString());
        } finally {
            if (this.con != null) {
                try {
                    this.con.close();
                } catch (Exception var13) {
                    JOptionPane.showMessageDialog((Component) null, var13.toString());
                }
            }

        }

        return listaCr;
    }
}
