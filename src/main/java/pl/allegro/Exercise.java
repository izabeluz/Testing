package pl.allegro;

public class Exercise {
  public static void main(String[] args) {
    System.out.print("Liczby podzielne przez 7 z zakresu od 13 do 170 to :");
    int licznik = 0;
    for (int i = 13; i <= 170; i++) {
      if (i % 7 == 0) {
        licznik++;
        System.out.print(i + ",");
      }
    }
    System.out.println("");
    System.out.println("Ilość liczb podzielnych przez 7 to: " + licznik);

    System.out.println("");
    System.out.println("");
    System.out.println("");

    System.out.print("Liczby podzielne przez 7 z zakresu od 13 do 170 to :");
    licznik = 0;
    for (int i = 13; i <= 170; i++) {
      if (i % 7 == 0) {// podzielne przez 7
        if (licznik % 5 == 0) {//co 5 element ma byc nowa linia
          System.out.println(""); //nowa linia
        }
        licznik++;//zwiększamy o 1

        System.out.print(i + ",");
      }
    }
    System.out.println("");
    System.out.println("Ilość liczb podzielnych przez 7 to: " + licznik);


    System.out.println("");
    System.out.println("");


    // ile liczb od 1 w góre jest potrzebnych, aaby ich suma przekroczyła wartosc 800
    // 1  = 1 , 3, 6 , 10, 15, 21, 28 ... 830
    // Potrzeba symu od 1 do 23 liczb aby przekroczyc 800
    int i = 1;
    int suma = 0;//początkowa wartość
    while (suma <= 800) {
      i++;
      suma = suma + i;

    }
    System.out.println("Aby suma liczb wyszła ponad 800 potrzeba jest liczb:" + i);
  }
}


// i     0   1   2   3   4
// suma  0   1   3   6   10





