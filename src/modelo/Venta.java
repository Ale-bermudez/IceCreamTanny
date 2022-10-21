/* Decompiler 9ms, total 305ms, lines 101 */
package modelo;

public class Venta {
   private int id;
   private int cliente;
   private Double total;
   private int modo;
   private Double precio_divisa;
   private Double total_efectivo;
   private Double total_tarjeta;
   private int checkCaja;
   private Double pagoMovil;

   public Venta() {
   }

   public Venta(int id, int cliente, Double total, int modo, Double precio_divisa, Double total_efectivo, Double total_tarjeta, int checkCaja, Double pagoMovil) {
      this.id = id;
      this.cliente = cliente;
      this.total = total;
      this.modo = modo;
      this.precio_divisa = precio_divisa;
      this.total_efectivo = total_efectivo;
      this.total_tarjeta = total_tarjeta;
      this.checkCaja = checkCaja;
      this.pagoMovil = pagoMovil;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getCliente() {
      return this.cliente;
   }

   public void setCliente(int cliente) {
      this.cliente = cliente;
   }

   public Double getTotal() {
      return this.total;
   }

   public void setTotal(Double total) {
      this.total = total;
   }

   public int getModo() {
      return this.modo;
   }

   public void setModo(int modo) {
      this.modo = modo;
   }

   public Double getPrecio_divisa() {
      return this.precio_divisa;
   }

   public void setPrecio_divisa(Double precio_divisa) {
      this.precio_divisa = precio_divisa;
   }

   public Double getTotal_efectivo() {
      return this.total_efectivo;
   }

   public void setTotal_efectivo(Double total_efectivo) {
      this.total_efectivo = total_efectivo;
   }

   public Double getTotal_tarjeta() {
      return this.total_tarjeta;
   }

   public void setTotal_tarjeta(Double total_tarjeta) {
      this.total_tarjeta = total_tarjeta;
   }

   public int getCheckCaja() {
      return this.checkCaja;
   }

   public void setCheckCaja(int checkCaja) {
      this.checkCaja = checkCaja;
   }

   public Double getPagoMovil() {
      return this.pagoMovil;
   }

   public void setPagoMovil(Double pagoMovil) {
      this.pagoMovil = pagoMovil;
   }
}