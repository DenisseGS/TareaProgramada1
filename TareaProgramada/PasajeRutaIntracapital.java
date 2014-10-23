
public class PasajeRutaIntracapital extends Pasaje  {
  
  private Boolean cuidadanoDeOro;
  private RutasIntracapitales ruta;
  
  public PasajeRutaIntracapital(Boolean cuidadanoDeOro, RutasIntracapitales ruta, int cantidadPasaje, double tipoPago) {
    super(cantidadPasaje, tipoPago);
    this.cuidadanoDeOro = cuidadanoDeOro;
    this.ruta = ruta;
  }
  
  public void setRuta(Boolean cuidadanoDeOro){
    this.cuidadanoDeOro = cuidadanoDeOro;
  }
  
  public Boolean getCuidadanoDeOro(){
    return cuidadanoDeOro;
  }
  
  public void setRuta(RutasIntracapitales ruta){
    this.ruta = ruta;
  }
  
  public RutasIntracapitales getRuta(){
    return ruta;
  }
  
  public String toString() {
    return  "Ruta: " + ruta + super.toString();
  } 
} // Fin PasajeRutaIntracapital