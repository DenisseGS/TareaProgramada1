

/**
 * Universidad de Costa Rica
 * IF-2000 Programaci�n I
 * Andrey Porras Rojas
 * Alejandra Anch�a  P.
 * Denisse G�nzalez S.
 * B30388
 * B33029
 * 06/10/14
 *------------------------------------------------------------------------------
 *Modificado por: <Alejandra Anch�a  P,Denisse G�nzalez S>
 * Fecha de modificaci�n: <22/10/2014>
 *------------------------------------------------------------------------------
 *Recomendaciones que debe seguir si usted modifica este c�digo:
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