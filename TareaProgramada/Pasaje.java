
public abstract class Pasaje{
  
  private int cantidadPasaje;
  private double tipoPago;
  
  public Pasaje(int cantidadPasaje, double tipoPago) {
    this.cantidadPasaje = cantidadPasaje;
    this.tipoPago = tipoPago;
  }
  
  public void setCantidadPasaje(int cantidadPasaje){
    this.cantidadPasaje = cantidadPasaje;
  }
  
  public int getCantidadPasaje(){
    return cantidadPasaje;
  }
  
  public void setTipoPago(double tipoPago){
    this.tipoPago = tipoPago;
  }
  
  public double getTipoPago(){
    return tipoPago;
  }
  
  public String toString() {
    return  "\nCantidad de pasajes: " + cantidadPasaje + "\nTipo de pago: " + tipoPago;
  } 
} // fin Pasaje