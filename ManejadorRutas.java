
public class ManejadorRutas {
  
  public Rutas[] vector;
  
  public ManejadorRutas() {
    int tama�o = 9;
    vector = new Rutas[tama�o];
  }
  
  public ManejadorRutas(Rutas [] vector) {
    this.vector = vector;
  }
  
  public String toString() {
    String hilera= "";
    for( int i = 0; i < vector.length; i++) {
      hilera+= vector [i] + " ";
    }
    return hilera;
  }
  
//  public Rutas getVector(){
//     for( int i = 0; i < vector.length; i++) {
//       vector [i] ;
//    }
//    return vector[i];
//  }
  
  public  String seleccionarRuta() {
    String hilera = " ";
    hilera = GestorIO.mostrarMenu("RUTAS", "RUTAS",vector);    
    return hilera;
  }
  
  
} // fin vectorRutas