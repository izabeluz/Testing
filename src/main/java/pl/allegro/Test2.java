package pl.allegro;

public class Test2 {
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
      if (i % 7 == 0) {// podzilene przez 7
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
}


