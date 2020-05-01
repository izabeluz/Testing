package pl.allegro;

import java.awt.*;

public class Tester {
  public static void main(String[] args) {
    Exercise exercise1 = new Exercise();//jeden objekt
//    exercise1.calculateNumber();//wywolanei metody na obiekcie zwykle
//    exercise1.getMaxNumber();
//    Exercise.getMaxValue();//static na klasie wywołana- statyczne
//    exercise1.increaseNumber();//
//    int suma1 = exercise1.sum(10, 20);
//    int suma2 = exercise1.sum(30, 50);
//    System.out.println(exercise1.sum(suma1, suma2));
//    System.out.println(exercise1.test());
    // napisz mi liczbu podzielne przez 13 od 20 do 3000
    //exercise1.increaseNumber(13, 20, 3000);//
//    double calculation = exercise1.getTriangleArea(10, 15);
//    System.out.println(calculation);
//    System.out.println(exercise1.getTriangleCircuit(5, 10, 15));
    int tab[] = new int[] {2, 6, 8, 9, 21, 21, 20, 69, 58};
    exercise1.getMaximumNumber(tab);
    System.out.println(exercise1.getMaximumNumber(tab));
    exercise1.getMinimumNumber(tab);
    System.out.println(exercise1.getMinimumNumber(tab));
    exercise1.getAverageNumber(tab);
    System.out.println(exercise1.getAverageNumber(tab));
    exercise1.getCalculateNumbers(7, 20, 55);
    exercise1.getCalculateCostOfTravel(372, 5.5, 100, 3.79);
    System.out.println(exercise1.getCalculateCostOfTravel(372, 5.5, 100, 3.79));


  }
}
