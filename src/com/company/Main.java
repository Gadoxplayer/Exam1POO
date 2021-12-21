package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Policia policia1 = new Policia("Nicolas", "Lopez", "123POO");

        ArmaCorta colTPython = new ArmaCorta(6, 201.0, "Cold Python", 5.0,  "EN USO", policia1, false);

        ArmaLarga ak74 = new ArmaLarga(200, 150.0, "AK-47 Rifle de Asalto", 74.0, "EN USO", policia1, false, "Descripcion: No al uso de armas", 3);
        ArmaLarga ak75 = new ArmaLarga(200, 200.0, "AK-45 Rifle de Asalto", 75.0, "EN USO", policia1, false, "Descripcion: No al uso de armas", 3);

        colTPython.serUsada();
        colTPython.dispararLejos();

        ak74.compareTo(ak75);


    }
}
