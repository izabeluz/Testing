package pl.allegro;

public class Exercise {
  public int sum(int a, int b) {
    return a + b;
  }

  public String Text() {
    return "Ala ma kota";

  }


  /*method increaseNumber, returns nothing, accepts arguments of type int */
  public void increaseNumber(int numberBy, int start, int end) {
    System.out.print("Liczby podzielne przez " + numberBy + "z zakresu od " + start + " do " + end + " to :");
    int counter = 0;
    for (int i = start; i <= end; i++) {
      if (i % numberBy == 0) {
        counter++;
        System.out.print(i + ",");
      }

    }
    System.out.println("");//new line
    System.out.println("Ilość liczb podzielnych przez " + numberBy + " to: " + counter);
  }


  /*metoda  returns nothing, nothing accepts*/
  public void calculateNumber() {
    System.out.print("Liczby podzielne przez 7 z zakresu od 13 do 170 to :");
    int counter = 0;
    for (int i = 13; i <= 170; i++) {
      if (i % 7 == 0) {// divisible by7
        if (counter % 5 == 0) {//every 5 element is to be a new line
          System.out.println(""); //new line
        }
        counter++;//

        System.out.print(i + ",");
      }
    }
    System.out.println("");
    System.out.println("Ilość liczb podzielnych przez 7 to: " + counter);
  }


  /*method static, nothing returns, nothing accepts*/
  public static void getMaxValue() {
    int i = 1;
    int sum = 0;//value of begining
    while (sum <= 800) {//when the sum is lees than 800
      i++;
      sum = sum + i;

    }
    System.out.println("Aby suma liczb wyszła ponad 800 potrzeba jest liczb:" + i);
  }


  //create an array that contains numbers from 1 to 50
  // print even numbers, but aeach line has to have 3 digits for example,
  // 2,4,6
  // 10,12,14
  /*method nothnig return, nothing qaccepts*/
  public void getMaxNumber() {
    System.out.print("Liczby parzyste to :");
    int[] tab1 = new int[50];//board
    int counter = 0;
    for (int i = 0; i < 50; i++) {
      tab1[i] = i + 1;
      if (tab1[i] % 2 == 0) {//even board will have even numbers
        if (counter % 3 == 0) {//new line every 3 elemts
          System.out.println("");//new line
        }
        counter++;
        System.out.print(tab1[i] + ",");//print board
      }
    }
    System.out.println("");
  }


  /*method return result, method accepts argument type int*/
  public double getTriangleArea(int a, int h) {
    return a * h * 0.5;

  }

  /*method return result, method accepts arguments type int*/
  public int getTriangleCircut(int a, int b, int c) {
    return a + b + c;
  }


  /*method return max numbers, method accepts board of int*/
  public int getMaximumNumber(int numbers[]) {
    int max = numbers[0];//value with zero index, first value
    for (int i = 0; i < numbers.length; i++) {// crossing the board
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }
    return max;

  }

  /*method return min numbers, method accepts argumnets type int */
  public int getMinimumNumber(int numbers[]) {
    int min = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < min) {
        min = numbers[i];
      }

    }
    return min;
  }


  /*method return sum of average numbers, accepts arguments type int*/
  public double getAverageNumber(int numbers[]) {
    int average = numbers[0];
    double sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum = sum + numbers[i];
    }
    sum = sum / numbers.length;//sum divided by an array of numbers

    return sum;

  }

  /*method return result of mathematical operation, accepts argumments type dupble*/
  public double getCalculateCostOfTravel(double a, double b, double c, double d) {
    return (a * b / c) * d;


  }

  /*method return result of mathematical operation, accepts arguments type int*/
  public int getCalculateNumbers(int a, int b, int c) {
    return a + b + c;
  }

  /*method return savings, accepts arguments type int*/
  public double getCalculateSavings(int money, int time, double procent) {
    return (money * procent) / 100 * time + money;
  }


}













