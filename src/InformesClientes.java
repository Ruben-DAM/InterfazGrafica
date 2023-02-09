import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class InformesClientes extends JPanel {

	/**
	 * Create the panel.
	 */
	public InformesClientes() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INFORME DE CLIENTES");
		lblNewLabel.setBounds(124, 11, 185, 27);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione el cliente a visualizar");
		lblNewLabel_1.setBounds(20, 55, 185, 14);
		add(lblNewLabel_1);
		
		JComboBox comboBoxCliente = new JComboBox();
		comboBoxCliente.setModel(new DefaultComboBoxModel(new String[] {"Bad Bunny", "Chencho Corleone", "J Balvin", "Maluma"}));
		comboBoxCliente.setBounds(223, 51, 191, 22);
		add(comboBoxCliente);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 156, 350, 130);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnVerCliente = new JButton("Ver Cliente");
		btnVerCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("INFORMACION DEL CLIENTE");
				textArea.append("\nEl cliente es: "+comboBoxCliente.getSelectedItem());
			}
		});
		btnVerCliente.setBounds(42, 100, 163, 23);
		add(btnVerCliente);
		
		JButton btnLimpiarCliente = new JButton("Limpiar Cliente");
		btnLimpiarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				comboBoxCliente.setSelectedIndex(0);
			}
		});
		btnLimpiarCliente.setBounds(223, 100, 168, 23);
		add(btnLimpiarCliente);
				
	}
}
