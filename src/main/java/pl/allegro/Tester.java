package pl.allegro;

public class Tester {
  public static void main(String[] args) {
    Exercise exercise1 = new Exercise();//jeden objekt
//    exercise1.calculateNumber();//wywolanei metody na obiekcie zwykle
//    exercise1.getMaxNumber();
//    Exercise.getMaxValue();//static na klasie wywołana- statyczne
//    exercise1.increaseNumber();//
    int suma1 = exercise1.sum(10, 20);
    int suma2 = exercise1.sum(30, 50);
//    System.out.println(exercise1.sum(suma1, suma2));
//    System.out.println(exercise1.test());
    // napisz mi liczbu podzielne przez 13 od 20 do 3000
    exercise1.increaseNumber(13, 20, 3000);//


  }
}
