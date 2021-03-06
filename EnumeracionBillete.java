
public enum EnumeracionBillete {
  
  MIL(1000, "colones"), DOSMIL(2000, "colones"), CINCOMIL(5000, "colones"), DIEZMIL(10000, "colones"), VEINTEMIL(20000, "colones");
  
  private int billete; // Variable para almacenar
  private String tipo; // Variable para almacenar
  
  private EnumeracionBillete(int billete, String tipo) {
    this.billete = billete;
    this.tipo = tipo;
  }
  
  public int getBillete() {
    return billete;
  }
  
  public String getTipo() {
    return tipo;
  }
} // fin EnumeracionBillete