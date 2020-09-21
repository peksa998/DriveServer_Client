package klijent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;

public class MoveDirectoryGUI {

	public JFrame frmDiskfonmovedirectory;
	private JTextField textFieldCurrent;
	private JTextField textFieldDestination;
	private JLabel lblCurrent;
	private JLabel lblDestination;
	private JLabel lblWarningCurrent;
	private JLabel lblWarningDestination;
	private JButton btnMove;
	private JLabel lblInsertPath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoveDirectoryGUI window = new MoveDirectoryGUI();
					window.frmDiskfonmovedirectory.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MoveDirectoryGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDiskfonmovedirectory = new JFrame();
		frmDiskfonmovedirectory.setResizable(false);
		frmDiskfonmovedirectory.setIconImage(Toolkit.getDefaultToolkit().getImage(MoveDirectoryGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		frmDiskfonmovedirectory.setTitle("DISKFON/move-directory");
		frmDiskfonmovedirectory.setBounds(100, 100, 525, 280);
		frmDiskfonmovedirectory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{126, 306, 59, 46, 0};
		gridBagLayout.rowHeights = new int[]{25, 25, 25, 25, 25, 25, 25, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmDiskfonmovedirectory.getContentPane().setLayout(gridBagLayout);
		GridBagConstraints gbc_lblInsertPath = new GridBagConstraints();
		gbc_lblInsertPath.insets = new Insets(0, 0, 5, 5);
		gbc_lblInsertPath.gridx = 1;
		gbc_lblInsertPath.gridy = 1;
		frmDiskfonmovedirectory.getContentPane().add(getLblInsertPath(), gbc_lblInsertPath);
		GridBagConstraints gbc_lblCurrent = new GridBagConstraints();
		gbc_lblCurrent.insets = new Insets(0, 0, 5, 5);
		gbc_lblCurrent.anchor = GridBagConstraints.EAST;
		gbc_lblCurrent.gridx = 0;
		gbc_lblCurrent.gridy = 2;
		frmDiskfonmovedirectory.getContentPane().add(getLblCurrent(), gbc_lblCurrent);
		GridBagConstraints gbc_textFieldCurrent = new GridBagConstraints();
		gbc_textFieldCurrent.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldCurrent.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCurrent.gridx = 1;
		gbc_textFieldCurrent.gridy = 2;
		frmDiskfonmovedirectory.getContentPane().add(getTextFieldCurrent(), gbc_textFieldCurrent);
		GridBagConstraints gbc_lblWarningCurrent = new GridBagConstraints();
		gbc_lblWarningCurrent.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarningCurrent.gridx = 1;
		gbc_lblWarningCurrent.gridy = 3;
		frmDiskfonmovedirectory.getContentPane().add(getLblWarningCurrent(), gbc_lblWarningCurrent);
		GridBagConstraints gbc_lblDestination = new GridBagConstraints();
		gbc_lblDestination.insets = new Insets(0, 0, 5, 5);
		gbc_lblDestination.anchor = GridBagConstraints.EAST;
		gbc_lblDestination.gridx = 0;
		gbc_lblDestination.gridy = 4;
		frmDiskfonmovedirectory.getContentPane().add(getLblDestination(), gbc_lblDestination);
		GridBagConstraints gbc_textFieldDestination = new GridBagConstraints();
		gbc_textFieldDestination.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldDestination.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldDestination.gridx = 1;
		gbc_textFieldDestination.gridy = 4;
		frmDiskfonmovedirectory.getContentPane().add(getTextFieldDestination(), gbc_textFieldDestination);
		GridBagConstraints gbc_lblWarningDestination = new GridBagConstraints();
		gbc_lblWarningDestination.insets = new Insets(0, 0, 5, 5);
		gbc_lblWarningDestination.gridx = 1;
		gbc_lblWarningDestination.gridy = 5;
		frmDiskfonmovedirectory.getContentPane().add(getLblWarningDestination(), gbc_lblWarningDestination);
		GridBagConstraints gbc_btnMove = new GridBagConstraints();
		gbc_btnMove.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMove.insets = new Insets(0, 0, 0, 5);
		gbc_btnMove.gridx = 1;
		gbc_btnMove.gridy = 6;
		frmDiskfonmovedirectory.getContentPane().add(getBtnMove(), gbc_btnMove);
	}

	private JTextField getTextFieldCurrent() {
		if (textFieldCurrent == null) {
			textFieldCurrent = new JTextField();
			textFieldCurrent.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textFieldCurrent.setColumns(10);
		}
		return textFieldCurrent;
	}
	private JTextField getTextFieldDestination() {
		if (textFieldDestination == null) {
			textFieldDestination = new JTextField();
			textFieldDestination.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textFieldDestination.setColumns(10);
		}
		return textFieldDestination;
	}
	private JLabel getLblCurrent() {
		if (lblCurrent == null) {
			lblCurrent = new JLabel("Current:");
			lblCurrent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblCurrent;
	}
	private JLabel getLblDestination() {
		if (lblDestination == null) {
			lblDestination = new JLabel("Destination:");
			lblDestination.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblDestination;
	}
	private JLabel getLblWarningCurrent() {
		if (lblWarningCurrent == null) {
			lblWarningCurrent = new JLabel("");
			lblWarningCurrent.setForeground(Color.RED);
			lblWarningCurrent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblWarningCurrent;
	}
	private JLabel getLblWarningDestination() {
		if (lblWarningDestination == null) {
			lblWarningDestination = new JLabel("");
			lblWarningDestination.setForeground(Color.RED);
			lblWarningDestination.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblWarningDestination;
	}
	private JButton getBtnMove() {
		if (btnMove == null) {
			btnMove = new JButton("Move");
			btnMove.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnMove;
	}
	private JLabel getLblInsertPath() {
		if (lblInsertPath == null) {
			lblInsertPath = new JLabel("Insert path");
			lblInsertPath.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblInsertPath;
	}
}
