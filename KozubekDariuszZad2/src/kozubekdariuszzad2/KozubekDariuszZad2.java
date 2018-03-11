package kozubekdariuszzad2;

import java.util.Scanner;

public class KozubekDariuszZad2 {
    private static void zadanie1(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("[ Zadanie 1 ]");
        System.out.print("podaj wartosc liczby a: ");
        double liczbaA = scanner.nextInt();
        
        System.out.print("podaj wartosc liczby b: ");
        double liczbaB = scanner.nextInt();
        
        System.out.print("podaj wartosc liczby c: ");
        int liczbaC = scanner.nextInt();
        
        double delta = liczbaB * liczbaB - (4 * liczbaA * liczbaC);
        System.out.println("Delta wynosi: " + delta);
        
        if (delta > 0){
            double x1 = ( -1 * liczbaB - Math.sqrt(delta) ) / 2 * liczbaA;
            double x2 = ( -1 * liczbaB + Math.sqrt(delta) ) / 2 * liczbaA;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }else if (delta == 0){
            double x = (-1 * liczbaB) / (2 * liczbaA);
            System.out.println("x = " + x);
        }else System.out.println("Brak rozwiazan");
        
    }
    
    private static void zadanie2dodawanie(){
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        double skladnik = 1;
        
        
        
        while(skladnik != 0){
            System.out.print("podaj wartosc skladnika sumy (0 konczy sumowanie): ");
            skladnik = scanner.nextDouble();
            if (skladnik != 0) suma = suma + skladnik;
        }
        System.out.println("Wynik sumowania wynosi: " + suma);
    }
    
    private static void zadanie2odejmowanie(){
        Scanner scanner = new Scanner(System.in);
        double roznica = 0;
        double odjemnik = 1;
        
        System.out.print("podaj wartosc odjemnika roznicy (0 konczy odejmowanie): ");
        roznica = scanner.nextDouble();
        
        while (odjemnik != 0){
            System.out.print("podaj wartosc odjemnika roznicy (0 konczy odejmowanie): ");
            odjemnik = scanner.nextDouble();
            if (odjemnik != 0) roznica = roznica - odjemnik;
        }
        System.out.println("Wynik odejmowania wynosi: " + roznica);
    }
    
    private static void zadanie2mnozenie(){
        Scanner scanner = new Scanner(System.in);
        double iloczyn = 1;
        double czynnik = 1;
        
        while (czynnik != 0){
            System.out.print("podaj wartosc czynnika iloczynu (0 konczy mnozenie): ");
            czynnik = scanner.nextDouble();
            if (czynnik != 0) iloczyn = iloczyn * czynnik;
        }
        System.out.println("Wynik mnozenia wynosi: " + iloczyn);
    }
    
    private static void zadanie2dzielenie(){
        Scanner scanner = new Scanner(System.in);
        double dzielna;
        double dzielnik = 1;
        System.out.print("Podaj liczbe, ktora ma zostac podzielona: ");
        dzielna = scanner.nextDouble();
        System.out.print("Podaj dzielnik: ");
        dzielnik = scanner.nextDouble();
        System.out.println("Wynik dzialania " + dzielna + " / " + dzielnik + " to " + (dzielna / dzielnik));
    }
    
    private static void zadanie2potegowanie(){
        Scanner scanner = new Scanner(System.in);
        double liczba;
        double wynik = 1;
        int potega;
        System.out.print("Podaj liczbe potegowana: ");
        liczba = scanner.nextDouble();
        System.out.print("Podaj wykladnik potegi: ");
        potega = scanner.nextInt();
        
        if  (potega != 0){
            for (int i = 0; i < potega; i++){
                wynik = wynik * liczba;
            }
        }
        System.out.println("Liczba " + liczba + " podniesiona do potegi " + potega + " wynosi " + wynik);
        
    }
    
    private static void zadanie2pierwiastkowanie() {
        Scanner scanner = new Scanner(System.in);   
        
        double liczba;
        double stopien;
        
        System.out.print("Podaj liczbe do pierwiastkowania: ");
        liczba = scanner.nextDouble();
        double wynik = liczba;
        
        System.out.print("Podaj stopien pierwiastka: ");
        stopien = scanner.nextDouble();
        
        double tmp = Math.pow(liczba, (stopien-1));
        double dokladnosc = 0.00000001;
        
        while (Math.abs(liczba - tmp * wynik)>=dokladnosc){
            wynik = 1/stopien*((stopien-1)*wynik + (liczba/tmp));
            tmp = Math.pow(wynik,stopien-1);
        }
        
        System.out.println("Pierwiastek stopnia " + stopien + " z liczby " + liczba + " wynosi: " + wynik);
    }
    
