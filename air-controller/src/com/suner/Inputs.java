package com.suner;

import java.util.Scanner;

public class Inputs {
    FrontEnd frontEnd = new FrontEnd();
    Scanner sc = new Scanner(System.in);

    public int InputAirTrafficControllerMenu() {
        int option = 0;

        System.out.println("(1 AFEGIR AVIÓ");
        System.out.println("(2 GESTIONAR AVIÓ");
        System.out.println("(3 MOSTRAR ELS AVIONS VISIBLES");
        System.out.println("(4 XIFRAR ELS AVIONS DE COMBAT");
        System.out.println("(5 DESXIFRAR ELS AVIONS DE COMBAT");
        System.out.println("(0 SORTIR");
        System.out.println("Escull una opció: ");

        while (sc.hasNextInt() == false) {
            sc.nextLine();


            System.out.println("(1 AFEGIR AVIÓ");
            System.out.println("(2 GESTIONAR AVIÓ");
            System.out.println("(3 MOSTRAR ELS AVIONS VISIBLES");
            System.out.println("(4 XIFRAR ELS AVIONS DE COMBAT");
            System.out.println("(5 DESXIFRAR ELS AVIONS DE COMBAT");
            System.out.println("(0 SORTIR");
            System.out.println("Escull una opció: ");
        }

        option = sc.nextInt();

        frontEnd.Clear();

        return option;
    }
    public int InputAirplaneTypeCreateMenu() {
        int option = 0;

        System.out.println("(1 AFEGIR AVIÓ COMERCIAL");
        System.out.println("(2 AFEGIR AVIÓ DE COMBAT");
        System.out.println("Escull una opció: ");

        while (sc.hasNextInt() == false) {
            sc.nextLine();

            System.out.println("(1 AFEGIR AVIÓ COMERCIAL");
            System.out.println("(2 AFEGIR AVIÓ DE COMBAT");
            System.out.println("Escull una opció: ");
        }

        option = sc.nextInt();

        frontEnd.Clear();

        return option;
    }
    public int InputCommercialAirplaneManagementMenu() {
        int option = 0;

        System.out.println("(1 ENCENDRE/APAGAR EL MOTOR");
        System.out.println("(2 ACCELERAR/FRENAR");
        System.out.println("(3 PUJAR/BAIXAR TREN D'ATERRATGE");
        System.out.println("(4 PUJAR/BAIXAR ALÇADA");
        System.out.println("(5 MOURE AVIÓ");
        System.out.println("(6 ESTAT DE L'AVIÓ");
        System.out.println("(0 SORTIR");
        System.out.println("Escull una opció: ");

        while (sc.hasNextInt() == false) {
            sc.nextLine();

            System.out.println("(1 ENCENDRE/APAGAR MOTOR");
            System.out.println("(2 ACCELERAR/FRENAR");
            System.out.println("(3 PUJAR/BAIXAR TREN D'ATERRATGE");
            System.out.println("(4 PUJAR/BAIXAR ALÇADA");
            System.out.println("(5 MOURE AVIÓ");
            System.out.println("(6 ESTAT DE L'AVIÓ");
            System.out.println("(0 SORTIR");
            System.out.println("Escull una opció: ");
        }

        option = sc.nextInt();

        frontEnd.Clear();

        return option;
    }
    public int InputBattleAirplaneManagementMenu() {
        int option = 0;

        System.out.println("(1 ENCENDRE/APAGAR EL MOTOR");
        System.out.println("(2 ACCELERAR/FRENAR");
        System.out.println("(3 PUJAR/BAIXAR TREN D'ATERRATGE");
        System.out.println("(4 PUJAR/BAIXAR ALÇADA");
        System.out.println("(5 MOURE AVIÓ");
        System.out.println("(6 ESTAT DE L'AVIÓ");
        System.out.println("(7 DISPARAR AVIÓ SOSPITÓS");
        System.out.println("(0 SORTIR");
        System.out.println("Escull una opció: ");

        while (sc.hasNextInt() == false) {
            sc.nextLine();

            System.out.println("(1 ENCENDRE/APAGAR MOTOR");
            System.out.println("(2 ACCELERAR/FRENAR");
            System.out.println("(3 PUJAR/BAIXAR TREN D'ATERRATGE");
            System.out.println("(4 PUJAR/BAIXAR ALÇADA");
            System.out.println("(5 MOURE AVIÓ");
            System.out.println("(6 ESTAT DE L'AVIÓ");
            System.out.println("(7 DISPARAR AVIÓ SOSPITÓS");
            System.out.println("(0 SORTIR");
            System.out.println("Escull una opció: ");
        }

        option = sc.nextInt();

        frontEnd.Clear();

        return option;
    }

}
