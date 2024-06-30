package controller.member;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.LoginUI;
import controller.PreOrderGameUI;
import model.Member;
import service.Impl.MemberServiceImpl;
import util.cal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MemberEditUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static MemberServiceImpl msi=new MemberServiceImpl();
	private JTextField name;
	private JTextField password;
	private JTextField address;
	private JTextField phone;
	private JTextField email;
	private JTextField daccount;
	private JTextField dpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberEditUI frame = new MemberEditUI();
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
	public MemberEditUI() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1316, 802);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(770, 10, 522, 345);
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setBackground(new Color(0,0,0,0));
		contentPane.add(scrollPane);
		
		JTextArea show = new JTextArea();
		scrollPane.setViewportView(show);
		show.setEditable(false);
		show.setForeground(new Color(255, 255, 255));
		show.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		show.setOpaque(false);
		show.setBackground(new Color(0, 0, 0, 0));
		
		Member m=(Member)cal.readFile("csgomember.txt");
		Member c=msi.queryByMemberno(m.getMemberno());
		show.setText("                      會員基本資料"
				+"\n會員編號 : "+c.getMemberno()
				+"\n姓名 : "+c.getName()
				+"\n帳號 : "+c.getAccount()
				+"\n密碼 : "+c.getPassword()
				+"\n信箱 : "+c.getEmail()
				+"\n地址 : "+c.getAddress()
				+"\n性別 : "+c.getSex()
				+"\n身分證字號 : "+c.getNationalid()
				+"\n電話 : "+c.getPhone()
				+"\n註冊時間 : "+c.getDatetime()
				);
		show.setCaretPosition(0);
		
		JLabel lblNewLabel1 = new JLabel("基本資料修改");
		lblNewLabel1.setForeground(Color.WHITE);
		lblNewLabel1.setFont(new Font("微軟正黑體", Font.BOLD, 40));
		lblNewLabel1.setBounds(158, 91, 263, 63);
		contentPane.add(lblNewLabel1);
		
		JLabel lblNewLabel1_1 = new JLabel("姓名 :");
		lblNewLabel1_1.setForeground(Color.WHITE);
		lblNewLabel1_1.setFont(new Font("微軟正黑體", Font.BOLD, 40));
		lblNewLabel1_1.setBounds(71, 164, 108, 77);
		contentPane.add(lblNewLabel1_1);
		
		name = new JTextField();
		name.setFont(new Font("微軟正黑體", Font.BOLD, 35));
		name.setColumns(10);
		name.setBounds(197, 172, 270, 63);
		contentPane.add(name);
		
		password = new JTextField();
		password.setFont(new Font("微軟正黑體", Font.BOLD, 35));
		password.setColumns(10);
		password.setBounds(197, 273, 270, 63);
		contentPane.add(password);
		
		JLabel lblNewLabel1_2 = new JLabel("密碼 :");
		lblNewLabel1_2.setForeground(Color.WHITE);
		lblNewLabel1_2.setFont(new Font("微軟正黑體", Font.BOLD, 40));
		lblNewLabel1_2.setBounds(71, 265, 108, 77);
		contentPane.add(lblNewLabel1_2);
		
		JLabel lblNewLabel1_3 = new JLabel("地址 :");
		lblNewLabel1_3.setForeground(Color.WHITE);
		lblNewLabel1_3.setFont(new Font("微軟正黑體", Font.BOLD, 40));
		lblNewLabel1_3.setBounds(71, 466, 108, 77);
		contentPane.add(lblNewLabel1_3);
		
		address = new JTextField();
		address.setFont(new Font("微軟正黑體", Font.BOLD, 35));
		address.setColumns(10);
		address.setBounds(197, 474, 270, 63);
		contentPane.add(address);
		
		phone = new JTextField();
		phone.setFont(new Font("微軟正黑體", Font.BOLD, 35));
		phone.setColumns(10);
		phone.setBounds(197, 573, 270, 63);
		contentPane.add(phone);
		
		JLabel lblNewLabel1_4 = new JLabel("電話 :");
		lblNewLabel1_4.setForeground(Color.WHITE);
		lblNewLabel1_4.setFont(new Font("微軟正黑體", Font.BOLD, 40));
		lblNewLabel1_4.setBounds(71, 565, 108, 77);
		contentPane.add(lblNewLabel1_4);
		
		JLabel lblNewLabel1_3_1 = new JLabel("信箱 :");
		lblNewLabel1_3_1.setForeground(Color.WHITE);
		lblNewLabel1_3_1.setFont(new Font("微軟正黑體", Font.BOLD, 40));
		lblNewLabel1_3_1.setBounds(71, 368, 108, 77);
		contentPane.add(lblNewLabel1_3_1);
		
		email = new JTextField();
		email.setFont(new Font("微軟正黑體", Font.BOLD, 35));
		email.setColumns(10);
		email.setBounds(197, 376, 270, 63);
		contentPane.add(email);
		
		JLabel lblNewLabel1_5 = new JLabel("刪除會員須填寫下列欄位:");
		lblNewLabel1_5.setForeground(Color.WHITE);
		lblNewLabel1_5.setFont(new Font("微軟正黑體", Font.BOLD, 40));
		lblNewLabel1_5.setBounds(801, 427, 463, 63);
		contentPane.add(lblNewLabel1_5);
		
		daccount = new JTextField();
		daccount.setFont(new Font("微軟正黑體", Font.BOLD, 35));
		daccount.setColumns(10);
		daccount.setBounds(965, 503, 270, 63);
		contentPane.add(daccount);
		
		JLabel lblNewLabel1_1_1 = new JLabel("帳號 :");
		lblNewLabel1_1_1.setForeground(Color.WHITE);
		lblNewLabel1_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 40));
		lblNewLabel1_1_1.setBounds(839, 495, 108, 77);
		contentPane.add(lblNewLabel1_1_1);
		
		dpassword = new JTextField();
		dpassword.setFont(new Font("微軟正黑體", Font.BOLD, 35));
		dpassword.setColumns(10);
		dpassword.setBounds(965, 604, 270, 63);
		contentPane.add(dpassword);
		JButton btnNewButton_1_1_2 = new JButton("回上一頁");
		btnNewButton_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginSuccessUI l=new LoginSuccessUI();
				l.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_2.setOpaque(true);
		btnNewButton_1_1_2.setForeground(Color.WHITE);
		btnNewButton_1_1_2.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_1_1_2.setBorderPainted(false);
		btnNewButton_1_1_2.setBackground(Color.BLACK);
		btnNewButton_1_1_2.setBounds(10, 10, 250, 63);
		contentPane.add(btnNewButton_1_1_2);
		
		JLabel lblNewLabel1_2_1 = new JLabel("密碼 :");
		lblNewLabel1_2_1.setForeground(Color.WHITE);
		lblNewLabel1_2_1.setFont(new Font("微軟正黑體", Font.BOLD, 40));
		lblNewLabel1_2_1.setBounds(839, 596, 108, 77);
		contentPane.add(lblNewLabel1_2_1);
		
		JButton btnNewButton_1_1 = new JButton("更新資料");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Member c=msi.queryByMemberno(m.getMemberno());
				
				show.setText("                      會員基本資料"
						+"\n會員編號 : "+c.getMemberno()
						+"\n姓名 : "+c.getName()
						+"\n帳號 : "+c.getAccount()
						+"\n密碼 : "+c.getPassword()
						+"\n信箱 : "+c.getEmail()
						+"\n地址 : "+c.getAddress()
						+"\n性別 : "+c.getSex()
						+"\n身分證字號 : "+c.getNationalid()
						+"\n電話 : "+c.getPhone()
						+"\n註冊時間 : "+c.getDatetime()
						);
				
                show.setCaretPosition(0);

			}
		});
		btnNewButton_1_1.setOpaque(true);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1.setBounds(1042, 365, 250, 63);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("離開遊戲");
		btnNewButton_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
			}
		});
		btnNewButton_1_1_1_1.setOpaque(true);
		btnNewButton_1_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_1_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1_1_1.setBounds(285, 10, 250, 63);
		contentPane.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("刪除會員");
		btnNewButton_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Member x=msi.queryByMember(daccount.getText(),dpassword.getText());
				String Daccount=daccount.getText();
				String Dpassword=dpassword.getText();
				if(x != null && Daccount != null && !Daccount.trim().isEmpty() && Dpassword != null && !Dpassword.trim().isEmpty() ) {
				msi.deleteMember(m.getMemberno(), daccount.getText(),dpassword.getText());
				JOptionPane.showMessageDialog(null, "您已成功刪除會員,請重新登入或註冊會員");
				LoginUI l=new LoginUI();
				l.setVisible(true);
				dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "無此帳號或密碼!請重新輸入!。", "錯誤", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_1_1_1.setOpaque(true);
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1_1.setBounds(1042, 692, 250, 63);
		contentPane.add(btnNewButton_1_1_1);
		
		
		
		JButton btnNewButton_1 = new JButton("確認修改");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name= name.getText();
				String Password= password.getText();
				String Email=email.getText();
				String Address=address.getText();
				String Phone=phone.getText();

				if(Name == null || Name.isEmpty() ||
						Password == null || Password.isEmpty() ||
						Email == null || Email.isEmpty() ||
						Address == null || Address.isEmpty() ||
						Phone == null || Phone.isEmpty()) {
					JOptionPane.showMessageDialog(null, "請填寫完所有欄位,謝謝!。", "錯誤", JOptionPane.ERROR_MESSAGE);
				
			}else {
				
				msi.updateMember(m.getMemberno(),
						name.getText(),
						password.getText(), 
						email.getText(), 
						address.getText(), 
						phone.getText());
				JOptionPane.showMessageDialog(null, "資料已修改成功。");
			}
				}
		});
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(197, 670, 250, 63);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1302, 765);
		setScaledImage(lblNewLabel, "/image/pic14.jpg");
		contentPane.add(lblNewLabel);
		
		
		

		
	
		
		
		
		
		

		
		
		
		
		
	
		
		
	}
	private void setScaledImage(JLabel label, String imagePath) {
		ImageIcon icon = new ImageIcon(PreOrderGameUI.class.getResource(imagePath));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(scaledImage));
	}
}
