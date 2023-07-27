public class Gorilla extends Mamifero {

  public void throwSomething() {
    this.setEnergia(this.getEnergia() - 5);
  }

  public void eatBananas() {
    this.setEnergia(this.getEnergia() + 10);
  }

  public void climb() {
    this.setEnergia(this.getEnergia() - 10);
  }
}
