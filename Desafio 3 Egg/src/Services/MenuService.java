package Services;
public class MenuService {
    public void MostrarMenuPrincipal() {

        System.out.println("Hola, bienvenido al gym.");
        System.out.println("1- CLIENTES");
        System.out.println("2- RUTINAS ");
        System.out.println("0- SALIR ");
        System.out.println("Ingrese una opción: ");
    }

    public void MostrarMenuClientes() {
        System.out.println("====Clientes====");

        System.out.println("1- Registrar cliente");
        System.out.println("2- Listar clientes");
        System.out.println("3- Modificar clientes");
        System.out.println("4- Eliminar clientes");

        System.out.println("0- Salir");
        System.out.println("Ingrese una opción: ");
    }
    public void MostrarMenuRutinas() {
        System.out.println("====Rutinas====");

        System.out.println("1- Registrar nueva rutina");
        System.out.println("2- Listar rutinas");
        System.out.println("3- Modificar rutinas");
        System.out.println("4- Eliminar rutinas");

        System.out.println("0- Salir");
        System.out.println("Ingrese una opción: ");
    }
    public MenuService() {
    }
}
