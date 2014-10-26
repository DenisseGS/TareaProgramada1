
public class ManejadorRutas {
  
  public  static Rutas[] vector;
  
  public ManejadorRutas() {
    int tamaño = 9;
    vector = new Rutas[tamaño];
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
  
  public  String seleccionarRuta() {
    String hilera = " ";
    hilera = GestorIO.mostrarMenu("RUTAS", "RUTAS",vector);    
    return hilera;
  }
  
  public   static String desplegarRutasInter(){
    String hilera = "";
    for (int i = 0; i <vector.length; i++ ){
      if((vector[i]!= null)&& vector[i]instanceof RutasInterprovinciales ){
        RutasInterprovinciales temp = (RutasInterprovinciales)vector[i];
        hilera += "\nDigite: " + (i) + " Para seleccionar la ruta : "+temp.getProvinciaOrigen()+ "--"+ temp.getProvinciaDestino()+"\nValor del tiquete:"+temp.montoRuta() + "\n";
        hilera +=  "\n";
      }
    }
    return hilera;
  }//fin de desplegarRutasInter
  
  public static String desplegarRutasIntraCapi(){
    String hilera = " ";
    for (int j = 0; j <vector.length; j++ ){
      if((vector[j]!= null)&& vector[j]instanceof RutasIntracapitales){
        RutasIntracapitales temp2 = (RutasIntracapitales)vector[j];
        hilera += "\nDigite: "+ (j) + " Para seleccionar la ruta : "+temp2.getSectorOrigen()+ "--"+ temp2.getSectorDestino()+"\nValor del tiquete:"+temp2.montoRuta() + "\n";
        hilera +=  "\n";
      }
    }
    return hilera;
  }// fin de desplegarRutasIntraCapi
  
  
  public static String desplegarRutasPerif(){
    String hilera = " ";
    
    for (int n = 0; n <vector.length; n++ ){
      if((vector[n]!= null)&& vector[n]instanceof RutasPeriferia){
        RutasPeriferia temp3 = (RutasPeriferia)vector[n];
        hilera += "\nDigite: "+ n + "\n Para seleccionar la ruta : "+temp3.getDecripcionLugares()+ "\nValor del tiquete:"+temp3.montoRuta() + "\n";
        hilera +=  "\n";
      }
    }// fin del for
    return hilera;                     
  }//fin de desplegarRutasPerif
  
  
} // fin vectorRutas