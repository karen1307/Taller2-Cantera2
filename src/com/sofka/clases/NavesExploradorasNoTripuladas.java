package com.sofka.clases;

import java.util.Scanner;

public class NavesExploradorasNoTripuladas extends Naves implements NaveEspacial{

    private String cuerpoCelesteEstudio;
    private float distanciaRecorrida;
    private String abastecimiento;

    public NavesExploradorasNoTripuladas(float potencia, String nombreNave, float velocidad, int tiempo) {
        super(potencia, nombreNave,velocidad,tiempo);
    }

    public float getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    @Override
    public void distancia() {
        distanciaRecorrida = velocidad*tiempo;
    }

    @Override
    public void tipoDeAbastecimiento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tipo de abastecimiento Solar o Combustible");
        this.abastecimiento = sc.nextLine();

    }

    public void estudiarCuerpoCeleste(){
        System.out.println("Se empieza estudio de cuerpo celeste encontrado.");
    }

    @Override
    public void propositoNave() {
        System.out.println("Estudio de cuerpos celestes");
    }


    @Override
    public void cantidadMotores() {
        System.out.println("La cantidad de motores de estos vehiculos es de 6");
    }

    @Override
    public void orbita() {
        System.out.println("llega a 20000km orbita");
    }
}