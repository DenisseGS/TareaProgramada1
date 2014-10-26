
public class PagoEfectivoCobradorElectronico implements Pago {
  
  private double montoPago;
  
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
  
  public String devolverBillete() {
    String temp = "";
    int contador = 1;
    for(EnumeracionBillete eb : EnumeracionBillete.values()) {
      temp += "\n" + contador + ") " + eb + ": " + eb.getBillete() + " " + eb.getTipo();
      contador++;
    }
    return temp;
  }
  
  public String devolverMonedas() {
    String temp = "";
    int contador = 6;
    for(EnumeracionMoneda em : EnumeracionMoneda.values()) {
      temp += "\n" + contador + ") " + em + ": " + em.getMoneda() + " " + em.getTipo();
      contador++;
    }
    return temp;
  }  
} // fin PagoEfectivoCobradorElectronico