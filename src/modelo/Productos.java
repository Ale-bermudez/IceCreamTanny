/* Decompiler 3ms, total 359ms, lines 48 */
package modelo;

public class Productos {
   private int id;
   private String nombre;
   private Double precio;
   private int porcentaje;

   public Productos() {
   }

   public Productos(int id) {
      this.id = id;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public Double getPrecio() {
      return this.precio;
   }

   public void setPrecio(Double precio) {
      this.precio = precio;
   }

   public int getPorcentaje() {
      return this.porcentaje;
   }

   public void setPorcentaje(int porcentaje) {
      this.porcentaje = porcentaje;
   }
}