/*
  Leksjon2: Oppgave 5

  Test av variabler, innlesing, og utskrift

  CA - Sep 2021
*/

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class Oppgave5 {
  public static void main(String[] args) {
    int amt1 = Integer.parseInt(showInputDialog("Amount of 1s:"));
    int amt5 = Integer.parseInt(showInputDialog("Amount of 5s:"));
    int amt10 = Integer.parseInt(showInputDialog("Amount of 10s:"));
    int amt20 = Integer.parseInt(showInputDialog("Amount of 20s:"));

    int sum = 0;
    sum += amt1 * 1;
    sum += amt5 * 5;
    sum += amt10 * 10;
    sum += amt20 * 20;

    showMessageDialog(null, "You have: " + sum + " kr");

  }
}