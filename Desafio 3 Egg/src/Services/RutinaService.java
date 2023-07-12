/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

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

    public Rutina CrearRutina() {
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
        return rutiAux;
    }

    public void ListarRutinas(ArrayList<Rutina> rutinas) {
        for (int i = 0; i < rutinas.size(); i++) {
            System.out.println(rutinas.get(i).toString());
        }
    }
}
