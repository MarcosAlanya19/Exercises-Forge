import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
  void exerciseOne() {
    ArrayList<Integer> numbers = new ArrayList<>();
    for (int i = 1; i <= 255; i++) {
      numbers.add(i);
    }

    System.out.println(numbers);;
  }

  void exerciseTwo() {
    int sum = 0;
    for (int i = 0; i <= 255; i++) {
      sum += i;
      System.out.println("Nuevo numero: " + i + " Suma: " + sum);
    }
  }

  void exerciseThree(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  void exerciseFour(int[] arr) {
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    System.out.println("El valor máximo en el arreglo es: " + max);
  }

  void exerciseFive(int[] arr) {
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }

    double average = (double) sum / arr.length;
    System.out.println("Promedio de " + average);
  }

  void exerciseSix() {
    ArrayList<Integer> y = new ArrayList<>();

    for (int i = 1; i <= 255; i += 2) {
      y.add(i);
    }
    System.out.print(y);
  }

  void exerciseSeven(int[] arr, int y) {
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > y) {
        count++;
      }
    }

    System.out.println(count);
  }


  void exerciseEight(int[] arr) {
    int[] squaredArr = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      squaredArr[i] = arr[i] * arr[i];
    }

    System.out.println(Arrays.toString(squaredArr));
  }

  void exerciseNine(int[] arr) {
    int[] modifiedArr = Arrays.copyOf(arr, arr.length);

    for (int i = 0; i < modifiedArr.length; i++) {
      if (modifiedArr[i] < 0) {
        modifiedArr[i] = 0;
      }
    }

    System.out.println(Arrays.toString(modifiedArr));
  }

  double[] exerciseTen(int[] arr) {
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    double suma = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > maximo) {
        maximo = arr[i];
      }
      if (arr[i] < minimo) {
        minimo = arr[i];
      }
      suma += arr[i];
    }

    double promedio = suma / arr.length;

    return new double[] { maximo, minimo, promedio };
  }

  void exerciseEleven(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[arr.length - 1] = 0;
  }
}
