
public class Menu {
  CreacionObjetos creacionObj = new CreacionObjetos();
  private final double DESCUENTO = 0.1;
  
  EnumeracionBillete billete1 = EnumeracionBillete.MIL;
  EnumeracionBillete billete2 = EnumeracionBillete.DOSMIL;
  EnumeracionBillete billete3 = EnumeracionBillete.CINCOMIL;
  EnumeracionBillete billete4 = EnumeracionBillete.DIEZMIL;
  EnumeracionBillete billete5 = EnumeracionBillete.VEINTEMIL;
  
  EnumeracionMoneda moneda1 = EnumeracionMoneda.DIEZ;
  EnumeracionMoneda moneda2 = EnumeracionMoneda.VEINTICINCO;
  EnumeracionMoneda moneda3 = EnumeracionMoneda.CINCUENTA;
  EnumeracionMoneda moneda4 = EnumeracionMoneda.CIEN;
  EnumeracionMoneda moneda5 = EnumeracionMoneda.QUINIENTOS;
  
  
  public void desplegarMenu() { 
    int accederMenu = 0;
    boolean salir = false;
    int contador = -1;
    
    Menu menu = new Menu();
    
    while(salir == false) {
      
      accederMenu = GestorIO.solicitarInt("Bienvenido, seleccione el tipo de sistema de compra:\n\n1)Ventanilla\n2)Web\n3)Cobrador Electronico\n4)Salir del Sistema");
      
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
      acceder2 = GestorIO.solicitarInt("DIGITE: \n\n1) Compra de Pasaje\n2) Generar Reporte\n3) Regresar");
      
      switch(acceder2) {
        case 1:
          transporte(opci);
          break;
          
        case 2:
          break;
          
        case 3:
          continuar = false;
          break;  
      } // fin switch
      
    } // fin while
  } // fin menu2
  
  
  public void transporte(int opci){
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
                rutaMetro(tipoTrans,opci,DESCUENTO);
                break;
              case 2:
                tipoTransporte(tipoTrans,opci);
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
  }// fin del transporte
  
  public  void tipoTransporte(int tipoTrans,int opci) {
    if (tipoTrans == 1) {
      rutaTren(tipoTrans,opci);
    } else if (tipoTrans == 2) {
      
      rutaMetroSinDescuen(tipoTrans,opci);
    }   
  }// fin del tipo Transporte
  
  
  
  public void rutaTren(int tipoTrans,int opci){
    String hora = " ";
    int eleccion= 0;
    String ruta1= " ";
    String rutaSeleciondad= " ";
    boolean continuar3 = true;
    while(continuar3 == true){
      int ruta = GestorIO.solicitarInt("Seleccione el tipo de ruta \n 1) Ruta Interprovincial \n 2)Ruta Periferia\n 3)Regresar");
      switch (ruta) {
        case 1:
          CreacionObjetos obj = new CreacionObjetos();
          obj.crearRuta(); 
          boolean condicion1= true;
          int eleccion1=10;
          while(condicion1== true){
            ruta1=ManejadorRutas.desplegarRutasInter();
            eleccion1= GestorIO.solicitarInt(ruta1);
            if((eleccion1==0)||(eleccion1==1)||(eleccion1==2)){
              condicion1= false;
            }else{
              condicion1= true;
            }
          }//fin del while
          rutaSeleciondad = ManejadorRutas.vector[eleccion].toString();
          hora= creacionObj.mostrar();
          int cantidad = GestorIO.solicitarInt("Digite la cantidad de pasajes que desea reservar");
          RutasInterprovinciales interprovinciales = new RutasInterprovinciales();
          double compra = cantidad * interprovinciales.montoRuta();
          tipoPago(compra,cantidad,"Tren",hora,opci,rutaSeleciondad);
          break;
          
        case 2:
          //FECHA
          CreacionObjetos obj2 = new CreacionObjetos();
          obj2.crearRuta();
          int eleccion3= 0;
          boolean condicion= true;
          
          while(condicion== true){
            String ruta6=ManejadorRutas.desplegarRutasIntraCapi();
            eleccion3= GestorIO.solicitarInt(ruta6);
            if((eleccion3==3)||(eleccion3==4)||(eleccion3==5)){
              condicion= false;
            }else{
              condicion= true;
            }
          }//fin del while
          rutaSeleciondad =ManejadorRutas.vector[eleccion].toString();
          hora = creacionObj.mostrar();
          int cantidad2 = GestorIO.solicitarInt("Digite la cantidad de pasajes que desea reservar");
          RutasPeriferia periferia = new RutasPeriferia ();
          double compra2 = cantidad2 * periferia.montoRuta();
          tipoPago(compra2,cantidad2,"Tren",hora,opci,rutaSeleciondad);
          break;
        case 3:
          continuar3 = false;
          break;
          
      }// fin del switch
    }// fin del while
  }// fin de rutaTren
  
  
  public void rutaMetro(int tipoTrans,int opci, double descuento){
    String hora = " ";
    int eleccion2=0;
    CreacionObjetos obj = new CreacionObjetos();
    obj.crearRuta(); 
    boolean condicion4= true;
     while(condicion4== true){
       String ruta2=ManejadorRutas.desplegarRutasPerif();
       eleccion2= GestorIO.solicitarInt(ruta2);
      if((eleccion2==6)||(eleccion2==7)||(eleccion2==8)){
        condicion4= false;
      }else{
        condicion4= true;
      }
      }
      String rutaSeleciondad2=ManejadorRutas.vector[eleccion2].toString();
    
    hora= creacionObj.mostrar();
    int cantidad = GestorIO.solicitarInt("Digite la cantidad de pasajes que desea reservar");
    RutasPeriferia peri = new RutasPeriferia();
    double compra = cantidad * (peri.montoRuta()-(peri.montoRuta()*descuento));
    tipoPago(compra,cantidad,"Metro",hora,opci,rutaSeleciondad2);
    
  }
  
  
  public void rutaMetroSinDescuen(int tipoTrans,int opci){
    String hora = " ";
    int eleccion2= 0;
    boolean condicion= true;
    CreacionObjetos obj = new CreacionObjetos();
    obj.crearRuta();
    while(condicion== true){
      String ruta2=ManejadorRutas.desplegarRutasPerif();
       eleccion2= GestorIO.solicitarInt(ruta2);
      if((eleccion2==6)||(eleccion2==7)||(eleccion2==8)){
        condicion= false;
      }else{
        condicion= true;
      }
      }//fin del while
    String rutaSeleciondad2=ManejadorRutas.vector[eleccion2].toString();
    hora= creacionObj.mostrar();
    int cantidad = GestorIO.solicitarInt("Digite la cantidad de pasajes que desea reservar");
    RutasPeriferia peri = new RutasPeriferia();
    double compra = cantidad *peri.montoRuta();
    tipoPago(compra,cantidad,"Metro",hora,opci,rutaSeleciondad2);
    
  }
  
