package controller;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class PreOrderGameUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int playerCount = 164832; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "歡迎進入CSGO登入預約畫面");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreOrderGameUI frame = new PreOrderGameUI();
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
	public PreOrderGameUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1307, 586);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginUI l=new LoginUI();
				l.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_1.setBounds(1104, 419, 179, 170);
		contentPane.add(lblNewLabel_1);
		setScaledImage(lblNewLabel_1, "/image/pic2.png");

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PreOrderGameUI.class.getResource("/image/pic1.gif")));
		lblNewLabel.setBounds(807, 77, 486, 260);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("目前預約玩家人數 : 164832 ");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		lblNewLabel_4.setBounds(922, 10, 350, 60);
		contentPane.add(lblNewLabel_4);
		// 在建構函式設置 Timer 來定時更新預約玩家人數
		Timer playerCountTimer = new Timer(400, new ActionListener() { // 每隔 ? 秒更新一次
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // 假設這裡模擬獲取新的預約玩家人數的邏輯，這裡直接使用計數器增加
		    	Random random = new Random();
		    	int randomIncrement = random.nextInt(10); //生成0-9隨機整數
		        playerCount += randomIncrement; // 這裡可以替換成你真實的數據邏輯
		        lblNewLabel_4.setText("目前預約玩家人數 : " + playerCount);
		    }
		});
		playerCountTimer.start(); // 啟動計時器
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginUI l=new LoginUI();
				l.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_3.setBounds(821, 447, 421, 117);
		contentPane.add(lblNewLabel_3);
		setScaledImage(lblNewLabel_3, "/image/pic3.png");
		
		
		
		JButton btnNewButton = new JButton("預約登入");
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		
		
		JLabel timelabel = new JLabel("");
		timelabel.setForeground(new Color(255, 255, 255));
		timelabel.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		timelabel.setBounds(10, 18, 268, 34);
		contentPane.add(timelabel);
		Timer timer = new Timer(100, e -> {
            String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            timelabel.setText(currentTime); // 更新標籤内容
            });
            timer.start();
            
            
            
		btnNewButton.setBounds(575, 322, 198, 60);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 1293, 572);
		contentPane.add(lblNewLabel_2);
		setScaledImage(lblNewLabel_2, "/image/pic5.jpg");
		
		
		
	
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginUI l=new LoginUI();
				l.setVisible(true);
				dispose();
			}
		});
		
	}
	private void setScaledImage(JLabel label, String imagePath) {
		ImageIcon icon = new ImageIcon(PreOrderGameUI.class.getResource(imagePath));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(scaledImage));
	}
}
