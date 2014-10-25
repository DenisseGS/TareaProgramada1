
public class RutasInterprovinciales implements Rutas {
  
  private String provinciaOrigen;
  private String provinciaDestino;
  
  public RutasInterprovinciales(String provinciaOrigen, String provinciaDestino) {
    this.provinciaOrigen = provinciaOrigen;
    this.provinciaDestino = provinciaDestino;
  }
  
  public void setProvinciaOrigen(String provinciaOrigen) {
    this.provinciaOrigen = provinciaOrigen;
  }
  
  public String getProvinciaOrigen() {
    return provinciaOrigen;
  }
  
  public void setProvinciaDestino(String provinciaDestino) {
    this.provinciaDestino = provinciaDestino;
  }
  
  public String getProvinciaDestino() {
    return provinciaDestino;
  }
  
  public double montoRuta() {
    return 3500.00;
  }
  
  public String toString() {
    return "Provincia de Origen: " + provinciaOrigen + "\nProvincia de Destino: " + provinciaDestino + "\nMonto de la Ruta: " + montoRuta();
  } 
} // Fin RutasInterprovinciales