
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Buy {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buy window = new Buy();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Buy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(SystemColor.window);
		frame.setBounds(100, 100, 666, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(198, 122, 45, 13);
		frame.getContentPane().add(lblNewLabel);
	
		JLabel lblNewLabel_1 = new JLabel("");
		ImageIcon image = new ImageIcon(this.getClass().getResource("/Logo.png"));
		lblNewLabel_1.setIcon(image);
		lblNewLabel_1.setBounds(0, 0, 170, 110);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblCars1 = new JLabel("Your Order will be ready soon!");
		lblCars1.setBackground(SystemColor.textHighlight);
		lblCars1.setForeground(SystemColor.textHighlight);
		lblCars1.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 16));
		lblCars1.setBounds(213, 25, 377, 56);
		frame.getContentPane().add(lblCars1);
		lblNewLabel.setBounds(0, 0, 162, 110);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("Order");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed  (ActionEvent e) {
				message msg = new message();
				msg.NewScreen3();
			}
			});
		btnNewButton_3.setBounds(410, 421, 85, 31);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("< Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed  (ActionEvent e) {
				Product product = new Product();
				product.NewScreen1();
			}
		});
		btnNewButton.setBounds(0, 501, 119, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Address");
		btnNewButton_1.setBounds(23, 380, 119, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Phone number");
		btnNewButton_1_1.setBounds(23, 421, 119, 31);
		frame.getContentPane().add(btnNewButton_1_1);
		
		textField = new JTextField();
		textField.setBounds(142, 380, 243, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 421, 243, 31);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setBounds(533, 501, 119, 31);
		frame.getContentPane().add(btnNewButton_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Cancel order");
		rdbtnNewRadioButton.setBounds(265, 501, 119, 26);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		
		
		/*JLabel lblNewLabel_2 = new JLabel("");
		ImageIcon image1 = new ImageIcon(this.getClass().getResource("/map.png"));
		lblNewLabel_2.setIcon(image1);
		lblNewLabel_2.setBounds(-290, 363, 942, 169);
		frame.getContentPane().add(lblNewLabel_2);*/
	
	/*	
		JButton btnPreviousPage = new JButton(" < Back");
		btnPreviousPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});*/
	}
}
