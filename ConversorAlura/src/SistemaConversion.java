
public class SistemaConversion {

  Conversion conver=new Conversion();
	
  public double SistemaConversion(int con1,int con2,double cantidad) {
		
		double resultado=0;
		

		switch(con1){
		case 0:
			switch(con2) {
			case 0:
			  resultado=1*cantidad;
				break;
			case 1:
				resultado=cantidad*conver.getDeuro();
				break;
			case 2:
				resultado=cantidad*conver.getDlibras();
				break;
			case 3:
				resultado=cantidad*conver.getDwon();
				break;
			case 4:
				resultado=cantidad*conver.getDyen();
				break;
			}
			break;
		case 1:
			switch(con2) {
			case 0:
				resultado=cantidad*conver.getEdolar();
				break;
			case 1:
				resultado=cantidad*1;
				break;
			case 2:
				resultado=cantidad*conver.getElibras();
				break;
			case 3:
				resultado=cantidad*conver.getEwon();
				break;
			case 4:
				resultado=cantidad*conver.getEyen();
				break;
			}
			break;
		case 2:
			switch(con2) {
			case 0:
				resultado=cantidad*conver.getLdolar();
				break;
			case 1:
				resultado=cantidad*conver.getLeuro();
				break;
			case 2:
				resultado=cantidad*1;
				break;
			case 3:
				resultado=cantidad*conver.getLwon();
				break;
			case 4:
				resultado=cantidad*conver.getLyen();
				break;
			}
			break;
		case 3:
			switch(con2) {
			case 0:
				resultado=cantidad*conver.getWdolar();
				break;
			case 1:
				resultado=cantidad*conver.getWeuro();
				break;
			case 2:
				resultado=cantidad*conver.getWlibras();
				break;
			case 3:
				resultado=cantidad*1;
				break;
			case 4:
				resultado=cantidad*conver.getWyen();
				break;
			}
			break;
		case 4:
			switch(con2) {
			case 0:
				resultado=cantidad*conver.getYdolar();
				break;
			case 1:
				resultado=cantidad*conver.getYeuro();
				break;
			case 2:
				resultado=cantidad*conver.getYlibras();
				break;
			case 3:
				resultado=cantidad*conver.getYwon();
				break;
			case 4:
				resultado=cantidad*1;
				break;
			}
			break;
		
		}
		System.out.println(resultado);
		return resultado;
	}
	
}
