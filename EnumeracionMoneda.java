
public enum EnumeracionMoneda {
  
  DIEZ(10), VEINTICINCO(25), CINCUENTA(50), CIEN(100), QUINIENTOS(500);
  
  private int moneda; // Variable para almacenar
  
  EnumeracionMoneda(int moneda) {
    this.moneda = moneda;
  }
  
  public double getMoneda() {
    return moneda;
  }
} // fin EnumeracionMoneda
