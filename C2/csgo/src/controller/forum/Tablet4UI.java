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
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Tablet4UI extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel panel;
	private JPanel contentPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_1;
	private JTextArea textArea_1;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablet4UI frame = new Tablet4UI();
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
	public Tablet4UI() {
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
		
		 scrollPane = new JScrollPane();
	        scrollPane.setBounds(56, 30, 864, 639);
	        scrollPane.setOpaque(false);
	        scrollPane.getViewport().setOpaque(false);
	        scrollPane.setBorder(null);
	        panel.add(scrollPane);
	        
	        textArea_1 = new JTextArea();
	        scrollPane.setViewportView(textArea_1);
	        textArea_1.setForeground(new Color(255, 255, 255));
	        textArea_1.setOpaque(false);
	        textArea_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
	        
	        
	    	
			  String announcement = "\t       **伺服器維護公告**"+
			  "\n\n               親愛的玩家您好，我們是CSGO營運團隊。"+
			  "\n               由於改版維護作業超出預期，故需延長維護時間。"+
			  "\n       開放時間將以本公告更新通知， 造成不便之處，懇請見諒。"+
			  "\n    *********************************************************"+
			  "\n               因維護時間較長，開啟補償活動："+
			  "\n               活動時間：2024/06/05 14:00 - 2024/7/05 23:59"+
			  "\n               活動條件：於4人房以上，遊玩20分鐘。"+
			  "\n               活動獎勵：稀有解碼器 10個 + 活動解碼器 1個"+
			  "\n\n               造成玩家不便，敬請見諒。"+
			  "\n               Have a good GAME!!"+
			  "\n\n            《CSO絕對武力》營運團隊敬上";
			
			  textArea_1.setText(announcement);
		
		JTextArea textArea = new JTextArea() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(new Color(255, 255, 255, 128)); // 設置白色半透明
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        textArea.setBounds(24, 10, 920, 673);
        textArea.setOpaque(false);
        panel.add(textArea);
        
       
	
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 970, 693);
		panel.add(lblNewLabel);
		setScaledImage(lblNewLabel,"/image/pic9.jpg");
		
		
		
		
	

      
       
		
		
		
		
		
	}
	 private void setScaledImage(JLabel label, String imagePath) {
	        ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
	        Image image = icon.getImage();
	        Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
	        label.setIcon(new ImageIcon(scaledImage));
	    }
	 public JPanel getContentPanel() {
	        return panel;
	    }
}
