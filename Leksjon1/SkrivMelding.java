/*
  Programforklaring

  Test av utskrift fra program med for-loop

  CA - Sep 2021
*/

import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class SkrivMelding {

  public static void main(String[] args) {
    out.println(MultiWord("Hei, verden!", 3));
  }

  private static String MultiWord(String s, int amount){
    String tempString = "";
    for(int i = 0; i < amount; i++){
      tempString += s;
    }

    return tempString;
  }
}