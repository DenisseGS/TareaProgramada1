
public class PasajeRutaInterprovincial extends Pasaje {
  
  private String fecha;
  private String horaSalida;
  private RutasInterprovinciales ruta;
  
  public PasajeRutaInterprovincial(String fecha, String horaSalida, RutasInterprovinciales ruta, int cantidadPasaje, double tipoPago) {
    super(cantidadPasaje, tipoPago);
    this.fecha = fecha;
    this.horaSalida = horaSalida;
    this.ruta = ruta;
  }
  
  public void setFecha(String fecha){
    this.fecha = fecha;
  }
  
  public String getFeha(){
    return fecha;
  }
  
  public void setHoraSalida(String horaSalida){
    this.horaSalida = horaSalida;
  }
  
  public String getHoraSalida(){
    return horaSalida;
  }
  
  public void setRuta(RutasInterprovinciales ruta){
    this.ruta = ruta;
  }
  
  public RutasInterprovinciales getRuta(){
    return ruta;
  }
  
  public String toString() {
    return "Fecha: " + fecha + "\nHora de salida: " + horaSalida + "\nRuta: " + ruta + super.toString();
  } 
} // Fin PasajeRutasInterprovincial