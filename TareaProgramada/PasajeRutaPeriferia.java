
public class PasajeRutaPeriferia extends Pasaje {
  
  private RutasPeriferia ruta;
  
  public PasajeRutaPeriferia(RutasPeriferia ruta, int cantidadPasaje, double tipoPago) {
    super(cantidadPasaje, tipoPago);
    this.ruta = ruta;
  }
  
  public void setRuta(RutasPeriferia ruta){
    this.ruta = ruta;
  }
  
  public RutasPeriferia getRuta(){
    return ruta;
  }
  
  public String toString() {
    return  "Ruta: " + ruta +  super.toString();
  } 
} // Fin PasajeRutaPeriferia