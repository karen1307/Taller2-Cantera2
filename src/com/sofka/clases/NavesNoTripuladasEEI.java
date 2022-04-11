package com.sofka.clases;

import java.util.Scanner;

public class NavesNoTripuladasEEI extends Naves implements NaveEspacial{
    private float distanciaRecorrida;
    private String abastecimiento;

    public NavesNoTripuladasEEI(float potencia, String nombreNave,float velocidad,int tiempo) {
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
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tipo de abastecimiento Solar o Combustible");
        this.abastecimiento = sc.nextLine();

    }
    public void abastecerEEI(){
        System.out.println("La nave ha sido abastecido");
    }

    public void limpiarEEI(){
        System.out.println("La nave ha sido limpiada");
    }

    public void regularElevacino(){
        System.out.println("La nave ha sido regulada");
    }

    @Override
    public void propositoNave() {
        System.out.println("abastecer, limpiar y regular las naves");
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