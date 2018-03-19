/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author LamaR
 */
import java.util.*;
public class Main {

    public static int potegaR(int a, int b) {                                        //potegowanie rekurencyjnie
        if (b == 0) {
            return 1;
        }
        return a * potegaR(a, b - 1);

    }
    public static int potegaI(int a, int b){
        int p=1;                                                                
        for(int i=0;i<b;i++){
            p=a*p;
        }
        return p;
    }
    public static int cFib(int c){
        if(c==0){
            return 0;
        }
        if(c==1){
            return 1;
        }
        return cFib(c-1)+cFib(c-2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        Scanner in = new Scanner(System.in);
        //1.4
        System.out.println("Zadanie 1.4:");
        System.out.println("9 << 4 = " + (9 << 4));                             //lewe przesuniecie ze znakiem, w tym przypadku liczba 9 jest pomnożona przez 2^4 co w systemie dziesiętnym daje 9*16 = 144
        System.out.println("9 >> 2 = " + (9 >> 2));                               //prawe przesuniecie ze znakiem, w tym przypadku liczba 9 jest podzielona przez 2^2, bez reszty. Daje to wynik róny 2
        System.out.println(" 9 >>> 2 = " + (9 >>> 2));
        System.out.println("-9 >>> 2 = " + (-9 >>> 2));
        /* nie za bardzo rozumiem jak miałoby to być ukazane w praktyce więc 
        to co wyżej to jedyne co mi przychodzi do głowy
         */
        // 1.7
        // Operatory XOR oraz NOT reprezentowane są przez odpowiednio "^", oraz "!"
        System.out.println("zadanie 1.7");
        boolean a = false;
        boolean b = true;
        if (a ^ b) {
            System.out.println(" '^' zwraca wartosc '1' wtedy i tylko wtedy gdy wartosci dla obydwu zmiennych sa od siebie rozne  ");
        }
        boolean c = true;
        boolean d = !c;
        boolean e = !d;
        if (c ^ d) {
            System.out.println("Tutaj mozna zauwazyc ze gdy wartosc c jest rozna od d, a ustalona za pomoca zaprzeczenia badz negacji to XOR zwraca rowniez 1");
        }
        if (c ^ e) {
            System.out.println("Ta linijka nie pojawi sie po uruchomieniu programu poniewaz obydwie zmienne maja wartosc true");
        }
        System.out.println("Zadanie 2.2");
        System.out.println("toCharArray() zamienia napis ze Stringa na nową tablice typu char[]");
        String pierwsze = "jd";

        char[] z = pierwsze.toCharArray();
        for (int i = 0; i < 2; i++) {
            System.out.print(" " + z[i]);
        }
        System.out.println("");

        System.out.println("getBytes() zwraca tablice typu byte z danego napisu");

        byte[] x = pierwsze.getBytes();
        for (int i = 0; i < 2; i++) {
            System.out.print(" " + x[i]);
        }
        System.out.println("");
        System.out.println("boolean equals(String str) zwraca true jesli 2 zmienne typu String sa rowne");
        String c1 = "jd";
        String c2 = "jd";

        if (c1.equals(c2)) {
            System.out.println("dwa napisy sa rowne");
        }
        System.out.println("");
        System.out.println("boolean equalsIgnoreCase(String str)podobnie jak poprzednia metoda,tylko ignoruje wielkosc liter ");
        String d1 = "JD";
        String d2 = "Jd";
        if (d1.equalsIgnoreCase(d2)) {
            System.out.println("dwa napisy sa rowne");
        }
        System.out.println("int campareTo(String str)porownoje dwa stringi i zwraca wartosc w zaleznosci od wartosci leksograficznej");
        String e1 = "jSd";
        String e2 = "jdSAd";
        int wynik1 = e1.compareTo(e1);
        int wynik2 = e1.compareTo(e2);
        System.out.println("jak sa takie same " + wynik1 + " jak pierwszy jest wiekszy " + wynik2);
        System.out.println("int campareToIgnoreCase(String str),podobnie jak wczensiejsza metoda tylko ignoruje wielkosc liter");
        int wynik3 = e1.compareToIgnoreCase(e1);
        int wynik4 = e1.compareToIgnoreCase(e2);
        System.out.println("jak sa takie same " + wynik3 + "jak pierwszy jest wiekszy " + wynik4);
        System.out.println("int indexOf(int i),wyszukuje w zmiennej String podany przez nas znak.Zwraca index pierwszego podanego znaku ");
        String nazwa = "rzeszow";
        int wynik5 = nazwa.indexOf('z');
        System.out.println(wynik5);
        System.out.println("int lastIndexOf(int i) działa podobnie jak wczesniejsza metoda,jednak wyswietla index ostatniego podanego znaku");
        int wynik6 = nazwa.lastIndexOf('z');
        System.out.println(wynik6);
        System.out.println("String substring(int startString, int stopString),metoda zwraca czesc wartosc zmiennej typu string(w zaleznosci od tego co podamy w nawiasie)");
        System.out.println(nazwa.substring(0, 3));
        System.out.println("String replace(char orginal, char zamiennik),metoda zamienia okreslony znak,podanym przez nas znakiem(np.z na c)");
        System.out.println(nazwa.replace('z', 'c'));
        System.out.println("String trim(),metoda usuwa indexy na poczatku i koncu zmiennej typu string");
        System.out.println(nazwa.trim());
        System.out.println("String toLowerCase(),metoda zamienia wszystkie litery na male");
        System.out.println(nazwa.toLowerCase());
        System.out.println("String toUpperrCase(),metoda zamienia wszystkie litery na male");
        System.out.println(nazwa.toUpperCase());
        System.out.println("String[] split(String regex),rozdziela String na mniejsze od podanego przez nas znaku");
        for (String retval : nazwa.split("r")) {
            System.out.println(retval);
        }
        //Wywolanie zadania 3.3 
        System.out.println("Podaj liczbe");
        int g = in.nextInt();
        System.out.println("Teraz poddaj do ktorej potegi chcesz ja podniesc");
        int p = in.nextInt();
        System.out.println("Rekurencyjnie: " + g + "^" + p + " = " + potegaR(g,p));
        System.out.println("Iteracyjnie: " + g + "^" + p + " = " + potegaI(g,p));
        //wywolanie zadania 3.4
        System.out.println("Podaj ktora z kolei liczbe z ciagu fibonacciego chcesz otrzymac");
        int f = in.nextInt();
        System.out.println(f + " liczba tego ciagu jest: " + cFib(f));

    }

}
