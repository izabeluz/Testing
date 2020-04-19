package pl.allegro;

public class Test2 {
    public static void main(String[] args) {
        System.out.print("Liczby podzielne przez 7 z zakresu od 13 do 170 to: ");
        for (int i = 13; i <= 170; i++) {
            if (i % 7 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println("");
        System.out.println("Ilość liczb podzielnych przez 7 to :");


    }
}

