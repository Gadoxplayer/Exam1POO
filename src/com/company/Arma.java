package com.company;

public abstract class Arma {

    private Integer cantidadMuniciones;
    private Double alcanceMetros;
    private String marca;
    private Double calibre;
    private String estado;
    //Posibilidades de estado: (“NUEVA”, “EN MANTENIMIENTO”, “EN USO”).
    Policia policia;

    public Arma(Integer cantidadMuniciones, Double alcanceMetros, String marca, Double calibre, String estado, Policia policia) {
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcanceMetros = alcanceMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
        this.policia = policia;
    }

    public Boolean serUsada(){
        if(estado.equals("EN USO") && calibre >= 9.0){
            System.out.println("Puede ser usada");
        }else {
            System.out.println("No puede ser usada");
        }return false;
    }

    public Double getAlcanceMetros() {
        return alcanceMetros;
    }

}
