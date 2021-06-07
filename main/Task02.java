package lt.lhu.unit05.main;

public class Task02 {
  public static void main(String[] args) {
    int a = 57;
    int b = 466;
    int c = 2;

    System.out.println(maxValue(a, b, c) + minValue(a, b, c));
  }

  public static int minValue(int a, int b, int c) {
    int min;
    if (a > b && b > c) {
      min = c;
    } else if (b > a && c > a) {
      min = a;
    } else {
      min = b;
    }
    return min;
  }

  public static int maxValue(int a, int b, int c) {
    int max;
    if (a > b && b > c) {
      max = a;
    } else if (b > a && c > a) {
      max = b;
    } else {
      max = c;
    }
    return max;
  }
}
