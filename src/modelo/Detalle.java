/* Decompiler 6ms, total 93ms, lines 70 */
package modelo;

public class Detalle {
   private int id_detalle;
   private int id_producto;
   private int cantidad;
   private Double precio;
   private int id_venta;
   private Object fecha;

   public Detalle(int id_detalle, int id_producto, int cantidad, Double precio, int id_venta, Object fecha) {
      this.id_detalle = id_detalle;
      this.id_producto = id_producto;
      this.cantidad = cantidad;
      this.precio = precio;
      this.id_venta = id_venta;
   }

   public Object getFecha() {
      return this.fecha;
   }

   public void setFecha(Object fecha) {
      this.fecha = fecha;
   }

   public Detalle() {
   }

   public int getId_detalle() {
      return this.id_detalle;
   }

   public void setId_detalle(int id_detalle) {
      this.id_detalle = id_detalle;
   }

   public int getId_producto() {
      return this.id_producto;
   }

   public void setId_producto(int id_producto) {
      this.id_producto = id_producto;
   }

   public int getCantidad() {
      return this.cantidad;
   }

   public void setCantidad(int cantidad) {
      this.cantidad = cantidad;
   }

   public Double getPrecio() {
      return this.precio;
   }

   public void setPrecio(Double precio) {
      this.precio = precio;
   }

   public int getId_venta() {
      return this.id_venta;
   }

   public void setId_venta(int id_venta) {
      this.id_venta = id_venta;
   }
}