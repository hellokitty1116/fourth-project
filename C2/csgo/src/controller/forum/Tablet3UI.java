package controller.forum;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class Tablet3UI extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel panel;
	public JPanel outputpanel;
	private JPanel contentPane;
	private JLabel lblNewLabel_2;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablet3UI frame = new Tablet3UI();
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
	public Tablet3UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 873);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(153, 10, 970, 693);
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
		outputpanel.setBounds(43, 108, 887, 575);
		outputpanel.setOpaque(false);
		panel.add(outputpanel);
		outputpanel.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("微軟正黑體", Font.BOLD, 35));
		textArea.setBounds(64, 38, 768, 516);
		textArea.setOpaque(false);
		outputpanel.add(textArea);
		
		
		textArea.setText("                            ****操作說明****"+
		"\n\n請透過點選圖標來觀看本遊戲中各個角色的介紹!");
		
		

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(new Character1UI().panel);
				setScaledImage(lblNewLabel_1, "/image/image2.jpg");
				setScaledImage(lblNewLabel_2, "/image/image3.jpg");
				
			}
		});
		lblNewLabel_1.setBounds(10, 10, 73, 88);
		panel.add(lblNewLabel_1);
		setScaledImage(lblNewLabel_1, "/image/image1.jpg");
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanel(new Character2UI().panel);
				setScaledImage(lblNewLabel_2, "/image/image4.jpg");
				setScaledImage(lblNewLabel_1, "/image/image1.jpg");
			}
		});
		lblNewLabel_2.setBounds(93, 10, 73, 88);
		panel.add(lblNewLabel_2);
		setScaledImage(lblNewLabel_2, "/image/image3.jpg");
		
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 970, 693);
		panel.add(lblNewLabel);
		setScaledImage(lblNewLabel,"/image/pic17.jpg");
		
	
		
		
		
		
		
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
