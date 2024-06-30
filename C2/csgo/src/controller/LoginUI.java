package controller;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.member.AddMemberUI;
import controller.member.LoginErrorUI;
import model.Member;
import service.Impl.MemberServiceImpl;
import util.cal;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField account;
	private JTextField password;
	public static MemberServiceImpl msi=new MemberServiceImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1330, 850);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("限定測試登錄");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 60));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 10, 394, 77);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("帳號 : ");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 50));
		lblNewLabel_1_1.setBounds(415, 239, 143, 57);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("密碼 : ");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 50));
		lblNewLabel_1_1_1.setBounds(415, 350, 143, 57);
		contentPane.add(lblNewLabel_1_1_1);
		
		account = new JTextField();
		account.setFont(new Font("微軟正黑體", Font.BOLD, 50));
		account.setBounds(558, 231, 305, 73);
		contentPane.add(account);
		account.setColumns(10);
		
		password = new JTextField();
		password.setFont(new Font("微軟正黑體", Font.BOLD, 50));
		password.setColumns(10);
		password.setBounds(558, 345, 305, 67);
		contentPane.add(password);
		
		JLabel errorshow = new JLabel("");
		errorshow.setForeground(new Color(255, 0, 0));
		errorshow.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		errorshow.setBounds(568, 174, 293, 47);
		contentPane.add(errorshow);
		
		
		JButton btnNewButton = new JButton("登錄");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Account=account.getText();
				String Password=password.getText();
				if(Account == null || Account.isEmpty() || Password == null || Password.isEmpty())
				{
					LoginErrorUI l=new LoginErrorUI();
					l.setVisible(true);
					dispose();
				}else {
					Member m=msi.queryByMember(Account, Password);
					if(m!=null)
					{
						cal.saveFile("csgomember.txt", m);
						GuideUI g=new GuideUI();
						g.setVisible(true);
						dispose();
						/*LoginSuccessUI x=new LoginSuccessUI();
						x.setVisible(true);
						dispose();*/
					}else {
						account.setText("");
						password.setText("");
						errorshow.setText("**無此帳號或密碼**");
					}
					
					
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 45));
		btnNewButton.setBounds(558, 454, 134, 57);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("註冊");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddMemberUI l=new AddMemberUI();
				l.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 45));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(729, 454, 134, 57);
		contentPane.add(btnNewButton_1);
		JButton btnNewButton_3 = new JButton("離開");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setBounds(1192, 10, 124, 47);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("回預約登錄畫面");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PreOrderGameUI l=new PreOrderGameUI();
				l.setVisible(true);
				dispose();
			}
		});
		
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(1001, 746, 305, 57);
		contentPane.add(btnNewButton_2);
		
		JLabel time = new JLabel("");
		time.setForeground(new Color(255, 255, 255));
		time.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		time.setBounds(10, 766, 231, 47);
		contentPane.add(time);
		Timer timer = new Timer(100, e -> {
            String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            time.setText(currentTime); // 更新標籤内容
            });
            timer.start();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 10, 1322, 820);
		contentPane.add(lblNewLabel);
		setScaledImage(lblNewLabel, "/image/pic4.png");
		
	

		
	}
	private void setScaledImage(JLabel label, String imagePath) {
		ImageIcon icon = new ImageIcon(PreOrderGameUI.class.getResource(imagePath));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(scaledImage));
	}
}
