/*
  Leksjon2: Oppgave 6

  Test av variabler, innlesing, og utskrift

  CA - Sep 2021
*/

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class Oppgave6 {
  public static void main(String[] args) {
    int hours = Integer.parseInt(showInputDialog("Hours:"));
    int minutes = Integer.parseInt(showInputDialog("Minutes:"));
    int seconds = Integer.parseInt(showInputDialog("Seconds:"));
    showMessageDialog(null, "It is " + (hours * 60 * 60 + minutes * 60 + seconds) + " seconds after midnight");

  }
}