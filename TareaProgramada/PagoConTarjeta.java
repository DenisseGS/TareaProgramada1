
//package programadai;

public class PagoConTarjeta implements Pago {
  
  int numeroDeTarjeta ;
  String fechaExpiracion;
  String entidadEmprededora;
  
  public PagoConTarjeta() {
  }
  
  public PagoConTarjeta(int numeroDeTarjeta, String fechaExpiracion, String entidadEmprededora) {
    this.numeroDeTarjeta = numeroDeTarjeta;
    this.fechaExpiracion = fechaExpiracion;
    this.entidadEmprededora = entidadEmprededora;
  }
  
  public int getNumeroDeTarjeta() {
    return numeroDeTarjeta;
  }
  
  public void setNumeroDeTarjeta(int numeroDeTarjeta) {
    this.numeroDeTarjeta = numeroDeTarjeta;
  }
  
  public String getFechaExpiracion() {
    return fechaExpiracion;
  }
  
  public void setFechaExpiracion(String fechaExpiracion) {
    this.fechaExpiracion = fechaExpiracion;
  }
  
  public String getEntidadEmprededora() {
    return entidadEmprededora;
  }
  
  public void setEntidadEmprededora(String entidadEmprededora) {
    this.entidadEmprededora = entidadEmprededora;
  }
  
  public boolean cobro(double compra) {
    boolean condicion = true;
    return condicion;
  }
  public String mensaje(boolean condicion,double vuelto,double compra){
    String mensaje = " ";
    return mensaje;
  }
  
  public String tiquete(String tipo,String ruta, int hora){
    String hilera= " ";
    
    hilera += "Transportes DELDU S.A " + "\nTipo de Transporte:  "+tipo+ "\nRuta:"+ ruta+ "\n Hora de salida"+ hora;
    
    hilera += "\n";
    
    return hilera;
  }
} // fin PagoConTarjeta
