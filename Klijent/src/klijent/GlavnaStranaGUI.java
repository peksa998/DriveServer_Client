package klijent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import javax.swing.JTree;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.DropMode;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GlavnaStranaGUI {

	public static  JFrame frmDiskfon_glavni;
	private JPanel panel_header;
	private JLabel lblUser;
	private JLabel lblAccType;
	private JButton btnLogout;
	private JTabbedPane tabbedPane;
	private JPanel panel_home;
	private JPanel panel_share;
	private JPanel panel_shareWithMe;
	private JPanel panel_home_top;
	private JPanel panel_home_left;
	private JScrollPane scrollPaneHome;
	private JTextArea textAreaHome;
	private JButton btnUpload;
	private JTextField txtDirectoryName;
	private JButton btnAddDirectory;
	private JButton btnRenameDyrectory;
	private JButton btnRemoveDirectory;
	private JLabel lblView;
	private JLabel lblDirectory_name;
	private JPanel panel_home_bottom;
	private JButton btnMoveDirectory;
	private JButton btnDownload;
	private JPanel panel_right;
	private JButton btnShare;
	private JLabel lblShareNull;
	private JButton btnStopShare;
	private JLabel lblStopShareNull;
	private JLabel lblUsersList;
	private JScrollPane scrollPaneUsersShare;
	private JList listUsersForShare;
	private JLabel lblMakeLinkForShare;
	private JLabel lblDirectoryNameNull;
	private JLabel lblLink;
	private JTextField textLink;
	private JLabel lblUspesnoKreiranLink;
	private JScrollPane scrollPaneShareWithMe;
	private JTextArea textAreaShareWithMe;
	private JPanel panel_top_swm;
	private JPanel panel_left_swm;
	private JScrollPane scrollPane_list;
	private JList list_swm;
	private JButton btnConfirmUser;
	private JScrollPane scrollPane_tree;
	private JButton btnShow;
	private JLabel lblUsersList_swm;
	private JLabel lblUsersDirectory;
	private JPanel panel_bottom_swm;
	private JLabel lblView_swm;
	private JPanel panel_right_swm;
	private JButton btnCreateLink;
	private JScrollPane scrollPane;
	private JList listHome;
	private JLabel lblPathHome;
	private JLabel lblPathhomenull;
	private JButton btnClearviewHome;
	
	public static String selekcijaZaBrisanje = "";
	
	public static String selectedItem = "";
	
	public static String selectedItem1 = "";
	public static String selectedItem2 = "";
	public static String selectedItem3 = "";
	public static String selectedItem4 = "";
	
	public static String selectedItem1_swm = "";
	public static String selectedItem2_swm = "";
	public static String selectedItem3_swm = "";
	public static String selectedItem4_swm = "";
	
	private JButton btnBackHome;
	
	public static String selekcija_share = "";
	public static String selekcija_share_wm = "";
	private JList list_swm_drive;
	private JLabel lblPath_swm;
	private JLabel lblPath_swmNull;
	private JButton btnBack_swm;
	private JButton btnClearView_swm;
	private JButton btnRefresh;
	private JLabel lblUploads;
	public static JLabel lblUploadsNull;
	
	public String p_pom = "";
	public String getP_pom() {
		return p_pom;
	}

	public void setP_pom(String p_pom) {
		this.p_pom = p_pom;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}
	public String p = "";
	public static JLabel lbluserNull;
	public static JLabel lblTypeNull;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GlavnaStranaGUI window = new GlavnaStranaGUI();
					window.frmDiskfon_glavni.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GlavnaStranaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDiskfon_glavni = new JFrame();
		frmDiskfon_glavni.setTitle("DISKFON");
		frmDiskfon_glavni.setIconImage(Toolkit.getDefaultToolkit().getImage(GlavnaStranaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		frmDiskfon_glavni.setBounds(100, 100, 900, 560);
		frmDiskfon_glavni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDiskfon_glavni.getContentPane().setLayout(new BorderLayout(0, 0));
		frmDiskfon_glavni.getContentPane().add(getPanel_1(), BorderLayout.NORTH);
		frmDiskfon_glavni.getContentPane().add(getTabbedPane(), BorderLayout.CENTER);
	}
	private JPanel getPanel_1() {
		if (panel_header == null) {
			panel_header = new JPanel();
			GroupLayout gl_panel_header = new GroupLayout(panel_header);
			gl_panel_header.setHorizontalGroup(
				gl_panel_header.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_header.createSequentialGroup()
						.addContainerGap()
						.addComponent(getLblUser())
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(getLbluserNull())
						.addGap(75)
						.addComponent(getLblAccType())
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(getLblTypeNull())
						.addGap(62)
						.addComponent(getLblUploads())
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(getLblUploadsNull())
						.addGap(74)
						.addComponent(getBtnRefresh(), GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
						.addComponent(getBtnLogout())
						.addContainerGap())
			);
			gl_panel_header.setVerticalGroup(
				gl_panel_header.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_panel_header.createSequentialGroup()
						.addGap(13)
						.addGroup(gl_panel_header.createParallelGroup(Alignment.BASELINE)
							.addComponent(getLblUser())
							.addComponent(getLblAccType())
							.addComponent(getBtnLogout())
							.addComponent(getLblUploads())
							.addComponent(getLblUploadsNull())
							.addComponent(getLbluserNull())
							.addComponent(getLblTypeNull()))
						.addContainerGap(17, Short.MAX_VALUE))
					.addGroup(gl_panel_header.createSequentialGroup()
						.addContainerGap(17, Short.MAX_VALUE)
						.addComponent(getBtnRefresh())
						.addContainerGap())
			);
			panel_header.setLayout(gl_panel_header);
		}
		return panel_header;
	}
	private JLabel getLblUser() {
		if (lblUser == null) {
			lblUser = new JLabel("User:");
			lblUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblUser;
	}
	private JLabel getLblAccType() {
		if (lblAccType == null) {
			lblAccType = new JLabel("Account type:");
			lblAccType.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblAccType;
	}
	private JButton getBtnLogout() {
		if (btnLogout == null) {
			btnLogout = new JButton("Logout");
			btnLogout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//*********************************************************
					
					int reply = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
			        if (reply == JOptionPane.YES_OPTION) {
			        Klijent.kraj = true;
			          frmDiskfon_glavni.setVisible(false);
			        }
					
					//*********************************************************
				}
			});
			btnLogout.setForeground(Color.RED);
			btnLogout.setFont(new Font("Tahoma", Font.BOLD, 16));
		}
		return btnLogout;
	}
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
			tabbedPane.setToolTipText("");
			tabbedPane.addTab("Home", new ImageIcon(GlavnaStranaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/HomeFolder.gif")), getPanel_1_1(), null);
			tabbedPane.addTab("Share", new ImageIcon(GlavnaStranaGUI.class.getResource("/com/sun/javafx/scene/web/skin/Copy_16x16_JFX.png")), getPanel_share(), null);
			tabbedPane.addTab("Share with me", new ImageIcon(GlavnaStranaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")), getPanel_shareWithMe(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanel_1_1() {
		if (panel_home == null) {
			panel_home = new JPanel();
			panel_home.setLayout(new BorderLayout(0, 0));
			panel_home.add(getPanel_1_2(), BorderLayout.NORTH);
			panel_home.add(getPanel_home_left(), BorderLayout.WEST);
			panel_home.add(getScrollPaneHome(), BorderLayout.CENTER);
			panel_home.add(getPanel_1_3(), BorderLayout.SOUTH);
			panel_home.add(getPanel_1_4(), BorderLayout.EAST);
		}
		return panel_home;
	}
	private JPanel getPanel_share() {
		if (panel_share == null) {
			panel_share = new JPanel();
			panel_share.setToolTipText("");
			GridBagLayout gbl_panel_share = new GridBagLayout();
			gbl_panel_share.columnWidths = new int[]{170, 134, 0, 86, 0, 0, 0};
			gbl_panel_share.rowHeights = new int[]{35, 25, 25, 25, 25, 25, 25, 0, 0, 0, 0};
			gbl_panel_share.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
			gbl_panel_share.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			panel_share.setLayout(gbl_panel_share);
			GridBagConstraints gbc_lblUsersList = new GridBagConstraints();
			gbc_lblUsersList.anchor = GridBagConstraints.SOUTH;
			gbc_lblUsersList.insets = new Insets(0, 0, 5, 5);
			gbc_lblUsersList.gridx = 0;
			gbc_lblUsersList.gridy = 0;
			panel_share.add(getLabel_1(), gbc_lblUsersList);
			GridBagConstraints gbc_scrollPaneUsersShare = new GridBagConstraints();
			gbc_scrollPaneUsersShare.gridheight = 9;
			gbc_scrollPaneUsersShare.insets = new Insets(0, 8, 5, 5);
			gbc_scrollPaneUsersShare.fill = GridBagConstraints.BOTH;
			gbc_scrollPaneUsersShare.gridx = 0;
			gbc_scrollPaneUsersShare.gridy = 1;
			panel_share.add(getScrollPaneUsersShare(), gbc_scrollPaneUsersShare);
			GridBagConstraints gbc_btnShare = new GridBagConstraints();
			gbc_btnShare.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnShare.insets = new Insets(0, 0, 5, 5);
			gbc_btnShare.gridx = 1;
			gbc_btnShare.gridy = 1;
			panel_share.add(getBtnShare(), gbc_btnShare);
			GridBagConstraints gbc_lblMakeLinkForShare = new GridBagConstraints();
			gbc_lblMakeLinkForShare.anchor = GridBagConstraints.SOUTH;
			gbc_lblMakeLinkForShare.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblMakeLinkForShare.insets = new Insets(0, 0, 5, 5);
			gbc_lblMakeLinkForShare.gridx = 4;
			gbc_lblMakeLinkForShare.gridy = 1;
			panel_share.add(getLblMakeLinkForShare(), gbc_lblMakeLinkForShare);
			GridBagConstraints gbc_lblShareNull = new GridBagConstraints();
			gbc_lblShareNull.insets = new Insets(0, 0, 5, 5);
			gbc_lblShareNull.gridx = 1;
			gbc_lblShareNull.gridy = 2;
			panel_share.add(getLblShareNull(), gbc_lblShareNull);
			GridBagConstraints gbc_lblDirectoryNameNull = new GridBagConstraints();
			gbc_lblDirectoryNameNull.insets = new Insets(0, 0, 5, 5);
			gbc_lblDirectoryNameNull.gridx = 4;
			gbc_lblDirectoryNameNull.gridy = 2;
			panel_share.add(getLblDirectoryNameNull(), gbc_lblDirectoryNameNull);
			GridBagConstraints gbc_btnStopShare = new GridBagConstraints();
			gbc_btnStopShare.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnStopShare.insets = new Insets(0, 0, 5, 5);
			gbc_btnStopShare.gridx = 1;
			gbc_btnStopShare.gridy = 3;
			panel_share.add(getBtnStopShare(), gbc_btnStopShare);
			GridBagConstraints gbc_lblLink = new GridBagConstraints();
			gbc_lblLink.anchor = GridBagConstraints.EAST;
			gbc_lblLink.insets = new Insets(0, 0, 5, 5);
			gbc_lblLink.gridx = 3;
			gbc_lblLink.gridy = 3;
			panel_share.add(getLblLink(), gbc_lblLink);
			GridBagConstraints gbc_textLink = new GridBagConstraints();
			gbc_textLink.insets = new Insets(0, 0, 5, 5);
			gbc_textLink.fill = GridBagConstraints.HORIZONTAL;
			gbc_textLink.gridx = 4;
			gbc_textLink.gridy = 3;
			panel_share.add(getTextLink(), gbc_textLink);
			GridBagConstraints gbc_lblStopShareNull = new GridBagConstraints();
			gbc_lblStopShareNull.insets = new Insets(0, 0, 5, 5);
			gbc_lblStopShareNull.gridx = 1;
			gbc_lblStopShareNull.gridy = 4;
			panel_share.add(getLblStopShareNull(), gbc_lblStopShareNull);
			GridBagConstraints gbc_lblUspesnoKreiranLink = new GridBagConstraints();
			gbc_lblUspesnoKreiranLink.insets = new Insets(0, 0, 5, 5);
			gbc_lblUspesnoKreiranLink.gridx = 4;
			gbc_lblUspesnoKreiranLink.gridy = 4;
			panel_share.add(getLblUspesnoKreiranLink(), gbc_lblUspesnoKreiranLink);
			GridBagConstraints gbc_btnCreateLink = new GridBagConstraints();
			gbc_btnCreateLink.insets = new Insets(0, 0, 5, 5);
			gbc_btnCreateLink.gridx = 4;
			gbc_btnCreateLink.gridy = 5;
			panel_share.add(getBtnCreateLink(), gbc_btnCreateLink);
		}
		return panel_share;
	}
	private JPanel getPanel_shareWithMe() {
		if (panel_shareWithMe == null) {
			panel_shareWithMe = new JPanel();
			panel_shareWithMe.setLayout(new BorderLayout(0, 0));
			panel_shareWithMe.add(getScrollPaneShareWithMe(), BorderLayout.CENTER);
			panel_shareWithMe.add(getPanel_top_swm(), BorderLayout.NORTH);
			panel_shareWithMe.add(getPanel_left_swm(), BorderLayout.WEST);
			panel_shareWithMe.add(getPanel_bottom_swm(), BorderLayout.SOUTH);
			panel_shareWithMe.add(getPanel_right_swm(), BorderLayout.EAST);
		}
		return panel_shareWithMe;
	}
	private JPanel getPanel_1_2() {
		if (panel_home_top == null) {
			panel_home_top = new JPanel();
			panel_home_top.setLayout(new MigLayout("", "[][][][][][][][grow][grow][][grow]", "[]"));
			panel_home_top.add(getBtnUpload(), "cell 0 0");
			panel_home_top.add(getLblView(), "cell 8 0,alignx left,aligny bottom");
			panel_home_top.add(getBtnClearviewHome(), "cell 9 0");
		}
		return panel_home_top;
	}
	private JPanel getPanel_home_left() {
		if (panel_home_left == null) {
			panel_home_left = new JPanel();
			GridBagLayout gbl_panel_home_left = new GridBagLayout();
			gbl_panel_home_left.columnWidths = new int[]{51, 159, 54, 146, 0};
			gbl_panel_home_left.rowHeights = new int[]{30, 30, 30, 30, 30, 30, 0, 0, 0, 0, 0, 0};
			gbl_panel_home_left.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_panel_home_left.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
			panel_home_left.setLayout(gbl_panel_home_left);
			GridBagConstraints gbc_lblPathHome = new GridBagConstraints();
			gbc_lblPathHome.anchor = GridBagConstraints.EAST;
			gbc_lblPathHome.insets = new Insets(0, 0, 5, 5);
			gbc_lblPathHome.gridx = 0;
			gbc_lblPathHome.gridy = 0;
			panel_home_left.add(getLblPathHome(), gbc_lblPathHome);
			GridBagConstraints gbc_lblPathhomenull = new GridBagConstraints();
			gbc_lblPathhomenull.gridwidth = 2;
			gbc_lblPathhomenull.insets = new Insets(0, 0, 5, 5);
			gbc_lblPathhomenull.gridx = 1;
			gbc_lblPathhomenull.gridy = 0;
			panel_home_left.add(getLblPathhomenull(), gbc_lblPathhomenull);
			GridBagConstraints gbc_lblDirectory_name = new GridBagConstraints();
			gbc_lblDirectory_name.anchor = GridBagConstraints.SOUTH;
			gbc_lblDirectory_name.insets = new Insets(0, 0, 5, 0);
			gbc_lblDirectory_name.gridx = 3;
			gbc_lblDirectory_name.gridy = 0;
			panel_home_left.add(getLblDirectory_name(), gbc_lblDirectory_name);
			GridBagConstraints gbc_scrollPane = new GridBagConstraints();
			gbc_scrollPane.gridwidth = 3;
			gbc_scrollPane.gridheight = 8;
			gbc_scrollPane.insets = new Insets(0, 8, 5, 5);
			gbc_scrollPane.fill = GridBagConstraints.BOTH;
			gbc_scrollPane.gridx = 0;
			gbc_scrollPane.gridy = 1;
			panel_home_left.add(getScrollPane(), gbc_scrollPane);
			GridBagConstraints gbc_txtDirectoryName = new GridBagConstraints();
			gbc_txtDirectoryName.anchor = GridBagConstraints.NORTH;
			gbc_txtDirectoryName.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtDirectoryName.insets = new Insets(0, 0, 5, 0);
			gbc_txtDirectoryName.gridx = 3;
			gbc_txtDirectoryName.gridy = 1;
			panel_home_left.add(getTxtDirectoryName(), gbc_txtDirectoryName);
			GridBagConstraints gbc_btnAddDirectory = new GridBagConstraints();
			gbc_btnAddDirectory.anchor = GridBagConstraints.NORTH;
			gbc_btnAddDirectory.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnAddDirectory.insets = new Insets(0, 0, 5, 0);
			gbc_btnAddDirectory.gridx = 3;
			gbc_btnAddDirectory.gridy = 2;
			panel_home_left.add(getBtnAddDirectory(), gbc_btnAddDirectory);
			GridBagConstraints gbc_btnRenameDyrectory = new GridBagConstraints();
			gbc_btnRenameDyrectory.anchor = GridBagConstraints.NORTH;
			gbc_btnRenameDyrectory.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnRenameDyrectory.insets = new Insets(0, 0, 5, 0);
			gbc_btnRenameDyrectory.gridx = 3;
			gbc_btnRenameDyrectory.gridy = 3;
			panel_home_left.add(getBtnRenameDyrectory(), gbc_btnRenameDyrectory);
			GridBagConstraints gbc_btnMoveDirectory = new GridBagConstraints();
			gbc_btnMoveDirectory.anchor = GridBagConstraints.NORTH;
			gbc_btnMoveDirectory.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnMoveDirectory.insets = new Insets(0, 0, 5, 0);
			gbc_btnMoveDirectory.gridx = 3;
			gbc_btnMoveDirectory.gridy = 4;
			panel_home_left.add(getBtnMoveDirectory(), gbc_btnMoveDirectory);
			GridBagConstraints gbc_btnDownload = new GridBagConstraints();
			gbc_btnDownload.anchor = GridBagConstraints.NORTH;
			gbc_btnDownload.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnDownload.insets = new Insets(0, 0, 5, 0);
			gbc_btnDownload.gridx = 3;
			gbc_btnDownload.gridy = 5;
			panel_home_left.add(getBtnDownload(), gbc_btnDownload);
			GridBagConstraints gbc_btnRemoveDirectory = new GridBagConstraints();
			gbc_btnRemoveDirectory.anchor = GridBagConstraints.SOUTH;
			gbc_btnRemoveDirectory.insets = new Insets(0, 0, 5, 0);
			gbc_btnRemoveDirectory.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnRemoveDirectory.gridx = 3;
			gbc_btnRemoveDirectory.gridy = 7;
			panel_home_left.add(getBtnRemoveDirectory(), gbc_btnRemoveDirectory);
			GridBagConstraints gbc_btnBackHome = new GridBagConstraints();
			gbc_btnBackHome.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnBackHome.insets = new Insets(0, 0, 5, 5);
			gbc_btnBackHome.gridx = 1;
			gbc_btnBackHome.gridy = 9;
			panel_home_left.add(getBtnBackHome(), gbc_btnBackHome);
		}
		return panel_home_left;
	}
	private JScrollPane getScrollPaneHome() {
		if (scrollPaneHome == null) {
			scrollPaneHome = new JScrollPane();
			scrollPaneHome.setViewportView(getTextAreaHome());
		}
		return scrollPaneHome;
	}
	private JTextArea getTextAreaHome() {
		if (textAreaHome == null) {
			textAreaHome = new JTextArea();
			textAreaHome.setFont(new Font("Monospaced", Font.PLAIN, 16));
		}
		return textAreaHome;
	}
	private JButton getBtnUpload() {
		if (btnUpload == null) {
			btnUpload = new JButton("Upload");
			btnUpload.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
//				**************************************************************************************
			          JFileChooser file = new JFileChooser();
			          file.setCurrentDirectory(new File(System.getProperty("user.home")));
			          //filter the files
			          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.file", "txt","bin");
			          file.addChoosableFileFilter(filter);
			          int result = file.showSaveDialog(null);
			           //if the user click on save in Jfilechooser
			          if(result == JFileChooser.APPROVE_OPTION){
			              File selectedFile = file.getSelectedFile();
			              Klijent.fileUp = selectedFile;
			              String path = selectedFile.getAbsolutePath();
			              Klijent.file_up_path = path;
			              Klijent.imeFajla = selectedFile.getName();
			            
			              Klijent.kod_za_slanje = 25;
			              
			              
			          }
			           //if the user click on save in Jfilechooser
//				**************************************************************************************					
			          }
				});
			btnUpload.setIcon(new ImageIcon(GlavnaStranaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/upFolder.gif")));
			btnUpload.setForeground(new Color(0, 0, 204));
			btnUpload.setFont(new Font("Tahoma", Font.BOLD, 16));
		}
		return btnUpload;
	}
	private JTextField getTxtDirectoryName() {
		if (txtDirectoryName == null) {
			txtDirectoryName = new JTextField();
			txtDirectoryName.setHorizontalAlignment(SwingConstants.CENTER);
			txtDirectoryName.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtDirectoryName.setColumns(10);
		}
		return txtDirectoryName;
	}
	private JButton getBtnAddDirectory() {
		if (btnAddDirectory == null) {
			btnAddDirectory = new JButton("Add");
			btnAddDirectory.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//******************************************************************************************
					String pom = txtDirectoryName.getText();
					if(!pom.equals("")) {
						Klijent.ime_dir = pom;
						Klijent.kod_za_slanje = 14;
						
						
						
					} else {
						JOptionPane.showMessageDialog(null, "You have not entered a directory name");
					}
					
					
//********************************************************************************************
				}
			});
			btnAddDirectory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnAddDirectory;
	}
	private JButton getBtnRenameDyrectory() {
		if (btnRenameDyrectory == null) {
			btnRenameDyrectory = new JButton("Rename");
			btnRenameDyrectory.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
//**************************************************************************************************
				
					String pom = txtDirectoryName.getText();
					if(!pom.equals("")) {
						Klijent.novo_ime_dir = pom;
						Klijent.kod_za_slanje = 15;
						
					} else {
						JOptionPane.showMessageDialog(null, "You have not entered a directory name");
					}	
					
					
					
					
					
//**************************************************************************************************
				}
			});
			btnRenameDyrectory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnRenameDyrectory;
	}
	private JButton getBtnRemoveDirectory() {
		if (btnRemoveDirectory == null) {
			btnRemoveDirectory = new JButton("Remove");
			btnRemoveDirectory.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
//***********************************************************************************************
					
					
					Klijent.kod_za_slanje = 33;
					
//**********************************************************************************************
				}
			});
			btnRemoveDirectory.setForeground(Color.RED);
			btnRemoveDirectory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnRemoveDirectory;
	}
	private JLabel getLblView() {
		if (lblView == null) {
			lblView = new JLabel("View");
			lblView.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblView;
	}
	private JLabel getLblDirectory_name() {
		if (lblDirectory_name == null) {
			lblDirectory_name = new JLabel("Directory name:");
			lblDirectory_name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblDirectory_name;
	}
	private JPanel getPanel_1_3() {
		if (panel_home_bottom == null) {
			panel_home_bottom = new JPanel();
			panel_home_bottom.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		}
		return panel_home_bottom;
	}
	private JButton getBtnMoveDirectory() {
		if (btnMoveDirectory == null) {
			btnMoveDirectory = new JButton("Move directory");
			btnMoveDirectory.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//****************************************
					
					String pom = txtDirectoryName.getText();
					if(!pom.equals("")) {
						Klijent.dir_roditelj = pom;
						Klijent.kod_za_slanje = 12;
						
					} else {
						JOptionPane.showMessageDialog(null, "You have not entered a directory name");
					}	
					
					
					//****************************************
				}
			});
			btnMoveDirectory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnMoveDirectory;
	}
	private JButton getBtnDownload() {
		if (btnDownload == null) {
			btnDownload = new JButton("Download");
			btnDownload.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnDownload;
	}
	private JPanel getPanel_1_4() {
		if (panel_right == null) {
			panel_right = new JPanel();
		}
		return panel_right;
	}
	private JButton getBtnShare() {
		if (btnShare == null) {
			btnShare = new JButton("Share");
			btnShare.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
//		*******************************************************************************************					
					
					if(!selekcija_share.equals(null)) {
						Klijent.kod_za_slanje = 22;
						
					}
					
					
//		*******************************************************************************************						
				}
			});
			btnShare.setForeground(Color.BLUE);
			btnShare.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnShare;
	}
	private JLabel getLblShareNull() {
		if (lblShareNull == null) {
			lblShareNull = new JLabel("");
			lblShareNull.setForeground(Color.RED);
			lblShareNull.setFont(new Font("Tahoma", Font.PLAIN, 13));
		}
		return lblShareNull;
	}
	private JButton getBtnStopShare() {
		if (btnStopShare == null) {
			btnStopShare = new JButton("Stop share");
			btnStopShare.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
//		*******************************************************************************************					
					
					if(!selekcija_share.equals(null)) {
						Klijent.kod_za_slanje = 23;
						
					}
					
					
//		*******************************************************************************************									
					
					
				}
			});
			btnStopShare.setForeground(Color.RED);
			btnStopShare.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnStopShare;
	}
	private JLabel getLblStopShareNull() {
		if (lblStopShareNull == null) {
			lblStopShareNull = new JLabel("");
			lblStopShareNull.setForeground(Color.RED);
			lblStopShareNull.setFont(new Font("Tahoma", Font.PLAIN, 13));
		}
		return lblStopShareNull;
	}
	private JLabel getLabel_1() {
		if (lblUsersList == null) {
			lblUsersList = new JLabel("Users list");
			lblUsersList.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblUsersList;
	}
	private JScrollPane getScrollPaneUsersShare() {
		if (scrollPaneUsersShare == null) {
			scrollPaneUsersShare = new JScrollPane();
			scrollPaneUsersShare.setViewportView(getListUsersForShare());
		}
		return scrollPaneUsersShare;
	}
	private JList getListUsersForShare() {
		if (listUsersForShare == null) {
			listUsersForShare = new JList();
			listUsersForShare.setForeground(new Color(0, 0, 0));
			listUsersForShare.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
//				*****************************************************************************
					
					String s = (String) listUsersForShare.getSelectedValue();
					
					if(!s.equals(null)) {
						selekcija_share = s;
					}
					
//				*****************************************************************************					
				}
			});
			listUsersForShare.setModel(new AbstractListModel() {
				public int getSize() {
					return Klijent.duzina_liste_share;
				}
				public Object getElementAt(int index) {
					return Klijent.lista_share.get(index);
				}
			});
			listUsersForShare.setBorder(new CompoundBorder(new LineBorder(new Color(0, 120, 215)), null));
			listUsersForShare.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return listUsersForShare;
	}
	private JLabel getLblMakeLinkForShare() {
		if (lblMakeLinkForShare == null) {
			lblMakeLinkForShare = new JLabel("Make link for share");
			lblMakeLinkForShare.setHorizontalAlignment(SwingConstants.CENTER);
			lblMakeLinkForShare.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblMakeLinkForShare;
	}
	private JLabel getLblDirectoryNameNull() {
		if (lblDirectoryNameNull == null) {
			lblDirectoryNameNull = new JLabel("");
			lblDirectoryNameNull.setForeground(Color.RED);
			lblDirectoryNameNull.setFont(new Font("Tahoma", Font.PLAIN, 13));
		}
		return lblDirectoryNameNull;
	}
	private JLabel getLblLink() {
		if (lblLink == null) {
			lblLink = new JLabel("Link:");
			lblLink.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblLink;
	}
	private JTextField getTextLink() {
		if (textLink == null) {
			textLink = new JTextField();
			textLink.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textLink.setColumns(10);
		}
		return textLink;
	}
	private JLabel getLblUspesnoKreiranLink() {
		if (lblUspesnoKreiranLink == null) {
			lblUspesnoKreiranLink = new JLabel("");
			lblUspesnoKreiranLink.setForeground(Color.GREEN);
		}
		return lblUspesnoKreiranLink;
	}
	private JScrollPane getScrollPaneShareWithMe() {
		if (scrollPaneShareWithMe == null) {
			scrollPaneShareWithMe = new JScrollPane();
			scrollPaneShareWithMe.setViewportView(getTextAreaShareWithMe());
		}
		return scrollPaneShareWithMe;
	}
	private JTextArea getTextAreaShareWithMe() {
		if (textAreaShareWithMe == null) {
			textAreaShareWithMe = new JTextArea();
			textAreaShareWithMe.setFont(new Font("Monospaced", Font.PLAIN, 16));
		}
		return textAreaShareWithMe;
	}
	private JPanel getPanel_top_swm() {
		if (panel_top_swm == null) {
			panel_top_swm = new JPanel();
			GroupLayout gl_panel_top_swm = new GroupLayout(panel_top_swm);
			gl_panel_top_swm.setHorizontalGroup(
				gl_panel_top_swm.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_top_swm.createSequentialGroup()
						.addGap(41)
						.addComponent(getLblUsersList_swm())
						.addPreferredGap(ComponentPlacement.RELATED, 418, Short.MAX_VALUE)
						.addComponent(getLblView_swm())
						.addGap(129)
						.addComponent(getBtnClearView_swm())
						.addGap(86))
			);
			gl_panel_top_swm.setVerticalGroup(
				gl_panel_top_swm.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_panel_top_swm.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panel_top_swm.createParallelGroup(Alignment.LEADING)
							.addComponent(getLblUsersList_swm())
							.addGroup(Alignment.TRAILING, gl_panel_top_swm.createParallelGroup(Alignment.BASELINE)
								.addComponent(getBtnClearView_swm())
								.addComponent(getLblView_swm()))))
			);
			panel_top_swm.setLayout(gl_panel_top_swm);
		}
		return panel_top_swm;
	}
	private JPanel getPanel_left_swm() {
		if (panel_left_swm == null) {
			panel_left_swm = new JPanel();
			GridBagLayout gbl_panel_left_swm = new GridBagLayout();
			gbl_panel_left_swm.columnWidths = new int[]{49, 181, 110, 0};
			gbl_panel_left_swm.rowHeights = new int[]{25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 0};
			gbl_panel_left_swm.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_panel_left_swm.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			panel_left_swm.setLayout(gbl_panel_left_swm);
			GridBagConstraints gbc_scrollPane_list = new GridBagConstraints();
			gbc_scrollPane_list.gridwidth = 2;
			gbc_scrollPane_list.gridheight = 5;
			gbc_scrollPane_list.insets = new Insets(3, 8, 5, 5);
			gbc_scrollPane_list.fill = GridBagConstraints.BOTH;
			gbc_scrollPane_list.gridx = 0;
			gbc_scrollPane_list.gridy = 0;
			panel_left_swm.add(getScrollPane_list(), gbc_scrollPane_list);
			GridBagConstraints gbc_btnConfirmUser = new GridBagConstraints();
			gbc_btnConfirmUser.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnConfirmUser.insets = new Insets(0, 0, 5, 0);
			gbc_btnConfirmUser.gridx = 2;
			gbc_btnConfirmUser.gridy = 0;
			panel_left_swm.add(getBtnConfirmUser(), gbc_btnConfirmUser);
			GridBagConstraints gbc_lblUsersDirectory = new GridBagConstraints();
			gbc_lblUsersDirectory.gridwidth = 2;
			gbc_lblUsersDirectory.anchor = GridBagConstraints.SOUTH;
			gbc_lblUsersDirectory.insets = new Insets(0, 0, 5, 5);
			gbc_lblUsersDirectory.gridx = 0;
			gbc_lblUsersDirectory.gridy = 5;
			panel_left_swm.add(getLblUsersDirectory(), gbc_lblUsersDirectory);
			GridBagConstraints gbc_lblPath_swm = new GridBagConstraints();
			gbc_lblPath_swm.anchor = GridBagConstraints.EAST;
			gbc_lblPath_swm.insets = new Insets(0, 0, 5, 5);
			gbc_lblPath_swm.gridx = 0;
			gbc_lblPath_swm.gridy = 6;
			panel_left_swm.add(getLblPath_swm(), gbc_lblPath_swm);
			GridBagConstraints gbc_lblPath_swmNull = new GridBagConstraints();
			gbc_lblPath_swmNull.insets = new Insets(0, 0, 5, 5);
			gbc_lblPath_swmNull.gridx = 1;
			gbc_lblPath_swmNull.gridy = 6;
			panel_left_swm.add(getLblPath_swmNull(), gbc_lblPath_swmNull);
			GridBagConstraints gbc_scrollPane_tree = new GridBagConstraints();
			gbc_scrollPane_tree.gridwidth = 2;
			gbc_scrollPane_tree.gridheight = 6;
			gbc_scrollPane_tree.insets = new Insets(0, 8, 0, 5);
			gbc_scrollPane_tree.fill = GridBagConstraints.BOTH;
			gbc_scrollPane_tree.gridx = 0;
			gbc_scrollPane_tree.gridy = 7;
			panel_left_swm.add(getScrollPane_tree(), gbc_scrollPane_tree);
			GridBagConstraints gbc_btnShow = new GridBagConstraints();
			gbc_btnShow.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnShow.insets = new Insets(0, 0, 5, 0);
			gbc_btnShow.gridx = 2;
			gbc_btnShow.gridy = 7;
			panel_left_swm.add(getBtnShow(), gbc_btnShow);
			GridBagConstraints gbc_btnBack_swm = new GridBagConstraints();
			gbc_btnBack_swm.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnBack_swm.insets = new Insets(0, 0, 5, 0);
			gbc_btnBack_swm.gridx = 2;
			gbc_btnBack_swm.gridy = 11;
			panel_left_swm.add(getBtnBack_swm(), gbc_btnBack_swm);
		}
		return panel_left_swm;
	}
	private JScrollPane getScrollPane_list() {
		if (scrollPane_list == null) {
			scrollPane_list = new JScrollPane();
			scrollPane_list.setViewportView(getList_swm());
		}
		return scrollPane_list;
	}
	private JList getList_swm() {
		if (list_swm == null) {
			list_swm = new JList();
			list_swm.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
//		****************************************************************************************************
					
					String s = (String) list_swm.getSelectedValue();
					
					if(!s.equals(null)) {
						selekcija_share_wm = s;
						Klijent.owner = s;
					}
					
//		****************************************************************************************************					
				}
			});
			list_swm.setBorder(new LineBorder(UIManager.getColor("MenuItem.selectionBackground")));
			list_swm.setModel(new AbstractListModel() {
				public int getSize() {
					return Klijent.duzina_liste_share_wm;
				}
				public Object getElementAt(int index) {
					return Klijent.lista_share_wm.get(index);
				}
			});
			list_swm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return list_swm;
	}
	private JButton getBtnConfirmUser() {
		if (btnConfirmUser == null) {
			btnConfirmUser = new JButton("Confirm user");
			btnConfirmUser.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
// *****************************************************************************************
				
					if(!selekcija_share_wm.equals(null)) {
						Klijent.kod_za_slanje = 24;
						
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						list_swm_drive.setModel(new AbstractListModel() {
							public int getSize() {
								return Klijent.duzina_liste_drive;
							}
							public Object getElementAt(int index) {
								return Klijent.lista_swm_drive.get(index);
							}
						});
						
						
					}
					
					
					
// *****************************************************************************************
				}
			});
			btnConfirmUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnConfirmUser;
	}
	private JScrollPane getScrollPane_tree() {
		if (scrollPane_tree == null) {
			scrollPane_tree = new JScrollPane();
			scrollPane_tree.setViewportView(getList_swm_drive());
		}
		return scrollPane_tree;
	}
	private JButton getBtnShow() {
		if (btnShow == null) {
			btnShow = new JButton("Show");
			btnShow.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnShow;
	}
	private JLabel getLblUsersList_swm() {
		if (lblUsersList_swm == null) {
			lblUsersList_swm = new JLabel("Users list");
			lblUsersList_swm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblUsersList_swm;
	}
	private JLabel getLblUsersDirectory() {
		if (lblUsersDirectory == null) {
			lblUsersDirectory = new JLabel("User's directory");
			lblUsersDirectory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblUsersDirectory;
	}
	private JPanel getPanel_bottom_swm() {
		if (panel_bottom_swm == null) {
			panel_bottom_swm = new JPanel();
		}
		return panel_bottom_swm;
	}
	private JLabel getLblView_swm() {
		if (lblView_swm == null) {
			lblView_swm = new JLabel("View");
			lblView_swm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblView_swm;
	}
	private JPanel getPanel_right_swm() {
		if (panel_right_swm == null) {
			panel_right_swm = new JPanel();
		}
		return panel_right_swm;
	}
	private JButton getBtnCreateLink() {
		if (btnCreateLink == null) {
			btnCreateLink = new JButton("Create link");
			btnCreateLink.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//				**************************************************************************	
					
					textLink.setText("Diskfon\\Data\\" + Klijent.username);
					
//				**************************************************************************					
				}
			});
			btnCreateLink.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnCreateLink;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getListHome());
		}
		return scrollPane;
	}
	private JList getListHome() {
		if (listHome == null) {
			listHome = new JList();
			listHome.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		************************************************************************************************
			listHome.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					if(e.getClickCount() == 1) {
						
						String selectedItem = (String) listHome.getSelectedValue();
						
						if(!selectedItem.equals(null)) {
							Klijent.selekcija_dodatna = selectedItem;
						}
					}
    						
					
					if(e.getClickCount() == 2) {
						// kod 21 "Posalji izabrani folder ili prikazi izabrani fajl"
				
						
						String selectedItem = (String) listHome.getSelectedValue();
						
						if(!selectedItem.equals(null)) {
							Klijent.br_refers_home = Klijent.br_refers_home + 1;
							
							if(Klijent.br_refers_home == 1) {
								Klijent.selekcija_u_listi = selectedItem;
								selectedItem1 = Klijent.selekcija_u_listi;
							}
							if(Klijent.br_refers_home == 2) {
								Klijent.selekcija_u_listi = selectedItem1 + '\\' + selectedItem;
								selectedItem2 = Klijent.selekcija_u_listi;
							}
							if(Klijent.br_refers_home == 3) {
								Klijent.selekcija_u_listi = selectedItem2 + '\\' + selectedItem;
								selectedItem3 = Klijent.selekcija_u_listi;
							}
							if(Klijent.br_refers_home == 4) {
								Klijent.selekcija_u_listi = selectedItem3 + '\\' + selectedItem;
								selectedItem4 = Klijent.selekcija_u_listi;
							}
							

							Klijent.kod_za_slanje = 21;
							
							// vreme cekanja servera
							try {
								Thread.sleep(500);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							
							if(Klijent.kod_za_prijem == 3) {
								// to je dir
								// sve OK
								// brisi staru listu
								
								listHome.setModel(new AbstractListModel() {
									public int getSize() {
										return Klijent.lista.size();
									}
									public Object getElementAt(int index) {
										return Klijent.lista.get(index);
									}
								});
								
								Klijent.kod_za_prijem = 0;
							}
							if(Klijent.kod_za_prijem == 4) {
								// kad je fajl

									textAreaHome.setText(null);
									textAreaHome.setText(Klijent.tekst);
								
								Klijent.kod_za_prijem = 0;
							}
							lblPathhomenull.setText(Klijent.selekcija_u_listi);
						}
					}
					
				}
			});
