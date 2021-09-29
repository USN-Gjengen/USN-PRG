/*
  Leksjon2: Oppgave 4

  Test av variabler, innlesing, og utskrift

  CA - Sep 2021
*/

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class Oppgave4 {
  final static double INCH_TO_METER_FACTOR = 0.0254d;

  public static void main(String[] args) {
    double inches = Double.parseDouble(showInputDialog("Enter inches to be converted:"));
    showMessageDialog(null, inches + "\" to Meters is " + (inches * INCH_TO_METER_FACTOR) + "m");
  }
}