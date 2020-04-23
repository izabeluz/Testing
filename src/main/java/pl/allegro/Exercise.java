package pl.allegro;

public class Exercise {
  public  void increaseNumber(String[] args) {//metoda main,
    System.out.print("Liczby podzielne przez 7 z zakresu od 13 do 170 to :");
    int licznik = 0;
    for (int i = 13; i <= 170; i++) {//pętla
      if (i % 7 == 0) {//warunek
        licznik++;//zwiekszanie zmiennej
        System.out.print(i + ",");//wydrukowanie warunku
      }
    }
    System.out.println("");//nowa linia
    System.out.println("Ilość liczb podzielnych przez 7 to: " + licznik);
  }


  public  void calculateNumber(String[] args) {//metoda counter
    System.out.print("Liczby podzielne przez 7 z zakresu od 13 do 170 to :");
    int licznik = 0;
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
  }


  // ile liczb od 1 w góre jest potrzebnych, aaby ich suma przekroczyła wartosc 800
  // 1  = 1 , 3, 6 , 10, 15, 21, 28 ... 830
  // Potrzeba symu od 1 do 23 liczb aby przekroczyc 800
  public void getMaxValue(String[] args) {
    int i = 1;
    int suma = 0;//początkowa wartość
    while (suma <= 800) {//kiedy suma jest mniejsza rowna 800
      i++;
      suma = suma + i;

    }
    System.out.println("Aby suma liczb wyszła ponad 800 potrzeba jest liczb:" + i);
  }
  // i     0   1   2   3   4
// suma  0   1   3   6   10


  //stwórz tablice, która zawiera liczby od 1 do 50
  // wypisz liczby parzyste, z tym ze kazda linia ma miec 3 cyfry np
  // 2,4,6
  // 10,12,14
  public  void getMaxNumber(String[] args) {
    System.out.print("Liczby parzyste to :");
    int[] tab1 = new int[50];//tablica
    int licznik = 0;
    for (int i = 0; i < 50; i++) {
      tab1[i] = i + 1;
      if (tab1[i] % 2 == 0) {//jesli tablica bedzie miała liczby parzyste
        if (licznik % 3 == 0) {//nowa lini aco 3 element
          System.out.println("");//nowa linia
        }
        licznik++;
        System.out.print(tab1[i] + ",");//drukowanie tablicy
      }
    }
    System.out.println("");
  }
}







