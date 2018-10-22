
public class FiguraComplexa extends Figura {
	
	/**
	 * Metodo Para calcular uma Figura Complexa
	 */

	@Override
	public void calcularArea() {	
		
	}
	
	public void calcularArea(double q1, double q2, double r1a, double r1b, double r2a, double r2b) {
		this.lado1 = q1;
		this.lado1 = q2;
		this.lado1 = r1a;
		this.lado1 = r1b;
		this.lado1 = r2a;
		this.lado1 = r2b;
		
		double result = ((q1 * q1) + (q2 * q2) + (r1a * r1b) + (r2a + r2b));
		System.out.println("A area da Figura Complexa é: " + result);
		
		
	}
	
	
}
