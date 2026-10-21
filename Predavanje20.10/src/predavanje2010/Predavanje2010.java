package predavanje2010;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Predavanje2010 {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        Random rng = new Random();
        int brPitanja;
        int brojac = 0;
        
        System.out.println("Unesite broj pitanja: ");
        brPitanja = unos.nextInt();
        
        int [] n1 = new int[brPitanja];
        
        int b1, b2, zbir, odgovor, tacniOdgovori = 0;
        
        while (brojac < brPitanja) {
            b1 = rng.nextInt(11);
            b2 = rng.nextInt(11);
            zbir = b1 + b2;
            brojac++;
            
            System.out.println("P" + brojac + ": " + b1 + " + " + b2 + " = ");
            odgovor = unos.nextInt();
            
            n1[brojac - 1] = odgovor;
            
            if (odgovor == zbir) {
                tacniOdgovori++;
            } else {
                System.err.println("P" + brojac + ": " + b1 + " + " + b2 + " = " + zbir);
            }
        }
        
        System.out.println("Ukupan postignuti rezultat: " + tacniOdgovori + "/" + brPitanja);
        
        System.out.println("Memorija unesenih odgovora: " + Arrays.toString(n1));
    }
}