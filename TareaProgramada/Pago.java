
//package programadai;

public interface Pago {
  
  public boolean cobro(double compra);
  public String mensaje(boolean condicion,double vuelto,double compra);
  public String tiquete(String tipo,String ruta, int hora);
  
} // fin Pago