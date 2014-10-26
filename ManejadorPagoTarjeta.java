
import java.text.SimpleDateFormat;  
import java.text.ParseException;
import java.util.Date;


public class ManejadorPagoTarjeta {
  
  
  public static Tarjeta [] vector1 ;
  
  public ManejadorPagoTarjeta() {
    vector1 = new Tarjeta [5];
  }
  
  public ManejadorPagoTarjeta(Tarjeta [] vector1) {
    this.vector1 = vector1;
  }  
  
  public String toString() {
    String hilera = " ";
    for (int i = 0; i < vector1.length; i++) {
      hilera +=  vector1[i] + " ";
    }
    hilera += "\n";
    return hilera;
  }
  
  public void OrdenarLista() {
    Tarjeta temp;
    for(int i = 0; i < vector1.length -1; i++){
      for(int j = 0; j < vector1.length -1; j++){
        if((vector1[j] != null && vector1[j+1] != null) && vector1[j].getNumeroDeTarjeta() > vector1[j+1].getNumeroDeTarjeta()){
          temp = vector1[j];
          vector1[j] = vector1[j+1];
          vector1[j+1] = temp;
        }
      }
    }
  }
  
  public static boolean buscarBinarioNumero(float dato) {
    int inicio = 0;
    int fin = vector1.length - 1;
    int actual;
    while (inicio <= fin) {
      actual = (inicio + fin) / 2;
      if (vector1[actual].getNumeroDeTarjeta() == dato)
        return true;
      else if (vector1[actual].getNumeroDeTarjeta() < dato) {
        inicio = actual + 1;
      } else {
        fin = actual - 1;
      }
    }
    return false;
  }// fin de buscarBinarioNumero
  
  public boolean validarIngresoFecha(String fecha) {  
    if (fecha == null)  
      return false;  
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
    if (fecha.trim().length() != dateFormat.toPattern().length())  
      return false;  
    dateFormat.setLenient(false);  
    try {  
      dateFormat.parse(fecha.trim());  
    }  
    catch (ParseException pe) {  
      return false;  
    }  
    return true;  
  }  
  
  public boolean validarExpiracion( String fecha1){
    ManejadorPagoTarjeta objetoPrincipal = new ManejadorPagoTarjeta();
    Date fechaActual = new Date();
    SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
    String fechaSistema=formateador.format(fechaActual);
    boolean esValida= objetoPrincipal.compararFechasConDate(fecha1,fechaSistema);
    System.out.println(esValida+"\n");
    return esValida;
  }

  private boolean compararFechasConDate(String fecha1, String fechaActual) {  
    boolean resultado= false;
    try {
      /**Obtenemos las fechas enviadas en el formato a comparar*/
      SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy"); 
      Date fechaDate1 = formateador.parse(fecha1);
      Date fechaDate2 = formateador.parse(fechaActual);
      
      if ( fechaDate1.before(fechaDate2) ){
        resultado= false;
      }else{
        if ( fechaDate2.before(fechaDate1) ){
          resultado=true;
        }else{
          resultado= true;
        } 
      }
    } catch (ParseException e) {
      System.out.println("Se Produjo un Error!!!  "+e.getMessage());
    }  
    return resultado;
  }
  
} // fin ManejadorPagoTarjeta