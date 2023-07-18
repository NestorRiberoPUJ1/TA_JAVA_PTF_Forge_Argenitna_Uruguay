import java.util.ArrayList;
import java.util.Collections;

public class Primera {

  public static void main(String[] args) {
    /*
     * var a=5;
     * var b=8;
     * console.log(a+b)
     */
    //PRIMITIVAS
    int a = 5;
    int b = 8;
    System.out.println(a + b);
    char genero = 'm';
    double c = 2.2;
    boolean k = false;

    int[] nums = { 1, 2, 3, 4, 5 };
    char[] palabra = { 'p', 'e', 'r', 'r', 'o' };

    int[] edades = new int[5];

    //No PRIMITIVAS
    Integer numero_suerte = 5;

    String nombre = "Nestor";

    Double[] lista_nums = { 1.0, 2.8, 3.42 };

    //Listas de arreglos y los mapas de hash

    ArrayList<Integer> myArray = new ArrayList<Integer>();

    myArray.add(1);
    myArray.add(2);
    myArray.add(3);
    myArray.add(4);

    myArray.remove(3);

    ArrayList<Integer> numeros = new ArrayList<Integer>();
    numeros.add(5);
    numeros.add(4);
    numeros.add(3);
    numeros.add(2);
    numeros.add(1);

    Collections.shuffle(numeros);
    System.out.println(numeros); // [5, 4, 3, 2, 1]
  }
}
