/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class ClienteService {
    
    private Cliente cli = new Cliente();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    
    
        public Cliente CrearCliente() {
        Cliente cliAux = new Cliente();
        System.out.println("Ingrese el Nombre del Cliente.");
        cliAux.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad del Cliente.");
        cliAux.setEdad(leer.nextInt());
        System.out.println("Ingrese la altura del Cliente");
        cliAux.setAltura(leer.nextDouble());
        System.out.println("Ingrese el Peso del Cliente.");
        cliAux.setPeso(leer.nextDouble());
        //Para que no nos coma la linea 
          leer.nextLine();
        
        System.out.println("Ingrese el Objetivo del Cliente.");
        cliAux.setObjetivo(leer.nextLine());
        
        leer.nextLine();
        return cliAux;
    }

    public void ListarPeliculas(ArrayList <Cliente> clientes) {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
    }
    
}
