
public class Operaciones {

	public int suma(int num1,int num2) {
		return num1+num2;
	}
	
	public int resta(int num1,int num2) {
		return num1-num2;
	}
	
	public int multiplicacion(int num1,int num2) {
		return num1*num2;
	}
	
	public String division(int num1,int num2) {
		if(num2!=0) {
			return (num1/num2)+"";
		}
		return "no se aceptan ceros o en blanco";
	}
	
}
