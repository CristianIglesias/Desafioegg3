package Services;
import Entities.Rutina;
import java.util.ArrayList;
import java.util.Scanner;
public class RutinaService {

    private Rutina ruti = new Rutina();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Rutina> CrearRutina(ArrayList<Rutina> rutinas) {
        Rutina rutiAux = new Rutina();
        rutiAux.setId(rutinas.size()+1); // acá estaba el error
        System.out.println("Ingrese el nombre de la rutina: ");
        rutiAux.setNombre(leer.nextLine());
        System.out.println("Ingrese la duración de la rutina (en minutos): ");
        rutiAux.setDuracion(leer.nextDouble());
        System.out.println("Ingrese el nivel de dificultad de la rutina (del 1 al 3): ");
        rutiAux.setDificultad(leer.nextInt());
        //Para que no nos coma una linea de mas.
        leer.nextLine();

        System.out.println("Ingrese una breve descripción de la rutina: ");
        rutiAux.setDescripcion(leer.nextLine());

        //leer.nextLine();
        rutinas.add(rutiAux);
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
            System.out.println("Ingrese el ID del cliente a modificar: ");

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

        System.out.println("Ingrese la duración de la rutina: ");
        rutiAux.setDuracion(leer.nextDouble());

        System.out.println("Ingrese la dificultad de la rutina: ");
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
            System.out.println("Ingrese el ID del cliente a eliminar: ");


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
