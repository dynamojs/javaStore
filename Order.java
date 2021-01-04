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
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JCalendar;
import javax.swing.JSpinner;
import javax.swing.JTable;

public class Order {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	int carNum; 
	int year; 
	int Gvwr; 
	String model;
	private final JLabel lblNewLabel = new JLabel("");
	private JTextField textField_3;
	private JTable table;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order window = new Order();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * 
	 * Create the application.
	 */
	public Order() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(SystemColor.window);
		frame.setBounds(100, 100, 679, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) { 
				carNum = Integer.parseInt(textField.getText());
				year = Integer.parseInt(textField_1.getText());
				//Gvwr = Integer.parseInt(textField_3.getText()); 
				model = textField_2.getText();
				
			}
		});
		btnAdd.setForeground(SystemColor.text);
		btnAdd.setBackground(SystemColor.textHighlight);
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAdd.setBounds(48, 506, 87, 32);
		frame.getContentPane().add(btnAdd); 
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDelete.setBackground(SystemColor.textHighlight);
		btnDelete.setForeground(SystemColor.text);
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnDelete.setBounds(48, 548, 87, 32);
		frame.getContentPane().add(btnDelete);
		
		JButton btnPreviousPage = new JButton(" < Home");
		btnPreviousPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPreviousPage.setBackground(SystemColor.textHighlight);
		btnPreviousPage.setForeground(SystemColor.text);
		btnPreviousPage.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnPreviousPage.setBounds(535, 553, 130, 27);
		frame.getContentPane().add(btnPreviousPage);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon image = new ImageIcon(this.getClass().getResource("/Logo.png"));
		lblNewLabel.setIcon(image);
		lblNewLabel.setBounds(0, 0, 170, 110);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCars = new JLabel("Orders");
		lblCars.setBackground(SystemColor.textHighlight);
		lblCars.setForeground(SystemColor.textHighlight);
		lblCars.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblCars.setBounds(290, 0, 208, 61);
		frame.getContentPane().add(lblCars);
		
		table = new JTable();
		table.setBounds(38, 147, 590, 319);
		frame.getContentPane().add(table);
		
		
	}
}