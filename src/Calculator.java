import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TextField;
	private JLabel label;
	private JRadioButton rdbtnOn;
	private JRadioButton rdbtnOff ;
	private JButton btnC;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JButton button_17;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void FrameinMiddle() {

		Dimension screenSize,frameSize;
		int x,y;
		screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		frameSize=getSize();
		x=(screenSize.width-frameSize.width)/2;
		y=(screenSize.height-frameSize.height)/2;
		setLocation(x, y);
		}
	
	double number,answer;
	int calculation;
	
	public void arithmetic_operation()
	{
		switch (calculation)
		{
		case '+':
			answer = number+ Double.parseDouble(TextField.getText());
			TextField.setText(Double.toString(answer));
			label.setText(null);
			break;
			
		case '-':
			answer = number- Double.parseDouble(TextField.getText());
			TextField.setText(Double.toString(answer));
			label.setText(null);
			break;
			
		case '*':
			answer = number* Double.parseDouble(TextField.getText());
			TextField.setText(Double.toString(answer));
			label.setText(null);
			break;
			
			
		case '/':
			answer = number/ Double.parseDouble(TextField.getText());
			TextField.setText(Double.toString(answer));
			label.setText(null);
			break;
		}
	}
	
	public void off()
	{
		TextField.setEnabled(false);
		button_1.setEnabled(false);
		button_2.setEnabled(false);
		button_3.setEnabled(false);
		button_4.setEnabled(false);
		button_5.setEnabled(false);
		button_6.setEnabled(false);
		button_7.setEnabled(false);
		button_8.setEnabled(false);
		button_9.setEnabled(false);
		button_10.setEnabled(false);
		button_11.setEnabled(false);
		button_12.setEnabled(false);
		button_13.setEnabled(false);
		button_14.setEnabled(false);
		button_15.setEnabled(false);
		button_16.setEnabled(false);
		button_17.setEnabled(false);
		btnC.setEnabled(false);
		rdbtnOff.setEnabled(false);
		rdbtnOn.setEnabled(true);
	}
	
	public void on()
	{
		TextField.setEnabled(true);
		button_1.setEnabled(true);
		button_2.setEnabled(true);
		button_3.setEnabled(true);
		button_4.setEnabled(true);
		button_5.setEnabled(true);
		button_6.setEnabled(true);
		button_7.setEnabled(true);
		button_8.setEnabled(true);
		button_9.setEnabled(true);
		button_10.setEnabled(true);
		button_11.setEnabled(true);
		button_12.setEnabled(true);
		button_13.setEnabled(true);
		button_14.setEnabled(true);
		button_15.setEnabled(true);
		button_16.setEnabled(true);
		button_17.setEnabled(true);
		btnC.setEnabled(true);
		rdbtnOn.setEnabled(false);
		rdbtnOff.setEnabled(true);
		
	}

	/**
	 * Create the frame.
	 */
	public Calculator() 
	{
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculator.class.getResource("/Img/calculator-outline.png")));
		initialize();
		FrameinMiddle();;
	}
	
	void initialize()
	{
		setBackground(new Color(30, 144, 255));
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 303, 373);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		TextField = new JTextField();
		TextField.setForeground(Color.DARK_GRAY);
		TextField.setEditable(false);
		TextField.setHorizontalAlignment(SwingConstants.RIGHT);
		TextField.setFont(new Font("Tahoma", Font.BOLD, 18));
		TextField.setColumns(10);
		
		button_17 = new JButton("8");
		button_17.setForeground(SystemColor.text);
		button_17.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_17.setBackground(Color.DARK_GRAY);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"8");
			}
		});
		
		button_1 = new JButton("9");
		button_1.setForeground(SystemColor.text);
		button_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_1.setBackground(Color.DARK_GRAY);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"9");
			}
		});
		
		button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(TextField.getText());
				calculation = '+';
				TextField.setText("");
				label.setText(number + "+");
				
			}
		});
		button_2.setForeground(SystemColor.text);
		button_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		button_2.setBackground(Color.DARK_GRAY);
		
		button_3 = new JButton("4");
		button_3.setForeground(SystemColor.text);
		button_3.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_3.setBackground(Color.DARK_GRAY);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"4");
			}
		});
		
		button_4 = new JButton("5");
		button_4.setForeground(SystemColor.text);
		button_4.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_4.setBackground(Color.DARK_GRAY);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"5");
			}
		});
		
		button_5 = new JButton("6");
		button_5.setForeground(SystemColor.text);
		button_5.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_5.setBackground(Color.DARK_GRAY);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"6");
			}
		});
		
		button_6 = new JButton("1");
		button_6.setForeground(SystemColor.text);
		button_6.setBackground(Color.DARK_GRAY);
		button_6.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TextField.setText(TextField.getText()+"1");
			}
		});
		
		button_7 = new JButton("2");
		button_7.setForeground(SystemColor.text);
		button_7.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_7.setBackground(Color.DARK_GRAY);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"2");
			}
		});
		
		button_8 = new JButton("3");
		button_8.setForeground(SystemColor.text);
		button_8.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_8.setBackground(Color.DARK_GRAY);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"3");
			}
		});
		
		button_9 = new JButton("0");
		button_9.setForeground(SystemColor.text);
		button_9.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_9.setBackground(Color.DARK_GRAY);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"0");
			}
		});
		button_16 = new JButton("7");
		button_16.setForeground(SystemColor.text);
		button_16.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_16.setBackground(Color.DARK_GRAY);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+"7");
			}
		});
		
		button_10 = new JButton(".");
		button_10.setForeground(SystemColor.text);
		button_10.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_10.setBackground(Color.DARK_GRAY);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText(TextField.getText()+".");
			}
		});
		
		button_11 = new JButton("=");
		button_11.setForeground(SystemColor.text);
		button_11.setFont(new Font("Century Gothic", Font.BOLD, 15));
		button_11.setBackground(Color.DARK_GRAY);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
			}
		});
		
		button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(TextField.getText());
				calculation = '-';
				TextField.setText("");
				label.setText(number + "-");
			}
		});
		button_12.setForeground(SystemColor.text);
		button_12.setFont(new Font("Century Gothic", Font.BOLD, 18));
		button_12.setBackground(Color.DARK_GRAY);
		
		button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(TextField.getText());
				calculation = '*';
				TextField.setText("");
				label.setText(number + "*");
			}
		});
		button_13.setForeground(SystemColor.text);
		button_13.setFont(new Font("Century Gothic", Font.BOLD, 18));
		button_13.setBackground(Color.DARK_GRAY);
		
		button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(TextField.getText());
				calculation = '/';
				TextField.setText("");
				label.setText(number + "/");
			}
		});
		button_14.setForeground(SystemColor.text);
		button_14.setFont(new Font("Century Gothic", Font.BOLD, 18));
		button_14.setBackground(Color.DARK_GRAY);
		
		btnC = new JButton("C");
		btnC.setForeground(SystemColor.text);
		btnC.setBackground(Color.DARK_GRAY);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText("");
				label.setText("");
			}
		});
		btnC.setFont(new Font("Century Gothic", Font.BOLD, 15));
		
		button_15 = new JButton("<-");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int length = TextField.getText().length();
				int number = length - 1;
				String store;
				
				if (length > 0) {
					StringBuilder back = new StringBuilder(TextField.getText());
					back.deleteCharAt(number);
					store = back.toString();
					TextField.setText(store);
				}
			}
		});
		button_15.setForeground(SystemColor.text);
		button_15.setBackground(Color.DARK_GRAY);
		button_15.setFont(new Font("Century Gothic", Font.BOLD, 15));
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(new Color(255, 250, 250));
		label.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		
		rdbtnOn = new JRadioButton("ON");
		buttonGroup.add(rdbtnOn);
		rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				on();
			}
		});
		rdbtnOn.setForeground(new Color(255, 250, 250));
		rdbtnOn.setBackground(Color.GRAY);
		
		rdbtnOff = new JRadioButton("OFF");
		buttonGroup.add(rdbtnOff);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextField.setText("");
				label.setText("");
				off();
			}
		});
		rdbtnOff.setForeground(new Color(255, 250, 250));
		rdbtnOff.setBackground(Color.GRAY);
		
		//rdbtnOn.setEnabled(false);
		rdbtnOff.setEnabled(true);
		TextField.setEnabled(false);
		button_1.setEnabled(false);
		button_2.setEnabled(false);
		button_3.setEnabled(false);
		button_4.setEnabled(false);
		button_5.setEnabled(false);
		button_6.setEnabled(false);
		button_7.setEnabled(false);
		button_8.setEnabled(false);
		button_9.setEnabled(false);
		button_10.setEnabled(false);
		button_11.setEnabled(false);
		button_12.setEnabled(false);
		button_13.setEnabled(false);
		button_14.setEnabled(false);
		button_15.setEnabled(false);
		button_16.setEnabled(false);
		button_17.setEnabled(false);
		btnC.setEnabled(false);
		rdbtnOff.setEnabled(false);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(202)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(TextField, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
					.addGap(9))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnOn, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
							.addGap(14))
						.addComponent(rdbtnOff, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
					.addGap(58)
					.addComponent(button_15, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(35)
					.addComponent(btnC, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(9))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(button_16, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(button_17, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(35)
					.addComponent(button_2, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(9))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(button_3, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(button_4, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(button_5, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(35)
					.addComponent(button_12, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(9))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(button_6, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(button_7, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(button_8, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(35)
					.addComponent(button_13, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(9))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(button_9, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(button_10, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(button_11, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(button_14, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
					.addGap(9))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(TextField, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(8)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnOn)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(rdbtnOff, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(13)
							.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(button_16, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(button_17, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(button_11, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
							.addGap(2))
						.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addGap(9))
		);
		contentPane.setLayout(gl_contentPane);
		
	}
}
