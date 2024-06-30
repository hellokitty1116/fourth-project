package controller.forum;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.JButton;

public class Character1UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JPanel panel;
	private JTextArea output;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JScrollPane scrollPane;
	private String a1="浮士德的身世無人知曉\r\n"
			+ "也沒人知道他的年齡或名字是否是真的\r\n"
			+ "\r\n"
			+ "浮士德將自己的一切都獻給了伊莎貝拉\r\n"
			+ "除了她之外其他人都像蟲子一樣\r\n"
			+ "但與禮貌無關\r\n"
			+ "而是他不曾把其他人放在眼裡";
	private String b1="是村裡最資深的工讀生，\r\n"+"在包子店工作的純真少女。\r\n"
			+ "\r\n"
			+ "某天，\r\n"+"在外送途中發現一個倒在地上的男人，\r\n"+"善良的明月決定要幫幫她，\r\n"+"沒想到這一個舉動也為她原本平凡的生活，\r\n"+"開啟了不一樣的新篇章。\r\n"
			+ "\r\n"
			+ "明月對總是躲在一旁，\r\n"+"只吃包子不做事的沃夫感到不悅，\r\n"+"努力想把他拉到店裡支援外送工作。\r\n"+"她不太在意他的過去，\r\n"+"反而對於在村裡找到一個願意和她玩的人而感到開心。";
	private String c1="羅美的親哥哥，\r\n\n"+"年幼的兄妹能從失落城市中生存下來，\r\n"+"都是多虧了羅伊的快速判斷力和\r\n"+"從曾經是失落城市守衛隊長的父親那學到的生存技術。\r\n"+"從小對於軍人有憧憬，\r\n"+
			"因此希望能成為軍人，\r\n"+"但從失落城市無力抵抗的軍人身上感受到莫大的失落感，\r\n"+""
			+ "因此期望成為平凡的社員，\r\n"+"不過為了賺錢有時候會加入傭兵活動。\r\n"+"和他陰沉的語調不同，\r\n"+"處事起來俐落因而受到傭兵團的喜愛。";
	private String d1="作為VR平台克洛諾世界招牌直播主，\r\n\n"+
			"實際上是一名厲害的駭客。\r\n"+
			"在網路世界中雖是活潑的個性，\r\n"+
			"不過在現實生活中則是很害羞且謹慎的個性。\r\n"+
			"偶然發現克洛諾世界的奇怪紀錄，\r\n"+"為了獲取情報，躲避接近的敵人並試圖接觸秘密基地研究所。";
	private String a="夜幕執事－浮士德";
	private String b="包子甜心－明月";
	private String c="防彈少年-羅伊";
	private String d="虛擬蜜糖-夢幻";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Character1UI frame = new Character1UI();
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
	public Character1UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1241, 909);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(161, 125, 887, 575);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setScaledImage(lblNewLabel_4, "/image/ctru1.jpg");
				output.setText(a1);
				lblNewLabel_5.setText(a);
				output.setCaretPosition(0);
			}
		});
		lblNewLabel.setBounds(140, 367, 96, 94);
		panel.add(lblNewLabel);
		setScaledImage(lblNewLabel, "/image/ctru2.jpg");
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setScaledImage(lblNewLabel_4, "/image/ctru3.jpg");
				output.setText(b1);
				lblNewLabel_5.setText(b);
				output.setCaretPosition(0);
			}
		});
		lblNewLabel_1.setBounds(140, 471, 96, 94);
		panel.add(lblNewLabel_1);
		setScaledImage(lblNewLabel_1, "/image/ctru4.jpg");
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setScaledImage(lblNewLabel_4, "/image/ctru5.jpg");
				output.setText(c1);
				lblNewLabel_5.setText(c);
				output.setCaretPosition(0);
			}
		});
		lblNewLabel_2.setBounds(21, 367, 96, 94);
		panel.add(lblNewLabel_2);
		setScaledImage(lblNewLabel_2, "/image/ctru6.jpg");
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(268, 0, 619, 575);
		panel.add(lblNewLabel_4);
		setScaledImage(lblNewLabel_4, "/image/ctru1.jpg");
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setScaledImage(lblNewLabel_4, "/image/ctru7.jpg");
				output.setText(d1);
				lblNewLabel_5.setText(d);
				output.setCaretPosition(0);
			}
		});
		lblNewLabel_3.setBounds(21, 471, 96, 94);
		panel.add(lblNewLabel_3);
		setScaledImage(lblNewLabel_3, "/image/ctru8.jpg");
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 81, 215, 251);
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setBackground(new Color(0,0,0,0));
		panel.add(scrollPane);
		
		output = new JTextArea();
		output.setForeground(new Color(255, 255, 255));
		output.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		output.setOpaque(false);
		scrollPane.setViewportView(output);
		output.setText(a1);
		output.setCaretPosition(0);
		
		lblNewLabel_5 = new JLabel("夜幕執事－浮士德");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("新細明體", Font.BOLD, 25));
		lblNewLabel_5.setBounds(21, 32, 215, 39);
		panel.add(lblNewLabel_5);
		
		// 修改JScrollPane的外觀
		scrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());
		scrollPane.getHorizontalScrollBar().setUI(new CustomScrollBarUI());
	}
	
	private void setScaledImage(JLabel label, String imagePath) {
		ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(scaledImage));
	}
	
	private static class CustomScrollBarUI extends BasicScrollBarUI {
		@Override
		protected void configureScrollBarColors() {
			this.thumbColor = new Color(41, 36, 33); // 設置滑塊的顏色為透明
			this.trackColor = new Color(0, 0, 0); // 設置軌道的顏色為黑色
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
