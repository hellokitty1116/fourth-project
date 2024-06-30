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

public class Character2UI extends JFrame {

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
	private String a1="童年時期因為戰爭失去雙親，\r\n"+"並且為了生存而加入了軍隊。\r\n"
			+ "\r\n"
			+ "當時在救援組織中被道格拉斯．賈各博注意到，\r\n"+"經他勸說，便和他一起到了美國。\r\n"
			+ "\r\n"
			+ "在他的適當幫助和她閃亮的外貌下，\r\n"+"她迅速成為了明星。\r\n"+"作為幫助的回報，\r\n"+"她開始使用由克羅諾斯提供的血清，\r\n"+"但由於擁有特殊的基因，病毒無法變異，\r\n"+"反而在不知不覺中她覺醒成為了超級士兵。";
	private String b1="因爲與夢幻打賭所以換上了可愛軟萌的毛衣\r\n"
			+ "這樣的穿搭讓罌粟感到很害羞\r\n"
			+ "\r\n"
			+ "而身為VR平臺克洛諾世界的職業玩家\r\n"
			+ "以出色的實力在世界遊戲大賽中揚名\r\n"
			+ "\r\n"
			+ "和雙胞胎姐姐夢幻最大的不同點在於\r\n"
			+ "優秀的體力和人見人愛的親和力是罌粟的特色\r\n"
			+ "為了保護得知克洛諾世界製作者詭計的夢幻\r\n"
			+ "罌粟以保護者的身分緊跟著夢幻身後";
	private String c1="吸血鬼和人類的混血，雖然出身貴族世家，\r\n"+
			"但由於混血得限制從小在差別待遇和無視中長大。\r\n"+"身為貴族的自負感變質看得出她鄙視所有事物的態度。\r\n\n"+
			"外觀和人類無異，不過仍有繼承吸血鬼的氣質，\r\n"+"身體的能力非常優秀。\r\n\n"+"在父母因村民舉報受到審判處決後獨自生存下來，\r\n"+"加入了培養她能力的獵人組織過著無差別獵殺的生活。";
	private String d1="從成為了廢墟的失落城市中救出的唯一生存者\r\n"+"--麻生亞子\r\n"
			+ "跟隨救出自己的卡爾成為組織的一員。\r\n"+"為找尋過去的記憶正努力著，\r\n"
			+ "也因此發掘了潛在的才能被選為新武器的的測試員。\r\n"+"卡爾雖希望她長成平凡的少女\r\n"
			+ "但外部環境正在摧毀著他所希望的。";
	private String a="星之璀璨－安潔莉娜";
	private String b="雪白萌羊 － 罌粟";
	private String c="嗜血獵人-伊莎貝拉";
	private String d="訓練兵-麻生亞子";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Character2UI frame = new Character2UI();
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
	public Character2UI() {
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
				setScaledImage(lblNewLabel_4, "/image/tru1.jpg");
				output.setText(a1);
				lblNewLabel_5.setText(a);
				output.setCaretPosition(0);
			}
		});
		lblNewLabel.setBounds(140, 367, 96, 94);
		panel.add(lblNewLabel);
		setScaledImage(lblNewLabel, "/image/tru2.jpg");
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setScaledImage(lblNewLabel_4, "/image/tru3.jpg");
				output.setText(b1);
				lblNewLabel_5.setText(b);
				output.setCaretPosition(0);
			}
		});
		lblNewLabel_1.setBounds(140, 471, 96, 94);
		panel.add(lblNewLabel_1);
		setScaledImage(lblNewLabel_1, "/image/tru4.jpg");
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setScaledImage(lblNewLabel_4, "/image/tru5.jpg");
				output.setText(c1);
				lblNewLabel_5.setText(c);
				output.setCaretPosition(0);
			}
		});
		lblNewLabel_2.setBounds(21, 367, 96, 94);
		panel.add(lblNewLabel_2);
		setScaledImage(lblNewLabel_2, "/image/tru6.jpg");
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(268, 0, 619, 575);
		panel.add(lblNewLabel_4);
		setScaledImage(lblNewLabel_4, "/image/tru1.jpg");
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setScaledImage(lblNewLabel_4, "/image/tru7.jpg");
				output.setText(d1);
				lblNewLabel_5.setText(d);
				output.setCaretPosition(0);
			}
		});
		lblNewLabel_3.setBounds(21, 471, 96, 94);
		panel.add(lblNewLabel_3);
		setScaledImage(lblNewLabel_3, "/image/tru8.jpg");
		
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
		
		lblNewLabel_5 = new JLabel("星之璀璨－安潔莉娜");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("新細明體", Font.BOLD, 25));
		lblNewLabel_5.setBounds(10, 32, 237, 39);
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
