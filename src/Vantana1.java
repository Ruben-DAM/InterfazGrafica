import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

import java.awt.ScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;

public class Vantana1 extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField precio;
	private final ButtonGroup buttonGroupCategoria = new ButtonGroup();
	private final ButtonGroup buttonGroupIVA = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vantana1 frame = new Vantana1();
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
	public Vantana1() {
		setTitle("Ventana gestion de productos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreDeProducto = new JLabel("Nombre de producto:");
		lblNombreDeProducto.setBounds(10, 11, 166, 14);
		contentPane.add(lblNombreDeProducto);
		
		JLabel lblTipoDeProducto = new JLabel("Tipo de producto:");
		lblTipoDeProducto.setBounds(10, 36, 166, 14);
		contentPane.add(lblTipoDeProducto);
		
		JLabel lblPrecioDelProducto = new JLabel("Precio del producto:");
		lblPrecioDelProducto.setBounds(10, 61, 166, 14);
		contentPane.add(lblPrecioDelProducto);
		
		nombre = new JTextField();
		nombre.setBounds(186, 8, 124, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		precio = new JTextField();
		precio.setColumns(10);
		precio.setBounds(186, 58, 124, 20);
		contentPane.add(precio);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"De temporada", "Todo el año"}));
		comboBox.setBounds(186, 32, 124, 22);
		contentPane.add(comboBox);
		
		JCheckBox chckbxAplicaTasa = new JCheckBox("Aplica Tasa");
		chckbxAplicaTasa.setBounds(327, 32, 97, 23);
		contentPane.add(chckbxAplicaTasa);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setBounds(36, 99, 63, 14);
		contentPane.add(lblCategoria);
		
		JRadioButton rdbtnExtra = new JRadioButton("Extra");
		buttonGroupCategoria.add(rdbtnExtra);
		rdbtnExtra.setBounds(105, 95, 77, 23);
		contentPane.add(rdbtnExtra);
		ButtonModel extra=rdbtnExtra.getModel();
		
		JRadioButton rdbtnSegunda = new JRadioButton("Segunda");
		buttonGroupCategoria.add(rdbtnSegunda);
		rdbtnSegunda.setBounds(184, 95, 97, 23);
		contentPane.add(rdbtnSegunda);
		ButtonModel segunda=rdbtnSegunda.getModel();
		
		JRadioButton rdbtnPrimera = new JRadioButton("Primera");
		buttonGroupCategoria.add(rdbtnPrimera);
		rdbtnPrimera.setBounds(105, 121, 77, 23);
		contentPane.add(rdbtnPrimera);
		ButtonModel primera=rdbtnPrimera.getModel();
		
		JRadioButton rdbtnSuperExtra = new JRadioButton("Super Extra");
		buttonGroupCategoria.add(rdbtnSuperExtra);
		rdbtnSuperExtra.setBounds(184, 121, 97, 23);
		contentPane.add(rdbtnSuperExtra);
		ButtonModel superExtra=rdbtnSuperExtra.getModel();
		
		JLabel lblIva = new JLabel("IVA:");
		lblIva.setBounds(36, 162, 63, 14);
		contentPane.add(lblIva);
		
		JRadioButton rdbtn4 = new JRadioButton("4%");
		buttonGroupIVA.add(rdbtn4);
		rdbtn4.setBounds(105, 158, 55, 23);
		contentPane.add(rdbtn4);
		ButtonModel cuatro=rdbtn4.getModel();
		
		JRadioButton rdbtn10 = new JRadioButton("10%");
		buttonGroupIVA.add(rdbtn10);
		rdbtn10.setBounds(175, 158, 55, 23);
		contentPane.add(rdbtn10);
		ButtonModel diez=rdbtn10.getModel();
		
		JRadioButton rdbtn21 = new JRadioButton("21%");
		buttonGroupIVA.add(rdbtn21);
		rdbtn21.setBounds(242, 158, 55, 23);
		contentPane.add(rdbtn21);
		ButtonModel veintiuno=rdbtn21.getModel();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 217, 397, 130);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnInsertar = new JButton("Insertar Datos");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("LOS DATOS TECLEADOS SON");
				textArea.append("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				textArea.append("\nNombre introducido: "+nombre.getText());
				textArea.append("\nPrecio introducido: "+precio.getText());
				textArea.append("\nCategoria del producto: "+comboBox.getSelectedItem());
				textArea.append("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
				
				textArea.append("\nCategoria ");
				if(buttonGroupCategoria.getSelection()!=null) {
					if(buttonGroupCategoria.getSelection().equals(extra))
						textArea.append("extra");
					if(buttonGroupCategoria.getSelection().equals(primera))
						textArea.append("primera");
					if(buttonGroupCategoria.getSelection().equals(segunda))
						textArea.append("segunda");
					if(buttonGroupCategoria.getSelection().equals(superExtra))
						textArea.append("super extra");
				} else textArea.append("no seleccionada");
				
				textArea.append("\nIVA ");
				if(buttonGroupIVA.getSelection()!=null) {
					if(buttonGroupIVA.getSelection().equals(cuatro))
						textArea.append("4%");
					if(buttonGroupIVA.getSelection().equals(diez))
						textArea.append("10%");
					if(buttonGroupIVA.getSelection().equals(veintiuno))
						textArea.append("21%");
				} else textArea.append("no seleccionado");
				
				if(chckbxAplicaTasa.isSelected()) {
					textArea.append("\nTasa aplicada");
				} else textArea.append("\nTasa no aplicada");
				
			}
		});
		btnInsertar.setBounds(67, 188, 134, 23);
		contentPane.add(btnInsertar);
		
		JButton btnLimpiar = new JButton("Limpiar Datos");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				nombre.setText("");
				precio.setText("");
				comboBox.setSelectedIndex(0);
				chckbxAplicaTasa.setSelected(false);
				buttonGroupCategoria.clearSelection();
				buttonGroupIVA.clearSelection();
			}
		});
		btnLimpiar.setBounds(204, 188, 134, 23);
		contentPane.add(btnLimpiar);
		
	}
}
