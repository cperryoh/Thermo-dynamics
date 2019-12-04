import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField MassIn;
	private JTextField CIn;
	JRadioButton CoolingTwo = new JRadioButton("Cooling");
	JRadioButton CoolingOne = new JRadioButton("Cooling");
	private JTextField TIIn;
	private JTextField MinTwo;
	private JTextField CinTwo;
	private JTextField TIInTwo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 615, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setFocusable(false);
		btnEnter.setBounds(233, 232, 115, 29);
		frame.getContentPane().add(btnEnter);
		
		JLabel lblOut = new JLabel("Out:");
		lblOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblOut.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblOut.setBounds(0, 285, 593, 36);
		frame.getContentPane().add(lblOut);
		
		MassIn = new JTextField();
		MassIn.setBounds(92, 94, 146, 26);
		frame.getContentPane().add(MassIn);
		MassIn.setColumns(10);
		
		JLabel lblM = new JLabel("M:");
		lblM.setHorizontalAlignment(SwingConstants.RIGHT);
		lblM.setBounds(15, 97, 69, 20);
		frame.getContentPane().add(lblM);
		
		JLabel lblC = new JLabel("C:");
		lblC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblC.setBounds(15, 141, 69, 20);
		frame.getContentPane().add(lblC);
		
		CIn = new JTextField();
		CIn.setColumns(10);
		CIn.setBounds(92, 138, 146, 26);
		frame.getContentPane().add(CIn);
		
		JLabel lblTf = new JLabel("TI:");
		lblTf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTf.setBounds(15, 180, 69, 20);
		frame.getContentPane().add(lblTf);
		
		TIIn = new JTextField();
		TIIn.setColumns(10);
		TIIn.setBounds(92, 177, 146, 26);
		frame.getContentPane().add(TIIn);
		
		MinTwo = new JTextField();
		MinTwo.setColumns(10);
		MinTwo.setBounds(404, 91, 146, 26);
		frame.getContentPane().add(MinTwo);
		
		JLabel label = new JLabel("M:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(327, 94, 69, 20);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("C:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(327, 138, 69, 20);
		frame.getContentPane().add(label_1);
		
		CinTwo = new JTextField();
		CinTwo.setColumns(10);
		CinTwo.setBounds(404, 135, 146, 26);
		frame.getContentPane().add(CinTwo);
		
		JLabel lblTi = new JLabel("TI:");
		lblTi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTi.setBounds(327, 177, 69, 20);
		frame.getContentPane().add(lblTi);
		
		TIInTwo = new JTextField();
		TIInTwo.setColumns(10);
		TIInTwo.setBounds(404, 174, 146, 26);
		frame.getContentPane().add(TIInTwo);
		
		CoolingOne.setBounds(78, 46, 155, 29);
		CoolingOne.setFocusable(false);
		CoolingOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(CoolingOne.isSelected()) {
					CoolingTwo.setSelected(false);
				}
			}
		});
		frame.getContentPane().add(CoolingOne);
		
		CoolingTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(CoolingTwo.isSelected()) {
					CoolingOne.setSelected(false);
				}
			}
		});
		CoolingTwo.setSelected(true);
		CoolingTwo.setFocusable(false);
		CoolingTwo.setBounds(395, 46, 155, 29);
		frame.getContentPane().add(CoolingTwo);
	}
}
