package Exercitiul2;

import java.util.HashSet;

public class Produs<Int> {

    enum Tip {
        Aliment, Altele
    }


    String name;
    Double price;
    Int cantitate;
    Tip tip;


    public static double pretTotal(double a,int b){
        return a*b;
    }



    public Produs(String name, double price, Int cantitate, Tip tip) {
        this.name = name;
        this.price = price;
        this.cantitate = cantitate;
        this.tip = tip;

    }


    public static void main(String[] args) {
        HashSet<Produs> produse = new HashSet<>();
        produse.add(new Produs("Sapun",2.5,2,Tip.Altele));
        produse.add(new Produs("Salam",3.99,5,Tip.Aliment));
        produse.add(new Produs("Cascaval",4.99,3,Tip.Aliment));
        produse.add(new Produs("Cuptor",199.99,1,Tip.Altele));
        produse.add(new Produs("Frigider",1499.99,2,Tip.Altele));
        produse.add(new Produs("Tricou",29.99,4,Tip.Altele));
        produse.add(new Produs("Conserva de masline",5.99,2,Tip.Aliment));
        produse.add(new Produs("Conserva de peste",4.99,5,Tip.Aliment));
        produse.add(new Produs("Lanterna",14.99,3,Tip.Altele));

        produse.stream().filter(b->b.tip == Tip.Aliment).forEach(produs -> System.out.println("Pret Total: " + pretTotal()));
        

    }


}


