import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    BasicJava basic = new BasicJava();

    // Imprimir 1 - 255
    // basic.exerciseOne();

    // Imprimir la Suma
    // basic.exerciseTwo();

    // Recorrer un Arreglo
    int[] arrThree = { 1, 3, 5, 7, 9, 13 };
    // basic.exerciseThree(arrThree);

    // Encontrar el Máximo
    int[] arrFour = { -3, -5, -7 };
    // basic.exerciseFour(arrFour);

    // Obtener el Promedio
    int[] arrFive = { 2, 10, 3 };
    // basic.exerciseFive(arrFive);

    // Arreglo con Números Impares
    // basic.exerciseSix();

    // Mayor que Y
    int[] arrSeven = { 1, 3, 5, 7 };
    // basic.exerciseSeven(arrSeven, 3);

    // Valores al Cuadrado
    int[] arrEight = { 1, 5, 10, -2 };
    // basic.exerciseEight(arrEight);

    // Eliminar Números Negativos
    int[] arrNine = { 1, 5, 10, -2 };
    // basic.exerciseNine(arrNine);

    // Mínimo, Máximo y Promedio
    int[] arrTen = { 1, 5, 10, -2 };
    //  double[] resultTen = basic.exerciseTen(arrTen);
    //  System.out.println("Resultado: " + Arrays.toString(resultTen));

    // Cambiando los Valores del Arreglo
    int[] arrEleven = { 1, 5, 10, -2 };
    basic.exerciseEleven(arrEleven);
    // System.out.println("Arreglo modificado: " + Arrays.toString(arrEleven));
  }
}
