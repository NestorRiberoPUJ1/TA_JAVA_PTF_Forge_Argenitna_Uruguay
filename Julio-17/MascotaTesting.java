public class MascotaTesting {

  public static void main(String[] args) {
    System.out.println(Mascota.getCantidad());
    Mascota pluto = new Mascota("Perro", 8, "Grande");

    System.out.println(pluto.getEspecie());
    System.out.println(pluto.getEdad());
    pluto.setEdad(pluto.getEdad() + 1);
    System.out.println(pluto.getEdad());
    pluto.cumplir_edad();
    System.out.println(pluto.getEdad());

    System.out.println(pluto);
    System.out.println(Mascota.getCantidad());
    new Mascota();
    System.out.println(Mascota.getCantidad());
     System.out.println(Mascota.getMascotas());
  }
}
