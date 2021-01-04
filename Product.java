import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;


public class Product{

	private JFrame frame;
	int carNum; 
	int year; 
	int Gvwr; 
	String model;
	private final JLabel lblNewLabel = new JLabel("");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Product window = new Product();
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
	public Product() {
		initialize();
	}
	public static void NewScreen1() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Product window = new Product();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(SystemColor.window);
		frame.setBounds(100, 100, 721, 724);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon image = new ImageIcon(this.getClass().getResource("/Logo.png"));
		lblNewLabel.setIcon(image);
		lblNewLabel.setBounds(0, 0, 113, 110);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCars = new JLabel("Products");
		lblCars.setBackground(SystemColor.textHighlight);
		lblCars.setForeground(SystemColor.textHighlight);
		lblCars.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblCars.setBounds(286, 6, 162, 50);
		frame.getContentPane().add(lblCars);
		lblNewLabel.setBounds(0, 0, 162, 110);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		ImageIcon image1 = new ImageIcon(this.getClass().getResource("/earlight.jpg"));
		lblNewLabel_1.setIcon(image1);
		lblNewLabel_1.setBounds(59, 132, 252, 202);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		ImageIcon image2 = new ImageIcon(this.getClass().getResource("/thermocare stethoscope superb.jpg"));
		lblNewLabel_1_1.setIcon(image2);
		lblNewLabel_1_1.setBounds(344, 152, 300, 172);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		ImageIcon image3 = new ImageIcon(this.getClass().getResource("/image1.jpg"));
		lblNewLabel_1_2.setIcon(image3);
		lblNewLabel_1_2.setBounds(59, 399, 252, 172);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		ImageIcon image4 = new ImageIcon(this.getClass().getResource("/needls.jpg"));
		lblNewLabel_1_3.setIcon(image4);
		lblNewLabel_1_3.setBounds(404, 399, 259, 167);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JButton btnNewButton_4 = new JButton("Confirm");
		btnNewButton_4.addActionListener(new ActionListener() {
		public void actionPerformed  (ActionEvent e) {
			Buy buy = new Buy();
			buy.NewScreen();
		}
		});
		
		btnNewButton_4.setBounds(596, 649, 111, 38);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("110$");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(59, 334, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("170$");
		btnNewButton_1.setBounds(404, 334, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("150$");
		btnNewButton_2.setBounds(59, 577, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("85$");
		btnNewButton_3.setBounds(404, 577, 85, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(281, 356, 30, 20);
		frame.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(281, 599, 30, 20);
		frame.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(633, 356, 30, 20);
		frame.getContentPane().add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(633, 599, 30, 20);
		frame.getContentPane().add(spinner_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Order it");
		chckbxNewCheckBox.setBounds(218, 334, 93, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Order it");
		chckbxNewCheckBox_1.setBounds(570, 334, 93, 21);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Order it");
		chckbxNewCheckBox_2.setBounds(571, 577, 93, 21);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Order it");
		chckbxNewCheckBox_3.setBounds(219, 577, 93, 21);
		frame.getContentPane().add(chckbxNewCheckBox_3);
		
		
		
	
		JLabel lblCars1 = new JLabel("Let the therapy begin!");
		lblCars1.setBackground(SystemColor.textHighlight);
		lblCars1.setForeground(SystemColor.textHighlight);
		lblCars1.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 14));
		lblCars1.setBounds(267, 46, 377, 56);
		frame.getContentPane().add(lblCars1);
		lblNewLabel.setBounds(0, 0, 162, 110);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
		
	}
}