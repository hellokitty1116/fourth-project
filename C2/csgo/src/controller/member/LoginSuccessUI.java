package controller.member;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Member;
import util.cal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import controller.PreOrderGameUI;
import controller.forum.ForumUI;
import controller.gunshop.RecordUI;
import controller.lotto.LottoUI;

public class LoginSuccessUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSuccessUI frame = new LoginSuccessUI();
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
	public LoginSuccessUI() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1156, 731);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("恭喜您登入成功,請先選取操作介面");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 40));
		lblNewLabel.setBounds(302, 128, 625, 64);
		contentPane.add(lblNewLabel);
		
		JLabel show = new JLabel("");
		show.setForeground(new Color(0, 0, 0));
		show.setHorizontalAlignment(SwingConstants.CENTER);
		show.setFont(new Font("微軟正黑體", Font.BOLD, 40));
		show.setBounds(403, 56, 468, 64);
		contentPane.add(show);
		
		JButton btnNewButton_1_2 = new JButton("離開遊戲");
		btnNewButton_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		
		JButton btnNewButton_1_2_1_1 = new JButton("遊戲論壇");
		btnNewButton_1_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ForumUI x=new ForumUI();
				x.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2_1_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_1_2_1_1.setBackground(Color.BLACK);
		btnNewButton_1_2_1_1.setBounds(497, 612, 203, 57);
		contentPane.add(btnNewButton_1_2_1_1);
		
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_1_2.setBackground(Color.BLACK);
		btnNewButton_1_2.setBounds(929, 10, 203, 57);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("購買裝備");
		btnNewButton_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "測試登入-先行體驗版--抽槍系統");
				LottoUI x= new LottoUI();
				x.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_1_2_1.setBackground(Color.BLACK);
		btnNewButton_1_2_1.setBounds(497, 454, 203, 57);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_2 = new JButton("購買紀錄");
		btnNewButton_1_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RecordUI r=new RecordUI();
				r.setVisible(true);
			}
		});
		btnNewButton_1_2_2.setForeground(Color.WHITE);
		btnNewButton_1_2_2.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_1_2_2.setBackground(Color.BLACK);
		btnNewButton_1_2_2.setBounds(497, 534, 203, 57);
		contentPane.add(btnNewButton_1_2_2);
		
		JButton btnNewButton_1_2_3 = new JButton("修改會員資料");
		btnNewButton_1_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MemberEditUI x=new MemberEditUI();
				x.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_2_3.setForeground(Color.WHITE);
		btnNewButton_1_2_3.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_1_2_3.setBackground(Color.BLACK);
		btnNewButton_1_2_3.setBounds(823, 627, 309, 57);
		contentPane.add(btnNewButton_1_2_3);
		
		JLabel timelabel = new JLabel("");
		timelabel.setForeground(new Color(0, 0, 0));
		timelabel.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		timelabel.setBounds(21, 0, 323, 46);
		contentPane.add(timelabel);
		Timer timer = new Timer(100, e -> {
            String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            timelabel.setText(currentTime); // 更新標籤内容
            });
            timer.start();
		
		JLabel lblLoginsuccess = new JLabel("");
		lblLoginsuccess.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLoginsuccess.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginsuccess.setForeground(Color.RED);
		lblLoginsuccess.setFont(new Font("微軟正黑體", Font.BOLD, 50));
		lblLoginsuccess.setBounds(0, 0, 1147, 701);
		contentPane.add(lblLoginsuccess);
		setScaledImage(lblLoginsuccess, "/image/pic8.jpg");
		
	
		Object o = cal.readFile("csgomember.txt");
		Member m= (Member) o;
		show.setText(m.getName()+",歡迎您");
		
		
	
		
		
		
		
		
		
		
	}
	private void setScaledImage(JLabel label, String imagePath) {
		ImageIcon icon = new ImageIcon(PreOrderGameUI.class.getResource(imagePath));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(scaledImage));
	}
}
