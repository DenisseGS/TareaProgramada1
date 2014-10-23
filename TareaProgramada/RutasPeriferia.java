
public class RutasPeriferia implements Rutas {
  
  private String decripcionLugares;
  
  public RutasPeriferia(String decripcionLugares){
    this.decripcionLugares = decripcionLugares;
  }
  
  public void setDecripcionLugares(String decripcionLugares){
    this.decripcionLugares = decripcionLugares;
  }
  
  public String getDecripcionLugares(){
    return decripcionLugares;
  }
  
  public String toString() {
    return "Descripción del Recorrido: " + decripcionLugares + "\nMonto de la Ruta: " + MONTO_RUTA;
  } 
} // Fin RutasInterprovinciales