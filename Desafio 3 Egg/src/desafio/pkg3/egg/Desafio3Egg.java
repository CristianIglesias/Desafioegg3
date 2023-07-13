package desafio.pkg3.egg;
import Entities.Cliente;
import Entities.Rutina;
import Services.ClienteService;
import Services.MenuService;
import Services.RutinaService;
import java.util.ArrayList;
import java.util.Scanner;
public class Desafio3Egg {
    static ArrayList<Cliente> listaCliente = new ArrayList<>();
    static ArrayList<Rutina> listaRutina = new ArrayList<>();
    public static void main(String[] args) {

        int opcion = -1;

        ClienteService clienteServ = new ClienteService();
        RutinaService rutinaServ = new RutinaService();
        MenuService menuServ = new MenuService();
        Scanner leer = new Scanner(System.in);

        principalLoop:
        while (opcion != 0) {

            menuServ.MostrarMenuPrincipal();

            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {

                case 1:

                    int opcionCli = -1;
                    
                    while (opcionCli != 0) {
                        menuServ.MostrarMenuClientes();
                        opcionCli = leer.nextInt();
                        leer.nextLine();
                        
                        switch (opcionCli) {
                            case 1:
                                listaCliente = clienteServ.CrearCliente(listaCliente);
                                break;
                            case 2:
                                clienteServ.ListarClientes(listaCliente);
                                break;
                            case 3:
                                listaCliente = clienteServ.ModificarCliente(listaCliente);
                                break;
                            case 4:
                                listaCliente = clienteServ.EliminarCliente(listaCliente);
                                break;
                        }
                     

                    }

                case 2:
                    
                    int opcionRut = -1;
                    while (opcionRut != 0) {
                        menuServ.MostrarMenuRutinas();
                        opcionRut = leer.nextInt();
                        leer.nextLine();
                        
                        switch (opcionRut) {
                            case 1:
                                listaRutina = rutinaServ.CrearRutina(listaRutina);
                                break;
                            case 2:
                                rutinaServ.ListarRutinas(listaRutina);
                                break;
                            case 3:
                                listaRutina = rutinaServ.ModificarRutinas(listaRutina);
                                break;
                            case 4:
                                listaRutina = rutinaServ.EliminarRutina(listaRutina);
                                break;
                            case 0:
                                continue principalLoop; // vuelve al menú principal
                        }
                    }


                case 0:
                    return;

                default:
                    System.out.println("Una opción valida campeón.");
                    break;

            }//cierre switch
        }//cierre while
    }//cierre metodo main
}
