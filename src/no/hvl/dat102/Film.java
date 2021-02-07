package no.hvl.dat102;

public class Film {
  private Sjanger sjanger;
  private int filmnr;
  private String produsent;
  private String tittel;
  private int year;
  private String filmselskap;

  public Film() {}

  public Film (int filmnr, String produsent, String tittel, int year, String filmselskap) {
    this.filmnr = filmnr;
    this.produsent = produsent;
    this.tittel = tittel;
    this.year = year;
    this.filmselskap = filmselskap;
  }

  public Sjanger getSjanger() {
    return sjanger;
  }

  public void setSjanger(Sjanger sjanger) {
    this.sjanger = sjanger;
  }

  public int getFilmnr() {
    return filmnr;
  }

  public void setFilmnr(int filmnr) {
    this.filmnr = filmnr;
  }

  public String getProdusent() {
    return produsent;
  }

  public void setProdusent(String produsent) {
    this.produsent = produsent;
  }

  public String getTittel() {
    return tittel;
  }

  public void setTittel(String tittel) {
    this.tittel = tittel;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getFilmselskap() {
    return filmselskap;
  }

  public void setFilmselskap(String filmselskap) {
    this.filmselskap = filmselskap;
  }
}
