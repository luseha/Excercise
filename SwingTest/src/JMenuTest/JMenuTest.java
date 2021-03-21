package JMenuTest;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		
		frame.setJMenuBar(createMenuBar());
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(800,600));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}           
	
	public static JMenuBar createMenuBar() {
		JMenuBar menubar = new JMenuBar();
		
		JMenu file = new JMenu("파일");
		JMenu bookInfo = new JMenu("도서정보관리");
		JMenu userInfo = new JMenu("사용자정보관리");
		JMenu bookInOut = new JMenu("도서대여관리");
		JMenu help = new JMenu("도움말");
		menubar.add(file);
		menubar.add(bookInfo);
		menubar.add(userInfo);
		menubar.add(bookInOut);
		menubar.add(help);
		
		//파일
		JMenuItem exit = new JMenuItem("종료");
		file.add(exit);
			
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//도서정보관리
		JMenuItem bookInfoInsert = new JMenuItem("도서정보등록");
		JMenuItem bookInfoUpdate = new JMenuItem("도서정보수정"); 
		JMenuItem bookInfoDelete = new JMenuItem("도서정보삭제"); 
		JMenuItem bookInfoSelect = new JMenuItem("도서정보조회"); 
		//도서정보조회
		bookInfo.add(bookInfoInsert);
		bookInfo.add(bookInfoUpdate);
		bookInfo.add(bookInfoDelete);
		bookInfo.addSeparator();
		bookInfo.add(bookInfoSelect);
		
		//사용자정보관리
		JMenuItem userInfoInsert = new JMenuItem("사용자정보등록");
		JMenuItem userInfoUpdate = new JMenuItem("사용자정보수정");
		JMenuItem userInfoDelete = new JMenuItem("사용자정보삭제");
		JMenuItem userInfoSelect = new JMenuItem("사용자정보조회");
		
		userInfo.add(userInfoInsert);
		userInfo.add(userInfoUpdate);
		userInfo.add(userInfoDelete);
		userInfo.addSeparator();
		userInfo.add(userInfoSelect);
		//도서대여관리
		JMenuItem bookOutInsert = new JMenuItem("도서반출등록");
		JMenuItem bookOutUpdate = new JMenuItem("도서반입등록");
		JMenuItem bookOutSelect = new JMenuItem("도서대여정보조회");
		
		bookInOut.add(bookOutInsert);
		bookInOut.add(bookOutUpdate);
		bookInOut.addSeparator();
		bookInOut.add(bookOutSelect);
		
		return menubar;
	}

}
