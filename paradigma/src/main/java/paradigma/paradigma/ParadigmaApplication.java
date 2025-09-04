package paradigma.paradigma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import paradigma.paradigma.clases.RobotStem;

@SpringBootApplication
public class ParadigmaApplication {

	public static void main(String[] args) {
		RobotStem robot1 = new RobotStem();
		robot1.id = 1;
		robot1.piezas = 10;
		robot1.color = new String[]{"rojo", "azul", "verde"};
		robot1.disponible = true;
		
		System.out.println("El robot STEM con ID " + robot1.id + " tiene " + robot1.piezas);
	}


}
