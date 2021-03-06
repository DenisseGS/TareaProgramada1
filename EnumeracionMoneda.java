
public enum EnumeracionMoneda {
  
  DIEZ(10, "colones"), VEINTICINCO(25, "colones"), CINCUENTA(50, "colones"), CIEN(100, "colones"), QUINIENTOS(500, "colones");
  
  private int moneda; // Variable para almacenar
  private String tipo; // Variable para almacenar
  
  private EnumeracionMoneda(int moneda, String tipo) {
    this.moneda = moneda;
    this.tipo = tipo;
  }
  
  public int getMoneda() {
    return moneda;
  }
  
  public String getTipo() {
    return tipo;
  }
} // fin EnumeracionMoneda
