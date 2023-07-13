/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.cliente;
import Entities.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class RutinaService {

    private Rutina ruti = new Rutina();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Rutina> CrearRutina(ArrayList<Rutina> rutinas) {
        Rutina rutiAux = new Rutina();
        System.out.println("Ingrese el Nombre de la Rutina.");
        rutiAux.setNombre(leer.nextLine());
        System.out.println("Ingrese la Duracion de la Rutinna (en minutos).");
        rutiAux.setDuracion(leer.nextDouble());
        System.out.println("Ingrese el nivel de dificultad de la Rutina. (del 1 al 3)");
        rutiAux.setDificultad(leer.nextInt());
        //Para que no nos coma una linea de mas.
        leer.nextLine();

        System.out.println("Ingrese una breve descripcion de la Rutina.");
        rutiAux.setDescripcion(leer.nextLine());

        leer.nextLine();
        return rutinas;
    }



    public void ListarRutinas(ArrayList<Rutina> rutinas) {
        for (int i = 0; i < rutinas.size(); i++) {
            System.out.println(rutinas.get(i).toString());
        }
    }


    public ArrayList<Rutina> ModificarRutinas(ArrayList<Rutina> rutinas){

        int id;
        boolean bandera = false;
        Scanner leer = new Scanner(System.in);
        this.ListarRutinas(rutinas);
        Rutina rutiAux = new Rutina();

        while(!bandera){
            System.out.println("ingrese el ID del cliente a modificar");

            id = leer.nextInt();
            leer.nextLine();
            for (int i = 0; i < rutinas.size(); i++)
            {
                if (rutinas.get(i).getId() == id){
                    bandera = true;
                    rutiAux = rutinas.get(i);
                    break;
                }
            }
        }
        System.out.println("Ingrese el nombre de la rutina: ");
        rutiAux.setNombre(leer.nextLine());

        System.out.println("Ingrese la duracion: ");
        rutiAux.setDuracion(leer.nextDouble());

        System.out.println("Ingrese la dificultad: ");
        rutiAux.setDificultad(leer.nextInt());

        System.out.println("Ingrese la descripción de la rutina: ");
        rutiAux.setDescripcion(leer.nextLine());

        //Para que no nos coma la linea
        leer.nextLine();

        rutinas.set((rutiAux.getId()-1), rutiAux);
        return rutinas;
    }



    public ArrayList<Rutina> EliminarRutina(ArrayList<Rutina> rutinas){

        int id;
        boolean bandera = false;
        Scanner leer = new Scanner(System.in);
        this.ListarRutinas(rutinas);
        Rutina rutiAux = new Rutina();

        while(!bandera){
            System.out.println("ingrese el ID del cliente a modificar");


            id = leer.nextInt();

            for (int i = 0; i < rutinas.size(); i++)
            {
                if (rutinas.get(i).getId() == id){
                    bandera = true;
                    rutiAux = rutinas.get(i);
                    rutinas.remove(rutiAux);
                    break;
                }
            }
        }
        return rutinas;
    }


}
