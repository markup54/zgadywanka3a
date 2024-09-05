import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj świecie");
        System.out.println("na lekcji programowania");

        int wylosowana = (int)(Math.random()*10+1);//rzutowanie
        System.out.println(wylosowana);
        /*
        typy proste zawsze z małej litery, mają tylko wartość
        logiczny: boolean
        całkowite: byte, short, int, long
        rzeczywiste: float,double
        znakowy: char

        typy złożone zawsze pisane wielką literą
        obiekty które mją wląsności i metody
         */
        System.out.println("zgadnij liczbe z zakresu 1,10");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaLiczba = klawiatura.nextInt();//wczytywanie z kawiatury liczby całkowitej
        System.out.println("Wpisano z klawiatury "+wpisanaLiczba);

        if(wpisanaLiczba == wylosowana){
            System.out.println("Trfiona liczba");
        }
        else{
            System.out.println("Nie trafiono spróbuj ponownie");
        }

    }
}