public class Desarrollador extends Empleado{

    private String[] lenguajes;

    public Desarrollador(String[] lenguajes, Boolean activo, String nombre, String telefono, int edad) {
        super();
        this.lenguajes = lenguajes;
    }

    public Desarrollador(String nombre, int edad) {
        super();
    }

    @Override
    public Boolean iniciarJornada() {
        return false;
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }

    
    
}