//		************************************************************************************************
			listHome.setModel(new AbstractListModel() {
				public int getSize() {
					return Klijent.duzina_liste;
				}
				public Object getElementAt(int index) {
					return Klijent.lista.get(index);
				}
			});
			listHome.setBorder(new LineBorder(UIManager.getColor("MenuItem.selectionBackground")));
		}
		return listHome;
	}
	private JLabel getLblPathHome() {
		if (lblPathHome == null) {
			lblPathHome = new JLabel("Path:");
			lblPathHome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblPathHome;
	}
	private JLabel getLblPathhomenull() {
		if (lblPathhomenull == null) {
			lblPathhomenull = new JLabel("");
			lblPathhomenull.setFont(new Font("Tahoma", Font.PLAIN, 13));
		}
		return lblPathhomenull;
	}
	private JButton getBtnClearviewHome() {
		if (btnClearviewHome == null) {
			btnClearviewHome = new JButton("Clear view");
			btnClearviewHome.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
//		**********************************************************************************	
					textAreaHome.setText(null);
					Klijent.tekst = "";
					
					if(Klijent.br_refers_home > 0) {

						
						
						if(Klijent.br_refers_home == 1) {
							Klijent.selekcija_u_listi = selectedItem;
							selectedItem1 = Klijent.selekcija_u_listi;
						}
						if(Klijent.br_refers_home == 2) {
							Klijent.selekcija_u_listi = selectedItem1 + '\\' + selectedItem;
							selectedItem2 = Klijent.selekcija_u_listi;
						}
						if(Klijent.br_refers_home == 3) {
							Klijent.selekcija_u_listi = selectedItem2 + '\\' + selectedItem;
							selectedItem3 = Klijent.selekcija_u_listi;
						}
						if(Klijent.br_refers_home == 4) {
							Klijent.selekcija_u_listi = selectedItem3 + '\\' + selectedItem;
							selectedItem4 = Klijent.selekcija_u_listi;
						}
						
						Klijent.br_refers_home--;
					}
					
					lblPathhomenull.setText(Klijent.selekcija_u_listi);
					
//		**********************************************************************************						
				}
			});
			btnClearviewHome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnClearviewHome;
	}
	private JButton getBtnBackHome() {
		if (btnBackHome == null) {
			btnBackHome = new JButton("Back");
			btnBackHome.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
//				**********************************************************************************	
					if(Klijent.br_refers_home > 0) {

					
					
					if(Klijent.br_refers_home == 1) {
						Klijent.selekcija_u_listi = selectedItem;
						selectedItem1 = Klijent.selekcija_u_listi;
					}
					if(Klijent.br_refers_home == 2) {
						Klijent.selekcija_u_listi = selectedItem1 + '\\' + selectedItem;
						selectedItem2 = Klijent.selekcija_u_listi;
					}
					if(Klijent.br_refers_home == 3) {
						Klijent.selekcija_u_listi = selectedItem2 + '\\' + selectedItem;
						selectedItem3 = Klijent.selekcija_u_listi;
					}
					if(Klijent.br_refers_home == 4) {
						Klijent.selekcija_u_listi = selectedItem3 + '\\' + selectedItem;
						selectedItem4 = Klijent.selekcija_u_listi;
					}
					
					Klijent.br_refers_home--;
					

					Klijent.kod_za_slanje = 21;
					
					// vreme cekanja servera
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					
					if(Klijent.kod_za_prijem == 3) {
						// to je dir
						// sve OK
						// brisi staru listu
						
						listHome.setModel(new AbstractListModel() {
							public int getSize() {
								return Klijent.lista.size();
							}
							public Object getElementAt(int index) {
								return Klijent.lista.get(index);
							}
						});
						
						Klijent.kod_za_prijem = 0;
					}
						lblPathhomenull.setText(Klijent.selekcija_u_listi);
					}
				}
					
//				**********************************************************************************					
				
			});
			btnBackHome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnBackHome;
	}
	private JList getList_swm_drive() {
		if (list_swm_drive == null) {
			list_swm_drive = new JList();
			list_swm_drive.setFont(new Font("Tahoma", Font.PLAIN, 16));
//*************************************************************************************************************************				
			list_swm_drive.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					if(e.getClickCount() == 2) {
						// kod 21 "Posalji izabrani folder ili prikazi izabrani fajl"
				
						
						String selectedItem = (String) list_swm_drive.getSelectedValue();
						
						if(!selectedItem.equals(null)) {
							Klijent.br_refers_swm = Klijent.br_refers_swm + 1;
							
							if(Klijent.br_refers_swm == 1) {
								Klijent.selekcija_u_listi_swm = selectedItem;
								selectedItem1_swm = Klijent.selekcija_u_listi_swm;
							}
							if(Klijent.br_refers_swm == 2) {
								Klijent.selekcija_u_listi_swm = selectedItem1_swm + '\\' + selectedItem;
								selectedItem2_swm = Klijent.selekcija_u_listi_swm;
							}
							if(Klijent.br_refers_swm == 3) {
								Klijent.selekcija_u_listi_swm = selectedItem2_swm + '\\' + selectedItem;
								selectedItem3_swm = Klijent.selekcija_u_listi_swm;
							}
							if(Klijent.br_refers_swm == 4) {
								Klijent.selekcija_u_listi_swm = selectedItem3_swm + '\\' + selectedItem;
								selectedItem4_swm = Klijent.selekcija_u_listi_swm;
							}


							Klijent.kod_za_slanje = 17;
//************************************************************************************************************							
							// vreme cekanja servera
							try {
								Thread.sleep(500);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							
							if(Klijent.kod_za_prijem == 3) {
								// to je dir
								// sve OK
								// brisi staru listu
								
								list_swm_drive.setModel(new AbstractListModel() {
									public int getSize() {
										return Klijent.duzina_liste_drive;
									}
									public Object getElementAt(int index) {
										return Klijent.lista_swm_drive.get(index);
									}
								});
								
								Klijent.kod_za_prijem = 0;
							}
							if(Klijent.kod_za_prijem == 4) {
								// kad je fajl

									textAreaShareWithMe.setText(null);
									textAreaShareWithMe.setText(Klijent.tekst_swm);
								
								Klijent.kod_za_prijem = 0;
							}
							lblPath_swmNull.setText(Klijent.selekcija_u_listi_swm);
						}
					}
					
				}
			});
