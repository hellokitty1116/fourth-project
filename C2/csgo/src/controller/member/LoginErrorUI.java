package controller.member;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.LoginUI;
import controller.PreOrderGameUI;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginErrorUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginErrorUI frame = new LoginErrorUI();
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
	public LoginErrorUI() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1100, 565);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("**登入失敗,請重新登入或註冊**");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 50));
		lblNewLabel_1.setBounds(180, 154, 761, 54);
		contentPane.add(lblNewLabel_1);
		
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
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 40));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(476, 262, 152, 72);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("返回登入");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginUI l=new LoginUI();
				l.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1.setBounds(873, 461, 203, 57);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("離開遊戲");
		btnNewButton_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_1_2.setBackground(Color.BLACK);
		btnNewButton_1_2.setBounds(873, 390, 203, 57);
		contentPane.add(btnNewButton_1_2);
		
		JLabel time = new JLabel("New label");
		time.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		time.setForeground(new Color(255, 255, 255));
		time.setBounds(10, 10, 330, 54);
		contentPane.add(time);
		Timer timer = new Timer(100, e -> {
            String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            time.setText(currentTime); // 更新標籤内容
            });
            timer.start();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 50));
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBounds(0, 0, 1092, 535);
		contentPane.add(lblNewLabel);
		setScaledImage(lblNewLabel, "/image/pic13.jpg");
		
		
		

		
		
	}
	private void setScaledImage(JLabel label, String imagePath) {
		ImageIcon icon = new ImageIcon(PreOrderGameUI.class.getResource(imagePath));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(scaledImage));
	}
}
