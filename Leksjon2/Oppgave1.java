/*
  Leksjon2: Oppgave 1

  Test av variabler, innlesing, og utskrift

  CA - Sep 2021
*/

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class Oppgave1 {
  public static void main(String[] args) {
    String firstname;
    String lastname;
    String message = "Good luck!";

    int year;

    firstname = showInputDialog("Enter first name:");
    lastname = showInputDialog("Enter last name:");
    year = Integer.parseInt(showInputDialog("Enter \r\nyear:"));

    showMessageDialog(null, "Hello, " + firstname + " " + lastname + ", " + message);
    out.println("First: " + firstname);
    out.println("Last: " + lastname);
    out.println("Year: " + year);
  }


}

