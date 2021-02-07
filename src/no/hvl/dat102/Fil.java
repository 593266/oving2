package no.hvl.dat102;

import static javax.swing.JOptionPane.showMessageDialog;

import java.io.*;

public class Fil {

  private static final String SKILLE = "#";

  //Lese et filmarkiv fra tekstfil
  public static void lesFraFil(FilmarkivADT filmarkiv, String filnavn) {

    FileReader ansattFil = null;
    BufferedReader reader = null;

    try {
//      File file = new File(filnavn);
      ansattFil = new FileReader(filnavn);
    } catch (FileNotFoundException unntak) {
//      showMessageDialog(null, "Filen " + filnavn + " finnes ikke. \n" + e.getMessage());
      System.out.println("Filen " + filnavn + " finnes ikke. \n");
      System.exit(1);

    }

    try {

      reader = new BufferedReader(ansattFil);

      String line = reader.readLine();
      int linenumber = Integer.parseInt(line);

      String post = reader.readLine();
      for (int i = 0; i < linenumber; i++) {
        String[] felt = post.split(SKILLE);

//        int filmnr, String produsent, String tittel, int year, String filmselskap/
        int filmnr = Integer.parseInt(felt[0]);
        String produsent = felt[1];
        String tittel = felt[2];
        int year = Integer.parseInt(felt[3]);
        String filmselskap = felt[4];

        Film a = new Film(filmnr, produsent, tittel, year, filmselskap);
        System.out.println(a);

        post = reader.readLine();

      }
      reader.close();

    } catch (IOException e) {
      showMessageDialog(null, "Kan ikke lese fra filen. \n" + e.getMessage());
      System.out.println("Feil ved lesing av fil: " + e);

      System.exit(2);
    }
  }


  //Lagre et filmarkiv til tekstfil
  public static void skrivTilFil(FilmarkivADT filmarkiv, String filnavn) {
    int antall = filmarkiv.antall();
    try {
      FileWriter filmarkivFil = new FileWriter(filnavn, false);

      PrintWriter outFile = new PrintWriter(filmarkivFil);

      outFile.println(antall);
      if (antall >= filmarkiv.length) {

      for (int i = 0; i < antall; i++) {
        outFile.print(Film[i].getFilmnr());
        outFile.print(SKILLE);
        outFile.print(Film[i].getProdusent());
        outFile.print(SKILLE);
        outFile.print(Film[i].getTittel());
        outFile.print(SKILLE);
        outFile.print(Film[i].getYear());
        outFile.print(SKILLE);
        outFile.print(Film[i].getProdusent());
        outFile.println();

        outFile.close();

      }
    } catch (IOException e) {
      System.out.println("Feil ved skriving til fil : " + e);
      System.exit(3);
    }

  }



}