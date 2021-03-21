package ByWindowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameTest frame = new JFrameTest();
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
	public JFrameTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("파일");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("exit");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("도서정보관리");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem bookInfoInsert = new JMenuItem("도서정보등록");
		mnNewMenu_1.add(bookInfoInsert);
		
		JMenuItem bookInfoUpdate = new JMenuItem("도서정보수정");
		mnNewMenu_1.add(bookInfoUpdate);
		
		JMenuItem bookInfoDelete = new JMenuItem("도서정보삭제");
		mnNewMenu_1.add(bookInfoDelete);
		
		JMenuItem bookInfoSelect = new JMenuItem("도서정보조회");
		mnNewMenu_1.add(bookInfoSelect);
		
		JMenu mnNewMenu_2 = new JMenu("사용자정보관리");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem userInfoInsert = new JMenuItem("사용자정보등록");
		mnNewMenu_2.add(userInfoInsert);
		
		JMenuItem userInfoUpdate = new JMenuItem("사용자정보수정");
		mnNewMenu_2.add(userInfoUpdate);
		
		JMenuItem userInfoDelete = new JMenuItem("사용자정보삭제");
		mnNewMenu_2.add(userInfoDelete);
		
		JMenuItem userInfoSelect = new JMenuItem("사용자정보조회");
		mnNewMenu_2.add(userInfoSelect);
		
		JMenu mnNewMenu_3 = new JMenu("도서대여관리");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem bookOutInsert = new JMenuItem("도서반출등록");
		mnNewMenu_3.add(bookOutInsert);
		
		JMenuItem bookOutUpdate = new JMenuItem("도서반입등록");
		mnNewMenu_3.add(bookOutUpdate);
		
		JMenu mnNewMenu_4 = new JMenu("도움말");
		menuBar.add(mnNewMenu_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
