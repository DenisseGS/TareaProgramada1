
import javax.swing.JOptionPane;

public class GestorIO {
  
  public static void mostrarMensaje(String mensaje) {
    JOptionPane.showMessageDialog(null, mensaje);
  }
  
  public static void mostrarMensajeError(String mensaje) {
    JOptionPane.showMessageDialog(null, mensaje, "MENSAJE ERROR", JOptionPane.ERROR_MESSAGE);
  }
  
  public static String solicitarString(String mensaje){
    String dato = "";
    try{
      dato = JOptionPane.showInputDialog (mensaje);
    }catch(Exception ex) {
      mostrarMensajeError("Error digite de nuevo");
    }
    return dato; 
  }
  
  public static int solicitarInt(String mensaje) {
    int numero = 0;
    boolean salir;
    do{
      salir = true;
      try{    
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
      }catch(Exception ex) {
        mostrarMensajeError("Error digite de nuevo"); 
        salir = false;
      }
    }while(salir == false);
    return numero;
  }

  public static double solicitarDouble(String mensaje) {
    double numero = 0;
    boolean salir;
    do{
      salir = true;
      try{    
        numero = Double.parseDouble(JOptionPane.showInputDialog(null, mensaje));
      }catch(Exception ex) {
        mostrarMensajeError("Error digite de nuevo"); 
        salir = false;
      }
    }while(salir == false);
    return numero;
  }
  
  public static float solicitarFloat(String mensaje) {
    float num = 0;
    boolean salir;
    do{
      salir = true;
      try{    
        num = Float.parseFloat(JOptionPane.showInputDialog(null, mensaje));
      }catch(Exception ex) {
        mostrarMensajeError("Error digite de nuevo"); 
        salir = false;
      }
    }while(salir == false);
    return num;
  }
  
  public static String mostrarMenu(String mensaje, String titulo, String [] botones) { //inicio del metodo
    String menu = "";//variable menu
    try{//validar los espacios
      menu = (String)JOptionPane.showInputDialog (null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]); //solicitud de variable 
    }//fin del try
    catch (Exception ex) {} //catch para el vacio
    return menu; //regresar variable menu
  } //fin metodo
} // }Fin clase GestorIO