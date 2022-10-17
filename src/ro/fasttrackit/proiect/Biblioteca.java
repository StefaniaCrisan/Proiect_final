package ro.fasttrackit.proiect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {

    private List<Carte> carti;
    private final int capacitate;

    public Biblioteca(int capacitate) {
        this.capacitate = capacitate;
        carti = new ArrayList<>();
    }

    public int getCapacitate(){
        return capacitate;
    }

    public List<Carte> getCarti() {
        return Collections.unmodifiableList(carti);
    }

    @Override
    public String toString() {

        return "Biblioteca{" +
                "carti=" + carti +
                ", capacitate=" + capacitate +
                '}';
    }

    public boolean addCarte(Carte carte) {
        if (capacitate < capacitateFolosita() + carte.getCantitate()) {
            return false;
        }
        carti.add(carte);
        return true;
    }

    private int capacitateFolosita() {
        int capacitateFolosita = 0;
        for (Carte carte : carti) {
            capacitateFolosita += carte.getCantitate();
        }
        return capacitateFolosita;
    }
}
