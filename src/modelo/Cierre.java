package modelo;

public class Cierre {
   private int id;
   private double total_punto;
   private double total_efectivo;
   private double total_conjunto;
   private Object fecha;
   private double pm;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public double getTotal_punto() {
      return this.total_punto;
   }

   public void setTotal_punto(double total_punto) {
      this.total_punto = total_punto;
   }

   public double getTotal_efectivo() {
      return this.total_efectivo;
   }

   public void setTotal_efectivo(double total_efectivo) {
      this.total_efectivo = total_efectivo;
   }

   public double getTotal_conjunto() {
      return this.total_conjunto;
   }

   public void setTotal_conjunto(double total_conjunto) {
      this.total_conjunto = total_conjunto;
   }

   public Object getFecha() {
      return this.fecha;
   }

   public void setFecha(Object fecha) {
      this.fecha = fecha;
   }

   public double getPm() {
      return this.pm;
   }

   public void setPm(double pm) {
      this.pm = pm;
   }

   public Cierre(int id, double total_punto, double total_efectivo, double total_conjunto, Object fecha, double pm) {
      this.id = id;
      this.total_punto = total_punto;
      this.total_efectivo = total_efectivo;
      this.total_conjunto = total_conjunto;
      this.fecha = fecha;
      this.pm = pm;
   }

   public Cierre() {
   }
}