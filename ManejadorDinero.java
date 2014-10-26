
public class ManejadorDinero {
  
  public static int[] vector;
  
  public ManejadorDinero() {
    int tamaño = 10;
    vector = new int[tamaño];
  }
  
  public ManejadorDinero(int[] vector) {
    this.vector = vector;
  }
  
  public String toString() {
    String hilera = "";
    for(int i = 0; i < vector.length; i++) {
      hilera += i + " " + vector [i] + " ";
    }
    return hilera;
  } 
  
  public int add(int dinero) {
    int var = 0;
    for(int i = 0; i < vector.length; i++) {
      var = vector[i] = dinero;
    }
    return var;
  }

} // fin ManejadorDinero