package com.itfactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduceti numele fisierului cautat: ");
        Scanner scanner = new Scanner(System.in);
        String numeCale = scanner.nextLine();

        try{
             Path path= Paths.get(numeCale+".txt");
             List<String> continutFisier = Files.readAllLines(path);

             System.out.println("Fisierul este gol: " + ServiciiCitire.fisierGol(continutFisier));

             if(!(continutFisier.isEmpty())) {
                System.out.println("Introduceti cuvantul cautat in fisier: ");
                Scanner scanner1 = new Scanner(System.in);
                String contineCuvant = scanner1.nextLine();
                System.out.println("Cuvantul cautat se afla in fisier: " + ServiciiCitire.cautareCuvant(continutFisier, contineCuvant));
            }
        }catch (IOException e){
            System.out.println("Nu s-a gasit fisierul cautat. Mai incercati o data.");
        }
    }
}
