package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String name;
        String surname;
        String color;
        int day;
        int month;
        int year;

        Scanner in = new Scanner(System.in);

        System.out.println("inserisci il nome");
        name = in.nextLine();
        System.out.println("inserisci il cognome");
        surname = in.nextLine();
        System.out.println("inserisci il tuo colore preferito");
        color = in.nextLine();
        System.out.println("inserisci il giorno della tua data di nascita");
        day = in.nextInt();
        System.out.println("inserisci il mese della tua data di nascita");
        month = in.nextInt();
        System.out.println("inserisci l'anno della tua data di nascita");
        year = in.nextInt();
        in.close();

        int sum = day + month + year;

        System.out.printf("La tua password è: %s-%s-%s-%d", name, surname, color, sum);
    }
}
