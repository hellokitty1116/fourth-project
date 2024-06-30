package controller.member;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import controller.LoginUI;
import util.cal;
import dao.impl.MemberDaoImpl;
import model.Member;

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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;

public class AddMemberUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField memberno;
	private JTextField name;
	private JTextField account;
	private JTextField password;
	private JTextField email;
	private JTextField address;
	private JTextField phone;
	private JTextField nid;
	private boolean privacyAgreementViewed = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMemberUI frame = new AddMemberUI();
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
	public AddMemberUI() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1276, 806);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		btnNewButton_3.setBounds(1138, 0, 124, 47);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("限定測試註冊");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 60));
		lblNewLabel_1.setBounds(0, 0, 394, 77);
		contentPane.add(lblNewLabel_1);
		
		JLabel time = new JLabel("");
		time.setForeground(Color.WHITE);
		time.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		time.setBounds(10, 733, 231, 36);
		contentPane.add(time);
		Timer timer = new Timer(100, e -> {
            String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            time.setText(currentTime); // 更新標籤内容
            });
            timer.start();
            
            JLabel lblNewLabel_1_1 = new JLabel("會員編碼 : ");
    		lblNewLabel_1_1.setForeground(Color.WHITE);
    		lblNewLabel_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 50));
    		lblNewLabel_1_1.setBounds(63, 215, 255, 57);
    		contentPane.add(lblNewLabel_1_1);
    		
    		JLabel lblNewLabel_1_1_1 = new JLabel("姓名 : ");
    		lblNewLabel_1_1_1.setForeground(Color.WHITE);
    		lblNewLabel_1_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 50));
    		lblNewLabel_1_1_1.setBounds(92, 322, 143, 57);
    		contentPane.add(lblNewLabel_1_1_1);
    		
    		JLabel lblNewLabel_1_1_2 = new JLabel("帳號 : ");
    		lblNewLabel_1_1_2.setForeground(Color.WHITE);
    		lblNewLabel_1_1_2.setFont(new Font("微軟正黑體", Font.BOLD, 50));
    		lblNewLabel_1_1_2.setBounds(92, 425, 143, 57);
    		contentPane.add(lblNewLabel_1_1_2);
    		
    		JLabel lblNewLabel_1_1_3 = new JLabel("密碼 : ");
    		lblNewLabel_1_1_3.setForeground(Color.WHITE);
    		lblNewLabel_1_1_3.setFont(new Font("微軟正黑體", Font.BOLD, 50));
    		lblNewLabel_1_1_3.setBounds(92, 534, 143, 57);
    		contentPane.add(lblNewLabel_1_1_3);
    		
    		JLabel lblNewLabel_1_1_4 = new JLabel("信箱 : ");
    		lblNewLabel_1_1_4.setForeground(Color.WHITE);
    		lblNewLabel_1_1_4.setFont(new Font("微軟正黑體", Font.BOLD, 50));
    		lblNewLabel_1_1_4.setBounds(597, 322, 143, 57);
    		contentPane.add(lblNewLabel_1_1_4);
    		
    		JLabel lblNewLabel_1_1_5 = new JLabel("性別 : ");
    		lblNewLabel_1_1_5.setForeground(Color.WHITE);
    		lblNewLabel_1_1_5.setFont(new Font("微軟正黑體", Font.BOLD, 50));
    		lblNewLabel_1_1_5.setBounds(597, 215, 143, 57);
    		contentPane.add(lblNewLabel_1_1_5);
    		
    		JLabel lblNewLabel_1_1_6 = new JLabel("身分證字號 : ");
    		lblNewLabel_1_1_6.setForeground(Color.WHITE);
    		lblNewLabel_1_1_6.setFont(new Font("微軟正黑體", Font.BOLD, 40));
    		lblNewLabel_1_1_6.setBounds(36, 638, 246, 57);
    		contentPane.add(lblNewLabel_1_1_6);
    		
    		JLabel lblNewLabel_1_1_7 = new JLabel("地址 : ");
    		lblNewLabel_1_1_7.setForeground(Color.WHITE);
    		lblNewLabel_1_1_7.setFont(new Font("微軟正黑體", Font.BOLD, 50));
    		lblNewLabel_1_1_7.setBounds(597, 521, 143, 57);
    		contentPane.add(lblNewLabel_1_1_7);
    		
    		JLabel lblNewLabel_1_1_8 = new JLabel("電話 : ");
    		lblNewLabel_1_1_8.setForeground(Color.WHITE);
    		lblNewLabel_1_1_8.setFont(new Font("微軟正黑體", Font.BOLD, 50));
    		lblNewLabel_1_1_8.setBounds(597, 425, 143, 57);
    		contentPane.add(lblNewLabel_1_1_8);
    		
    		memberno = new JTextField();
    		memberno.setFont(new Font("微軟正黑體", Font.BOLD, 40));
    		memberno.setEditable(false);
    		memberno.setBounds(293, 215, 246, 57);
    		contentPane.add(memberno);
    		memberno.setColumns(10);
    		generateAndSetNextMemberNo();
    		
    		name = new JTextField();
    		name.setFont(new Font("微軟正黑體", Font.BOLD, 40));
    		name.setColumns(10);
    		name.setBounds(293, 322, 246, 57);
    		contentPane.add(name);
    		
    		account = new JTextField();
    		account.setFont(new Font("微軟正黑體", Font.BOLD, 40));
    		account.setColumns(10);
    		account.setBounds(293, 425, 246, 57);
    		contentPane.add(account);
    		
    		password = new JTextField();
    		password.setFont(new Font("微軟正黑體", Font.BOLD, 40));
    		password.setColumns(10);
    		password.setBounds(293, 534, 246, 57);
    		contentPane.add(password);
    		
    		email = new JTextField();
    		email.setFont(new Font("微軟正黑體", Font.BOLD, 40));
    		email.setColumns(10);
    		email.setBounds(743, 322, 366, 57);
    		contentPane.add(email);
    		
    		address = new JTextField();
    		address.setFont(new Font("微軟正黑體", Font.BOLD, 40));
    		address.setColumns(10);
    		address.setBounds(743, 521, 366, 57);
    		contentPane.add(address);
    		
    		try {
    		    MaskFormatter formatter = new MaskFormatter("09########");
    		    formatter.setPlaceholderCharacter('_'); // 设置占位符号，这里可以使用 '_' 或其他符号作为占位符
    		    phone = new JFormattedTextField(formatter);
    		} catch (ParseException e) {
    		    e.printStackTrace();
    		}
    		
    		phone.setFont(new Font("微軟正黑體", Font.BOLD, 40));
    		phone.setColumns(10);
    		phone.setBounds(745, 425, 366, 57);
    		contentPane.add(phone);
    		
    		try {
    		    MaskFormatter formatter = new MaskFormatter("U#########");
    		    formatter.setPlaceholderCharacter('_'); // 设置占位符号，这里使用 '_' 作为占位符号
    		    nid = new JFormattedTextField(formatter);
    		    nid.setFont(new Font("微軟正黑體", Font.BOLD, 40));
    		} catch (ParseException e) {
    		    e.printStackTrace();
    		}
    		
    		
    		nid.setColumns(10);
    		nid.setBounds(292, 638, 247, 57);
    		contentPane.add(nid);
    		
    		JComboBox<String> sex = new JComboBox();
    		sex.setEditable(true);
    		sex.setFont(new Font("微軟正黑體", Font.BOLD, 50));
    		sex.setBounds(781, 215, 81, 57);
    		sex.addItem("m");
    		sex.addItem("f");
    		contentPane.add(sex);
    		
    		JCheckBox chckbxNewCheckBox = new JCheckBox("我已年滿 13 歲並同意");
    		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				if (!privacyAgreementViewed) {
                        JOptionPane.showMessageDialog(null, "請先瀏覽隱私協議!", "警告", JOptionPane.WARNING_MESSAGE);
                        chckbxNewCheckBox.setSelected(false);
                    }
    			}
    		});
    		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
    		chckbxNewCheckBox.setFont(new Font("微軟正黑體", Font.BOLD, 25));
    		chckbxNewCheckBox.setBounds(610, 599, 273, 29);
    		chckbxNewCheckBox.setOpaque(false);
    		chckbxNewCheckBox.setBorder(null);
    		chckbxNewCheckBox.setBackground(new Color(0, 0, 0, 0));
    		contentPane.add(chckbxNewCheckBox);
    		
    		JLabel lblNewLabel_2 = new JLabel("隱私協議");
    		lblNewLabel_2.addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				ContrcactUI X= new ContrcactUI();
    				X.setVisible(true);
    				privacyAgreementViewed = true; // 标记为已点击
    			}
    		});
    		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.BOLD, 25));
    		lblNewLabel_2.setForeground(new Color(255, 0, 0));
    		lblNewLabel_2.setBounds(877, 599, 114, 29);
    		contentPane.add(lblNewLabel_2);
    		
    		JButton btnNewButton_1 = new JButton("資料送出");
    		btnNewButton_1.addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				if (chckbxNewCheckBox.isSelected()) {
    				String s=sex.getSelectedItem().toString();
    				Member m= new MemberDaoImpl().queryAccount(account.getText());
    				if(m!=null)
    				{
    					JOptionPane.showMessageDialog(null, "帳號重複!請重新填寫。", "錯誤", JOptionPane.ERROR_MESSAGE);
    					
    				}else
    				{   String Name=name.getText();
    					String Account=account.getText();
    					String Address=address.getText();
    					String Password=password.getText();
    					String Phone=phone.getText();
    					String Email=email.getText();
    					
    					 
    					if (Name.trim().isEmpty() || 
    							Account.trim().isEmpty() || 
    							Password.trim().isEmpty() || 
    							Address.trim().isEmpty() || 
    							Phone.trim().isEmpty()	|| 
								s.trim().isEmpty()	||
    							Email.trim().isEmpty())
    					{
    						
    						JOptionPane.showMessageDialog(null, "所有欄位都必須填寫。", "錯誤", JOptionPane.ERROR_MESSAGE);
    						
    					}
    					else {
    						Member m1=new Member(memberno.getText(),
    	    						name.getText(),
    	    						account.getText(),
    	    						password.getText(),
    	    						email.getText(),
    	    						s,
    	    						nid.getText(),
    	    						address.getText(),
    	    						phone.getText());
    						
    						new MemberDaoImpl().add(m1);
    						
    						AddMemberSuccessUI x=new AddMemberSuccessUI();
    						x.setVisible(true);
    						dispose();
    						
    					}
    				}
    				
    			
    				
    			}else {
    				JOptionPane.showMessageDialog(null, "請先勾選同意隱私協議。", "提示", JOptionPane.INFORMATION_MESSAGE);
    			}
    		}}
    		
    				);
    		
    		JButton btnNewButton_1_1 = new JButton("返回登入");
    		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
    			@Override
    			public void mouseClicked(MouseEvent e) {
    				LoginUI y=new LoginUI();
    				y.setVisible(true);
    				dispose();
    			}
    		});
    		btnNewButton_1_1.setForeground(Color.WHITE);
    		btnNewButton_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 45));
    		btnNewButton_1_1.setBackground(Color.BLACK);
    		btnNewButton_1_1.setBounds(1012, 635, 240, 57);
    		contentPane.add(btnNewButton_1_1);
    		
    		btnNewButton_1.setForeground(Color.WHITE);
    		btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 45));
    		btnNewButton_1.setBackground(Color.BLACK);
    		btnNewButton_1.setBounds(745, 638, 240, 57);
    		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 50));
		lblNewLabel.setBounds(0, 0, 1267, 776);
		contentPane.add(lblNewLabel);
		setScaledImage(lblNewLabel, "/image/pic18.jpg");
		
		
		
	
	
	
		
	
	}
	
	private void setScaledImage(JLabel label, String imagePath) {
		ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(scaledImage));
	}
	private void generateAndSetNextMemberNo() {
	    String nextMemberNo = new MemberDaoImpl().generateNextMemberNo();
	    memberno.setText(nextMemberNo);
	}
}
