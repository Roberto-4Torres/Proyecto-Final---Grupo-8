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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

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
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

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
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(26, 173, 173, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnRegistrar = new JButton("Registrar Devolución:");
			btnRegistrar.addActionListener(this);
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
		{
			btnNewButton_1 = new JButton("REGISTRAR LIBRO:");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(269, 90, 170, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Eliminar");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(165, 209, 89, 23);
			contentPane.add(btnNewButton_2);
		}
		{
			btnNewButton_3 = new JButton("Revisar Disponibilidad");
			btnNewButton_3.addActionListener(this);
			btnNewButton_3.setBounds(26, 144, 173, 23);
			contentPane.add(btnNewButton_3);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_3) {
			do_btnNewButton_3_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrar) {
			do_btnRegistrar_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		//Boton Registrar Prestamo
	}
	protected void do_btnRegistrar_actionPerformed(ActionEvent e) {
		//Boton Registrar Devolución
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		//Boton REGISTRAR LIBRO - Roberto Torres Casapia
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		//Boton ELIMINAR LIBRO - Raul Yarupaayta Arotaype
	}
	protected void do_btnNewButton_3_actionPerformed(ActionEvent e) {
		//Botón Revisar Disponibilidad - Edgar Vasquez Bedoya
	}
}

