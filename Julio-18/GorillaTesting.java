public class GorillaTesting {

  public static void main(String[] args) {
    Gorilla kingkong = new Gorilla();
    System.out.print("ENERGIA INICIAL: ");
    kingkong.displayEnergy();
    for (int idx = 0; idx < 10; idx++) {
      kingkong.throwSomething();
    }
    System.out.print("ENERGIA DESPUES DE LANZAR: ");
    kingkong.displayEnergy();
    kingkong.eatBananas();
    kingkong.eatBananas();
    System.out.print("ENERGIA DESPUES DE COMER: ");
    kingkong.displayEnergy();
    kingkong.climb();
    kingkong.displayEnergy("ENERGIA DESPUES DE TREPAR: ");
  }
}
