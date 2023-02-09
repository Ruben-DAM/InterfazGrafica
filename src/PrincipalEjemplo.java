import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalEjemplo extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField textFieldCodF;
	private JTextField textFieldAltF;
	private JTextField textFieldPesoF;
	private JComboBox comboBoxPaisF;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalEjemplo frame = new PrincipalEjemplo();
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
	public PrincipalEjemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(0, 0, 434, 381);
		contentPane.add(tabbedPane);
		
		JPanel panelMasc = new JPanel();
		tabbedPane.addTab("Masculino", null, panelMasc, null);
		panelMasc.setLayout(null);
		
		JPanel panelFem = new JPanel();
		panelFem.setForeground(Color.BLACK);
		tabbedPane.addTab("Femenino", null, panelFem, null);
		panelFem.setLayout(null);
		
		JLabel lbl1fem = new JLabel("Gimnasia Ritmica Femenina");
		lbl1fem.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl1fem.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1fem.setBounds(0, 0, 429, 52);
		panelFem.add(lbl1fem);
		
		JLabel lblCodGimF = new JLabel("Codigo de gimnasta: ");
		lblCodGimF.setBounds(10, 68, 115, 14);
		panelFem.add(lblCodGimF);
		
		JLabel lblEstaturaF = new JLabel("Estatura(m): ");
		lblEstaturaF.setBounds(10, 96, 115, 14);
		panelFem.add(lblEstaturaF);
		
		JLabel lblPesoF = new JLabel("Peso(kg): ");
		lblPesoF.setBounds(10, 121, 115, 14);
		panelFem.add(lblPesoF);
		
		textFieldCodF = new JTextField();
		textFieldCodF.setForeground(Color.YELLOW);
		textFieldCodF.setBackground(Color.PINK);
		textFieldCodF.setBounds(135, 65, 115, 20);
		panelFem.add(textFieldCodF);
		textFieldCodF.setColumns(10);
		
		textFieldAltF = new JTextField();
		textFieldAltF.setForeground(Color.YELLOW);
		textFieldAltF.setBackground(Color.PINK);
		textFieldAltF.setColumns(10);
		textFieldAltF.setBounds(135, 93, 115, 20);
		panelFem.add(textFieldAltF);
		
		textFieldPesoF = new JTextField();
		textFieldPesoF.setBackground(Color.PINK);
		textFieldPesoF.setForeground(Color.YELLOW);
		textFieldPesoF.setColumns(10);
		textFieldPesoF.setBounds(135, 118, 115, 20);
		panelFem.add(textFieldPesoF);
		
		comboBoxPaisF = new JComboBox();
		comboBoxPaisF.setBackground(new Color(216, 191, 216));
		comboBoxPaisF.setModel(new DefaultComboBoxModel(new String[] {"España", "Rusia", "Ucrania", "China", "Japon"}));
		comboBoxPaisF.setBounds(135, 149, 115, 22);
		panelFem.add(comboBoxPaisF);
		
		JLabel lblPaisF = new JLabel("Pais: ");
		lblPaisF.setBounds(10, 153, 115, 14);
		panelFem.add(lblPaisF);
		
		JLabel lblRankingF = new JLabel("Ranking:");
		lblRankingF.setHorizontalAlignment(SwingConstants.CENTER);
		lblRankingF.setBounds(260, 68, 76, 14);
		panelFem.add(lblRankingF);
		
		JRadioButton rdbtnLooserF = new JRadioButton("Loosers");
		buttonGroup.add(rdbtnLooserF);
		rdbtnLooserF.setBounds(270, 87, 109, 23);
		panelFem.add(rdbtnLooserF);
		
		JRadioButton rdbtnMehF = new JRadioButton("Meh");
		buttonGroup.add(rdbtnMehF);
		rdbtnMehF.setBounds(270, 117, 109, 23);
		panelFem.add(rdbtnMehF);
		
		JRadioButton rdbtnGoatF = new JRadioButton("GOAT");
		buttonGroup.add(rdbtnGoatF);
		rdbtnGoatF.setBounds(270, 144, 109, 23);
		panelFem.add(rdbtnGoatF);
		
		JCheckBox chckbxEmbarazada = new JCheckBox("Embarazada");
		chckbxEmbarazada.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxEmbarazada.setBounds(10, 174, 115, 23);
		panelFem.add(chckbxEmbarazada);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 237, 409, 105);
		panelFem.add(scrollPane);
		
		JTextArea textAreaF = new JTextArea();
		scrollPane.setViewportView(textAreaF);
		
		JButton btnInsertarF = new JButton("Insertar");
		
		btnInsertarF.setBounds(88, 204, 115, 23);
		panelFem.add(btnInsertarF);
		
		JButton btnLimpiarF = new JButton("Limpiar");
		
		btnLimpiarF.setBounds(213, 204, 126, 23);
		panelFem.add(btnLimpiarF);
		
		ButtonModel bmLooserF = rdbtnLooserF.getModel();
		ButtonModel bmMehF = rdbtnMehF.getModel();
		ButtonModel bmGoatF = rdbtnGoatF.getModel();
		
		btnInsertarF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaF.setText("Los datos introducidos son");
				textAreaF.append("\nEl codigo de la gimansta es "+textFieldCodF.getText());
				textAreaF.append("\nLa altura de la gimansta es "+textFieldAltF.getText()+" metros");
				textAreaF.append("\nEl peso de la gimansta es "+textFieldPesoF.getText()+" kilos");
				textAreaF.append("\nEl pais de la gimansta es "+comboBoxPaisF.getSelectedItem());
				
				if(chckbxEmbarazada.isSelected()) {
					textAreaF.append("\nLa gimnasta esta preñada");
				} else {
					textAreaF.append("\nLa gimnasta no lleva bombo");
				}
				
				if(buttonGroup.getSelection()!=null) {
					if(buttonGroup.getSelection().equals(bmLooserF))
						textAreaF.append("\nLa gimnasta es una looser");
					if(buttonGroup.getSelection().equals(bmMehF))
						textAreaF.append("\nLa gimnasta es meh");
					if(buttonGroup.getSelection().equals(bmGoatF))
						textAreaF.append("\nLa gimnasta esta GOD");
				}
			}
		});
		btnLimpiarF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaF.setText("");
				textFieldCodF.setText("");
				textFieldAltF.setText("");
				textFieldPesoF.setText("");
				chckbxEmbarazada.setSelected(false);
				buttonGroup.clearSelection();
			}
		});
	}
}
