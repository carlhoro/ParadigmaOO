package paradigma.paradigma.clases;

public class RobotStem {
    
    //atributos
    
    public Integer id ;
    public Integer piezas;
    public String[] color;
    public Boolean disponible = false;

//metodo
    
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El robot STEM está disponible");
        }else{
            System.out.println("El robot STEM no está disponible");
        }
    }

    public Boolean verificarDisponibilidad() {
        disponible = !disponible;
        return disponible;
    }

    public void devolver() {
        disponible = true;
        System.out.println("El robot ha sido devuelto y está disponible");
    }

    
}
    

    
    /*
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPiezas() {
        return piezas;
    }
    
    public void setPiezas(Integer piezas) {
        this.piezas = piezas;
    }
    
    */
    
    //constructores
    /*
    public RobotStem (Integer id, Integer piezas){
        this.id = id;
        this.piezas = piezas;
    }
    
    public RobotStem (Integer id, Integer piezas, String[] color){
        this.id = id;
        this.piezas = piezas;
        this.color = color;
    }
    */

