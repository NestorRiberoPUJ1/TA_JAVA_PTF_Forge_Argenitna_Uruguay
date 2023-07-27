public class Mamifero {

  private int energia;

  /* Constructor */
  public Mamifero() {
    this.energia = 100;
  }

  /* Método */
  public int displayEnergy() {
    System.out.println(energia);
    return energia;
  }

  public int displayEnergy(String prefix) {
    System.out.print(prefix);
    System.out.println(energia);
    return energia;
  }

  public int getEnergia() {
    return energia;
  }

  public void setEnergia(int energia) {
    this.energia = energia;
  }
}