    private static void zadanie2tryg(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wartosc kata: ");
        double kat = scanner.nextDouble();
        int funkcja;
        
        System.out.println("Wybierz funkcje trygonometryczna: ");
        System.out.println("[ 1 ] Sinus");
        System.out.println("[ 2 ] Cosinus");
        System.out.println("[ 3 ] Tangens");
        System.out.println("[ 4 ] Cotangens");
        System.out.print("-> ");
        funkcja = scanner.nextInt();
        
        switch (funkcja){
            case 1: System.out.println("Wartosc sinusa dla kata " + kat + " stopni wynosi " + Math.sin(Math.toRadians(kat))); break;
            case 2: System.out.println("Wartosc cosinusa dla kata " + kat + " stopni wynosi " + Math.cos(Math.toRadians(kat))); break;
            case 3: System.out.println("Wartosc tangensa dla kata " + kat + " stopni wynosi " + Math.tan(Math.toRadians(kat))); break;
            case 4: System.out.println("Wartosc cotangensa dla kata " + kat + " stopni wynosi " + (1 / Math.tan(Math.toRadians(kat)))); break;
            default: System.out.println("Nieprawidlowa opcja");
        }
    }
    
    private static void zadanie2(){
        Scanner scanner = new Scanner(System.in);
        int opcja = 1;
        
        while (opcja != 0){
            System.out.println("[ Zadanie 2 ]");
            System.out.println("Wybierz operację:");
            System.out.println("[ 1 ] Dodawanie");
            System.out.println("[ 2 ] Odejmowanie");
            System.out.println("[ 3 ] Mnozenie");
            System.out.println("[ 4 ] Dzielenie");
            System.out.println("[ 5 ] Potegowanie");
            System.out.println("[ 6 ] Pierwiastkowanie");
            System.out.println("[ 7 ] Wartosc funkcji trygonometrycznej");
            System.out.println("[ 0 ] Cofnij");
            System.out.print("-> ");
            
            opcja = scanner.nextInt();
            
            switch (opcja){
                case 1: zadanie2dodawanie(); break;
                case 2: zadanie2odejmowanie(); break;
                case 3: zadanie2mnozenie(); break;
                case 4: zadanie2dzielenie(); break;
                case 5: zadanie2potegowanie(); break;
                case 6: zadanie2pierwiastkowanie(); break;
                case 7: zadanie2tryg(); break;
                case 0: return;
                default: System.out.println("Nieprawidlowa opcja");
            }
        }
    }
    
    private static void zadanie3(){
        Scanner scanner = new Scanner(System.in);
        Double[] tablica = new Double[10];
        int operacja = 1;
        System.out.println("Podaj 10 liczb do tablicy:");
        for (int i=0; i<10; i++){
            System.out.print("Podaj wartosc " + (i+1) + ". elementu tablicy: ");
            tablica[i] = scanner.nextDouble();
        }
        
        do {
            System.out.println("Wybierz operacje: ");
            System.out.println("[ 1 ] Wyswietlanie tablicy od pierwszego do ostatniego indeksu");
            System.out.println("[ 2 ] Wyswietlanie tablicy od ostatniego do pierwszego indeksu");
            System.out.println("[ 3 ] Wysletlanie elementow tablicy o nieparzystych indeksach");
            System.out.println("[ 4 ] Wyswietlanie elementow tablicy o parzystych indeksach");
            System.out.println("[ 0 ] Cofnij");
            System.out.print("-> ");
            operacja = scanner.nextInt();
            
            if (operacja == 1){
            System.out.print("Wyswietlam zawartosc tablicy od pierwszego do ostatniego indeksu: ");
                for (int i=0; i<10; i++){
                    System.out.print(tablica[i] + " ");
                }
            }else if (operacja == 2){
                System.out.print("Wyswietlam zawartosc tablicy od ostatniego do pierwszego indeksu: ");
                for (int i=9;i>=0;i--){
                    System.out.print(tablica[i] + " ");
                }
            }else if (operacja == 3){
                System.out.print("Wyswietlam elementy tablicy o indeksach nieparzystych: ");
                for (int i=1;i<10;){
                    System.out.print(tablica[i] + " ");
                    i = i + 2;
                }
            }else if (operacja == 4){
                System.out.print("Wyswietlam elementy tablicy o indeksach parzystych: ");
                for (int i=0;i<10;) {
                    System.out.print(tablica[i] + " ");
                    i = i + 2;
                }
            }else System.out.println("Nieprawidlowa opcja");
        }while (operacja != 0);
        
        
    }
    
