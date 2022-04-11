package com.sofka;
import com.sofka.clases.NavesExploradorasNoTripuladas;
import com.sofka.clases.NavesNoTripuladasEEI;
import com.sofka.clases.NavesTripuladas;
import com.sofka.clases.VehiculoLanzadera;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean bandera = true;
        int opcion;
        do {

            menu();
            opcion=capturarOpcion();
            bandera=evaluarOpcion1(opcion);
        } while (bandera == true);

    }

    private static void menu(){
        System.out.println("Que nave deseas contruir");
        System.out.println("1. VehiculoLanzadera");
        System.out.println("2. Nave no tripulada EEi");
        System.out.println("3. Nave Exploradara no tripulada");
        System.out.println("4. Nave Tripulada");
        System.out.println("0. salir");

    }
    private static int capturarOpcion(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }

    private static boolean evaluarOpcion1(int opcion1){
        int opcion2,opcion3,opcion4,opcion5;
        float potencia;
        float velocidad;
        int tiempo;
        String nombreNave;
        Scanner sc = new Scanner(System.in);
        switch (opcion1) {

            case 1:

                System.out.println("Vehiculo lanzadera");
                System.out.println("Ingrese caballos de fuerza");
                potencia = sc.nextFloat();
                sc.nextLine();
                System.out.println("Nombre de la nave");
                nombreNave = sc.nextLine();
                System.out.println("Tipo de carga");
                String tipoCarga = sc.nextLine();
                System.out.println("Peso Carga");
                float pesoCarga = sc.nextFloat();
                System.out.println("ingrese velocidad en km");
                velocidad = sc.nextFloat();
                System.out.println("ingrese tiempo de vuelo en minutos");
                tiempo = sc.nextInt();
                VehiculoLanzadera vehiculoLanzadera = new VehiculoLanzadera (potencia, nombreNave, tipoCarga, pesoCarga,velocidad,tiempo);
                vehiculoLanzadera.tipoDeAbastecimiento();
                vehiculoLanzadera.distancia();
                System.out.println("La distancia recorrida es "+ vehiculoLanzadera.getDistanciaRecorrida());
                vehiculoLanzadera.colocarCargaUtilEnOrbita();
                vehiculoLanzadera.propositoNave();
                vehiculoLanzadera.cantidadMotores();
                vehiculoLanzadera.orbita();
                return true;
            case 2:
                System.out.println("Naves no tripuladas EEI");
                System.out.println("Ingrese caballos de fuerza");
                potencia = sc.nextFloat();
                sc.nextLine();
                System.out.println("Nombre de la nave");
                nombreNave = sc.nextLine();
                System.out.println("ingrese velocidad en km");
                velocidad = sc.nextFloat();
                System.out.println("ingrese tiempo de vuelo en minutos");
                tiempo = sc.nextInt();
                NavesNoTripuladasEEI navesNoTripuladasEEI=new NavesNoTripuladasEEI(potencia,nombreNave,velocidad,tiempo);
                navesNoTripuladasEEI.tipoDeAbastecimiento();
                navesNoTripuladasEEI.distancia();
                System.out.println("La distancia recorrida es "+ navesNoTripuladasEEI.getDistanciaRecorrida());
                navesNoTripuladasEEI.propositoNave();
                navesNoTripuladasEEI.cantidadMotores();
                navesNoTripuladasEEI.orbita();
                navesNoTripuladasEEI.abastecerEEI();
                navesNoTripuladasEEI.limpiarEEI();
                navesNoTripuladasEEI.regularElevacino();

                return true;
            case 3:
                System.out.println("Naves exploradoras no tripuladas");
                System.out.println("Ingrese caballos de fuerza");
                potencia = sc.nextFloat();
                sc.nextLine();
                System.out.println("Nombre de la nave");
                nombreNave = sc.nextLine();
                System.out.println("ingrese velocidad en km");
                velocidad = sc.nextFloat();
                System.out.println("ingrese tiempo de vuelo en minutos");
                tiempo = sc.nextInt();
                NavesExploradorasNoTripuladas navesExploradorasNoTripuladas=new NavesExploradorasNoTripuladas(potencia,nombreNave,velocidad,tiempo);
                navesExploradorasNoTripuladas.tipoDeAbastecimiento();
                navesExploradorasNoTripuladas.distancia();
                System.out.println("La distancia recorrida es "+ navesExploradorasNoTripuladas.getDistanciaRecorrida());
                navesExploradorasNoTripuladas.propositoNave();
                navesExploradorasNoTripuladas.cantidadMotores();
                navesExploradorasNoTripuladas.orbita();
                navesExploradorasNoTripuladas.estudiarCuerpoCeleste();

                return true;
            case 4:
                System.out.println("Naves exploradoras no tripuladas");
                System.out.println("Ingrese caballos de fuerza");
                potencia = sc.nextFloat();
                sc.nextLine();
                System.out.println("Nombre de la nave");
                nombreNave = sc.nextLine();
                System.out.println("ingrese velocidad en km");
                velocidad = sc.nextFloat();
                System.out.println("ingrese tiempo de vuelo en minutos");
                tiempo = sc.nextInt();
                NavesTripuladas navesTripuladas=new NavesTripuladas(potencia,nombreNave,velocidad,tiempo);
                navesTripuladas.tipoDeAbastecimiento();
                navesTripuladas.distancia();
                System.out.println("La distancia recorrida es "+ navesTripuladas.getDistanciaRecorrida());
                navesTripuladas.propositoNave();
                navesTripuladas.cantidadMotores();
                navesTripuladas.orbita();
                return true;
            case 0:
                return false;
        }
        return true;
    }
}