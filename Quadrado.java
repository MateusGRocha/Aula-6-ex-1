
public class Quadrado extends Figura {
	
	/**
	 * Calculo do Quadrado
	 */

	@Override
	public void calcularArea() {
	}
	
	public void calcularArea(Double lado1) {
		this.lado1 = lado1;
		
		System.out.println("A area do Quadrado é: " + lado1 * lado1);
		
	}
	
	
}
