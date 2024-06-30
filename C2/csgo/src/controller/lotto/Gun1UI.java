package controller.lotto;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.gunshop.GunShopUI;
import dao.impl.LottoResultDaoImpl;
import model.LottoResult;
import model.Member;
import util.cal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gun1UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	String gun1= "X001";
	String amount="1";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gun1UI frame = new Gun1UI();
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
	public Gun1UI() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1194, 741);
		setLocationRelativeTo(null);
		JOptionPane.showMessageDialog(null, "恭喜獲得MP7焦地!");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("再抽一次");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LottoUI x= new LottoUI();
				x.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(740, 637, 255, 57);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("進入武器商店");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GunShopUI x=new GunShopUI();
				x.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(0, 0, 279, 57);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("離開");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(1032, 637, 138, 57);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1186, 710);
		contentPane.add(lblNewLabel);
		setScaledImage(lblNewLabel,"/image/pic24.png");
		
		Object o = cal.readFile("csgomember.txt");
		Member m= (Member) o;
		LottoResult l=new LottoResult
				(m.getMemberno(),
						m.getName(),
						gun1,
						amount
						);
		new LottoResultDaoImpl().add(l);
		
		
		
		
		
	}
	private void setScaledImage(JLabel label, String imagePath) {
		ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(scaledImage));
	}
}