    private static void zadanie4(){
        Scanner scanner = new Scanner(System.in);
        Double[] tablica = new Double[10];
        
        System.out.println("Podaj 10 liczb do tablicy:");
        for (int i=0; i<10; i++){
            System.out.print("Podaj wartosc " + (i+1) + ". elementu tablicy: ");
            tablica[i] = scanner.nextDouble();
        }
        
        System.out.println("Wybierz operacje:");
        System.out.println("[ 1 ] Oblicz sume elementow tablicy");
        System.out.println("[ 2 ] Oblicz iloczyn elementow tablicy");
        System.out.println("[ 3 ] Wyznacz wartosc srednia");
        System.out.println("[ 4 ] Wyznacz wartosc minimalna");
        System.out.println("[ 5 ] Wyznacz wartosc maksymalna");
        System.out.print("-> ");
        int operacja = scanner.nextInt();
        
        switch (operacja){
            case 1:
                double suma = 0;
                for (int i=0;i<10;i++){
                    suma = suma + tablica[i];
                }
                System.out.println("Suma elementow tablicy wynosi: " + suma);
                break;
            case 2:
                double iloczyn = 1;
                for (int i=0;i<10;i++){
                    iloczyn = iloczyn * tablica[i];
                }
                System.out.println("Iloczyn elementow tablicy wynosi: " + iloczyn);
                break;
            case 3:
               double sumaSr = 0;
                for (int i=0;i<10;i++){
                    sumaSr = sumaSr + tablica[i];
                }
                System.out.println("Srednia elementow tablicy wynosi: " + (sumaSr / 10));
                break;
            case 4:
                double min = 0;
                for (int i=0;i<10;i++){
                    if (min>tablica[i]) min = tablica[i];
                }
                System.out.println("Minimalna wartosc elementow tablicy wynosi: " + min);
                break;
            case 5:
                double max = 0;
                for (int i=0;i<10;i++){
                    if (max<tablica[i]) max = tablica[i];
                }
                System.out.println("Maksymalna wartosc elementow tablicy wynosi: " + max);
                break;
            default: System.out.println("Nieprawidlowa opcja");
        }
    }
    
    private static void zadanie5(){
        for (int i=20; i>=0;i--){
            if (i==2 || i==6 || i==9  || i==15 || i==19) continue;
            System.out.print(i + " ");
        }
    }
    
    private static void zadanie6(){
        Scanner scanner = new Scanner(System.in);
        int liczba;
        
        while (true){
            System.out.print("Podaj liczbe calkowita: ");
            liczba = scanner.nextInt();
            if (liczba < 0) break;
        }
    }
    
    private static void zadanie7(){
        Scanner scanner = new Scanner(System.in);
        int n;
        int zmiany = 1;
        int temp;
        
        System.out.print("Ile liczb chcesz wprowadzic?: ");
        n = scanner.nextInt();
        
        int[] tablica = new int[n];
        
        for (int i=0;i<n;i++){
            System.out.print("Podaj wartosc " + (i + 1) + ". elementu tablicy: ");
            tablica[i] = scanner.nextInt();
        }
        
        while(zmiany > 0){
            zmiany = 0;
            for (int i=0;i<n-1;i++){
                if(tablica[i] > tablica[i+1]){
                    temp = tablica[i+1];
                    tablica[i+1] = tablica[i];
                    tablica[i] = temp;
                    zmiany++;
                }
            }
        }
        
        System.out.print("Posortowana tablica: ");
        for (int i=0;i<n;i++){
            System.out.print(tablica[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcja = 1;
        
        
        while (opcja != 0){
            System.out.println("\nWybierz opcje:");
            System.out.println("[ 1 ] Zadanie 1");
            System.out.println("[ 2 ] Zadanie 2");
            System.out.println("[ 3 ] Zadanie 3");
            System.out.println("[ 4 ] Zadanie 4");
            System.out.println("[ 5 ] Zadanie 5");
            System.out.println("[ 6 ] Zadanie 6");
            System.out.println("[ 7 ] Zadanie 7");
            System.out.println("[ 0 ] Koniec");
            System.out.print("-> ");
            opcja = scanner.nextInt();
            
            switch (opcja){
                case 1: zadanie1(); break;
                case 2: zadanie2(); break;
                case 3: zadanie3(); break;
                case 4: zadanie4(); break;
                case 5: zadanie5(); break;
                case 6: zadanie6(); break;
                case 7: zadanie7(); break;
                case 0: break;
                default: System.out.println("Nieprawidlowa opcja");
            }
        }
    }
}