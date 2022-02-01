package ec.ups.edu.evacardenastracycli.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.URL;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.xml.namespace.QName;

import ec.ups.edu.evacardenastracycli.Libro;
import ec.ups.edu.evacardenastracycli.LibroServiceSOAP;
import ec.ups.edu.evacardenastracycli.LibroServiceSOAPService;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaListar extends JFrame {
	
	

	private JPanel contentPane;
	private static final QName SERVICE_NAME = new QName("http://service.EVACardenasTracySRV.edu.ups.ec/", "LibroServiceSOAPService");

    URL wsdlURL = LibroServiceSOAPService.WSDL_LOCATION;
	LibroServiceSOAPService ss = new LibroServiceSOAPService(wsdlURL, SERVICE_NAME);
    LibroServiceSOAP port = ss.getLibroServiceSOAPPort();
    private List<Libro> libros;
    JTextArea txtArea ;
    private JScrollPane scrollpane1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListar frame = new VentanaListar();
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
	
	public void listarLibros() {
		libros = port.getLibros();
		txtArea.setText(libros+"\n");
		
	}

	public VentanaListar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de Libros");
		lblNewLabel.setBounds(101, 38, 128, 13);
		contentPane.add(lblNewLabel);
		
		txtArea = new JTextArea();
		scrollpane1=new JScrollPane(txtArea);    
        scrollpane1.setBounds(36, 71, 369, 161);
        contentPane.add(scrollpane1);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listarLibros();
			}
		});
		btnListar.setBounds(266, 34, 85, 21);
		contentPane.add(btnListar);
	}
}
