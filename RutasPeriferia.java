
public class RutasPeriferia implements Rutas {
  
  private String decripcionLugares;
  
  public RutasPeriferia() {
  }
  
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
    return "Descripción del Recorrido: " + decripcionLugares;
  } 
} // Fin RutasInterprovinciales