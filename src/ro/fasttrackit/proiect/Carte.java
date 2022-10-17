package ro.fasttrackit.proiect;

import java.util.ArrayList;
import java.util.List;

public class Carte {

    private final String titlu;
    private final String autor;
    private TipCarte descriere;
    private String editura;
    private int anAparitie;
    private int cantitate;

    public Carte(String titlu, String autor, TipCarte descriere, String editura, int anAparitie, int cantitate) {
        this.titlu = titlu;
        this.autor = autor;
        this.descriere = descriere;
        this.editura = editura;
        this.anAparitie = anAparitie;
        this.cantitate = cantitate;
    }

    public int getCantitate() {
        return cantitate;
    }

    public static List<Carte> toateCartileDeUnTip(TipCarte descriere, List<Carte> carti) {
        List<Carte> rezultate = new ArrayList<>();
        for (Carte carte : carti) {
            if (carte.getDescriere() == descriere) {
                rezultate.add(carte);
            }
        }
        return rezultate;
    }

    public TipCarte getDescriere() {
        return descriere;
    }

    public String getTitlu() {
        return titlu;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditura() {
        return editura;
    }

    @Override
    public String toString() {
        return "\nCarte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", descriere=" + descriere +
                ", editura='" + editura + '\'' +
                ", anAparitie=" + anAparitie +
                ", cantitate=" + cantitate +
                '}';
    }

    /*
    public static void main(String[] args) {
        List<Carte> carti = new ArrayList<>();
        carti.add(new Carte("Nemesis", "Agatha Christie", TipCarte.FICTIUNE, "Litera", 2015, 4));
        carti.add(new Carte("N sau M?", "Agatha Christie", TipCarte.STIINTE, "Litera", 2013, 6));

        System.out.println(toateCartileDeUnTip(TipCarte.FICTIUNE, carti));
    }
     */
}
