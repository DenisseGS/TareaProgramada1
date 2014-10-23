
//package programadai;

public class PagoEfectivoVentanilla implements Pago {
  
  private double montoPago;
  
  public PagoEfectivoVentanilla() {
  }
  
  public PagoEfectivoVentanilla(double montoPago) {
    this.montoPago = montoPago;
  }
  
  public double getMontoPago() {
    return montoPago;
  }
  
  public void setMontoPago(double montoPago) {
    this.montoPago = montoPago;
  }
  
  public boolean cobro(double compra){
    boolean condicion = true;
    double vuelto =0;
    if(getMontoPago()>=compra ){
      vuelto = getMontoPago()-compra; 
      condicion = true;
      GestorIO.mostrarMensaje("Mensaje prueba:"+ mensaje(condicion,vuelto,compra));
    }else{
      condicion =false;
      GestorIO.mostrarMensaje("Mensaje prueba:"+ mensaje(condicion,vuelto,compra));
    }
    return condicion;
  }
  
  public  String mensaje(boolean condicion,double vuelto,double compra){
    String hilera = " ";
    if(condicion == true){
      hilera = "\n La compra se ha realizado de manera exitosa." + "\nMonto de compra"+compra 
        + "\n Monto de pago: "+ getMontoPago() + "\n Vuelto :"+ vuelto;
    }else{
      hilera ="\n Lo sentimos la comprano no se puede realizar "+ 
        "\n Fondos insuficientes";
      //// AGREGAR 
    }
    return hilera;
  }
  
  public String tiquete(String tipo,String ruta, int hora){
    String hilera= " ";
    
    hilera += "\nTransportes DELDU S.A " + "\nTipo de Transporte:  "+tipo+ "\nRuta:"+ ruta+ "\n Hora de salida"+ hora;
    
    hilera += "\n";
    
    return hilera;
  }
  
} // fin PagoEfectivoVentanilla