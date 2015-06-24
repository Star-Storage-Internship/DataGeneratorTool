package ro.starstorage.datageneratortool.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JList;

import java.awt.TextArea;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollBar;

public class UserInterface {

	private JFrame frmDataGenerator;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			System.out.println("Error setting native LAF: " + e);
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInterface window = new UserInterface();
					window.frmDataGenerator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDataGenerator = new JFrame();
		frmDataGenerator.setResizable(false);
		frmDataGenerator.setTitle("Data Generator");
		frmDataGenerator.setBounds(100, 100, 614, 408);
		frmDataGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDataGenerator.getContentPane().setLayout(null);

		JButton btnGenereaza = new JButton("Genereaza");
		btnGenereaza.setBounds(248, 335, 89, 23);
		frmDataGenerator.getContentPane().add(btnGenereaza);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(117, 32, 139, 23);
		frmDataGenerator.getContentPane().add(comboBox);

		comboBox.addItem("Fisier .CVS");
		comboBox.addItem("Script .SQL");
		comboBox.addItem("Script .SQL si executie in BD");

		JTextPane txtpnTipExoprt = new JTextPane();
		txtpnTipExoprt.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnTipExoprt.setText("Tip export");
		txtpnTipExoprt.setEditable(false);
		txtpnTipExoprt
				.setBackground(UIManager.getColor("ArrowButton.disabled"));
		txtpnTipExoprt.setBounds(10, 32, 102, 23);
		frmDataGenerator.getContentPane().add(txtpnTipExoprt);

		JTextPane txtpnNrRepetari = new JTextPane();
		txtpnNrRepetari.setText("Nr. repetari");
		txtpnNrRepetari.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnNrRepetari.setEditable(false);
		txtpnNrRepetari.setBackground((Color) null);
		txtpnNrRepetari.setBounds(10, 66, 102, 23);
		frmDataGenerator.getContentPane().add(txtpnNrRepetari);

		textField = new JTextField();
		textField.setBounds(117, 66, 139, 20);
		frmDataGenerator.getContentPane().add(textField);
		textField.setColumns(10);

		JTextPane txtpnFisierContinut = new JTextPane();
		txtpnFisierContinut.setText("Fisier continut");
		txtpnFisierContinut.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnFisierContinut.setEditable(false);
		txtpnFisierContinut.setBackground((Color) null);
		txtpnFisierContinut.setBounds(10, 100, 102, 23);
		frmDataGenerator.getContentPane().add(txtpnFisierContinut);

		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(117, 100, 139, 23);
		frmDataGenerator.getContentPane().add(comboBox_1);

		comboBox_1.addItem("Nu");
		comboBox_1.addItem("Da");

		JList<Object> list = new JList<Object>();
		list.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null,
				null, null));
		list.setBounds(433, 162, 115, 143);
		frmDataGenerator.getContentPane().add(list);

		TextArea textArea = new TextArea();
		textArea.setBounds(30, 162, 343, 143);
		frmDataGenerator.getContentPane().add(textArea);

		JTextPane txtpnInput = new JTextPane();
		txtpnInput.setText("Input:");
		txtpnInput.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnInput.setEditable(false);
		txtpnInput.setBackground((Color) null);
		txtpnInput.setBounds(30, 133, 102, 23);
		frmDataGenerator.getContentPane().add(txtpnInput);

		JTextPane txtpnTokens = new JTextPane();
		txtpnTokens.setText("Tokens");
		txtpnTokens.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnTokens.setEditable(false);
		txtpnTokens.setBackground((Color) null);
		txtpnTokens.setBounds(433, 133, 102, 23);
		frmDataGenerator.getContentPane().add(txtpnTokens);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(546, 162, 17, 143);
		frmDataGenerator.getContentPane().add(scrollBar);

	}
}
