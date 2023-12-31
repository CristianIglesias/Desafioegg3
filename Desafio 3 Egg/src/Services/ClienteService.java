package Services;
import Entities.Cliente;
import java.util.ArrayList;
import java.util.Scanner;
public class ClienteService {
    private Cliente cli = new Cliente();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Cliente> CrearCliente(ArrayList<Cliente> clientes) {

        Cliente cliAux = new Cliente();
        cliAux.setId(clientes.size()+1);
        
        System.out.println("Ingrese el nombre del cliente: ");
        cliAux.setNombre(leer.nextLine());
        
        System.out.println("Ingrese la edad del cliente: ");
        cliAux.setEdad(leer.nextInt());
        
        System.out.println("Ingrese la altura del cliente: ");
        cliAux.setAltura(leer.nextDouble());
        
        System.out.println("Ingrese el peso del cliente: ");
        cliAux.setPeso(leer.nextDouble());
        //Para que no nos coma la linea 
        leer.nextLine();

        System.out.println("Ingrese el objetivo del cliente: ");
        cliAux.setObjetivo(leer.nextLine());

        clientes.add(cliAux);
        return clientes;
    }

    public void ListarClientes(ArrayList<Cliente> clientes) {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
    }
    public ArrayList<Cliente> ModificarCliente(ArrayList<Cliente> clientes){
    
        int id; 
        boolean bandera = false;
        Scanner leer = new Scanner(System.in);
        this.ListarClientes(clientes);
        Cliente cliAux = new Cliente();
       
        while(!bandera){
        System.out.println("Ingrese el ID del cliente a modificar: ");
        id = leer.nextInt();
        leer.nextLine();

        for (int i = 0; i < clientes.size(); i++)
        {
            if (clientes.get(i).getId() == id){
                bandera = true;
                cliAux = clientes.get(i);
                break;
            }
        }
        
   
        }
        
        System.out.println("Ingrese el nombre del cliente: ");
        cliAux.setNombre(leer.nextLine());
        
        System.out.println("Ingrese la edad del cliente: ");
        cliAux.setEdad(leer.nextInt());
        
        System.out.println("Ingrese la altura del cliente: ");
        cliAux.setAltura(leer.nextDouble());
        
        System.out.println("Ingrese el peso del cliente: ");
        cliAux.setPeso(leer.nextDouble());
        //Para que no nos coma la linea 
        leer.nextLine();

        System.out.println("Ingrese el Objetivo del Cliente.");
        cliAux.setObjetivo(leer.nextLine());

        //leer.nextLine();
        clientes.set((cliAux.getId()-1), cliAux);
        return clientes;
   }


   public ArrayList<Cliente> EliminarCliente(ArrayList<Cliente> clientes){
        int id;
        boolean bandera = false;
        Scanner leer = new Scanner(System.in);
        this.ListarClientes(clientes);
        Cliente cliAux = new Cliente();

        while(!bandera){
            System.out.println("ingrese el ID del cliente a modificar");


            id = leer.nextInt();

                for (int i = 0; i < clientes.size(); i++)
                {
                    if (clientes.get(i).getId() == id){
                        bandera = true;
                        cliAux = clientes.get(i);
                        clientes.remove(cliAux);
                        break;
                    }
                }
            }
        return clientes;
    }
}
