public abstract class Empleado implements Trabajador{
    
    private String nombre;
    private String apellidos;
    private String telefono;
    private int edad;
    private Boolean activo;
    
    void darDeBaja(){
        if (activo.equals(true)){
            activo= !activo;    
        }else{
            System.err.println("El empleado no se puede despedir por que no se encuentra activo");
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Boolean Contratar() {
        return activo;
    }
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    
}
