package com.company;

public class ArmaCorta extends Arma{

    private Boolean automatica;

    public ArmaCorta(Integer cantidadMuniciones, Double alcanceMetros, String marca, Double calibre, String estado, Policia policia, Boolean automatica) {
        super(cantidadMuniciones, alcanceMetros, marca, calibre, estado, policia);
        this.automatica = automatica;
    }

    public Boolean dispararLejos(){
        if(getAlcanceMetros() > 200.0 ){
            System.out.println("El arma puede disparar a mas de 200 metros");
        }else {
            System.out.println("El arma no puede disparar a mas de 200 metros");
        }return false;
    }
}
