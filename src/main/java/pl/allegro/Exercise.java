package pl.allegro;

public class Exercise {
  public int sum(int a, int b) {//dwa dowolne parametry
    return a + b;// zwracanie dwóch parametrów
  }

  public String test() {
    return "Ala ma kota";

  }


  public void increaseNumber(int numberBy, int start, int end) {//metoda main, parametry podane
    System.out.print("Liczby podzielne przez " + numberBy + "z zakresu od " + start + " do " + end + " to :");
    int licznik = 0;
    for (int i = start; i <= end; i++) {//pętla
      if (i % numberBy == 0) {//warunek dla dowolnej zmiennej
        licznik++;//zwiekszanie zmiennej
        System.out.print(i + ",");//wydrukowanie warunku
      }//

    }
    System.out.println("");//nowa linia
    System.out.println("Ilość liczb podzielnych przez " + numberBy + " to: " + licznik);
  }


  public void calculateNumber() {//metoda counter
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
  public static void getMaxValue() {
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
  public void getMaxNumber() {
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


  public double getTriangleArea(int a, int h) {
    return a * h * 0.5;

  }

  public int getTriangleCircut(int a, int b, int c) {
    return a + b + c;
  }

  public int getMaximumNumber(int numbers[]) {//tablica intów
    int max = numbers[0];//wartosc z indeksem zerowym, pierwsza wartosc
    for (int i = 0; i < numbers.length; i++) {// przejscie po całej tablicy
      if (numbers[i] > max) {
        ;//jesli element tablicy jest wiekszy niz max ,
        max = numbers[i];//przypisaniie elkementu do max
      }
    }
    return max;

  }

  public int getMinimumNumber(int numbers[]) {
    int min = numbers[0];//indesk zerowy
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < min) {//jesli element tablicy mniejszy niz min
        min = numbers[i];//przypisanie elementu do min
      }

    }
    return min;
  }


  public double getAverageNumber(int numbers[]) {
    int average = numbers[0];
    double sum = 0;//przypisanie zmiennej typu double do wartsoci
    for (int i = 0; i < numbers.length; i++) {
      sum = sum + numbers[i];
    }
    sum = sum / numbers.length;//suma podzilena przez tablice liczb

    return sum;

  }


  public double getCalculateCostOfTravel(double a, double b, double c, double d) {
    return (a * b / c) * d;


  }

  public int getCalculateNumbers(int a, int b, int c) {
    return a + b + c;
  }

}













