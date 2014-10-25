
public enum EnumeracionBillete {
  
  MIL(1000), DOSMIL(2000), CINCOMIL(5000), DIEZMIL(10000), VEINTEMIL(20000);
  
  private int billete; // Variable para almacenar
  
  EnumeracionBillete(int billete) {
    this.billete = billete;
  }
  
  public double getBillete() {
    return billete;
  }
} // fin EnumeracionBillete