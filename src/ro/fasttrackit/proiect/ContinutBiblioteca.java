package ro.fasttrackit.proiect;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class ContinutBiblioteca {
    private static Path CONTINUT = Path.of("file", "biblioteca.txt");

    public void write(Biblioteca biblioteca) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CONTINUT.toFile()))) {
            writer.write(String.valueOf(biblioteca.getCapacitate()));
            writer.newLine();
            for (Carte c : biblioteca.getCarti()) {
                writer.write(carteToLine(c));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Nu pot scrie in fisier");
        }
    }

    public void read(Biblioteca biblioteca) {

        try {
            File myObj = new File("biblioteca.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nu se poate citi din fisier.");
            e.printStackTrace();
        }

    }

    private String carteToLine(Carte c) {
        return c.getTitlu() + " | " + c.getAutor() + " | " + c.getEditura() + " | " + c.getAnAparitie() + " | " + c.getCantitate();
    }
}
