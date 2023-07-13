/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio.pkg3.egg;

import Entities.Cliente;
import Entities.Rutina;
import Services.ClienteService;
import Services.MenuServicio;
import Services.RutinaService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Desafio3Egg {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Cliente> listaCliente = new ArrayList<>();
    static ArrayList<Rutina> listaRutina = new ArrayList<>();

    public static void main(String[] args) {

        int opcion = -1;
        ClienteService clienteServ = new ClienteService();
        RutinaService rutinaServ = new RutinaService();
        MenuServicio menuServ = new MenuServicio();
        Scanner leer = new Scanner(System.in);

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
                        menuServ.MostrarMenuClientes();
                        opcionRut = leer.nextInt();
                        leer.nextLine();
                        
                        switch (opcionRut) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                        break;

                    }

                case 0:
                    return;

                default:
                    System.out.println("una opcion valida cammpeon");
                    break;

            }//cierre switch

        }//cierre while

    }//cierre metodo main 

}
