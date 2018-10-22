
public class Calculador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciar os Objetos
		Quadrado q1 = new Quadrado();
		Retangulo r1 = new Retangulo();
		FiguraComplexa fc1 = new FiguraComplexa();
		
		//atribuir valores aos Objetos
		q1.calcularArea(5.0);
		r1.calcularArea(5.0, 2);
		fc1.calcularArea(3.0, 10, 2, 7, 5, 3);		
		
	}

}
