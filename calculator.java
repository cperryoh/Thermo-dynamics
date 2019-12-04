import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField MassIn;
	private JTextField CIn;
	private JTextField TIIn;
	private JTextField MinTwo;
	JButton btnEnter = new JButton("Enter");
	private JTextField CinTwo;
	private JTextField TIInTwo;
	
	JLabel lblOut = new JLabel("Out:");

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
		frame.setBounds(100, 100, 615, 307);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		btnEnter.setFocusable(false);
		btnEnter.setBounds(230, 157, 115, 29);
		frame.getContentPane().add(btnEnter);
		lblOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblOut.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblOut.setBounds(0, 202, 593, 36);
		frame.getContentPane().add(lblOut);
		
		MassIn = new JTextField();
		MassIn.setBounds(77, 19, 146, 26);
		frame.getContentPane().add(MassIn);
		MassIn.setColumns(10);
		
		JLabel lblM = new JLabel("M:");
		lblM.setHorizontalAlignment(SwingConstants.RIGHT);
		lblM.setBounds(0, 22, 69, 20);
		frame.getContentPane().add(lblM);
		
		JLabel lblC = new JLabel("C:");
		lblC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblC.setBounds(0, 66, 69, 20);
		frame.getContentPane().add(lblC);
		
		CIn = new JTextField();
		CIn.setColumns(10);
		CIn.setBounds(77, 63, 146, 26);
		frame.getContentPane().add(CIn);
		
		JLabel lblTf = new JLabel("TI:");
		lblTf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTf.setBounds(0, 105, 69, 20);
		frame.getContentPane().add(lblTf);
		
		TIIn = new JTextField();
		TIIn.setColumns(10);
		TIIn.setBounds(77, 102, 146, 26);
		frame.getContentPane().add(TIIn);
		
		MinTwo = new JTextField();
		MinTwo.setColumns(10);
		MinTwo.setBounds(389, 16, 146, 26);
		frame.getContentPane().add(MinTwo);
		
		JLabel label = new JLabel("M:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(312, 19, 69, 20);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("C:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(312, 63, 69, 20);
		frame.getContentPane().add(label_1);
		
		CinTwo = new JTextField();
		CinTwo.setColumns(10);
		CinTwo.setBounds(389, 60, 146, 26);
		frame.getContentPane().add(CinTwo);
		
		JLabel lblTi = new JLabel("TI:");
		lblTi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTi.setBounds(312, 102, 69, 20);
		frame.getContentPane().add(lblTi);
		
		TIInTwo = new JTextField();
		TIInTwo.setColumns(10);
		TIInTwo.setBounds(389, 99, 146, 26);
		frame.getContentPane().add(TIInTwo);
		btnEnter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//TopOne*TopTwo
				//-------------(divide)
				//BottomOne*BottomTwo
				Double TIOne=Double.parseDouble(TIIn.getText());
				Double TITwo=Double.parseDouble(TIInTwo.getText());
				Double C=Double.parseDouble(CIn.getText());
				Double CTwo=Double.parseDouble(CinTwo.getText());
				Double massOne=Double.parseDouble(MassIn.getText());
				Double massTwo=Double.parseDouble(MinTwo.getText());
				Double topOne= TIOne*C*massOne;
				Double topTwo=TITwo*CTwo*massTwo;
				Double bottomOne=C*massOne;
				Double bottonTwo=CTwo*massTwo;
				NumberFormat formatter = new DecimalFormat("#0.00");
				lblOut.setText("Out: "+formatter.format((topOne+topTwo)/(bottomOne+bottonTwo)));
			}
		});
	}
}
