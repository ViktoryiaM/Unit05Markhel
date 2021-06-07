package lt.lhu.unit05.main;

import java.util.Random;

public class Task04 {
  public static void main(String[] args) {
    int[] mas = new int[10];

    Random rand = new Random();
    for (int i = 0; i < mas.length; i++) {
      mas[i] = rand.nextInt(100);
      System.out.print(" " + mas[i]);
    }
    System.out.print("\n");
    System.out.println(sumOfThree(mas, 1));
    System.out.println(sumOfThree(mas, 3));
    System.out.println(sumOfThree(mas, 4));
  }

  public static int sumOfThree(int[] mas, int k) {
    int sum = -1;
    if (k > 0 && (k + 2) < mas.length) {
      sum = mas[k] + mas[k + 1] + mas[k + 2];
    } else {
      System.out.println("Вы вышли за границы массива!!!");
    }
    return sum;
  }
}
