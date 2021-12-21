package com.company;

public class ArmaLarga extends Arma implements Comparable{

    private Boolean selloRenan;
    private String descripcion;
    private Integer nivelArma;
    //Posibles niveles de arma larga: 1 al 5.


    public ArmaLarga(Integer cantidadMuniciones, Double alcanceMetros, String marca, Double calibre, String estado, Policia policia, Boolean selloRenan, String descripcion, Integer nivelArma) {
        super(cantidadMuniciones, alcanceMetros, marca, calibre, estado, policia);
        this.selloRenan = selloRenan;
        this.descripcion = descripcion;
        this.nivelArma = nivelArma;
    }

    @Override
    public int compareTo(Object o) {
        ArmaLarga arma1 = (ArmaLarga) o;

        if(this.nivelArma > arma1.nivelArma){
            System.out.println("El arma 1 tiene mayor nivel al arma 2");
            return  1;
        }
        if(this.nivelArma < arma1.nivelArma){
            System.out.println("El arma 1 tiene menor nivel al arma 2");
            return  -1;
        }else{
            System.out.println("Son del mismo nivel las armas");
            return 0;
        }
    }
}
