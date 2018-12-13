import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Font;

public class loginform extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	
	int xx ,xy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginform frame = new loginform();
					frame.setUndecorated(true);
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
	public loginform() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 379);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(-16, 0, 277, 439);
		contentPane.add(panel);
		
		JLabel lblLogin = new JLabel("");
		
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				 e.getX();
			     e.getY();
			}
		});
		lblLogin.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x = arg0.getXOnScreen();
	            int y = arg0.getYOnScreen();
	            loginform.this.setLocation(x - xx, y - xy); 
			}
		});
		lblLogin.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblLogin);
		lblLogin.setIcon(new ImageIcon(loginform.class.getResource("/images/123.jpeg")));
		
		Button button = new Button("Submit");
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(241, 57, 83));
		button.setBounds(315, 320, 232, 29);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(315, 53, 232, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(331, 82, 210, 2);
		contentPane.add(separator);
		
		JLabel lblName = new JLabel("E-mail");
		lblName.setFont(new Font("FreeSans", Font.BOLD, 12));
		lblName.setBounds(325, 99, 70, 15);
		contentPane.add(lblName);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("FreeSans", Font.BOLD, 12));
		lblUsername.setBounds(325, 26, 100, 15);
		contentPane.add(lblUsername);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(331, 155, 210, 2);
		contentPane.add(separator_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(315, 123, 232, 34);
		contentPane.add(textField_2);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("FreeSans", Font.BOLD, 12));
		lblPassword.setBounds(327, 169, 70, 15);
		contentPane.add(lblPassword);
		
		JLabel lblReEnterPassword = new JLabel("Re Enter Password");
		lblReEnterPassword.setFont(new Font("FreeSans", Font.BOLD, 12));
		lblReEnterPassword.setBounds(331, 242, 143, 15);
		contentPane.add(lblReEnterPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(315, 269, 232, 36);
		contentPane.add(passwordField);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(331, 228, 210, 2);
		contentPane.add(separator_2);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(315, 194, 232, 36);
		contentPane.add(passwordField_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(331, 297, 210, 2);
		contentPane.add(separator_3);
		
		JLabel lbl_close = new JLabel("X");
		lbl_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lbl_close.setForeground(new Color(220, 20, 60));
		lbl_close.setBackground(new Color(220, 20, 60));
		lbl_close.setBounds(554, 0, 28, 29);
		contentPane.add(lbl_close);
	}
}
