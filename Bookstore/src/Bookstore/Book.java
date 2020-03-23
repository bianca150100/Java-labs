package Bookstore;

import java.util.Objects;
import java.util.Scanner;

public class Book {

    private String titlu;
    private String autor;
    private String editura;
    private int nrPagini;

    public Book() {
        titlu = "";
        autor = "";
        editura = "";
        nrPagini = 0;
    }

    public Book(String a, String b, String c, int n) {
        this.titlu = a;
        this.autor = b;
        this.editura = c;
        if (n != 0)
            this.nrPagini = n;
        else
            this.nrPagini = 1;
    }

    @Override
    public String toString() {
        return "Book_title: " + titlu.toUpperCase()  +
                "\nBook_autor: " + autor +
                "\nBook_editura: " + editura.toLowerCase() ;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adauga nr de carti noi: ");

        Book carti=new Book();
        System.out.println("Dati numele cartii, autorul, editura si nr_pagini: ");
        String a, b, c;
        String k;
        a = scanner.nextLine();
        b = scanner.nextLine();
        c = scanner.nextLine();
        k = scanner.nextLine();
        int nr_pag=Integer.parseInt(k);
        if (nr_pag<=0)
            System.out.println("Ati introdus un nr gresit de pag");
        else {
            carti.setTitlu(a);
            carti.setAutor(b);
            carti.setEditura(c);
            carti.setNrPagini(nr_pag);
            System.out.println(carti);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nrPagini == book.nrPagini &&
                Objects.equals(titlu, book.titlu) &&
                Objects.equals(autor, book.autor) &&
                Objects.equals(editura, book.editura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titlu, autor, editura, nrPagini);
    }
}

