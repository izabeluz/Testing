package pl.allegro;

public class Test3 {
  public static void main(String[] args) {
    //stwórz tablice, która zawiera liczby od 1 do 50
    // wypisz liczby parzyste, z tym ze kazda linia ma miec 3 cyfry np
    // 2,4,6
    // 10,12,14
    System.out.print("Liczby parzyste to :");
    int[] tab1 = new int[50];
    int licznik = 0;
    for (int i = 0; i < 50; i++) {
      tab1[i] = i + 1;
      if (tab1[i] % 2 == 0) {
        if (licznik % 3 == 0) {
          System.out.println("");
        }
        licznik++;
        System.out.print(tab1[i] + ",");
      }
    }

  }
}
