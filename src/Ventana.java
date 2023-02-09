import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField cod;
	private JTextField nombre;
	private JTextField loc;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setTitle("Ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 250);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTO");
		lblNewLabel.setBounds(10, 11, 394, 26);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setToolTipText("");
		
		JLabel lblNewLabel_1 = new JLabel("Codigo de departamento");
		lblNewLabel_1.setBounds(57, 45, 137, 15);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		cod = new JTextField();
		cod.setToolTipText("");
		cod.setBounds(204, 43, 200, 20);
		cod.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre de departamento");
		lblNewLabel_1_1.setBounds(51, 76, 143, 15);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		nombre = new JTextField();
		nombre.setBounds(204, 74, 200, 20);
		nombre.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Localidad departamento");
		lblNewLabel_1_1_1.setBounds(63, 105, 131, 15);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		loc = new JTextField();
		loc.setBounds(204, 105, 200, 20);
		loc.setColumns(10);
		panel.setLayout(null);
		panel.add(lblNewLabel_1);
		panel.add(cod);
		panel.add(lblNewLabel_1_1);
		panel.add(nombre);
		panel.add(lblNewLabel_1_1_1);
		panel.add(loc);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"España", "Italia", "Reino Unido", "Francia", "Portugal"}));
		comboBox.setBounds(204, 139, 137, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Pais:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(124, 140, 70, 20);
		panel.add(lblNewLabel_2);
		
		//Boton de Limpiar
		JButton btnNewButton_1 = new JButton("Limpiar Datos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cod.setText("");
				nombre.setText("");
				loc.setText("");
			}
		});
		btnNewButton_1.setBounds(204, 172, 200, 23);
		panel.add(btnNewButton_1);
		
		//Añadir panel de scroll
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 205, 394, 44);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de Departamento:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(449, 24, 135, 14);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton rdbtnGestion = new JRadioButton("Gestion");
		buttonGroup.add(rdbtnGestion);
		rdbtnGestion.setBounds(448, 45, 109, 23);
		contentPane.add(rdbtnGestion);
		ButtonModel gestion=rdbtnGestion.getModel();
		
		JRadioButton rdbtnPersonal = new JRadioButton("Personal");
		buttonGroup.add(rdbtnPersonal);
		rdbtnPersonal.setBounds(448, 71, 109, 23);
		contentPane.add(rdbtnPersonal);
		ButtonModel personal=rdbtnPersonal.getModel();
		
		JRadioButton rdbtnApoyo = new JRadioButton("Apoyo");
		buttonGroup.add(rdbtnApoyo);
		rdbtnApoyo.setBounds(448, 97, 109, 23);
		contentPane.add(rdbtnApoyo);
		ButtonModel apoyo=rdbtnApoyo.getModel();
		
		JRadioButton rdbtnTecnologico = new JRadioButton("Tecnologico");
		buttonGroup.add(rdbtnTecnologico);
		rdbtnTecnologico.setBounds(449, 123, 109, 23);
		contentPane.add(rdbtnTecnologico);
		ButtonModel tecnologico=rdbtnTecnologico.getModel();
		
		//Boton de insertar datos
		JButton btnNewButton = new JButton("Insertar Datos");
		btnNewButton.setBounds(10, 171, 184, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("El codigo de departamento es: "+cod.getText());
				System.out.println("El nombre de departamento es: "+nombre.getText());
				System.out.println("La localidad de departamento es: "+loc.getText());
				System.out.println("El pais del departamento es: "+comboBox.getSelectedIndex()+" "+comboBox.getSelectedItem());
				if(buttonGroup.getSelection()!=null) {
					if(buttonGroup.getSelection().equals(gestion))
						System.out.println("Pulsaste Gestion");
					if(buttonGroup.getSelection().equals(personal))
						System.out.println("Pulsaste Personal");
					if(buttonGroup.getSelection().equals(apoyo))
						System.out.println("Pulsaste Apoyo");
					if(buttonGroup.getSelection().equals(tecnologico))
						System.out.println("Pulsaste Tecnologico");
				}
				textArea.setText("");
				textArea.append("Primera linea wow");
				textArea.append("\nSegunda linea ohh");	
				textArea.append("\nuwu");
			}
		});
		panel.add(btnNewButton);
	}
}
