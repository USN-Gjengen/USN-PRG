/*
  Leksjon2: Oppgave 2

  Test av variabler, innlesing, og utskrift

  CA - Sep 2021
*/

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class Oppgave2 {
  public static void main(String[] args) {
    int number = Integer.parseInt(showInputDialog("Enter number:"));

    out.println(number + " + " + number + " = " + (number + number));
    out.println(number + " * " + number + " = " + (number * number));
  }
}