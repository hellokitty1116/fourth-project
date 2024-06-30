package controller.forum;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tablet1UI extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel panel;
	private JPanel contentPane;
	private JPanel outputpanel;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablet1UI frame = new Tablet1UI();
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
	public Tablet1UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 873);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(155, 84, 970, 693);
		contentPane.add(panel);
		panel.setLayout(null);
		
		outputpanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(new Color(255, 255, 255, 128)); // 設置白色半透明
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
		outputpanel.setBounds(122, 95, 721, 572);
		outputpanel.setOpaque(false);
		panel.add(outputpanel);
		outputpanel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("微軟正黑體", Font.BOLD, 35));
		textArea.setBounds(35, 33, 659, 509);
		textArea.setOpaque(false);
		outputpanel.add(textArea);
		
		String x="      敬愛的玩家您好!"+
		"\n\n     這裡是關於遊戲各項分析報告的區塊!"
		+"\n\n     請透過點選按鈕,來切換您想要觀看的"+"\n     分析報表";
	
		textArea.setText(x);
		
		
		JButton btnNewButton = new JButton("玩家性別比例");
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(new ChartUI().chartPanel);
			}
		});
		btnNewButton.setBounds(646, 21, 197, 55);
		panel.add(btnNewButton);
		
		btnNewButton_2 = new JButton("裝備購買比例");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(new Chart3UI().chartPanel);
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(232, 21, 197, 55);
		panel.add(btnNewButton_2);
		
		btnNewButton_1 = new JButton("槍枝中獎比例");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(new Chart2UI().chartPanel);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 25));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(439, 21, 197, 55);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 970, 693);
		panel.add(lblNewLabel);
		setScaledImage(lblNewLabel, "/image/pic20.jpg");
		
		
		
	
	}
	
	private void setScaledImage(JLabel label, String imagePath) {
		ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(scaledImage));
	}
	
	private void switchPanel(JPanel panel) {
		panel.setBounds(0, 0, outputpanel.getWidth(), outputpanel.getHeight());
		outputpanel.removeAll();
		outputpanel.add(panel);
		outputpanel.repaint();
		outputpanel.revalidate();
	}
}
