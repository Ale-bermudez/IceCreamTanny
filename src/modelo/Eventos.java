/* Decompiler 4ms, total 160ms, lines 33 */
package modelo;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class Eventos {
   public void textKeyPress(KeyEvent evt) {
      char car = evt.getKeyChar();
      if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && car != '\b' && car != ' ') {
         evt.consume();
      }

   }

   public void numberKeyPress(KeyEvent evt) {
      char car = evt.getKeyChar();
      if ((car < '0' || car > '9') && car != '\b') {
         evt.consume();
      }

   }

   public void numberDecimalKeyPress(KeyEvent evt, JTextField textField) {
      char car = evt.getKeyChar();
      if ((car < '0' || car > '9') && textField.getText().contains(".") && car != '\b') {
         evt.consume();
      } else if ((car < '0' || car > '9') && car != '.' && car != '\b') {
         evt.consume();
      }

   }
}