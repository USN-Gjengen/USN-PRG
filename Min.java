
/**********************************************************************
 * Min egen verktøyklasse - dvs. metodesamling. Denne klassen vil være  
 * vedlagt eksamensoppgaven. Disse metodene kan kalles på i din løsning
 * via Min.metodenavn() uten å skrive koden for dem inn i dine program. 
 **********************************************************************
 */

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Min {
    // Metoden skriver en sekvens av tegn i en String
    public static String skrivTegn(char t, int antall) {
        String sekvens = "";
        for (int i = 1; i <= antall; i++)
            sekvens += t;
        return sekvens;
    }

    // Metoden avgjør om et tegn er en (engelsk) bokstav
    public static boolean erBokstav(char tegn) {
        return ('A' <= tegn && tegn <= 'Z') || ('a' <= tegn && tegn <= 'z');
    }

    // Metoden avrunder et tall til én desimal
    public static double avrund1(double tall) {
        return (int) Math.round(tall * 10) / 10.0;
    }

    // Metoden avrunder et tall til to desimaler
    public static double avrund2(double tall) {
        return (int) Math.round(tall * 100) / 100.0;
    }

    // Metoden leser inn et heltall i området (min-max)
    public static int lesHeltall(int min, int max, String ledetekst) {
        int tall = 0;
        do {
            String tallTekst = showInputDialog(ledetekst + " (" + min + "-" + max + "): ");
            tall = parseInt(tallTekst);
            if (tall < min || tall > max)
                showMessageDialog(null, "Ulovlig verdi!");
        } while (tall < min || tall > max);
        return tall;
    }

    // Metoden trekker et tilfeldig heltall i området min - max
    public static int trekkTall(int min, int max) {
        return min + (int) (random() * (max - min + 1));
    }
}
