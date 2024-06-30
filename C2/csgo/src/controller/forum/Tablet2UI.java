package controller.forum;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.JButton;

public class Tablet2UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JPanel panel;
	private JPanel outputpanel;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	private String text = "     和平與戰爭兩者"
			+ "\n\n     和平是人類一直追求的事物!"
			+ "\n     戰爭是人類長久厭惡的事物"
			+ "\n\n     但是和平並非一直能長久保持下去"
			+ "\n     每個年代，總有些人類會製造戰爭而破壞和平"
			+ "\n     我們稱呼這些人為恐怖份子"
			+ "\n     而為了對付恐怖份子"
			+ "\n     每個國家都設有反恐部隊"
			+ "\n     以制止及消除任何恐怖分子對國家造成的威脅"
			+ "\n     戰爭是人類長久厭惡的事物"
			+ "\n\n     但長期以來"
			+ "\n     恐怖份子的行動一直打擊著每個國家的政治、經濟與軍事"
			+ "\n     戰爭是人類長久厭惡的事物"
			+ "\n     為了消滅恐怖份子們"
			+ "\n     政府開始著手研究高科技武器，甚至是生化武器…";
	private int charIndex = 0;
	private Timer timer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablet2UI frame = new Tablet2UI();
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
	public Tablet2UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1324, 873);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(26, 76, 970, 693);
		contentPane.add(panel);
		panel.setLayout(null);
		
		outputpanel = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(new Color(255, 255, 255, 128)); // 設置白色半透明
                g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		outputpanel.setLayout(null);
		outputpanel.setOpaque(false);
		outputpanel.setBounds(33, 23, 916, 644);
		panel.add(outputpanel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 896, 624);
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setBorder(null);
		outputpanel.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setOpaque(false);
		textArea.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		textArea.setCaretPosition(0);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 970, 693);
		panel.add(lblNewLabel);
		setScaledImage(lblNewLabel,"/image/pic19.jpg");

		startTextAnimation();

		// Hide scrollbars
		scrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());
		scrollPane.getHorizontalScrollBar().setUI(new CustomScrollBarUI());
	}

	private void setScaledImage(JLabel label, String imagePath) {
	    ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
	    Image image = icon.getImage();
	    Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
	    label.setIcon(new ImageIcon(scaledImage));
	}
	 
	private void startTextAnimation() {
	    timer = new Timer(50, e -> {
	        if (charIndex < text.length()) {
	            textArea.append(String.valueOf(text.charAt(charIndex)));
	            charIndex++;
	        } else {
	            timer.stop();
	        }
	    });
	    timer.start();
	}
	
	private static class CustomScrollBarUI extends BasicScrollBarUI {
		@Override
		protected void configureScrollBarColors() {
			this.thumbColor = new Color(0, 0, 0, 0); // Transparent
			this.trackColor = new Color(0, 0, 0); // Transparent
		}

		@Override
		protected JButton createDecreaseButton(int orientation) {
			JButton button = super.createDecreaseButton(orientation);
			button.setBackground(Color.BLACK); // 設置減少按鈕的背景顏色為黑色
			return button;
		}

		@Override
		protected JButton createIncreaseButton(int orientation) {
			JButton button = super.createIncreaseButton(orientation);
			button.setBackground(Color.BLACK); // 設置增加按鈕的背景顏色為黑色
			return button;
		}
	}
}
