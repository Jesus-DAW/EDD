package introduccion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Window {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 816, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrIntroduccinDeClientes = new JTextArea();
		txtrIntroduccinDeClientes.setText("INTRODUCCI\u00D3N DE CLIENTES");
		txtrIntroduccinDeClientes.setBounds(290, 27, 204, 27);
		frame.getContentPane().add(txtrIntroduccinDeClientes);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(134, 143, 46, 13);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(134, 219, 46, 13);
		frame.getContentPane().add(lblApellidos);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(134, 278, 46, 13);
		frame.getContentPane().add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(276, 140, 269, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(276, 216, 269, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(276, 275, 269, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(338, 338, 85, 21);
		frame.getContentPane().add(btnEnviar);
	}
}
