package no.hvl.dat102;

import java.util.Locale;

public class Filmarkiv implements FilmarkivADT{

  //Instansvariiable
  private Film[] filmTabell;
  private int antall;

  //Konstruktører og andre metoder
  public Filmarkiv (Film[] filmTabell, int antall) {
    this.filmTabell = filmTabell;
    antall = 0;
  }

  //class

  @Override
  public Film[] hentFilmTabell() {
    return filmTabell;
  }

  @Override
  public void leggTilFilm(Film nyFilm) {
    if ( antall >= filmTabell.length) {
      System.out.println("Ikke ledig plass i tabellen");
    } else {
      filmTabell[antall] = nyFilm;
      antall++;
      System.out.println(nyFilm + " Er lagt til i filmtabellen");
    }
  }

  @Override
  public boolean slettFilm(int filmnr) {
    for (int i = 0; i < filmTabell.length; i++) {
      if (filmTabell[i] != null) continue;
      if (filmTabell[i].getFilmnr() == filmnr) {
        filmTabell[i] = null;
        return true;
      }
    }
    return false;
  }

  @Override
  public Film[] soekTittel(String delstreng) {
    Film[] sokeTab = new Film[filmTabell.length];
    int antall = 0;
    for (int i = 0; i < filmTabell.length; i++) {
      if (filmTabell[i].getTittel().toUpperCase().contains(delstreng.toUpperCase())) {
        sokeTab[antall] = filmTabell[i];
        antall++;
      }
    }
    trimTab(sokeTab, antall);
    return sokeTab;
  }

  @Override
  public Film[] soekProdusent(String delstreng) {
    Film[] sokeTab = new Film[filmTabell.length];
    int antall = 0;
    for (int i = 0; i < filmTabell.length; i++) {
      if (filmTabell[i].getProdusent().toUpperCase().contains(delstreng.toUpperCase())) {
        sokeTab[antall] = filmTabell[i];
        antall++;
      }
    }
    trimTab(sokeTab,antall);
    return sokeTab;
  }

  @Override
  public int antall(Sjanger sjanger) {
    int antallSjanger = 0;
    for (int i = 0; i < antall; i++) {
      if (filmTabell[i].getSjanger().equals(sjanger)) {
        antallSjanger++;
      }
    }
    return antallSjanger;
  }

  @Override
  public int antall() {
    return antall;
  }

  @Override
  public Film[] trimTab(Film[] tab, int n) {
    Film[] filmtab2 = new Film[n];
    int i = 0;
    while (i < n) {
      filmtab2[i] = tab[i];
      i++;
    } //while
    return filmtab2;
  }
}
