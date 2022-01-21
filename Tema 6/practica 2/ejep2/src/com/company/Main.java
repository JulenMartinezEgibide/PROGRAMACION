package com.company;


import Clases.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    // Todos los estudios que existen en el mundo
    private static Estudio[] listaEstudios;

    // Todos las películas que existen en el mundo
    private static ArrayList<Pelicula> listaPeliculas;

    public static void main(String[] args) {
        try
        {
            creaEstudio();
            creaPelicula();
            relacionarEstudioPelicula();
            peliculaMasLarga();
            estudioConMasPeliculas();
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null,e.getClass());
        }
    }

    public static void creaEstudio() throws Exception{
        // Crear objetos de tipo estudio sin películas

        listaEstudios = new Estudio[5];
        // Lista de telefonos
        ArrayList<String> telefonos = new ArrayList();
        telefonos.add("111111111");
        telefonos.add("111111112");
        listaEstudios[0] = new Estudio("Universal", "Los Angeles"," C/ a","www.universal.es", LocalDate.of(1950,9,23),"EEUU",telefonos);



        telefonos = new ArrayList();
        telefonos.add("222222222");
        telefonos.add("222222223");
        listaEstudios[1] = new Estudio("Walt Disney", "Los Angeles"," C/ b","www.disney.es",LocalDate.of(1960,9,23),"EEUU",telefonos);



        telefonos = new ArrayList();
        telefonos.add("333333333");
        telefonos.add("333333334");
        listaEstudios[2] = new Estudio("Warner Bros", "California"," C/ c","www.warner.es",LocalDate.of(1956,1,10),"EEUU",telefonos);
        listaEstudios[2] = new Estudio();
        listaEstudios[2].setNombre("Warner Bros");
        listaEstudios[2].setPais("EEUU");
        listaEstudios[2].setCiudad("California");
        listaEstudios[2].setDireccion(" C/ c");
        listaEstudios[2].setDireccionWeb("www.warner.es");
        listaEstudios[2].setTelefonos(telefonos);
        listaEstudios[2].setFechaFunda(LocalDate.of(1956,01,10));



        /*telefonos = new ArrayList();
        telefonos.add("444444444");
        telefonos.add("444444445");*/
        listaEstudios[3] = new Estudio("Paramount", "Los Angeles"," C/ d","www.paramount.es",LocalDate.of(1955,9,23),"EEUU",telefonos);
        listaEstudios[3].setTelefonos(telefonos);
        listaEstudios[3].setTelefonos(telefonos);


        telefonos = new ArrayList();
        telefonos.add("555555555");
        telefonos.add("555555556");
        listaEstudios[4] = new Estudio("20Th Century Fox", "Los Angeles"," C/ e","www.fox.es",LocalDate.of(1953,9,23),"EEUU",telefonos);
    }

    public static void creaPelicula() throws Exception{
        // Creo peliculas ya con los estudios
        listaPeliculas = new ArrayList();

        // Estudios de la película
        ArrayList <Estudio> lista = new ArrayList();
        lista.add(listaEstudios[0]);
        lista.add(listaEstudios[2]);
        Pelicula p = new Pelicula("ET",1980,90,"Infantil",lista);
        listaPeliculas.add(p);


        int año = 1997;
        // Estudios de la película
        lista = new ArrayList();
        lista.add(listaEstudios[1]);
        lista.add(listaEstudios[2]);
        listaPeliculas.add(new Pelicula("Titanic",año,180,"Romántica",lista));



        año = 2003;
        // Estudios de la película
        lista = new ArrayList();
        lista.add(listaEstudios[4]);
        listaPeliculas.add(new Pelicula("El señor de los anillos",año,133,"Ciencia ficción",lista));



        año = 2003;
        // Estudios de la película
        lista = new ArrayList();
        lista.add(listaEstudios[3]);
        lista.add(listaEstudios[4]);
        lista.add(listaEstudios[1]);
        lista.add(listaEstudios[2]);
        listaPeliculas.add(new Pelicula("Piratas del Caribe",año,220,"Aventuras",lista));



        año = 1994;
        // Estudios de la película
        lista = new ArrayList();
        lista.add(listaEstudios[1]);
        listaPeliculas.add(new Pelicula("El rey león",año,97,"Infantil",lista));
    }

    public static void peliculaMasLarga() throws Exception{
        float maximo = 0;
        Pelicula objeto=null;
        for(int x=0; x < listaPeliculas.size();x++)
        {
            if (listaPeliculas.get(x).getDuracion() > maximo)
            {
                maximo = listaPeliculas.get(x).getDuracion();
                objeto = listaPeliculas.get(x);
                // También me puedo quedar con la posición
            }
        }

        // Nombre de todos los estudios que han producido la película
        String mensaje = "";
        for (int x = 0; x < objeto.getListaEstudios().size();x++)
            mensaje += " " + objeto.getListaEstudios().get(x).getNombre();

        javax.swing.JOptionPane.showMessageDialog(null," La pelicula más larga es " + objeto.getTitulo()+ " y se ha producido en " + mensaje);
    }

    public static void estudioConMasPeliculas() throws Exception{
        // En estudio tengo el arrayList de películas.
        float maximo = 0;
        Estudio objeto=null;
        for(int x=0; x < listaEstudios.length;x++)
            if (listaEstudios[x].getListaPeliculas().size() > maximo)
            {
                maximo = listaEstudios[x].getListaPeliculas().size();
                objeto = listaEstudios[x];
            }
        String mensaje = " El estudio que más películas ha producido es " + objeto.getNombre() + " y ha producido " + objeto.getListaPeliculas().size() + " peliculas cuyos títulos son: ";
        for (int x = 0; x < objeto.getListaPeliculas().size();x++)
            mensaje += "\n" + objeto.getListaPeliculas().get(x).getTitulo();

        javax.swing.JOptionPane.showMessageDialog(null,mensaje);
    }

    public static void relacionarEstudioPelicula() throws Exception{
        ArrayList<Pelicula> lista = new ArrayList();

        lista.add(listaPeliculas.get(0));
        listaEstudios[0].setListaPeliculas(lista);

        lista = new ArrayList();
        lista.add(listaPeliculas.get(1));
        lista.add(listaPeliculas.get(3));
        lista.add(listaPeliculas.get(4));
        listaEstudios[1].setListaPeliculas(lista);

        lista = new ArrayList();
        lista.add(listaPeliculas.get(0));
        lista.add(listaPeliculas.get(1));
        lista.add(listaPeliculas.get(3));
        listaEstudios[2].setListaPeliculas(lista);

        lista = new ArrayList();
        lista.add(listaPeliculas.get(3));
        listaEstudios[3].setListaPeliculas(lista);

        lista = new ArrayList();
        lista.add(listaPeliculas.get(2));
        lista.add(listaPeliculas.get(3));
        listaEstudios[4].setListaPeliculas(lista);

        /* Películas de una en una.
        listaEstudios[4].setPelicula(listaPeliculas.get(2));
        listaEstudios[4].setPelicula(listaPeliculas.get(3));*/
    }
}

