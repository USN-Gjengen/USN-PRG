/*
  Leksjon2: Oppgave 3

  Test av variabler, innlesing, og utskrift

  CA - Sep 2021
*/

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class Oppgave3 {
  public static void main(String[] args) {
    out.println("+---------+        ");
    out.println("|         | Height ");
    out.println("+---------+        ");
    out.println("   Width           ");

    int width = Integer.parseInt(showInputDialog("Enter width:"));
    int height = Integer.parseInt(showInputDialog("Enter height:"));


    out.println("Circumference: " + (height * 2 + width * 2));

  }
}