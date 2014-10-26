
//package programadai;

public class PagoEfectivoCobradorElectronico implements Pago {
   private double montoPago;
  
//  EnumeracionBillete billete1 = EnumeracionBillete.MIL;
//  EnumeracionBillete billete2 = EnumeracionBillete.DOSMIL;
//  EnumeracionBillete billete3 = EnumeracionBillete.CINCOMIL;
//  EnumeracionBillete billete4 = EnumeracionBillete.DIEZMIL;
//  EnumeracionBillete billete5 = EnumeracionBillete.VEINTEMIL;
//  
//  EnumeracionMoneda moneda1 = EnumeracionMoneda.DIEZ;
//  EnumeracionMoneda moneda2 = EnumeracionMoneda.VEINTICINCO;
//  EnumeracionMoneda moneda3 = EnumeracionMoneda.CINCUENTA;
//  EnumeracionMoneda moneda4 = EnumeracionMoneda.CIEN;
//  EnumeracionMoneda moneda5 = EnumeracionMoneda.QUINIENTOS;
  
  
  
  
//  Pago con efectivo en cobrador electrónico: se deben seleccionar billetes y monedas con que se
//pagará con denominaciones nacionales hasta que el monto sea superior al monto de
//cobro(tomando en cuenta monto ruta y cantidad de pasajes), posteriormente se deberá generar el
//vuelto correspondiente, también en denominaciones válidas. Se deberá generar un mensaje de
//compra exitosa, el monto de la compra, el monto de pago y el vuelto.
  public PagoEfectivoCobradorElectronico() {
  }
  
  public void setMontoPago(double montoPago){
    this.montoPago = montoPago;
  }
  
   public double getMontoPago() {
    return montoPago;
  }
   
   
   public boolean cobro(double compra) {
     boolean condicion = true;
     double vuelto = 0;
     if( getMontoPago()>= compra){
       vuelto = getMontoPago() - compra; 
       condicion = true;
       GestorIO.mostrarMensaje("Mensaje prueba: " + mensaje(condicion, vuelto, compra));
     }else{
       condicion = false;
       GestorIO.mostrarMensaje("Mensaje prueba: " + mensaje(condicion, vuelto, compra));
     }
     return condicion;
   }
   
   public  String mensaje(boolean condicion, double vuelto, double compra) {
     String hilera = " ";
     if(condicion == true){
       hilera = "\nLa compra se ha realizado exitosamente" + "\nMonto de compra" + compra 
         + "\n Monto de pago: " + getMontoPago() + "\n Vuelto :" + vuelto;
     }else{
       hilera ="\nLo sentimos, la compra no se puede realizar" + 
         "\nFondos insuficientes";
       //// AGREGAR 
     }
    return hilera;
  }
  
  public String tiquete(String tipo, String ruta, String hora, int contador) {
    String hilera= " ";
    hilera += contador + "\n\nTransportes DELDU S.A " + "\nTipo de Transporte:  " + tipo + "\nRuta: " + ruta + "\n Hora de salida: " + hora;
    hilera += "\n";
    return hilera;
  } 
  
  //.......................................................................................................... 
  
  public String devolverBillete() {
    String temp = "";
    int contador = 1;
    for(EnumeracionBillete eb : EnumeracionBillete.values()) {
      temp += "\n" + contador + ") " + eb + ": " + eb.getBillete() + " " + eb.getTipo();
      contador++;
    }
    return temp;
  }
  
     
//  public int devolverCantidadBillete() {
//    int temp = 0;
//    for(EnumeracionBillete eb : EnumeracionBillete.values()) {
//      temp = eb.getBillete();
//    }
//    ManejadorDinero manjdr = new ManejadorDinero();  
//    manjdr.add(temp);
//    return temp;
//  }
  
  public String devolverMonedas() {
    String temp = "";
    int contador = 6;
    for(EnumeracionMoneda em : EnumeracionMoneda.values()) {
      temp += "\n" + contador + ") " + em + ": " + em.getMoneda() + " " + em.getTipo();
      contador++;
    }
    return temp;
  }
  
//  public int devolverCantidadMonedas() {
//    int temp = 0;
//    for(EnumeracionMoneda em : EnumeracionMoneda.values()) {
//      temp = em.getMoneda();
//    }
//    ManejadorDinero manjdr = new ManejadorDinero();  
//    manjdr.add(temp);
//    return temp;
//  }  
  //................................................................................................................
  
  
} // fin PagoEfectivoCobradorElectronico