/* Decompiler 7ms, total 97ms, lines 81 */
package modelo;

public class Deuda {
   private int id_deuda;
   private int id_producto;
   private int id_socio;
   private int cantidad_producto;
   private double precio;
   private String nombre;
   private Object fecha;

   public Deuda() {
   }

   public Deuda(int id_deuda, int id_producto, int id_socio, int cantidad_producto, double precio, String nombre, Object fecha) {
      this.id_deuda = id_deuda;
      this.id_producto = id_producto;
      this.id_socio = id_socio;
      this.cantidad_producto = cantidad_producto;
      this.precio = precio;
      this.nombre = nombre;
      this.fecha = fecha;
   }

   public Object getFecha() {
      return this.fecha;
   }

   public void setFecha(Object fecha) {
      this.fecha = fecha;
   }

   public int getId_deuda() {
      return this.id_deuda;
   }

   public void setId_deuda(int id_deuda) {
      this.id_deuda = id_deuda;
   }

   public int getId_producto() {
      return this.id_producto;
   }

   public void setId_producto(int id_producto) {
      this.id_producto = id_producto;
   }

   public int getId_socio() {
      return this.id_socio;
   }

   public void setId_socio(int id_socio) {
      this.id_socio = id_socio;
   }

   public int getCantidad_producto() {
      return this.cantidad_producto;
   }

   public void setCantidad_producto(int cantidad_producto) {
      this.cantidad_producto = cantidad_producto;
   }

   public double getPrecio() {
      return this.precio;
   }

   public void setPrecio(double precio) {
      this.precio = precio;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
}