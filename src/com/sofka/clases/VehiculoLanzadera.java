package com.sofka.clases;

import java.util.Scanner;

public class VehiculoLanzadera extends Naves implements NaveEspacial{

    private String tipoCarga;
    private float pesoCarga;
    private boolean estadoLazamiento;
    private float distanciaRecorrida;
    private String abastecimiento;

    public VehiculoLanzadera(float potencia, String nombreNave, String tipoCarga, float pesoCarga, float velocidad, int tiempo) {
        super(potencia, nombreNave,velocidad,tiempo);
        this.tipoCarga = tipoCarga;
        this.pesoCarga = pesoCarga;
        this.estadoLazamiento = calcularAtraccionGravitatoria(this.distanciaRecorrida);
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

    public void colocarCargaUtilEnOrbita(){
        if(estadoLazamiento == true){
            System.out.println("soltar carga");
        } else {
            System.out.println("No se puede soltar carga");
        }
    }

    private boolean calcularAtraccionGravitatoria(float distancia){
        boolean estado;
        if(distancia == 100){
            estado = true;
        } else {
            estado = false;
        }
        return estado;
    }

    @Override
    public void propositoNave() {
        System.out.println("En una distancia de 100km, soltar carga en el espacio");
    }

    @Override
    public void cantidadMotores() {
        System.out.println("La cantidad de motores de estos vehiculos es de 4");
    }

    @Override
    public void orbita() {
        System.out.println("llega a 100km orbita");
    }
}