//*************************************************************************************************************************			
			
			
			
			list_swm_drive.setModel(new AbstractListModel() {
				public int getSize() {
					return Klijent.duzina_liste_drive;
				}
				public Object getElementAt(int index) {
					return Klijent.lista_swm_drive.get(index);
				}
			});
		}
		return list_swm_drive;
	}
	private JLabel getLblPath_swm() {
		if (lblPath_swm == null) {
			lblPath_swm = new JLabel("Path:");
			lblPath_swm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblPath_swm;
	}
	private JLabel getLblPath_swmNull() {
		if (lblPath_swmNull == null) {
			lblPath_swmNull = new JLabel("");
		}
		return lblPath_swmNull;
	}
	private JButton getBtnBack_swm() {
		if (btnBack_swm == null) {
			btnBack_swm = new JButton("Back");
			btnBack_swm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if(Klijent.br_refers_swm > 0) {

						
						
						if(Klijent.br_refers_swm == 1) {
							Klijent.selekcija_u_listi_swm = selectedItem;
							selectedItem1_swm = Klijent.selekcija_u_listi_swm;
						}
						if(Klijent.br_refers_swm == 2) {
							Klijent.selekcija_u_listi_swm = selectedItem1_swm + '\\' + selectedItem;
							selectedItem2_swm = Klijent.selekcija_u_listi_swm;
						}
						if(Klijent.br_refers_swm == 3) {
							Klijent.selekcija_u_listi_swm = selectedItem2_swm + '\\' + selectedItem;
							selectedItem3_swm = Klijent.selekcija_u_listi_swm;
						}
						if(Klijent.br_refers_swm == 4) {
							Klijent.selekcija_u_listi_swm = selectedItem3_swm + '\\' + selectedItem;
							selectedItem4_swm = Klijent.selekcija_u_listi_swm;
						}
						

						
						Klijent.br_refers_swm--;
						

						Klijent.kod_za_slanje = 17;
						
						// vreme cekanja servera
						try {
							Thread.sleep(500);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						
						if(Klijent.kod_za_prijem == 3) {
							
							list_swm_drive.setModel(new AbstractListModel() {
								public int getSize() {
									return Klijent.duzina_liste_drive;
								}
								public Object getElementAt(int index) {
									return Klijent.lista_swm_drive.get(index);
								}
							});
							
							Klijent.kod_za_prijem = 0;
						}

						lblPath_swmNull.setText(Klijent.selekcija_u_listi_swm);
					}
				}
			});
			btnBack_swm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnBack_swm;
	}
	private JButton getBtnClearView_swm() {
		if (btnClearView_swm == null) {
			btnClearView_swm = new JButton("Clear view");
			btnClearView_swm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
//		******************************************************************************************					
					textAreaShareWithMe.setText(null);
					Klijent.tekst_swm = "";
					
					if(Klijent.br_refers_swm > 0) {

						
						
						if(Klijent.br_refers_swm == 1) {
							Klijent.selekcija_u_listi_swm = selectedItem;
							selectedItem1_swm = Klijent.selekcija_u_listi_swm;
						}
						if(Klijent.br_refers_swm == 2) {
							Klijent.selekcija_u_listi_swm = selectedItem1_swm + '\\' + selectedItem;
							selectedItem2_swm = Klijent.selekcija_u_listi_swm;
						}
						if(Klijent.br_refers_swm == 3) {
							Klijent.selekcija_u_listi_swm = selectedItem2_swm + '\\' + selectedItem;
							selectedItem3_swm = Klijent.selekcija_u_listi_swm;
						}
						if(Klijent.br_refers_swm == 4) {
							Klijent.selekcija_u_listi_swm = selectedItem3_swm + '\\' + selectedItem;
							selectedItem4_swm = Klijent.selekcija_u_listi_swm;
						}
						
						Klijent.br_refers_swm--;
					}
					
					lblPath_swmNull.setText(Klijent.selekcija_u_listi_swm);
					
//			******************************************************************************************					
					
				}
			});
			btnClearView_swm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnClearView_swm;
	}
	private JButton getBtnRefresh() {
		if (btnRefresh == null) {
			btnRefresh = new JButton("Refresh");
			btnRefresh.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
// ***************************************************************************************
					
					Klijent.kod_za_slanje = 20;
					
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					PrijavaGUI.prozorG.lbluserNull.setText(Klijent.username);
					PrijavaGUI.prozorG.lblTypeNull.setText(Klijent.type);
					PrijavaGUI.prozorG.lblUploadsNull.setText("" + Klijent.broj_upload);
					
					SwingUtilities.updateComponentTreeUI(PrijavaGUI.prozorG.frmDiskfon_glavni);
					
					Klijent.br_refers_home = 0;
					Klijent.br_refers_swm = 0;
					Klijent.selekcija_u_listi = "";
					Klijent.selekcija_u_listi_swm = "";
					Klijent.selekcija_dodatna = "";

					
					Klijent.selekcija_u_listi = "";
					
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					lblPathhomenull.setText(Klijent.selekcija_u_listi);
					
					

					
//*****************************************************************************************
				}
			});
			btnRefresh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return btnRefresh;
	}
	private JLabel getLblUploads() {
		if (lblUploads == null) {
			lblUploads = new JLabel("Uploads:");
			lblUploads.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblUploads;
	}
	private JLabel getLblUploadsNull() {
		if (lblUploadsNull == null) {
			lblUploadsNull = new JLabel("Unknown");
			lblUploadsNull.setForeground(new Color(0, 0, 255));
			lblUploadsNull.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblUploadsNull;
	}
	private JLabel getLbluserNull() {
		if (lbluserNull == null) {
			lbluserNull = new JLabel(Klijent.username);
			lbluserNull.setForeground(new Color(0, 128, 0));
			lbluserNull.setFont(new Font("Tahoma", Font.BOLD, 16));
		}
		return lbluserNull;
	}
	private JLabel getLblTypeNull() {
		if (lblTypeNull == null) {
			lblTypeNull = new JLabel(Klijent.type);
			lblTypeNull.setForeground(new Color(0, 0, 255));
			lblTypeNull.setFont(new Font("Tahoma", Font.BOLD, 16));
		}
		return lblTypeNull;
	}
}
