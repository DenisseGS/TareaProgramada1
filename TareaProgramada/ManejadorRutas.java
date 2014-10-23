
public class ManejadorRutas {
  
  public Rutas[] vector;
  
  public ManejadorRutas() {
    int tamaño = 9;
    vector = new Rutas[tamaño];
  }
  
  public ManejadorRutas(Rutas [] vector) {
    this.vector = vector;
  }
  
  public String toString (){
    String hilera= "";
    for( int i=0; i < vector.length; i++){
      hilera+= vector [i]+ " ";
    }
    return hilera;
  }
  
  public  String seleccionarRuta(Rutas [] vector){
    
    String hilera = " ";
     hilera=GestorIO.mostrarMenu("RUTAS","RUTAS", vector);
     
     return hilera;
  }
    
} // fin vectorRutas