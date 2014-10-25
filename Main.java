

/**
 * Universidad de Costa Rica
 * IF-2000 Programación I
 * Andrey Porras Rojas
 * Alejandra Anchía  P.
 * Denisse Gónzalez S.
 * B30388
 * B33029
 * 06/10/14
 *------------------------------------------------------------------------------
 *Modificado por: <Alejandra Anchía  P,Denisse Gónzalez S>
 * Fecha de modificación: <22/10/2014>
 *------------------------------------------------------------------------------
 *Recomendaciones que debe seguir si usted modifica este código:
 * <.........>
 */

public class Main {
  
  public static void main(String[] args) {
    
   
    Menu menu = new Menu();
     CreacionObjetos creacionObj = new CreacionObjetos();
     creacionObj.crearRuta();
     creacionObj.crearVector();
    menu.desplegarMenu(); 
  } // fin main 
  
} // fin Main