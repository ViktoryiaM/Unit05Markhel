package lt.lhu.unit05.main;

public class Task03 {
  public static void main(String[] args) {
    int a = 64756;
    int b = -3984789;
    int k1 = countDigits(a);
    int k2 = countDigits(b);

    if (k1 > k2) {
      System.out.println("Большее количество цифр в числе: " + a);

    } else if (k2 > k1) {
      System.out.println("Большее количество цифр в числе: " + b);

    } else {
      System.out.println("Одинаковое количество цифр!!");
    }

  }

  private static int countDigits(int a) {
    int k = 0;
    int aAbs = Math.abs(a);

    while (aAbs > 0) {
      aAbs = aAbs / 10;
      k++;
    }
    return k;
  }
}
