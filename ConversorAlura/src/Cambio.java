import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cambio {

	Operaciones operacion=new Operaciones();

	
	public Cambio() {
		cambioDivisa();
	}

	public void cambioDivisa() {

		JComboBox combo = new JComboBox();

		combo.addItem("Conversor de Lempiras");
		combo.addItem("Calculadora");
		combo.addItem("Conversor extranjero");
		JOptionPane.showMessageDialog(null,combo);

//		System.out.println(combo.getSelectedIndex());

		if (combo.getSelectedIndex() == 0) {
//			System.out.println("ingresaste a monedas");
			monedas();
       
		} else if (combo.getSelectedIndex() == 1) {
       ejecucion();
		}else if(combo.getSelectedIndex()==2) {
			Prueba33 pp=new Prueba33();
			pp.setVisible(true);
		}

	}
/////////////////////////////////////////////////////////////////////////
	public void monedas() {

		JComboBox combo1=new JComboBox();
		combo1.addItem(".Dolar");
		combo1.addItem(".Quetzal");
		combo1.addItem(".Euro");
		combo1.addItem(".Yuang");
		combo1.addItem(".Salir");
				
	
		do {
			JOptionPane.showMessageDialog(null, combo1);
  
			switch(combo1.getSelectedIndex()) {
			case 0:
				String cantidad=JOptionPane.showInputDialog("ingrese la cantiad");
				if(!validarNumero(cantidad.trim())) {
					JOptionPane.showMessageDialog(null, "solo numero sin espacio");
				}else {
					JOptionPane.showMessageDialog(null,cantidad+"Lps"+" cambiados a dolares es"+ (Integer.parseInt(cantidad)*0.041)+"$");
				}
				break;
			case 1:
				cantidad=JOptionPane.showInputDialog("ingrese la cantiad");
				if(!validarNumero(cantidad.trim())) {
					JOptionPane.showMessageDialog(null, "solo numero sin espacio");
				}else {
					JOptionPane.showMessageDialog(null,cantidad+"Lps"+" cambiados a Quetzales es"+ (Integer.parseInt(cantidad)*0.32)+"Q");
				}
				break;
			case 2:
				cantidad=JOptionPane.showInputDialog("ingrese la cantiad");
				if(!validarNumero(cantidad.trim())) {
					JOptionPane.showMessageDialog(null, "solo numero sin espacio");
				}else {
					JOptionPane.showMessageDialog(null,cantidad+"Lps"+" cambiados a Euros es"+ (Integer.parseInt(cantidad)*0.038)+"€");
				}

				break;
			case 3:
				cantidad=JOptionPane.showInputDialog("ingrese la cantiad");
				if(!validarNumero(cantidad.trim())) {
					JOptionPane.showMessageDialog(null, "solo numero sin espacio");
				}else {
					JOptionPane.showMessageDialog(null,cantidad+"Lps"+" cambiados a Yaun es"+ (Integer.parseInt(cantidad)*0.28)+"¥");
				}

				break;
			case 4:

				JOptionPane.showMessageDialog(null, "FIN del programa");
				break;
			default:
				JOptionPane.showMessageDialog(null,"dato no valido");

				break;
			
			}
			
		}while(combo1.getSelectedIndex()!=4);		
	 
	}
////////////////////////////////////////////////////////////////////////
 	public void ejecucion() {
		
		String menu="primer aplicacion\n";
		menu+="1. suma\n";
		menu+="2. resta\n";
		menu+="3. multiplicacion\n";
		menu+="4. division\n";
		menu+="5. salir\n";
		menu+="-----------------------\n";
		menu+="ingrese una opcion\n";
		int op=0;
		
		
		
		do {
			String n=JOptionPane.showInputDialog(menu);
      if(!validarNumero(n.trim())) {
				JOptionPane.showMessageDialog(null, "solo numero sin espacio");
      }else {
      	op=Integer.parseInt(n);
      }
			

			switch(op) {
			case 1:
				
				String num1=JOptionPane.showInputDialog(null,"numero 1");
				String num2=JOptionPane.showInputDialog(null,"numero 2");
				if(validarNnum(num1.trim(),num2.trim())) {
					JOptionPane.showMessageDialog(null,"la suma es "+ operacion.suma(Integer.parseInt(num1), Integer.parseInt(num2)));
				}else {
					JOptionPane.showMessageDialog(null, "solo numero sin espacio");
				}
				break;
			case 2:
				num1=JOptionPane.showInputDialog(null,"numero 1");
				num2=JOptionPane.showInputDialog(null,"numero 2");
				if(validarNnum(num1.trim(),num2.trim())) {
					JOptionPane.showMessageDialog(null,"la resta es "+ operacion.resta(Integer.parseInt(num1), Integer.parseInt(num2)));
				}else {
					JOptionPane.showMessageDialog(null, "solo numero sin espacio");
				}
				break;
			case 3:
				num1=JOptionPane.showInputDialog(null,"numero 1");
				num2=JOptionPane.showInputDialog(null,"numero 2");
				if(validarNnum(num1.trim(),num2.trim())) {
					JOptionPane.showMessageDialog(null,"la multiplicacion es "+ operacion.multiplicacion(Integer.parseInt(num1), Integer.parseInt(num2)));
				}else {
					JOptionPane.showMessageDialog(null, "solo numero sin espacio");
				}
				break;
			case 4:
				num1=JOptionPane.showInputDialog(null,"numero 1");
				num2=JOptionPane.showInputDialog(null,"numero 2");
				if(validarNnum(num1.trim(),num2.trim())) {
					JOptionPane.showMessageDialog(null,"la division es "+ operacion.division(Integer.parseInt(num1), Integer.parseInt(num2)));
				}else {
					JOptionPane.showMessageDialog(null, "solo numero sin espacio");
				}
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "FIN del programa");
				break;
			
			}
			
		}while(op!=5);
		
	}
 	public boolean validarNumero(String datos) {
 		return datos.matches("[0-9]*");
 	}
 	public boolean validarNnum(String num1,String num2) {
 		if(num1.matches("[0-9]*")&&num2.matches("[0-9]*")) {
 			return true;
 		}else {
 			return false;
 		}
 	}
 	
}
