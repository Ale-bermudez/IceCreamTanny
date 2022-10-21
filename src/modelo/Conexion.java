/* Decompiler 1ms, total 139ms, lines 24 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
   Connection con;

   public Connection getConnection() throws ClassNotFoundException {
      try {
         Class.forName("org.sqlite.JDBC");
          
         String usuario = "root";
         String clave = "";
         String user = System.getProperty("user.name");
         String URLSqlite = "C:\\Program Files (x86)\\Tanny\\heladeria.db";
      // String URLSqlite = "C:\\Users\\" + user + "\\Documentos\\Tany\\heladeria.db";
     // String URLSqlite = "C:\\Users\\Alejandro\\Documentos\\Tanny\\heladeria.db";
         this.con = DriverManager.getConnection("jdbc:sqlite:" + URLSqlite);
         return this.con;
      } catch (SQLException var5) {
          JOptionPane.showMessageDialog(null,var5.toString());
         System.out.println(var5.toString());
         return null;
      }
   }
}