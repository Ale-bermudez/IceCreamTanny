/* Decompiler 71ms, total 161ms, lines 692 */
package modelo;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Component;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Pdf {
   VentaDAO vDao = new VentaDAO();
   CierreDAO crDao = new CierreDAO();

   public void pdfProductos(int id, String producto, int dias) {
      List<Detalle> listaProd = new ArrayList();
      String user = System.getProperty("user.name");
      File file = new File("");
      PdfPCell cell1 = new PdfPCell();
      if (dias == 1) {
         listaProd = this.vDao.obtenerProducto(id, LocalDate.now());
         file = new File("C:\\Users\\" + user + "\\Documents\\Tanny\\pdfProductos\\Cantidad_" + producto + ".pdf");
         cell1.setPhrase(new Phrase("Datos de los Productos del " + LocalDate.now()));
      } else {
         String fch;
         LocalDate var10003;
         if (dias == 7) {
            fch = restarSemanas(LocalDate.now().toString(), 1L);
            listaProd = this.vDao.obtenerProducto(id, fch);
            file = new File("C:\\Users\\" + user + "\\Documents\\Tanny\\pdfProductos\\Cantidad_" + producto + dias + "dias.pdf");
            var10003 = LocalDate.now();
            cell1.setPhrase(new Phrase("Datos de los Productos del " + var10003 + " al " + fch));
         } else if (dias == 15) {
            fch = restarSemanas(LocalDate.now().toString(), 2L);
            listaProd = this.vDao.obtenerProducto(id, fch);
            file = new File("C:\\Users\\" + user + "\\Documents\\Tanny\\pdfProductos\\Cantidad_" + producto + dias + "dias.pdf");
            var10003 = LocalDate.now();
            cell1.setPhrase(new Phrase("Datos de los Productos del " + var10003 + " al " + fch));
         } else if (dias == 30) {
            fch = restarMes(LocalDate.now().toString(), 1L);
            listaProd = this.vDao.obtenerProducto(id, fch);
            file = new File("C:\\Users\\" + user + "\\Documents\\Tanny\\pdfProductos\\Cantidad_" + producto + dias + "dias.pdf");
            var10003 = LocalDate.now();
            cell1.setPhrase(new Phrase("Datos de los Productos del " + var10003 + " al " + fch));
         } else if (dias == 90) {
            fch = restarMes(LocalDate.now().toString(), 3L);
            listaProd = this.vDao.obtenerProducto(id, fch);
            file = new File("C:\\Users\\" + user + "\\Documents\\Tanny\\pdfProductos\\Cantidad_" + producto + dias + "dias.pdf");
            var10003 = LocalDate.now();
            cell1.setPhrase(new Phrase("Datos de los Productos del " + var10003 + " al " + fch));
         } else if (dias == 180) {
            fch = restarMes(LocalDate.now().toString(), 6L);
            listaProd = this.vDao.obtenerProducto(id, fch);
            file = new File("C:\\Users\\" + user + "\\Documents\\Tanny\\pdfProductos\\Cantidad_" + producto + dias + "dias.pdf");
            var10003 = LocalDate.now();
            cell1.setPhrase(new Phrase("Datos de los Productos del " + var10003 + " al " + fch));
         } else if (dias == 270) {
            fch = restarMes(LocalDate.now().toString(), 9L);
            listaProd = this.vDao.obtenerProducto(id, fch);
            file = new File("C:\\Users\\" + user + "\\Documents\\Tanny\\pdfProductos\\Cantidad_" + producto + dias + "dias.pdf");
            var10003 = LocalDate.now();
            cell1.setPhrase(new Phrase("Datos de los Productos del " + var10003 + " al " + fch));
         } else if (dias == 365) {
            fch = restarAnio(LocalDate.now().toString(), 1L);
            listaProd = this.vDao.obtenerProducto(id, fch);
            file = new File("C:\\Users\\" + user + "\\Documents\\Tanny\\pdfProductos\\Cantidad_" + producto + dias + "dias.pdf");
            var10003 = LocalDate.now();
            cell1.setPhrase(new Phrase("Datos de los Productos del " + var10003 + " al " + fch));
         }
      }

      try {
         FileOutputStream archivo = new FileOutputStream(file);
         Document dc = new Document();
         PdfWriter.getInstance(dc, archivo);
         dc.open();
         Image img = Image.getInstance("C:\\Users\\" + user + "\\Documents\\Tanny\\logo_pdf.png");
         Paragraph fecha = new Paragraph();
         fecha.add(Chunk.NEWLINE);
         fecha.add("Fecha: " + LocalDate.now() + "\n\n");
         PdfPTable encabezado = new PdfPTable(4);
         encabezado.setWidthPercentage(100.0F);
         encabezado.getDefaultCell().setBorder(0);
         float[] columnaEncabezado = new float[]{20.0F, 20.0F, 70.0F, 60.0F};
         encabezado.setWidths(columnaEncabezado);
         encabezado.setHorizontalAlignment(0);
         encabezado.addCell(img);
         String ruc = " V-110379109";
         String nombre = "Ice Cream Tanny";
         String telefono = "0424-264.4678";
         String dir = "Club campestre Pan de Azucar";
         encabezado.addCell("");
         encabezado.addCell("RIF: " + ruc + "\nNombre: " + nombre + "\nTelefono: " + telefono + "\nDireccion: " + dir);
         encabezado.addCell(fecha);
         dc.add(encabezado);
         PdfPTable head = new PdfPTable(1);
         head.setTotalWidth(new float[]{520.0F});
         head.setLockedWidth(true);
         head.setSpacingBefore(50.0F);
         head.setSpacingAfter(50.0F);
         cell1.setBorderWidth(0.0F);
         cell1.setMinimumHeight(20.0F);
         cell1.setHorizontalAlignment(1);
         cell1.setVerticalAlignment(5);
         head.addCell(cell1);
         dc.add(head);
         PdfPTable tablaProductos = new PdfPTable(3);
         tablaProductos.setWidthPercentage(100.0F);
         tablaProductos.getDefaultCell().setBorder(0);
         float[] columnaProducto = new float[]{100.0F, 100.0F, 100.0F};
         tablaProductos.setWidths(columnaProducto);
         tablaProductos.setHorizontalAlignment(1);
         PdfPCell cl1 = new PdfPCell(new Phrase("Cantidad"));
         PdfPCell cl2 = new PdfPCell(new Phrase("Producto"));
         PdfPCell cl3 = new PdfPCell(new Phrase("Fecha"));
         cl1.setBorder(0);
         cl2.setBorder(0);
         cl3.setBorder(0);
         tablaProductos.addCell(cl1);
         tablaProductos.addCell(cl2);
         tablaProductos.addCell(cl3);
         PdfPTable tablaProd = new PdfPTable(3);
         tablaProd.setWidthPercentage(100.0F);
         tablaProd.getDefaultCell().setBorder(0);
         float[] columnaProd = new float[]{100.0F, 100.0F, 100.0F};
         tablaProd.setWidths(columnaProd);
         tablaProd.setHorizontalAlignment(1);
         int total = 0;
         producto = upperCaseFirst(producto);
         System.out.println(((List)listaProd).size());

         for(int i = 0; i < ((List)listaProd).size(); ++i) {
            String cantidad = String.valueOf(((Detalle)((List)listaProd).get(i)).getCantidad());
            String fechas = ((Detalle)((List)listaProd).get(i)).getFecha().toString();
            total += ((Detalle)((List)listaProd).get(i)).getCantidad();
            tablaProd.addCell(cantidad);
            tablaProd.addCell(producto);
            tablaProd.addCell(fechas);
         }

         PdfPTable finals = new PdfPTable(1);
         finals.setWidthPercentage(100.0F);
         finals.getDefaultCell().setBorder(0);
         finals.setHorizontalAlignment(2);
         PdfPCell pros1 = new PdfPCell(new Phrase("\n\n\n" + total + " Productos en Total"));
         pros1.setBorder(0);
         finals.addCell(pros1);
         dc.add(tablaProductos);
         dc.add(tablaProd);
         dc.add(finals);
         dc.close();
         archivo.close();
      } catch (Exception var31) {
         JOptionPane.showMessageDialog((Component)null, var31.toString());
      }

   }

   public void pdfCierres(int id) {
      List list = this.crDao.buscarCierre(id);

      try {
         String user = System.getProperty("user.name");
         File file = new File("C:\\Users\\" + user + "\\Documents\\Tanny\\pdfCierres\\Cierre_" + ((Cierre)list.get(0)).getFecha() + "_" + id + ".pdf");
         FileOutputStream archivo = new FileOutputStream(file);
         Document dc = new Document();
         PdfWriter.getInstance(dc, archivo);
         dc.open();
         Image img = Image.getInstance("C:\\Users\\" + user + "\\Documents\\Tanny\\logo_pdf.png");
         Paragraph fecha = new Paragraph();
         fecha.add(Chunk.NEWLINE);
         fecha.add("Fecha: " + ((Cierre)list.get(0)).getFecha() + "\n\n");
         PdfPTable encabezado = new PdfPTable(4);
         encabezado.setWidthPercentage(100.0F);
         encabezado.getDefaultCell().setBorder(0);
         float[] columnaEncabezado = new float[]{20.0F, 30.0F, 70.0F, 40.0F};
         encabezado.setWidths(columnaEncabezado);
         encabezado.setHorizontalAlignment(1);
         encabezado.addCell(img);
         String ruc = " V-110379109";
         String nombre = "Ice Cream Tanny";
         String telefono = "0424-264.4678";
         String dir = "Club campestre Pan de Azucar";
         encabezado.addCell("");
         encabezado.addCell("RIF: " + ruc + "\nNombre de la empresa: " + nombre + "\nTelefono: " + telefono + "\nDireccion: " + dir);
         encabezado.addCell(fecha);
         PdfPTable head = new PdfPTable(1);
         head.setTotalWidth(new float[]{520.0F});
         head.setLockedWidth(true);
         head.setSpacingBefore(50.0F);
         head.setSpacingAfter(50.0F);
         PdfPCell cell1 = new PdfPCell(new Phrase("Resultados del Cierre del Dia " + ((Cierre)list.get(0)).getFecha()));
         cell1.setBorderWidth(0.0F);
         cell1.setMinimumHeight(20.0F);
         cell1.setHorizontalAlignment(1);
         cell1.setVerticalAlignment(5);
         head.addCell(cell1);
         PdfPTable tablaProductos = new PdfPTable(4);
         tablaProductos.setWidthPercentage(100.0F);
         tablaProductos.getDefaultCell().setBorder(0);
         float[] columnaProducto = new float[]{90.0F, 90.0F, 90.0F, 90.0F};
         tablaProductos.setWidths(columnaProducto);
         tablaProductos.setHorizontalAlignment(1);
         PdfPCell cl1 = new PdfPCell(new Phrase("TOTAL EN PUNTO"));
         PdfPCell cl2 = new PdfPCell(new Phrase("TOTAL EN EFECTIVO"));
         PdfPCell cl3 = new PdfPCell(new Phrase("TOTAL EN PM"));
         PdfPCell cl4 = new PdfPCell(new Phrase("TOTAL"));
         cl1.setHorizontalAlignment(1);
         cl1.setVerticalAlignment(5);
         cl2.setHorizontalAlignment(1);
         cl2.setVerticalAlignment(5);
         cl3.setHorizontalAlignment(1);
         cl3.setVerticalAlignment(5);
         cl4.setHorizontalAlignment(1);
         cl4.setVerticalAlignment(5);
         tablaProductos.addCell(cl1);
         tablaProductos.addCell(cl2);
         tablaProductos.addCell(cl3);
         tablaProductos.addCell(cl4);
         PdfPTable tablaProd = new PdfPTable(4);
         tablaProd.setWidthPercentage(100.0F);
         tablaProd.getDefaultCell().setBorder(0);
         float[] columnaProd = new float[]{100.0F, 100.0F, 100.0F, 100.0F};
         tablaProd.setWidths(columnaProd);
         tablaProd.setHorizontalAlignment(1);
         String totalPunto = String.valueOf(this.preciofinal(((Cierre)list.get(0)).getTotal_punto()));
         String totalEfectivo = String.valueOf(this.preciofinal(((Cierre)list.get(0)).getTotal_efectivo()));
         String total = String.valueOf(this.preciofinal(((Cierre)list.get(0)).getTotal_conjunto()));
         String pm = String.valueOf(this.preciofinal(((Cierre)list.get(0)).getPm()));
         PdfPCell t1 = new PdfPCell(new Phrase(totalPunto + "$"));
         PdfPCell t2 = new PdfPCell(new Phrase(totalEfectivo + "$"));
         PdfPCell t3 = new PdfPCell(new Phrase(pm + "$"));
         PdfPCell t4 = new PdfPCell(new Phrase(total + "$"));
         t1.setHorizontalAlignment(1);
         t1.setVerticalAlignment(5);
         t2.setHorizontalAlignment(1);
         t2.setVerticalAlignment(5);
         t3.setHorizontalAlignment(1);
         t3.setVerticalAlignment(5);
         t4.setHorizontalAlignment(1);
         t4.setVerticalAlignment(5);
         tablaProd.addCell(t1);
         tablaProd.addCell(t2);
         tablaProd.addCell(t3);
         tablaProd.addCell(t4);
         dc.add(encabezado);
         dc.add(head);
         dc.add(tablaProductos);
         dc.add(tablaProd);
         dc.close();
         archivo.close();
      } catch (Exception var33) {
         JOptionPane.showMessageDialog((Component)null, var33.toString());
      }

   }

   public void pdfCierreSemanal() {
      String fechaMin = restarDias(LocalDate.now().toString(), 6L);
      List list = this.crDao.buscarCierreSemanal(fechaMin);

      try {
         String user = System.getProperty("user.name");
         File file = new File("C:\\Users\\" + user + "\\Documents\\Tanny\\pdfCierres\\Cierre_" + fechaMin + "_al_" + LocalDate.now() + ".pdf");
         FileOutputStream archivo = new FileOutputStream(file);
         Document dc = new Document();
         PdfWriter.getInstance(dc, archivo);
         dc.open();
         Image img = Image.getInstance("C:\\Users\\" + user + "\\Documents\\Tanny\\logo_pdf.png");
         Paragraph fecha = new Paragraph();
         fecha.add(Chunk.NEWLINE);
         fecha.add("Fecha: " + LocalDate.now());
         PdfPTable encabezado = new PdfPTable(4);
         encabezado.setWidthPercentage(100.0F);
         encabezado.getDefaultCell().setBorder(0);
         float[] columnaEncabezado = new float[]{20.0F, 30.0F, 70.0F, 40.0F};
         encabezado.setWidths(columnaEncabezado);
         encabezado.setHorizontalAlignment(1);
         encabezado.addCell(img);
         String ruc = " V-110379109";
         String nombre = "Ice Cream Tanny";
         String telefono = "0424-264.4678";
         String dir = "Club campestre Pan de Azucar";
         encabezado.addCell("");
         encabezado.addCell("RIF: " + ruc + "\nNombre de la empresa: " + nombre + "\nTelefono: " + telefono + "\nDireccion: " + dir);
         encabezado.addCell(fecha);
         PdfPTable head = new PdfPTable(1);
         head.setTotalWidth(new float[]{520.0F});
         head.setLockedWidth(true);
         head.setSpacingBefore(50.0F);
         head.setSpacingAfter(50.0F);
         PdfPCell cell1 = new PdfPCell(new Phrase("Resultados del Cierre de los Dias " + fechaMin + " al " + LocalDate.now()));
         cell1.setBorderWidth(0.0F);
         cell1.setMinimumHeight(20.0F);
         cell1.setHorizontalAlignment(1);
         cell1.setVerticalAlignment(5);
         head.addCell(cell1);
         PdfPTable tablaProductos = new PdfPTable(5);
         tablaProductos.setWidthPercentage(100.0F);
         tablaProductos.getDefaultCell().setBorder(0);
         float[] columnaProducto = new float[]{90.0F, 90.0F, 90.0F, 90.0F, 90.0F};
         tablaProductos.setWidths(columnaProducto);
         tablaProductos.setHorizontalAlignment(1);
         PdfPCell cl1 = new PdfPCell(new Phrase("PUNTO"));
         PdfPCell cl2 = new PdfPCell(new Phrase("EFECTIVO"));
         PdfPCell cl3 = new PdfPCell(new Phrase("PAGO MOVIL"));
         PdfPCell cl4 = new PdfPCell(new Phrase("TOTAL"));
         PdfPCell cl5 = new PdfPCell(new Phrase("FECHA"));
         cl1.setHorizontalAlignment(1);
         cl1.setVerticalAlignment(5);
         cl2.setHorizontalAlignment(1);
         cl2.setVerticalAlignment(5);
         cl3.setHorizontalAlignment(1);
         cl3.setVerticalAlignment(5);
         cl4.setHorizontalAlignment(1);
         cl4.setVerticalAlignment(5);
         cl5.setHorizontalAlignment(1);
         cl5.setVerticalAlignment(5);
         tablaProductos.addCell(cl1);
         tablaProductos.addCell(cl2);
         tablaProductos.addCell(cl3);
         tablaProductos.addCell(cl4);
         tablaProductos.addCell(cl5);
         PdfPTable tablaProd = new PdfPTable(5);
         tablaProd.setWidthPercentage(100.0F);
         tablaProd.getDefaultCell().setBorder(0);
         float[] columnaProd = new float[]{100.0F, 100.0F, 100.0F, 100.0F, 100.0F};
         tablaProd.setWidths(columnaProd);
         tablaProd.setHorizontalAlignment(1);
         Double totalSemanal = 0.0D;
         Double totalEfecSemanal = 0.0D;
         Double totalTarjSemana = 0.0D;
         Double totalPmSemanal = 0.0D;

         PdfPCell ct3;
         PdfPCell ct4;
         PdfPCell cf1;
         for(int i = 0; i < list.size(); ++i) {
            String totalPunto = String.valueOf(this.preciofinal(((Cierre)list.get(i)).getTotal_punto()));
            String totalEfectivo = String.valueOf(this.preciofinal(((Cierre)list.get(i)).getTotal_efectivo()));
            String total = String.valueOf(this.preciofinal(((Cierre)list.get(i)).getTotal_conjunto()));
            String fechaCierre = (String)((Cierre)list.get(i)).getFecha();
            String pagoMovil = String.valueOf(this.preciofinal(((Cierre)list.get(i)).getPm()));
            totalSemanal = totalSemanal + this.preciofinal(((Cierre)list.get(i)).getTotal_conjunto());
            totalEfecSemanal = totalEfecSemanal + this.preciofinal(((Cierre)list.get(i)).getTotal_efectivo());
            totalTarjSemana = totalTarjSemana + this.preciofinal(((Cierre)list.get(i)).getTotal_punto());
            totalPmSemanal = totalPmSemanal + this.preciofinal(((Cierre)list.get(i)).getPm());
            ct3 = new PdfPCell(new Phrase(totalPunto + "$"));
            ct4 = new PdfPCell(new Phrase(totalEfectivo + "$"));
            PdfPCell t3 = new PdfPCell(new Phrase(pagoMovil + "$"));
            PdfPCell t4 = new PdfPCell(new Phrase(total + "$"));
            cf1 = new PdfPCell(new Phrase(fechaCierre));
            ct3.setHorizontalAlignment(1);
            ct3.setVerticalAlignment(5);
            ct4.setHorizontalAlignment(1);
            ct4.setVerticalAlignment(5);
            t3.setHorizontalAlignment(1);
            t3.setVerticalAlignment(5);
            t4.setHorizontalAlignment(1);
            t4.setVerticalAlignment(5);
            cf1.setHorizontalAlignment(1);
            cf1.setVerticalAlignment(5);
            tablaProd.addCell(ct3);
            tablaProd.addCell(ct4);
            tablaProd.addCell(t3);
            tablaProd.addCell(t4);
            tablaProd.addCell(cf1);
         }

         PdfPTable head2 = new PdfPTable(1);
         head2.setTotalWidth(new float[]{520.0F});
         head2.setLockedWidth(true);
         head2.setSpacingBefore(50.0F);
         head2.setSpacingAfter(50.0F);
         PdfPCell cell2 = new PdfPCell(new Phrase());
         cell2.setBorderWidth(0.0F);
         cell2.setMinimumHeight(20.0F);
         cell2.setHorizontalAlignment(1);
         cell2.setVerticalAlignment(5);
         head2.addCell(cell2);
         PdfPTable tablaTotales = new PdfPTable(4);
         tablaTotales.setWidthPercentage(100.0F);
         tablaTotales.getDefaultCell().setBorder(0);
         float[] columnTotales = new float[]{120.0F, 120.0F, 120.0F, 120.0F};
         tablaTotales.setWidths(columnTotales);
         tablaTotales.setHorizontalAlignment(1);
         PdfPCell ct1 = new PdfPCell(new Phrase("TOTAL EN PUNTO"));
         PdfPCell ct2 = new PdfPCell(new Phrase("TOTAL EN EFECTIVO"));
         ct3 = new PdfPCell(new Phrase("TOTAL EN PAGO MOVIL"));
         ct4 = new PdfPCell(new Phrase("TOTAL SEMANAL"));
         ct1.setHorizontalAlignment(1);
         ct1.setVerticalAlignment(5);
         ct2.setHorizontalAlignment(1);
         ct2.setVerticalAlignment(5);
         ct3.setHorizontalAlignment(1);
         ct3.setVerticalAlignment(5);
         ct4.setHorizontalAlignment(1);
         ct4.setVerticalAlignment(5);
         ct1.setMinimumHeight(20.0F);
         ct1.setHorizontalAlignment(1);
         ct1.setVerticalAlignment(5);
         ct2.setMinimumHeight(20.0F);
         ct2.setHorizontalAlignment(1);
         ct2.setVerticalAlignment(5);
         ct3.setMinimumHeight(20.0F);
         ct3.setHorizontalAlignment(1);
         ct3.setVerticalAlignment(5);
         ct4.setMinimumHeight(20.0F);
         ct4.setHorizontalAlignment(1);
         ct4.setVerticalAlignment(5);
         tablaTotales.addCell(ct1);
         tablaTotales.addCell(ct2);
         tablaTotales.addCell(ct3);
         tablaTotales.addCell(ct4);
         PdfPTable tablaFin = new PdfPTable(4);
         tablaFin.setWidthPercentage(100.0F);
         tablaFin.getDefaultCell().setBorder(0);
         float[] columnFin = new float[]{120.0F, 120.0F, 120.0F, 120.0F};
         tablaFin.setWidths(columnFin);
         tablaFin.setHorizontalAlignment(1);
         cf1 = new PdfPCell(new Phrase(String.valueOf(this.preciofinal(totalTarjSemana))));
         PdfPCell cf2 = new PdfPCell(new Phrase(String.valueOf(this.preciofinal(totalEfecSemanal))));
         PdfPCell cf3 = new PdfPCell(new Phrase(String.valueOf(this.preciofinal(totalPmSemanal))));
         PdfPCell cf4 = new PdfPCell(new Phrase(String.valueOf(this.preciofinal(totalSemanal))));
         cf1.setHorizontalAlignment(1);
         cf1.setVerticalAlignment(5);
         cf2.setHorizontalAlignment(1);
         cf2.setVerticalAlignment(5);
         cf3.setHorizontalAlignment(1);
         cf3.setVerticalAlignment(5);
         cf4.setHorizontalAlignment(1);
         cf4.setVerticalAlignment(5);
         tablaFin.addCell(cf1);
         tablaFin.addCell(cf2);
         tablaFin.addCell(cf3);
         tablaFin.addCell(cf4);
         dc.add(encabezado);
         dc.add(head);
         dc.add(tablaProductos);
         dc.add(tablaProd);
         dc.add(head2);
         dc.add(tablaTotales);
         dc.add(tablaFin);
         dc.close();
         archivo.close();
      } catch (Exception var44) {
         JOptionPane.showMessageDialog((Component)null, var44.toString());
      }

   }

   public void pdfCierreTotales() {
      List list = this.crDao.buscarCierreTotal();

      try {
         String user = System.getProperty("user.name");
         File file = new File("C:\\Users\\" + user + "\\Documents\\Tanny\\pdfCierres\\Cierre_Totales.pdf");
         FileOutputStream archivo = new FileOutputStream(file);
         Document dc = new Document();
         PdfWriter.getInstance(dc, archivo);
         dc.open();
         Image img = Image.getInstance("C:\\Users\\" + user + "\\Documents\\Tanny\\logo_pdf.png");
         Paragraph fecha = new Paragraph();
         fecha.add(Chunk.NEWLINE);
         fecha.add("Fecha: " + LocalDate.now());
         PdfPTable encabezado = new PdfPTable(4);
         encabezado.setWidthPercentage(100.0F);
         encabezado.getDefaultCell().setBorder(0);
         float[] columnaEncabezado = new float[]{20.0F, 30.0F, 70.0F, 40.0F};
         encabezado.setWidths(columnaEncabezado);
         encabezado.setHorizontalAlignment(1);
         encabezado.addCell(img);
         String ruc = " V-110379109";
         String nombre = "Ice Cream Tanny";
         String telefono = "0424-264.4678";
         String dir = "Club campestre Pan de Azucar";
         encabezado.addCell("");
         encabezado.addCell("RIF: " + ruc + "\nNombre de la empresa: " + nombre + "\nTelefono: " + telefono + "\nDireccion: " + dir);
         encabezado.addCell(fecha);
         PdfPTable head = new PdfPTable(1);
         head.setTotalWidth(new float[]{520.0F});
         head.setLockedWidth(true);
         head.setSpacingBefore(50.0F);
         head.setSpacingAfter(50.0F);
         PdfPCell cell1 = new PdfPCell(new Phrase("Resultados de los Cierres Totales"));
         cell1.setBorderWidth(0.0F);
         cell1.setMinimumHeight(20.0F);
         cell1.setHorizontalAlignment(1);
         cell1.setVerticalAlignment(5);
         head.addCell(cell1);
         PdfPTable tablaProductos = new PdfPTable(5);
         tablaProductos.setWidthPercentage(100.0F);
         tablaProductos.getDefaultCell().setBorder(0);
         float[] columnaProducto = new float[]{90.0F, 90.0F, 90.0F, 90.0F, 90.0F};
         tablaProductos.setWidths(columnaProducto);
         tablaProductos.setHorizontalAlignment(1);
         PdfPCell cl1 = new PdfPCell(new Phrase("PUNTO"));
         PdfPCell cl2 = new PdfPCell(new Phrase("EFECTIVO"));
         PdfPCell cl3 = new PdfPCell(new Phrase("PAGO MOVIL"));
         PdfPCell cl4 = new PdfPCell(new Phrase("TOTAL"));
         PdfPCell cl5 = new PdfPCell(new Phrase("FECHA"));
         cl1.setHorizontalAlignment(1);
         cl1.setVerticalAlignment(5);
         cl2.setHorizontalAlignment(1);
         cl2.setVerticalAlignment(5);
         cl3.setHorizontalAlignment(1);
         cl3.setVerticalAlignment(5);
         cl4.setHorizontalAlignment(1);
         cl4.setVerticalAlignment(5);
         cl5.setHorizontalAlignment(1);
         cl5.setVerticalAlignment(5);
         tablaProductos.addCell(cl1);
         tablaProductos.addCell(cl2);
         tablaProductos.addCell(cl3);
         tablaProductos.addCell(cl4);
         tablaProductos.addCell(cl5);
         PdfPTable tablaProd = new PdfPTable(5);
         tablaProd.setWidthPercentage(100.0F);
         tablaProd.getDefaultCell().setBorder(0);
         float[] columnaProd = new float[]{100.0F, 100.0F, 100.0F, 100.0F, 100.0F};
         tablaProd.setWidths(columnaProd);
         tablaProd.setHorizontalAlignment(1);
         Double totalSemanal = 0.0D;
         Double totalEfecSemanal = 0.0D;
         Double totalTarjSemana = 0.0D;
         Double totalPmSemanal = 0.0D;

         PdfPCell ct3;
         PdfPCell ct4;
         PdfPCell cf1;
         for(int i = 0; i < list.size(); ++i) {
            String totalPunto = String.valueOf(this.preciofinal(((Cierre)list.get(i)).getTotal_punto()));
            String totalEfectivo = String.valueOf(this.preciofinal(((Cierre)list.get(i)).getTotal_efectivo()));
            String total = String.valueOf(this.preciofinal(((Cierre)list.get(i)).getTotal_conjunto()));
            String fechaCierre = (String)((Cierre)list.get(i)).getFecha();
            String pagoMovil = String.valueOf(this.preciofinal(((Cierre)list.get(i)).getPm()));
            totalSemanal = totalSemanal + this.preciofinal(((Cierre)list.get(i)).getTotal_conjunto());
            totalEfecSemanal = totalEfecSemanal + this.preciofinal(((Cierre)list.get(i)).getTotal_efectivo());
            totalTarjSemana = totalTarjSemana + this.preciofinal(((Cierre)list.get(i)).getTotal_punto());
            totalPmSemanal = totalPmSemanal + this.preciofinal(((Cierre)list.get(i)).getPm());
            ct3 = new PdfPCell(new Phrase(totalPunto + "$"));
            ct4 = new PdfPCell(new Phrase(totalEfectivo + "$"));
            PdfPCell t3 = new PdfPCell(new Phrase(pagoMovil + "$"));
            PdfPCell t4 = new PdfPCell(new Phrase(total + "$"));
            cf1 = new PdfPCell(new Phrase(fechaCierre));
            ct3.setHorizontalAlignment(1);
            ct3.setVerticalAlignment(5);
            ct4.setHorizontalAlignment(1);
            ct4.setVerticalAlignment(5);
            t3.setHorizontalAlignment(1);
            t3.setVerticalAlignment(5);
            t4.setHorizontalAlignment(1);
            t4.setVerticalAlignment(5);
            cf1.setHorizontalAlignment(1);
            cf1.setVerticalAlignment(5);
            tablaProd.addCell(ct3);
            tablaProd.addCell(ct4);
            tablaProd.addCell(t3);
            tablaProd.addCell(t4);
            tablaProd.addCell(cf1);
         }

         PdfPTable head2 = new PdfPTable(1);
         head2.setTotalWidth(new float[]{520.0F});
         head2.setLockedWidth(true);
         head2.setSpacingBefore(50.0F);
         head2.setSpacingAfter(50.0F);
         PdfPCell cell2 = new PdfPCell(new Phrase());
         cell2.setBorderWidth(0.0F);
         cell2.setMinimumHeight(20.0F);
         cell2.setHorizontalAlignment(1);
         cell2.setVerticalAlignment(5);
         head2.addCell(cell2);
         PdfPTable tablaTotales = new PdfPTable(4);
         tablaTotales.setWidthPercentage(100.0F);
         tablaTotales.getDefaultCell().setBorder(0);
         float[] columnTotales = new float[]{120.0F, 120.0F, 120.0F, 120.0F};
         tablaTotales.setWidths(columnTotales);
         tablaTotales.setHorizontalAlignment(1);
         PdfPCell ct1 = new PdfPCell(new Phrase("TOTAL EN PUNTO"));
         PdfPCell ct2 = new PdfPCell(new Phrase("TOTAL EN EFECTIVO"));
         ct3 = new PdfPCell(new Phrase("TOTAL EN PAGO MOVIL"));
         ct4 = new PdfPCell(new Phrase("TOTAL"));
         ct1.setHorizontalAlignment(1);
         ct1.setVerticalAlignment(5);
         ct2.setHorizontalAlignment(1);
         ct2.setVerticalAlignment(5);
         ct3.setHorizontalAlignment(1);
         ct3.setVerticalAlignment(5);
         ct4.setHorizontalAlignment(1);
         ct4.setVerticalAlignment(5);
         ct1.setMinimumHeight(20.0F);
         ct1.setHorizontalAlignment(1);
         ct1.setVerticalAlignment(5);
         ct2.setMinimumHeight(20.0F);
         ct2.setHorizontalAlignment(1);
         ct2.setVerticalAlignment(5);
         ct3.setMinimumHeight(20.0F);
         ct3.setHorizontalAlignment(1);
         ct3.setVerticalAlignment(5);
         ct4.setMinimumHeight(20.0F);
         ct4.setHorizontalAlignment(1);
         ct4.setVerticalAlignment(5);
         tablaTotales.addCell(ct1);
         tablaTotales.addCell(ct2);
         tablaTotales.addCell(ct3);
         tablaTotales.addCell(ct4);
         PdfPTable tablaFin = new PdfPTable(4);
         tablaFin.setWidthPercentage(100.0F);
         tablaFin.getDefaultCell().setBorder(0);
         float[] columnFin = new float[]{120.0F, 120.0F, 120.0F, 120.0F};
         tablaFin.setWidths(columnFin);
         tablaFin.setHorizontalAlignment(1);
         cf1 = new PdfPCell(new Phrase(String.valueOf(this.preciofinal(totalTarjSemana))));
         PdfPCell cf2 = new PdfPCell(new Phrase(String.valueOf(this.preciofinal(totalEfecSemanal))));
         PdfPCell cf3 = new PdfPCell(new Phrase(String.valueOf(this.preciofinal(totalPmSemanal))));
         PdfPCell cf4 = new PdfPCell(new Phrase(String.valueOf(this.preciofinal(totalSemanal))));
         cf1.setHorizontalAlignment(1);
         cf1.setVerticalAlignment(5);
         cf2.setHorizontalAlignment(1);
         cf2.setVerticalAlignment(5);
         cf3.setHorizontalAlignment(1);
         cf3.setVerticalAlignment(5);
         cf4.setHorizontalAlignment(1);
         cf4.setVerticalAlignment(5);
         tablaFin.addCell(cf1);
         tablaFin.addCell(cf2);
         tablaFin.addCell(cf3);
         tablaFin.addCell(cf4);
         dc.add(encabezado);
         dc.add(head);
         dc.add(tablaProductos);
         dc.add(tablaProd);
         dc.add(head2);
         dc.add(tablaTotales);
         dc.add(tablaFin);
         dc.close();
         archivo.close();
      } catch (Exception var43) {
         JOptionPane.showMessageDialog((Component)null, var43.toString());
      }

   }

   public static String restarDias(String fechaYHora, long dias) {
      DateTimeFormatter formateador = DateTimeFormatter.ofPattern("uuuu-MM-dd");
      LocalDate fechaLocal = LocalDate.parse(fechaYHora, formateador);
      fechaLocal = fechaLocal.minusDays(dias);
      return fechaLocal.format(formateador);
   }

   public static String restarSemanas(String fechaYHora, long semanas) {
      DateTimeFormatter formateador = DateTimeFormatter.ofPattern("uuuu-MM-dd");
      LocalDate fechaLocal = LocalDate.parse(fechaYHora, formateador);
      fechaLocal = fechaLocal.minusWeeks(semanas);
      return fechaLocal.format(formateador);
   }

   public static String restarMes(String fechaYHora, long mes) {
      DateTimeFormatter formateador = DateTimeFormatter.ofPattern("uuuu-MM-dd");
      LocalDate fechaLocal = LocalDate.parse(fechaYHora, formateador);
      fechaLocal = fechaLocal.minusMonths(mes);
      return fechaLocal.format(formateador);
   }

   public static String restarAnio(String fechaYHora, long anio) {
      DateTimeFormatter formateador = DateTimeFormatter.ofPattern("uuuu-MM-dd");
      LocalDate fechaLocal = LocalDate.parse(fechaYHora, formateador);
      fechaLocal = fechaLocal.minusYears(anio);
      return fechaLocal.format(formateador);
   }

   public static String upperCaseFirst(String val) {
      char[] arr = val.toCharArray();
      arr[0] = Character.toUpperCase(arr[0]);
      return new String(arr);
   }

   private Double preciofinal(Double numero) {
      return (double)Math.round(numero * Math.pow(10.0D, 2.0D)) / Math.pow(10.0D, 2.0D);
   }
}