/* Decompiler 2ms, total 88ms, lines 31 */
package modelo;

public class Login {
   private Double divisa;
   private Double fondo;

   public Login() {
   }

   public Login(Double divisa, Double fondo) {
      this.divisa = divisa;
      this.fondo = fondo;
   }

   public Double getDivisa() {
      return this.divisa;
   }

   public void setDivisa(Double divisa) {
      this.divisa = divisa;
   }

   public Double getFondo() {
      return this.fondo;
   }

   public void setFondo(Double fondo) {
      this.fondo = fondo;
   }
}