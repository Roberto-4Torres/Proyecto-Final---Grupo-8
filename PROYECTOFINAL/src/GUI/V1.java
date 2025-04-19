package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class V1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnRegistrar;
	private JLabel lblUsuario;
	private JTextField textField_1;
	private JScrollPane scrollPane;
	private JLabel lblListasPrestamos;
	private JLabel lblUsuario_2;
	private JLabel lblFechaDePrestamo;
	private JTextField textField_2;
	private JLabel lblFechaDeDevolucin;
	private JTextField textField_3;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Sistema de Préstamo de libros - Biblioteca Lima");
			lblNewLabel.setBounds(124, 11, 234, 14);
			contentPane.add(lblNewLabel);
		}
		{
			textField = new JTextField();
			textField.setBounds(324, 48, 115, 20);
			contentPane.add(textField);
			textField.setColumns(10);
		}
		{
			btnNewButton = new JButton("Registrar Prestamo:");
			btnNewButton.setBounds(26, 173, 173, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnRegistrar = new JButton("Registrar Devolución:");
			btnRegistrar.setBounds(250, 173, 183, 23);
			contentPane.add(btnRegistrar);
		}
		{
			lblUsuario = new JLabel("Libro:");
			lblUsuario.setBounds(26, 51, 128, 14);
			contentPane.add(lblUsuario);
		}
		{
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(59, 48, 115, 20);
			contentPane.add(textField_1);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 243, 437, 152);
			contentPane.add(scrollPane);
			{
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
			}
		}
		{
			lblListasPrestamos = new JLabel("Lista de Prestamos:");
			lblListasPrestamos.setBounds(10, 218, 142, 14);
			contentPane.add(lblListasPrestamos);
		}
		{
			lblUsuario_2 = new JLabel("Usuario:");
			lblUsuario_2.setBounds(274, 51, 128, 14);
			contentPane.add(lblUsuario_2);
		}
		{
			lblFechaDePrestamo = new JLabel("Fecha de Préstamo:");
			lblFechaDePrestamo.setBounds(26, 94, 161, 14);
			contentPane.add(lblFechaDePrestamo);
		}
		{
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(139, 91, 115, 20);
			contentPane.add(textField_2);
		}
		{
			lblFechaDeDevolucin = new JLabel("Fecha de Devolución:");
			lblFechaDeDevolucin.setBounds(26, 119, 161, 14);
			contentPane.add(lblFechaDeDevolucin);
		}
		{
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(139, 116, 115, 20);
			contentPane.add(textField_3);
		}
	}
}

