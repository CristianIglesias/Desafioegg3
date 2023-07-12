/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class MenuServicio {

    public void MostrarMenuPrincipal() {

        System.out.println("Buenos dias, bienvenido al gym.");
        System.out.println("1- CLIENTES.");
        System.out.println("2- RUTINAS. ");

        System.out.println("0-Salir");
        System.out.println("Ingrese una opcion: ");

    }

    public void MostrarMenuClientes() {

        System.out.println("====Clientes====");
        System.out.println("1-Registrar Cliente.");
        System.out.println("2-Listar Clientes.");
        System.out.println("3-Modificar Clientes.");
        System.out.println("4-Eliminar Clientes.");

        System.out.println("0-Salir");
        System.out.println("Ingrese una opcion: ");

    }

    public void MostrarMenuRutinas() {
        System.out.println("====Rutinas====");
        System.out.println("1-Registrar nuevas Rutinas.");
        System.out.println("2-Listar Rutinas.");
        System.out.println("3-Modificar Rutinas.");
        System.out.println("4-Eliminar Rutinas.");

        System.out.println("0-Salir");
        System.out.println("Ingrese una opcion: ");
    }

    public MenuServicio() {
    }

}
