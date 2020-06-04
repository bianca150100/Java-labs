package csv;

public interface CsvInterface {

    String[] getStringfromArray();      //plecand de la un obiect -> returneaza un array de string-uri cu fiecare field
    void getAraayfromString(String[] a);        //plecand de la un string[] -> creeaza un obiect
    String[] seteazaColoane(); //genereaza coloanele(denumirile) fiecarui obicet
    int nrColoane();        //returneaza nr de coloane continute de obiect
}
