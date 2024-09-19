package pkg;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
/** Controller for the app
 * 
 * @author Adam Gueits
 * @version 1.0
 * 
 */
public class Main {

	private JFrame frame;
	private JTextField itemName;
	private JTextField itemCost;
	private JTextField itemQuantity;
	private JButton addBtn;
	private JTextArea listOutputArea;
	private JTextPane totalOutputArea;
	private SalesSlip list = new SalesSlip();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
		AddButtonPress();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 557, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		itemName = new JTextField();
		itemName.setBounds(179, 99, 243, 20);
		frame.getContentPane().add(itemName);
		itemName.setColumns(10);

		itemCost = new JTextField();
		itemCost.setBounds(179, 130, 172, 20);
		frame.getContentPane().add(itemCost);
		itemCost.setColumns(10);

		itemQuantity = new JTextField();
		itemQuantity.setBounds(179, 161, 172, 20);
		frame.getContentPane().add(itemQuantity);
		itemQuantity.setColumns(10);

		addBtn = new JButton("Add Item To Sales List");
		addBtn.setBounds(176, 202, 193, 23);
		frame.getContentPane().add(addBtn);

		JLabel lblNewLabel = new JLabel("Total Sales:");
		lblNewLabel.setBounds(128, 373, 70, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Quantity:");
		lblNewLabel_1.setBounds(111, 164, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Cost($):");
		lblNewLabel_2.setBounds(111, 133, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Item:");
		lblNewLabel_3.setBounds(111, 102, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);

		totalOutputArea = new JTextPane();
		totalOutputArea.setBounds(208, 367, 200, 20);
		frame.getContentPane().add(totalOutputArea);

		JLabel lblNewLabel_4 = new JLabel("Sales List");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(223, 11, 128, 46);
		frame.getContentPane().add(lblNewLabel_4);

		listOutputArea = new JTextArea();
		listOutputArea.setColumns(3);
		listOutputArea.setLineWrap(true);
		listOutputArea.setWrapStyleWord(true);
		listOutputArea.setBounds(111, 245, 327, 117);
		frame.getContentPane().add(listOutputArea);

		JScrollPane scrollPane = new JScrollPane(listOutputArea);
		scrollPane.setBounds(111, 245, 327, 117);
		frame.getContentPane().add(scrollPane);
	}

	/**
	 * Adds button press functionality
	 */
	private void AddButtonPress() {
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Convert from JTextFields to corresponding variables
				String name = itemName.getText();
				double cost = Double.parseDouble(itemCost.getText());
				int quantity = Integer.parseInt(itemQuantity.getText());

				SalesItem entry = new SalesItem(name, cost, quantity);
				list.add(entry);
				// Sets Text of Output Fields
				listOutputArea.setText(list.toString());
				totalOutputArea.setText("$" + Double.toString(list.totalSales()));

			}
		});
	}
}
