package com.sofka.clases;

public abstract class Naves {
    protected float potencia;
    protected String nombreNave;
    protected float velocidad;
    protected int tiempo;

    public Naves(float potencia, String nombreNave, float velocidad,int tiempo) {
        this.potencia = potencia;
        this.nombreNave = nombreNave;
        this.velocidad = velocidad;
        this.tiempo=tiempo;
    }


    public abstract void distancia();
    public abstract void tipoDeAbastecimiento();

}
