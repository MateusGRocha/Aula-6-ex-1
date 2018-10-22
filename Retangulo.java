
public class Retangulo extends Figura {
	
	/**
	 * Metodo do Retangulo
	 */

	@Override
	public void calcularArea() {
		

	}
	
	public void calcularArea(Double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado1 = lado2;
		
		System.out.println("A area do Retangulo é: " + lado1 * lado2);
		
	}
	
}
