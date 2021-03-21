package game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainClass {

	private JFrame frame;
	private JTextField txtInputNum;
	private int[] randomNum;
	private int tryCount;
	private JTextField txtOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainClass window = new MainClass();
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
	public MainClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1~30까지의 수중 아무 수를 입력하세요.");
		lblNewLabel.setBounds(12, 23, 410, 15);
		frame.getContentPane().add(lblNewLabel);
		
		txtInputNum = new JTextField();
		txtInputNum.setBounds(12, 48, 81, 21);
		frame.getContentPane().add(txtInputNum);
		txtInputNum.setColumns(10);
		
		JButton btnNewButton = new JButton("랜덤 수 생성");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RandomNumDuplicate randomNum = new RandomNumDuplicate();
				getRandomNum();
			}
		});
		btnNewButton.setBounds(12, 109, 126, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("확인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setRandomNum();
			}
		});
		btnNewButton_1.setBounds(100, 48, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		txtOutput = new JTextField();
		txtOutput.setEditable(false);
		txtOutput.setBounds(22, 230, 400, 21);
		frame.getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
	}
	
	private void getRandomNum() {
		RandomNum random = new RandomNum(30);
		RandomNumDuplicate rm = new RandomNumDuplicate(random);
		randomNum = rm.returnRandomNum(1);
	}
	
	private void setRandomNum() {
		
		if (randomNum[0] < Integer.parseInt(txtInputNum.getText())) {
			txtOutput.setText("좀 더 작은 수를 입력하세요.");
		} else if (randomNum[0] > Integer.parseInt(txtInputNum.getText())) {
			txtOutput.setText("좀 더 큰 수를 입력하세요.");
		} else if (randomNum[0] == Integer.parseInt(txtInputNum.getText())) {
			txtOutput.setText("Random수는 : " + randomNum[0] + "입니다. 숫자를 맞췄습니다. 실행한 횟수는 : " + tryCount + "입니다.");
		}
	}
}
