package no.hvl.dat102;

import no.hvl.dat102.Film;

public interface FilmarkivADT {

  //Returnere en tabell av filmer
  Film[] hentFilmTabell();

  //Legger til en ny Film
  void leggTilFilm(Film nyFilm);

  //Sletter en film hvis den finnest
  boolean slettFilm(int filmnr);

  //Søker og henter Filmer med en gitt delstreng
  Film[] soekTittel(String delstreng);

  //Søker oh henter produsenter med en gitt delstreng
  Film[] soekProdusent(String delstreng);

  //Henter antall filmer for en gitt sjanger
  int antall(Sjanger sjanger);


  //returnerer antall filmer
    int antall();

  Film[] trimTab(Film[] tab, int n);

  //interface

}
