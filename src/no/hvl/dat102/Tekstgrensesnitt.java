package no.hvl.dat102;

import no.hvl.dat102.adt.FilmarkivADT;

public class Tekstgrensesnitt {

  public final static Scanner TASTATUR = new Scanner(System.in);



//Skrive ut alle filmer med en spesiell delstreng i tittelen
public void skrivUtDelstreng(FilmarkivADT film, String delstreng) {
  Film[] delstrengTab = new Film[filmTabell.length];
  for (int i = 0; i < filmTabell.length; i++) {
    while ( delstreng.equals(filmTabell[i]) {
      delstrengTab[i] = delstreng;
    }
  }
}

//Skrive ut alle filmer av en produsent / en gruppe

//Skrive ut en enkel statistikk som inneholder antall filmer totalt og hvor mange det er i hver sjanger.

}
