
public class Operacao {
		
	double a;
	double b;
		
	public void subtracao(double resultado) {
		resultado = a-b;
	}
	
	public void calculaMedia(double resultado) {
		resultado = (a*0.2+b*0.6)/2;
	}
	
	public void fatorial(double resultado) {
		for (int i=0; i<a; i++) {
			resultado = a*a;
			a = a-1;
		}
		
	}

}
