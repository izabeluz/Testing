package pl.allegro;

public class Test2 {

  public static void main(String[] args) {
    System.out.print("Liczby podzielne przez 7 z zakresu od 13 do 170 to: ");
    int licznik = 0;
    for (int i = 13; i <= 170; i++) {
      if (i % 7 == 0) {
        licznik++;
        System.out.print(i + ",");
      }
    }

    System.out.println("");
    System.out.println("Ilość liczb podzielnych przez 7 to :" + licznik);

    System.out.println("");
    System.out.println("");
    System.out.println("");

    System.out.print("Liczby podzielne przez 7 z zakresu od 13 do 170 to: ");
    licznik = 0;
    for (int i = 13; i <= 170; i++) {
      if (i % 7 == 0) {
        if (licznik % 5 == 0) {
          System.out.println("");
        }
        licznik++;
        System.out.print(i + ",");
      }
    }

    System.out.println("");
    System.out.println("Ilość liczb podzielnych przez 7 to :" + licznik);

    System.out.println("");
    System.out.println("");

    // ile liczb od 1 w góre jest potrzebnych, aaby ich suma przekroczyła wartosc 1000
    // 1  = 1 , 3, 6 , 10, 15, 21, 28 ... 1023
    // Potrzeba symu od 1 do 23 liczb aby przekroczyc 1000


    int suma = 0;
    int i = 1;

    while (suma <= 1000) {
      i++;
      suma = suma + i;
    }

    System.out.println("Aby suma liczb wyszła 1000 potrzeba ich :" + i);

    // i     0   1   2   3   4
    // suma  0   1   3   6   10
  }
}

