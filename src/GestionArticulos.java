import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionArticulos extends JPanel {
	private JTextField textFieldCodA;
	private JTextField textFieldDenA;
	private JTextField textFieldPrecioA;
	private JTextField textFieldStock;
	private JTextField textFieldZona;

	/**
	 * Create the panel.
	 */
	public GestionArticulos() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GESTION DE ARTICULOS");
		lblNewLabel.setBounds(142, 11, 167, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(240, 255, 255));
		panel.setBounds(10, 36, 415, 239);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblCodArt = new JLabel("Codigo de articulo");
		lblCodArt.setBounds(10, 11, 122, 24);
		panel.add(lblCodArt);
		
		textFieldCodA = new JTextField();
		textFieldCodA.setBounds(142, 13, 92, 20);
		panel.add(textFieldCodA);
		textFieldCodA.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Denominacion de articulo");
		lblNewLabel_1.setBounds(10, 45, 149, 14);
		panel.add(lblNewLabel_1);
		
		textFieldDenA = new JTextField();
		textFieldDenA.setBounds(188, 44, 173, 20);
		panel.add(textFieldDenA);
		textFieldDenA.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(10, 82, 46, 14);
		panel.add(lblPrecio);
		
		textFieldPrecioA = new JTextField();
		textFieldPrecioA.setColumns(10);
		textFieldPrecioA.setBounds(66, 79, 92, 20);
		panel.add(textFieldPrecioA);
		
		textFieldStock = new JTextField();
		textFieldStock.setColumns(10);
		textFieldStock.setBounds(264, 79, 92, 20);
		panel.add(textFieldStock);
		
		JLabel lblStock = new JLabel("Stock:");
		lblStock.setBounds(188, 82, 66, 14);
		panel.add(lblStock);
		
		JLabel lblZona = new JLabel("Nombre de zona");
		lblZona.setBounds(10, 125, 122, 14);
		panel.add(lblZona);
		
		textFieldZona = new JTextField();
		textFieldZona.setColumns(10);
		textFieldZona.setBounds(142, 122, 181, 20);
		panel.add(textFieldZona);
		
		JLabel lblProveedor = new JLabel("Proveedor");
		lblProveedor.setBounds(10, 161, 92, 14);
		panel.add(lblProveedor);
		
		JComboBox comboBoxProveedor = new JComboBox();
		comboBoxProveedor.setModel(new DefaultComboBoxModel(new String[] {"Richard Wildmark", "Benito Camela", "Rosa Melano", "Crotolamo", "M. Rajoy"}));
		comboBoxProveedor.setBounds(112, 157, 181, 22);
		panel.add(comboBoxProveedor);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 286, 415, 95);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textFieldCodA.setText("");
				textFieldDenA.setText("");
				textFieldPrecioA.setText("");
				textFieldStock.setText("");
				textFieldZona.setText("");
				comboBoxProveedor.setSelectedIndex(0);
			}
		});
		btnLimpiar.setBounds(315, 157, 89, 23);
		panel.add(btnLimpiar);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("ARTICULO INTRODUCIDO");
				textArea.append("\nCodigo del producto: "+textFieldCodA.getText());
				textArea.append("\nDenominacion del producto: "+textFieldDenA.getText());
				textArea.append("\nPrecio del producto: "+textFieldPrecioA.getText());
				textArea.append("\nStock del producto: "+textFieldStock.getText());
				textArea.append("\nNombre de la zona: "+textFieldZona.getText());
				textArea.append("\nProveedor: "+comboBoxProveedor.getSelectedItem());
			}
		});
		btnInsertar.setBounds(10, 194, 89, 23);
		panel.add(btnInsertar);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.setBounds(272, 12, 122, 23);
		panel.add(btnComprobar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(112, 194, 89, 23);
		panel.add(btnBorrar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(211, 194, 89, 23);
		panel.add(btnModificar);
		
		JButton btnVisualizar = new JButton("Visualizar");
		btnVisualizar.setBounds(315, 194, 99, 23);
		panel.add(btnVisualizar);
		
	}
}
