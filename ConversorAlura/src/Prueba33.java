import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class Prueba33 extends JFrame implements ActionListener{


	SistemaConversion scon=new SistemaConversion();
	private JPanel contentPane;
	JButton btnCambio;
	JComboBox comboBox2,comboBox1;
	private JTextField txtcantidad;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Prueba33 frame = new Prueba33();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}


	/**
	 * Create the frame.
	 */
	public Prueba33() {
		setResizable(false);
		setTitle("Aplicacion de Monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"DOLAR", "EURO", "LIBRAS", "YUANG", "ZEN"}));
		comboBox2.setBounds(223, 42, 109, 22);
		contentPane.add(comboBox2);
		
		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"DOLAR", "EURO", "LIBRAS", "YUANG", "ZEN"}));
		comboBox1.setBounds(61, 42, 109, 22);
		contentPane.add(comboBox1);
		
		JLabel lblNewLabel = new JLabel("CAMBIAR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(142, 11, 89, 26);
		contentPane.add(lblNewLabel);
		
		btnCambio = new JButton("Cambio");
		btnCambio.setBounds(142, 138, 89, 29);
		contentPane.add(btnCambio);
		btnCambio.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("DE");
		lblNewLabel_1.setBounds(27, 46, 24, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("A");
		lblNewLabel_1_1.setBounds(189, 46, 24, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtcantidad = new JTextField();
		txtcantidad.setBounds(133, 96, 86, 20);
		contentPane.add(txtcantidad);
		txtcantidad.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(btnCambio==e.getSource()) {
			int cb1=comboBox1.getSelectedIndex();
			int cb2=comboBox2.getSelectedIndex();
			if(!validarNumero(txtcantidad.getText())) {
				JOptionPane.showMessageDialog(null, "solo numero sin espacio");
			}else {
				double cantidad=Double.parseDouble(txtcantidad.getText());
				JOptionPane.showMessageDialog(null,scon.SistemaConversion(cb1, cb2, cantidad));
			}

		}
	}
 	public boolean validarNumero(String datos) {
 		return datos.matches("[0-9]*");
 	}
}
