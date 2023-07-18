import java.util.ArrayList;

public class Mascota {

  /* Atributos de clase */

  private static int cantidad = 0;

  private static ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

  /*Atributos de instancia */
  private String especie;
  private int edad;
  private String tamano;

  /*Constructor  con sobre carga*/

  public Mascota(String especie_init, int edad_init, String tamano_init) {
    this.especie = especie_init;
    this.edad = edad_init;
    this.tamano = tamano_init;

    cantidad++;
    mascotas.add(this);
  }

  public Mascota() {
    this.especie = "Chinchilla";
    this.edad = 0;
    this.tamano = "pequeno";

    cantidad++;
    mascotas.add(this);
  }

  /*Getters y Setters */

  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String value) {
    especie = value;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int value) {
    edad = value;
  }

  public String getTamano() {
    return tamano;
  }

  public void setTamano(String value) {
    tamano = value;
  }

  /* Metodos de instancia */
  public void cumplir_edad() {
    edad++;
  }

  public void hacer_ruido() {
    System.out.println("GUAU");
  }

  /* Getter de Clase */

  public static int getCantidad() {
    return cantidad;
  }

  public static ArrayList<Mascota> getMascotas() {
    return mascotas;
  }
}
