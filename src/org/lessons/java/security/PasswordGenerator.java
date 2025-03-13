package org.lessons.java.security;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Benvenuto nel password generator, ti chiederò alcuni dati al fine di generare la tua password:");
        System.out.println("Inserire nome:");
        String nome = in.nextLine();
        System.out.println("Inserire Cognome:");
        String cognome = in.nextLine();
        System.out.println("Okay "+nome+" "+cognome+", qual è il tuo colore preferito?");
        String colore = in.nextLine();
        System.out.println("Perfetto! Procediamo con la tua data di nascita: inserire il giorno di nascita:");
        int giorno = in.nextInt();
        while(giorno <= 0 || giorno > 31){
            System.out.println("Il numero digitato non è valido, per favore inserire numero valido:");
            giorno = in.nextInt();
        }
        System.out.println("Che mese sei nato?");
        int mese = in.nextInt();
        while(mese <=0 || mese > 12 ){
            System.out.println("Mese inesistente! Inserire mese valido:");
            mese = in.nextInt();
        }
        System.out.println("Di che anno sei?");
        int anno = in.nextInt();
        while(anno< 1900 || anno > 2025){
            System.out.println("Anno non valido, reinserirlo:");
            anno = in.nextInt();
        }
        char divisore = '-';
        int somma = giorno+mese+anno;
        String password = nome+divisore+cognome+divisore+colore+somma;
        System.out.println("La password per te generata è: "+password);
    }
}
