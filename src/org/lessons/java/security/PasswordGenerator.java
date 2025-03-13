package org.lessons.java.security;

//Import
import java.util.Scanner;
import java.time.Year;
import org.lessons.java.security.utils.DateUtils;

public class PasswordGenerator {
    public static void main(String[] args) {
        //Intro programma con input
        Scanner in = new Scanner(System.in);
        System.out.println("Benvenuto nel password generator, ti chiederò alcuni dati al fine di generare la tua password:");
        //Nome
        System.out.println("Inserire nome:");
        String nome = in.nextLine();
        //Cognome
        System.out.println("Inserire Cognome:");
        String cognome = in.nextLine();
        //Colore
        System.out.println("Okay "+nome+" "+cognome+", qual è il tuo colore preferito?");
        String colore = in.nextLine();

        //Data di nascita: anno
        int annoAttuale = Year.now().getValue();
        System.out.println("Perfetto! Procediamo con la tua data di nascita, di che anno sei?");
        int anno = in.nextInt();
        while(anno <= 0 || anno > annoAttuale){
            System.out.println("L'anno digitato non è valido, per favore inserire numero valido:");
            anno = in.nextInt();
        }
        //Data di nascita: mese
        System.out.println("Che mese sei nato?(Gennaio = 1, Febbraio = 2, ..., Dicembre = 12)");
        int mese = in.nextInt();
        while(mese <=0 || mese > 12 ){
            System.out.println("Mese inesistente! Inserire mese valido:");
            mese = in.nextInt();
        }
        //Data di nascita: giorno
        int maxGiorno = DateUtils.giorniNelMese(mese, anno);
        System.out.println("Okay, concludiamo con il giorno di nascita:");
        int giorno = in.nextInt();
        while(giorno <= 0 || giorno > maxGiorno ){
            System.out.println("Giorno non valido, reinserirlo:");
            giorno = in.nextInt();
        }
        char divisore = '-';
        int somma = giorno+mese+anno;
        String password = nome+divisore+cognome+divisore+colore+somma;
        System.out.println("La password per te generata è: "+password);
    }
}
