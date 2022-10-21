/* Decompiler 7ms, total 140ms, lines 109 */
package modelo;

public class Socios {
   private int id;
   private int cedula;
   private String nombre;
   private String apellido;
   private int accion;
   private String telefono;
   private int status;
   private double aFavor;
   private int tipo;

   public Socios() {
   }

   public Socios(int id, int cedula, String nombre, String apellido, int accion, String telefono, int status, double aFavor, int tipo) {
      this.id = id;
      this.cedula = cedula;
      this.nombre = nombre;
      this.apellido = apellido;
      this.accion = accion;
      this.telefono = telefono;
      this.status = status;
      this.aFavor = aFavor;
      this.tipo = tipo;
   }

   public double getaFavor() {
      return this.aFavor;
   }

   public void setaFavor(double aFavor) {
      this.aFavor = aFavor;
   }

   public int getTipo() {
      return this.tipo;
   }

   public void setTipo(int tipo) {
      this.tipo = tipo;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getCedula() {
      return this.cedula;
   }

   public void setCedula(int cedula) {
      this.cedula = cedula;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellido() {
      return this.apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public int getAccion() {
      return this.accion;
   }

   public void setAccion(int accion) {
      this.accion = accion;
   }

   public String getTelefono() {
      return this.telefono;
   }

   public void setTelefono(String telefono) {
      this.telefono = telefono;
   }

   public int getStatus() {
      return this.status;
   }

   public void setStatus(int status) {
      this.status = status;
   }

   public double getAFavor() {
      return this.aFavor;
   }

   public void setAFavor(double aFavor) {
      this.aFavor = aFavor;
   }
}