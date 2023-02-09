import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextPane;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField codigoOfi;
	private JTextField nombreOfi;
	private JTextField gratificacion;
	private JTextField codigoDep;
	private JTextField nombreDep;
	private JTextField localidadDep;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
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
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 311);
		contentPane.add(tabbedPane);
		
		JPanel departamentos = new JPanel();
		tabbedPane.addTab("Insertar Departamentos", null, departamentos, null);
		departamentos.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Codigo Departamento: ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(10, 31, 153, 14);
		departamentos.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel_1.setBounds(153, 5, 174, 15);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		departamentos.add(lblNewLabel_1);
		
		codigoDep = new JTextField();
		codigoDep.setBackground(Color.LIGHT_GRAY);
		codigoDep.setForeground(Color.BLACK);
		codigoDep.setBounds(173, 28, 86, 20);
		departamentos.add(codigoDep);
		codigoDep.setColumns(10);
		
		nombreDep = new JTextField();
		nombreDep.setColumns(10);
		nombreDep.setBounds(173, 59, 204, 20);
		departamentos.add(nombreDep);
		
		localidadDep = new JTextField();
		localidadDep.setColumns(10);
		localidadDep.setBounds(173, 90, 204, 20);
		departamentos.add(localidadDep);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre Departamento: ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(10, 62, 153, 14);
		departamentos.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Localidad Departamento:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(10, 93, 153, 14);
		departamentos.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Pais Departamento:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(42, 125, 121, 14);
		departamentos.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"España", "Portugal", "Francia", "Italia", "Alemania"}));
		comboBox.setBounds(173, 121, 204, 22);
		departamentos.add(comboBox);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 190, 409, 82);
		departamentos.add(scrollPane_1);
		
		JTextArea textAreaDep = new JTextArea();
		scrollPane_1.setViewportView(textAreaDep);
		
		JButton btnInsertarDep = new JButton("Insertar Departamento");
		btnInsertarDep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaDep.setText("Departamento introducido: ");
				textAreaDep.append("\nEl codigo de departamento es "+codigoDep.getText());
				textAreaDep.append("\nEl nombre de departamento es "+nombreDep.getText());
				textAreaDep.append("\nLa localidad de departamento es "+localidadDep.getText());
				textAreaDep.append("\nEl pais de departamento es "+comboBox.getSelectedItem());
			}
		});
		btnInsertarDep.setBounds(10, 156, 199, 23);
		departamentos.add(btnInsertarDep);
		
		JButton btnLimpiarDep = new JButton("Limpiar Departamento");
		btnLimpiarDep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaDep.setText("");
				codigoDep.setText("");
				nombreDep.setText("");
				localidadDep.setText("");
				comboBox.setSelectedIndex(0);
			}
		});
		btnLimpiarDep.setBounds(219, 156, 200, 23);
		departamentos.add(btnLimpiarDep);
		
		JPanel oficinas = new JPanel();
		tabbedPane.addTab("Insertar Oficinas", null, oficinas, null);
		oficinas.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INSERCION DE OFICINAS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(135, 11, 163, 14);
		oficinas.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(57, 36, 325, 100);
		oficinas.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblcodigo = new JLabel("Codigo:");
		lblcodigo.setBounds(10, 11, 92, 14);
		panel_2.add(lblcodigo);
		
		codigoOfi = new JTextField();
		codigoOfi.setBounds(106, 8, 209, 20);
		panel_2.add(codigoOfi);
		codigoOfi.setColumns(10);
		
		JLabel lblnombre = new JLabel("Nombre:");
		lblnombre.setBounds(10, 42, 92, 14);
		panel_2.add(lblnombre);
		
		nombreOfi = new JTextField();
		nombreOfi.setColumns(10);
		nombreOfi.setBounds(106, 39, 209, 20);
		panel_2.add(nombreOfi);
		
		JLabel lblgratificacion = new JLabel("Gratificación:");
		lblgratificacion.setBounds(10, 75, 92, 14);
		panel_2.add(lblgratificacion);
		
		gratificacion = new JTextField();
		gratificacion.setColumns(10);
		gratificacion.setBounds(106, 71, 209, 20);
		panel_2.add(gratificacion);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 182, 409, 90);
		oficinas.add(scrollPane);
		
		JTextArea textAreaOfi = new JTextArea();
		scrollPane.setViewportView(textAreaOfi);
		
		JButton btnInsOficina = new JButton("Insertar datos");
		btnInsOficina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaOfi.setText("Oficina a insertar:");
				textAreaOfi.append("\nEl codigo de oficina es "+codigoOfi.getText());
				textAreaOfi.append("\nEl nombre de oficina es "+nombreOfi.getText());
				textAreaOfi.append("\nLa gratificacion de oficina es "+gratificacion.getText());
			}
		});
		btnInsOficina.setBounds(67, 148, 150, 23);
		oficinas.add(btnInsOficina);
		
		JButton btnLimpOficina = new JButton("Limpiar datos");
		btnLimpOficina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaOfi.setText("");
				codigoOfi.setText("");
				nombreOfi.setText("");
				gratificacion.setText("");
			}
		});
		btnLimpOficina.setBounds(227, 147, 150, 23);
		oficinas.add(btnLimpOficina);
	}
}
