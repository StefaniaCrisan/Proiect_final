package ro.fasttrackit.proiect;

import java.util.ArrayList;
import java.util.List;

public class Carte {

    private String titlu;
    private String autor;
    private TipCarte tip;
    private String editura;
    private int anAparitie;
    private int cantitate;

    public Carte(String titlu, String autor, TipCarte tip, String editura, int anAparitie, int cantitate) {
        this.titlu = titlu;
        this.autor = autor;
        this.tip = tip;
        this.editura = editura;
        this.anAparitie = anAparitie;
        this.cantitate = cantitate;
    }

    public TipCarte getTip() {
        return tip;
    }

    public static List<Carte> toateCartileDeUnTip(TipCarte tip, List<Carte> carti) {
        List<Carte> rezultate = new ArrayList<>();
        for (Carte carte : carti) {
            if (carte.getTip() == tip) {
                rezultate.add(carte);
            }
        }
        return rezultate;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", tip=" + tip +
                ", editura='" + editura + '\'' +
                ", anAparitie=" + anAparitie +
                ", cantitate=" + cantitate +
                '}';
    }

    public static void main(String[] args) {
        List<Carte> carti = new ArrayList<>();
        carti.add(new Carte("Nemesis", "Agatha Christie", TipCarte.FICTIUNE, "Litera", 2015, 4));
        carti.add(new Carte("N sau M?", "Agatha Christie", TipCarte.FICTIUNE, "Litera", 2013, 6));

        System.out.println(toateCartileDeUnTip(TipCarte.FICTIUNE, carti));
    }
}
