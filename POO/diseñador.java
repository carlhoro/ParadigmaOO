public class diseñador extends Empleado{

    private String equipo;

    @Override
    public Boolean iniciarJornada() {
        return true;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    
    
}
