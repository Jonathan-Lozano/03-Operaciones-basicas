import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public class Ventana extends JFrame implements ActionListener{
	
	private JTextField txtN1 = new JTextField();
	private JTextField txtN2 = new JTextField();
	
	private JLabel lblN1 = new JLabel("Numero 1");
	private JLabel lblN2 = new JLabel("Numero 2");
	private JLabel lblResultado = new JLabel("Resultado");
	
	private JButton btnCalcular = new JButton("Calcular");
	private Container c = getContentPane();
	
	private Operaciones op = new Operaciones();
	
	/**
	 * Constructor para crear una ventana
	 */
	public Ventana(){
		super.setTitle("Operaciones");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cargarControles();
		
	}

	/**
	 * Metodo para agregar controles
	 */
	private void cargarControles() {
		c.setLayout(null);
		
		lblN1.setBounds(10, 10, 290, 30);
		c.add(lblN1);

		txtN1.setBounds(10, 40, 290, 30);
		c.add(txtN1);
		
		lblN2.setBounds(10, 80, 290, 30);
		c.add(lblN2);
		
		txtN2.setBounds(10, 110, 290, 30);
		c.add(txtN2);
		
		btnCalcular.setBounds(110, 170, 90, 30);
		c.add(btnCalcular);
		
		lblResultado.setBounds(10, 200, 290, 30);
		c.add(lblResultado);
		
		btnCalcular.addActionListener(this);
	}

	/**
	 * Accion al precionar el boton Calcular
	 * Se hace una suma y al precionar este boton muestra el resultado de la suma
	 * con los valores ingresados en las cajas de texto
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		int res = op.sumar(Integer.parseInt(txtN1.getText()), Integer.parseInt(txtN2.getText()));
		
		lblResultado.setText(String.format("\n%s + %s = %d", txtN1.getText(), txtN2.getText(), res));
	}
}
