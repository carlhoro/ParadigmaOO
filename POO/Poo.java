
public class Poo {

    public static void main(String[] args) {
        String[] arr = {"sql","mariadb"};
        Empleado pedro = new Desarrollador(arr, true, "maria", "3109874635", 34);
        Empleado maria = new Desarrollador("pedro", 34);

        maria.Contratar();
        maria.darDeBaja();
        pedro.darDeBaja();

        
    }
}