package ec.ups.edu.evacardenastracycli.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.namespace.QName;

import ec.ups.edu.evacardenastracycli.CrearLibro;
import ec.ups.edu.evacardenastracycli.Libro;
import ec.ups.edu.evacardenastracycli.LibroServiceSOAP;
import ec.ups.edu.evacardenastracycli.LibroServiceSOAPService;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCrear extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtAutor;
	private JTextField txtPrecio;
	private Libro libro;
	private static final QName SERVICE_NAME = new QName("http://service.EVACardenasTracySRV.edu.ups.ec/", "LibroServiceSOAPService");

    URL wsdlURL = LibroServiceSOAPService.WSDL_LOCATION;
	LibroServiceSOAPService ss = new LibroServiceSOAPService(wsdlURL, SERVICE_NAME);
    LibroServiceSOAP port = ss.getLibroServiceSOAPPort();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCrear frame = new VentanaCrear();
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
	public void crearLibro() {
		libro = new Libro();
		int id = Integer.parseInt(txtId.getText());
		String nombre = txtNombre.getText();
		String autor = txtAutor.getText();
		Double precio = Double.parseDouble(txtPrecio.getText());
		libro.setId(id);
		libro.setNombre(nombre);
		libro.setAutor(autor);
		libro.setPrecio(precio);
		port.crearLibro(libro);
		
	}
	public VentanaCrear() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(65, 55, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(65, 93, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Autor");
		lblNewLabel_2.setBounds(65, 139, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio");
		lblNewLabel_3.setBounds(65, 173, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		txtId = new JTextField();
		txtId.setBounds(120, 52, 96, 19);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(120, 90, 96, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtAutor = new JTextField();
		txtAutor.setBounds(120, 136, 96, 19);
		contentPane.add(txtAutor);
		txtAutor.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(120, 170, 96, 19);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("LIBRO");
		lblNewLabel_4.setBounds(136, 20, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearLibro();
			}
			
		});
		btnGuardar.setBounds(120, 218, 85, 21);
		contentPane.add(btnGuardar);
	}
}
