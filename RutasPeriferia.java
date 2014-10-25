
public class RutasPeriferia implements Rutas {
  
  private String decripcionLugares;
  
  public RutasPeriferia(String decripcionLugares) {
    this.decripcionLugares = decripcionLugares;
  }
  
  public void setDecripcionLugares(String decripcionLugares) {
    this.decripcionLugares = decripcionLugares;
  }
  
  public String getDecripcionLugares() {
    return decripcionLugares;
  }
  
  public double montoRuta() {
    return 950.00;
  }
  
  public String toString() {
    return "Descripci�n del Recorrido: " + decripcionLugares + "\nMonto de la Ruta: " + montoRuta();
  } 
} // Fin RutasInterprovinciales