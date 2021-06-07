package lt.lhu.unit05.main;

public class Task01 {
  public static void main(String[] args) {

    int A = 35;
    int B = 7;

    int nod = searchNOD(A, B);
    System.out.println("НОД(А, В) = " + nod);

    int nok = searchNOK(A, B, nod);
    System.out.println("НОК(А, В) = " + nok);
  }

  public static int searchNOK(int A, int B, int nod) {
    return ((A * B) / nod);

  }

  public static int searchNOD(int A, int B) {
    while (A != B) {
      if (A > B) {
        A = A - B;
      } else {
        B = B - A;
      }
    }
    return A;
  }
}
