package com.sofka.clases;

import java.util.Scanner;

public class NavesTripuladas extends Naves implements NaveEspacial {

    private float peso;
    private int capacidadPersonal;
    private float distanciaRecorrida;
    private String abastecimiento;

    public NavesTripuladas(float potencia, String nombreNave,float velocidad, int tiempo) {
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

    public void reparar(){
        System.out.println("La nave ha sido reparada.");
    }

    public void realizarMantenimiento(){
        System.out.println("El mantenimiento ha finalizado con exito ");
    }

    public void investigar(){
        System.out.println("Se ha empezado la investigacion, en un momento se enviaran los datos.");
    }

    @Override
    public void propositoNave() {
        System.out.println("se precisa de la destreza y de la toma de decisiones de personas, en detrimento de las máquinas.");
    }

    @Override
    public void cantidadMotores() {
        System.out.println("La cantidad de motores de estos vehiculos es de 8");

    }

    @Override
    public void orbita() {
        System.out.println("llega a 20000km orbita");
    }
}