  public  void tipoPago(double compra,int cantidad,String tipo,String hora,int opci,String ruta){
    boolean continuar= true;
    int pago =0;
    
    while (continuar == true){
      if(opci == 2){
        pago =2;
      }else if(opci==3){
        pago = GestorIO.solicitarInt("Seleccione el tipo de pago:\n 1) Pago con efectivo en cobrador electrónico\n 2)Pago con Tarjeta \n 4) Regresar");
        if(pago ==1){
          pago = 3;
        }
      }else{
        pago = GestorIO.solicitarInt("Seleccione el tipo de pago:\n 1) Pago en efectivo \n 2)Pago con Tarjeta \n 3) Regresar");
      }
      int contador =0;
      switch (pago) {
        
        case 1:
          
          
          double montoPago = GestorIO.solicitarDouble("Digite el monto de pago");
          PagoEfectivoVentanilla pagoEfectivo = new PagoEfectivoVentanilla(montoPago);
          boolean condicion= pagoEfectivo.cobro(compra);
          
          if(condicion == true){
            for(int i =0; i<cantidad;i++){
              contador++;
              GestorIO.mostrarMensaje(pagoEfectivo.tiquete(tipo,ruta, hora,contador));
            }
          }
          
          break;
          
        case 2:
          float numTarjeta = GestorIO.solicitarFloat("Digite el Número de tarjeta");
          String fecha = GestorIO.solicitarString( "Digite la fecha de Expiración ");
          String entidad= GestorIO.solicitarString( "Digite la entidad expendedora ");
          // GestorIO.mostrarMensaje( miMain.getManejador());
          //GestorIO.mostrarMensaje("buscar" + manejador.buscarBinarioNumero(5046270600087498f));
          break;
          
        case 3 :
          PagoEfectivoCobradorElectronico cobroElectronico = new PagoEfectivoCobradorElectronico();
          String dinero = "";
          int eleccion2 = 0;
          GestorIO.mostrarMensaje("El monto a pagar es:"+compra);
           double montoPago2=0.0;
          while(montoPago2 < compra){
          dinero = "BILLETES: \n" + cobroElectronico.devolverBillete() + "\n\nMONEDAS: \n" + cobroElectronico.devolverMonedas();
          eleccion2 = GestorIO.solicitarInt(dinero);
          if(eleccion2 == 1) {
            int enu1 = billete1.getBillete();
            montoPago2 += enu1;
            System.out.println("" + enu1);
          }
          
          if(eleccion2 == 2) {
            int enu2 = billete2.getBillete();
             montoPago2 += enu2;
            System.out.println("" + enu2);
          }
          
          if(eleccion2 == 3) {
            int enu3 = billete3.getBillete();
             montoPago2 += enu3;
            System.out.println("" + enu3);
          }
          
          if(eleccion2 == 4) {
            int enu4 = billete4.getBillete();
             montoPago2 += enu4;
            System.out.println("" + enu4);
          }
          
          if(eleccion2 == 5) {
            int enu5 = billete5.getBillete();
             montoPago2 += enu5;
            System.out.println("" + enu5);
          }
        
          if(eleccion2 == 6) {
            int enu6 = moneda1.getMoneda();
             montoPago2 += enu6;
            System.out.println("" + enu6);
          }
          
          if(eleccion2 == 7) {
            int enu7 = moneda2.getMoneda();
             montoPago2 +=enu7; 
            System.out.println("" + enu7);
          }
          
          if(eleccion2 == 8) {
            int enu8 = moneda3.getMoneda();
             montoPago2 += enu8;
            System.out.println("" + enu8);
          }
          
          if(eleccion2 == 9) {
            int enu9 = moneda4.getMoneda();
             montoPago2 += enu9;
            System.out.println("" + enu9);
          }
          
          if(eleccion2 == 10) {
            int enu10 = moneda5.getMoneda();
             montoPago2 += enu10;
            System.out.println("" + enu10);
          }
          
          }//fin del while
        
         cobroElectronico.setMontoPago(montoPago2);
          boolean condicion2 = cobroElectronico.cobro(compra);
          if(condicion2 == true){
            for(int i = 0; i < cantidad; i++){
              contador++;
              GestorIO.mostrarMensaje(cobroElectronico.tiquete(tipo, ruta, hora, contador));
            }
          }
          
        case 4:
          continuar = false;
          break;          
          
      }// fin de switch 
    }// fin del while
  }// fin de tipo de pago 
  
}// fin Menu
