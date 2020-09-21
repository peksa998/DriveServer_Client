package klijent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistracijaGUI {

	public JFrame frmDiskfoncreateaccaunt;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblConfirmPassword;
	private JLabel lblType;
	private JTextField textUsername;
	private JComboBox comboBoxType;
	private JButton btnCreate;
	private JLabel lblWarningPass;
	private JLabel lblWarningConfirmPass;
	private JLabel lblWarningUser;
	private JPasswordField passwordField;
	private JPasswordField passwordField_ConfirmPass;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistracijaGUI window = new RegistracijaGUI();
					window.frmDiskfoncreateaccaunt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegistracijaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDiskfoncreateaccaunt = new JFrame();
		frmDiskfoncreateaccaunt.setIconImage(Toolkit.getDefaultToolkit().getImage(RegistracijaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		frmDiskfoncreateaccaunt.setTitle("DISKFON/create-account");
		frmDiskfoncreateaccaunt.setResizable(false);
		frmDiskfoncreateaccaunt.setBounds(100, 100, 590, 355);
		frmDiskfoncreateaccaunt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{196, 218, 143, 0};
		gridBagLayout.rowHeights = new int[]{10, 20, 25, 15, 25, 15, 25, 15, 25, 25, 25, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmDiskfoncreateaccaunt.getContentPane().setLayout(gridBagLayout);
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.anchor = GridBagConstraints.EAST;
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.gridx = 0;
		gbc_lblUsername.gridy = 2;
		frmDiskfoncreateaccaunt.getContentPane().add(getLblUsername(), gbc_lblUsername);
		GridBagConstraints gbc_textUsername = new GridBagConstraints();
		gbc_textUsername.insets = new Insets(0, 0, 5, 5);
		gbc_textUsername.fill = GridBagConstraints.BOTH;
		gbc_textUsername.gridx = 1;
		gbc_textUsername.gridy = 2;
		frmDiskfoncreateaccaunt.getContentPane().add(getTextUsername(), gbc_textUsername);
		GridBagConstraints gbc_lblWarningUser = new GridBagConstraints();
		gbc_lblWarningUser.anchor = GridBagConstraints.NORTH;
		gbc_lblWarningUser.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarningUser.gridx = 1;
		gbc_lblWarningUser.gridy = 3;
		frmDiskfoncreateaccaunt.getContentPane().add(getLblWarningUser(), gbc_lblWarningUser);
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 4;
		frmDiskfoncreateaccaunt.getContentPane().add(getLblPassword(), gbc_lblPassword);
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 4;
		frmDiskfoncreateaccaunt.getContentPane().add(getPasswordField(), gbc_passwordField);
		GridBagConstraints gbc_lblWarningPass = new GridBagConstraints();
		gbc_lblWarningPass.anchor = GridBagConstraints.NORTH;
		gbc_lblWarningPass.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarningPass.gridx = 1;
		gbc_lblWarningPass.gridy = 5;
		frmDiskfoncreateaccaunt.getContentPane().add(getLblWarningPass(), gbc_lblWarningPass);
		GridBagConstraints gbc_lblConfirmPassword = new GridBagConstraints();
		gbc_lblConfirmPassword.anchor = GridBagConstraints.EAST;
		gbc_lblConfirmPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmPassword.gridx = 0;
		gbc_lblConfirmPassword.gridy = 6;
		frmDiskfoncreateaccaunt.getContentPane().add(getLblConfirmPassword(), gbc_lblConfirmPassword);
		GridBagConstraints gbc_passwordField_ConfirmPass = new GridBagConstraints();
		gbc_passwordField_ConfirmPass.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField_ConfirmPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_ConfirmPass.gridx = 1;
		gbc_passwordField_ConfirmPass.gridy = 6;
		frmDiskfoncreateaccaunt.getContentPane().add(getPasswordField_ConfirmPass(), gbc_passwordField_ConfirmPass);
		GridBagConstraints gbc_lblWarningConfirmPass = new GridBagConstraints();
		gbc_lblWarningConfirmPass.anchor = GridBagConstraints.NORTH;
		gbc_lblWarningConfirmPass.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarningConfirmPass.gridx = 1;
		gbc_lblWarningConfirmPass.gridy = 7;
		frmDiskfoncreateaccaunt.getContentPane().add(getLblWarningConfirmPass(), gbc_lblWarningConfirmPass);
		GridBagConstraints gbc_lblType = new GridBagConstraints();
		gbc_lblType.anchor = GridBagConstraints.EAST;
		gbc_lblType.insets = new Insets(0, 0, 5, 5);
		gbc_lblType.gridx = 0;
		gbc_lblType.gridy = 8;
		frmDiskfoncreateaccaunt.getContentPane().add(getLblType(), gbc_lblType);
		GridBagConstraints gbc_comboBoxType = new GridBagConstraints();
		gbc_comboBoxType.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxType.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxType.gridx = 1;
		gbc_comboBoxType.gridy = 8;
		frmDiskfoncreateaccaunt.getContentPane().add(getComboBoxType(), gbc_comboBoxType);
		GridBagConstraints gbc_btnCreate = new GridBagConstraints();
		gbc_btnCreate.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCreate.insets = new Insets(0, 0, 0, 5);
		gbc_btnCreate.gridx = 1;
		gbc_btnCreate.gridy = 10;
		frmDiskfoncreateaccaunt.getContentPane().add(getBtnCreate(), gbc_btnCreate);
	}

	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username:");
			lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblUsername;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password:");
			lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblPassword;
	}
	private JLabel getLblConfirmPassword() {
		if (lblConfirmPassword == null) {
			lblConfirmPassword = new JLabel("Confirm password:");
			lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblConfirmPassword;
	}
	private JLabel getLblType() {
		if (lblType == null) {
			lblType = new JLabel("Type:");
			lblType.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblType;
	}
	private JTextField getTextUsername() {
		if (textUsername == null) {
			textUsername = new JTextField();
			textUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textUsername.setColumns(10);
		}
		return textUsername;
	}
	private JComboBox getComboBoxType() {
		if (comboBoxType == null) {
			comboBoxType = new JComboBox();
			comboBoxType.setFont(new Font("Dialog", Font.BOLD, 16));
			comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"Standard", "Premium"}));
			comboBoxType.setToolTipText("");
			comboBoxType.setEditable(false);
		}
		return comboBoxType;
	}
	private JButton getBtnCreate() {
		if (btnCreate == null) {
			btnCreate = new JButton("Create");
			btnCreate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
//					----------------------------------------------------------
					
					Klijent.username = textUsername.getText();
					Klijent.password = passwordField.getText();
					Klijent.type = comboBoxType.getSelectedItem().toString();
					
					
					String pass1 = passwordField.getText();
					String pass2 = passwordField_ConfirmPass.getText();
					
					if(!pass1.equals(pass2)) {
						lblWarningConfirmPass.setText("Passwords don't match!");
					} else {
						Klijent.kod_za_slanje = 10;
						
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						if(Klijent.kod_za_prijem == 2) {
							lblWarningUser.setText("Username not available!");
							Klijent.kod_za_prijem = 0;
						} else {
							JOptionPane.showMessageDialog(null, "Account created!");
							Klijent.kod_za_prijem = 0;
							
							PrijavaGUI prozor = new PrijavaGUI();
							frmDiskfoncreateaccaunt.setVisible(false);
							prozor.frmDiskfon.setVisible(true);
						}
					}
				
//					----------------------------------------------------------
				}
			});
			btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnCreate;
	}
	private JLabel getLblWarningPass() {
		if (lblWarningPass == null) {
			lblWarningPass = new JLabel("");
			lblWarningPass.setForeground(Color.RED);
		}
		return lblWarningPass;
	}
	private JLabel getLblWarningConfirmPass() {
		if (lblWarningConfirmPass == null) {
			lblWarningConfirmPass = new JLabel("");
			lblWarningConfirmPass.setForeground(Color.RED);
		}
		return lblWarningConfirmPass;
	}
	private JLabel getLblWarningUser() {
		if (lblWarningUser == null) {
			lblWarningUser = new JLabel("");
			lblWarningUser.setForeground(Color.RED);
		}
		return lblWarningUser;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return passwordField;
	}
	private JPasswordField getPasswordField_ConfirmPass() {
		if (passwordField_ConfirmPass == null) {
			passwordField_ConfirmPass = new JPasswordField();
			passwordField_ConfirmPass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return passwordField_ConfirmPass;
	}
}
