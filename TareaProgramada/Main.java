
import java.util.Calendar;
public class Main {
  
  public static void main(String[] args) {
   
    
    Rutas[] vector = new Rutas[9];
    
    
    vector[0] = new RutasInterprovinciales("San Jose", "Alajuela");
    vector[1] = new RutasInterprovinciales("Heredia", "Cartago");
    vector[2] = new RutasInterprovinciales("Guanacaste", "Puntarenas");
    vector[3] = new RutasIntracapitales("Moravia", "Tibas");
    vector[4] = new RutasIntracapitales("Grecia", "Naranjo");
    vector[5] = new RutasIntracapitales("Santa Barbara", "Barva");
    vector[6] = new RutasPeriferia("Mercado de San Jose");
    vector[7] = new RutasPeriferia("Parque Prospero Fernandez");
    vector[8] = new RutasPeriferia("Hospital de Heredia");
    String hilera =" ";
    ManejadorRutas manejador = new ManejadorRutas(vector);
    GestorIO.mostrarMensaje(" " + manejador);
   
   
  
    Calendar fecha1 = Calendar.getInstance();
    fecha1.set(2019,10,22); //Los meses van de 0 a 11, luego 10 representa noviembre
    
    Tarjeta [] vector1 = new Tarjeta[5];
    
    vector1 [0] = new Tarjeta(5046270600087498f, fecha1, "BCR", 20000);
    fecha1.set(2020, 10, 22);
    vector1 [1] = new Tarjeta(4097108456782563f, fecha1 , "BCR", 30000);
    fecha1.set(2016, 02, 22);
    vector1 [2] = new Tarjeta(4000873654896905f, fecha1 ,"BCP", 40000);
    fecha1.set(2018, 07, 23);
    vector1 [3] = new Tarjeta(4380749864924578f, fecha1 , "BCP", 50000);
    fecha1.set(2050, 07, 23);
    vector1 [4] = new Tarjeta(4380498965039752f, fecha1, "BN", 10000);
    fecha1.set(2050, 01, 23);
    
    Tarjeta [] vector2 = new Tarjeta[5];
    vector2 [0] = new Tarjeta(4000000456768935f, fecha1, "BCR", 50000);
    vector2 [1] = new Tarjeta(4097108578920300f,  fecha1, "BCR", 60000);
    vector2 [2] = new Tarjeta(4000873654369055f, fecha1, "BCP", 70000);
    vector2 [3] = new Tarjeta(4380749856748738f, fecha1, "BCP", 80000);
    vector2 [4] = new Tarjeta(4380989683034857f, fecha1, "BN", 100000);
    
    ManejadorPagoTarjeta manejador1 = new ManejadorPagoTarjeta(vector1);
    ManejadorPagoTarjeta manejador2 = new ManejadorPagoTarjeta(vector2);
    manejador1.OrdenarLista();
    manejador2.OrdenarLista();
    
     
    GestorIO.mostrarMensaje("prueba" + manejador2);
 
    
    Menu menu = new Menu();
    menu.desplegarMenu(); 
  } // fin main 
  
} // fin Main