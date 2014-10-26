
import java.util.Calendar;
public class Tarjeta {
  
  float  numeroDeTarjeta ;
  private Calendar fechaExpiracion;
  String entidadEmprededora;
  double montoDisponible;
  
  public Tarjeta() {
  }
  
  public Tarjeta(float numeroDeTarjeta, Calendar fechaExpiracion, String entidadEmprededora, double montoDisponible) {
    this.numeroDeTarjeta = numeroDeTarjeta;
    this.fechaExpiracion = fechaExpiracion;
    this.entidadEmprededora = entidadEmprededora;
    this.montoDisponible = montoDisponible;
  }
  
  public float getNumeroDeTarjeta() {
    return numeroDeTarjeta;
  }
  
  public void setNumeroDeTarjeta(float numeroDeTarjeta) {
    this.numeroDeTarjeta = numeroDeTarjeta;
  }
  
  public Calendar getFechaExpiracion() {
    return fechaExpiracion;
  }
  
  public void setFechaExpiracion(Calendar fechaExpiracion) {
    this.fechaExpiracion = fechaExpiracion;
  }
  
  public void setEntidadEmprededora(String entidadEmprededora) {
    this.entidadEmprededora = entidadEmprededora;
  }
  
  public String getEntidadEmprededora() {
    return entidadEmprededora;
  }
  
  public double getMontoDisponible() {
    return montoDisponible;
  }
  
  public void setMontoDisponible(double montoDisponible) {
    this.montoDisponible = montoDisponible;
  }
  
  public String toString() {
    return "\nNumero de tarjeta" + getNumeroDeTarjeta() ;
  }  
} // fin Tarjeta