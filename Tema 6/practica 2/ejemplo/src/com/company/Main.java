package com.company;
import Modelo.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	      Persona aPersonas[] = new Persona[2];
          aPersonas[0] =new Persona(1,"11111111A","Pepe");

          ArrayList<Cuenta> aCuentas = new ArrayList();
          aCuentas.add(new Cuenta(1,100,"Euros",aPersonas[0]));
          aCuentas.add(new Cuenta(2,200,"libras"));
          aCuentas.add(new Cuenta(3,300,"Euros"));

          ArrayList<Cuenta> cuentasPersona = new ArrayList();
          cuentasPersona.add(aCuentas.get(0));
          cuentasPersona.add(aCuentas.get(2));
          aPersonas[0].setListaCuentas(cuentasPersona);

          cuentasPersona = new ArrayList();
          cuentasPersona.add(aCuentas.get(1));

          aPersonas[1] = new Persona(2,"22222222B","Ana",cuentasPersona);

          aCuentas.get(1).setP(aPersonas[1]);
          aCuentas.get(2).setP(aPersonas[0]);

          System.out.println("Adios");





    }
}
