
//package programadai;

public class Menu {
  CreacionObjetos creacionObj = new CreacionObjetos();
   private final double DESCUENTO= 0.10;
  public void desplegarMenu() {
    
    int accederMenu = 0;
    boolean salir = false;
    int contador = -1;
    
    Menu menu = new Menu();
    
    while(salir == false) {
      
      accederMenu = GestorIO.solicitarInt("Bienvenido,seleccione el tipo de sistema de compra:\nDIGITE :\n\n 1)Ventanilla:\n2)Web:\n3)Cobrador Electronico:\n4)Salir del Sistema");
      
      switch(accederMenu) {
        
        case 1:
          menu.menu2(accederMenu);
          break;
          
        case 2:
          menu.menu2(accederMenu);
          
          break;
          
        case 3:
          menu.menu2(accederMenu);
          break;
          
        case 4:
          salir=true;
          break;
      }// fin switch
    } //  fin while
  }// fin de deplegar menu
  
  
  public void menu2(int opci) {
    
    int acceder2 = 0;
    boolean continuar = true;
    while(continuar == true) {
      acceder2 = GestorIO.solicitarInt("DIGITE :\n\n 1)Compra de Pasaje:\n2)Generar Reporte:\n3)Regresar");
      
      switch(acceder2) {
        case 1:
          boolean continuar2 = true;
          while(continuar2 == true) {
            int tipoTrans = GestorIO.solicitarInt("Seleccione el tipo de transporte \n Digite:\n 1)Tren \n2)Metro \n 3)Regresar");
            switch (tipoTrans) {
              case 1:
                tipoTransporte(tipoTrans,opci);
                
                break;
                
              case 2:
                GestorIO.mostrarMensaje("Bienvenido: \nRuta Intracapital");
                boolean continuar3 = true;
                while(continuar3 == true) {
                  int ciudadano = GestorIO.solicitarInt("Posee carnet de Oro \n1)SI \n2)NO \n3)Regresar");
                  switch (ciudadano) {
                    case 1:
                     
                       
                      tipoTransporte(tipoTrans,opci);
                      break;
                    case 2:
                      
                      break;
                      
                    case 3:
                      continuar3 = false;
                      break;
                  }// fin del switch
                }// fin del while
                    case 3:
                      continuar2 = false;
                      break;
                
            }// fin del switch
          }// fin de while
          break;
          
        case 2:
          break;
          
        case 3:
          continuar = false;
          break;  
      } // fin switch
      
    } // fin while
  } // fin menu2
  
  
  public  void tipoTransporte(int tipoTrans,int opci) {
  //  ManejadorRutas manejador = new ManejadorRutas();
    String hora = " ";
    if (tipoTrans == 1) {
      boolean continuar3 = true;
      while(continuar3 == true){
        int ruta = GestorIO.solicitarInt("Seleccione el tipo de ruta \n 1) Ruta Interprovincial \n 2)Ruta Periferia\n 3)Regresar");
        switch (ruta) {
          case 1:
            CreacionObjetos obj = new CreacionObjetos();
            obj.crearRuta();
            ManejadorRutas manejador = new ManejadorRutas();
            manejador.seleccionarRuta();
            hora= creacionObj.mostrar();
            int cantidad = GestorIO.solicitarInt("Digite la cantidad de pasajes que desea reservar");
            double compra = cantidad * 1000;
            tipoPago(compra,cantidad,"Tren",hora,opci);
            break;
            
          case 2:
            ///NOTA RUTAS 
            //FECHA
            hora = creacionObj.mostrar();
            int cantidad2 = GestorIO.solicitarInt("Digite la cantidad de pasajes que desea reservar");
            double compra2 = cantidad2 * 1000;
            tipoPago(compra2,cantidad2,"Tren",hora,opci);
            
            break;
          case 3:
            continuar3 = false;
            break;
            
        }// fin del switch
      }// fin del while
    } else if (tipoTrans == 2) {
      
    }
    
  }// fin del tipo Transporte
  
  public  void tipoPago(double compra,int cantidad,String tipo,String hora,int opci){
    boolean continuar= true;
    int pago =0;
    
    while (continuar == true){
      if(opci == 2){
        pago =2;
      }else if(opci==3){
        pago = GestorIO.solicitarInt("Seleccione el tipo de pago:\n 1) Pago con efectivo en cobrador electrónico\n 2)Pago con Tarjeta \n 3) Regresar");
      }else{
        pago = GestorIO.solicitarInt("Seleccione el tipo de pago:\n 1) Pago en efectivo \n 2)Pago con Tarjeta \n 3) Regresar");
      }
      
      switch (pago) {
        
        case 1:
          /// hacer un if 
          
          double montoPago = GestorIO.solicitarDouble("Digite el monto de pago");
          PagoEfectivoVentanilla pagoEfectivo = new PagoEfectivoVentanilla(montoPago);
          boolean condicion= pagoEfectivo.cobro(compra);
          int contador =0;
          if(condicion == true){
            
            for(int i =0; i<cantidad;i++){
              contador++;
              GestorIO.mostrarMensaje(pagoEfectivo.tiquete(tipo,"puntarenas", hora,contador));
            }
          }
          /// contaador
          break;
        case 2:
          
          float numTarjeta = GestorIO.solicitarFloat("Digite el Número de tarjeta");
          String fecha = GestorIO.solicitarString( "Digite la fecha de Expiración ");
          String entidad= GestorIO.solicitarString( "Digite la entidad expendedora ");
          // GestorIO.mostrarMensaje( miMain.getManejador());
          //GestorIO.mostrarMensaje("buscar" + manejador.buscarBinarioNumero(5046270600087498f));
          
          break;
        case 3 :
          continuar = false;
          break;
          
      }// fin de switch 
    }// fin del while
  }// fin de tipo de pago 
  
  
  
}// fin Menu
