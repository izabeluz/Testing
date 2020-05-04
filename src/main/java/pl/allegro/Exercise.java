package pl.allegro;

public class Exercise {
  public int sum(int a, int b) {
    return a + b;
  }

  public String Text() {
    return "Ala ma kota";

  }


  public void increaseNumber(int numberBy, int start, int end) {/*method increaseNumber, returns nothing, accepts arguments of type int **/
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


  public void calculateNumber() {/*metoda counter returns nothing, nothing accepts*/
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


  public static void getMaxValue() {/*method static, nothing returns, nothing accepts*/
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
  public void getMaxNumber() {/*method nothnig return, nothing qaccepts*/
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


  public double getTriangleArea(int a, int h) {/*method return result, method accepts argument type int*/
    return a * h * 0.5;

  }

  public int getTriangleCircut(int a, int b, int c) {/*method return result, method accepts arguments type int*/
    return a + b + c;
  }

  public int getMaximumNumber(int numbers[]) {/*method return max numbers, method accepts board of int*/
    int max = numbers[0];//value with zero index, first value
    for (int i = 0; i < numbers.length; i++) {// crossing the board
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }
    return max;

  }

  public int getMinimumNumber(int numbers[]) {/*method return min numbers, method accepts argumnets type int */
    int min = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < min) {
        min = numbers[i];
      }

    }
    return min;
  }


  public double getAverageNumber(int numbers[]) {/*method return sum of average numbers, accepts arguments type int*/
    int average = numbers[0];
    double sum = 0;//przypisanie zmiennej typu double do wartsoci
    for (int i = 0; i < numbers.length; i++) {
      sum = sum + numbers[i];
    }
    sum = sum / numbers.length;//sum divided by an array of numbers

    return sum;

  }


  public double getCalculateCostOfTravel(double a, double b, double c, double d) {/*method return result of mathematical operation, accepts argumments type dupble*/
    return (a * b / c) * d;


  }

  public int getCalculateNumbers(int a, int b, int c) {/*method return result of mathematical operation, accepts arguments type int*/
    return a + b + c;
  }

  public double getCalculateOfMoney(double a, double b, double c) {
    return (a * b) * c + a;
  }


}













