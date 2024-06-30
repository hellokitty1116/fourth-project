package controller.lotto;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class LottoUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	 private boolean openRandomCalled = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LottoUI frame = new LottoUI();
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
	public LottoUI() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 1255, 722);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("**請點選開啟箱子**");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_3.setBounds(118, 167, 213, 60);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1_2 = new JButton("離開遊戲");
		btnNewButton_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("微軟正黑體", Font.BOLD, 17));
		btnNewButton_1_2.setBackground(Color.BLACK);
		btnNewButton_1_2.setBounds(896, 635, 109, 29);
		btnNewButton_1_2.setBorder(null);;
		contentPane.add(btnNewButton_1_2);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1241, 675);
		contentPane.add(lblNewLabel);
		setScaledImage(lblNewLabel, "/image/pic21.png");

	

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "開始抽槍!");
				GIFUI gifFrame = new GIFUI(LottoUI.this);
				gifFrame.setVisible(true);
				Timer timer = new Timer(7000, new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					    if (!openRandomCalled) {
                            openRandomCalled = true;
                            gifFrame.dispose(); // 關閉介面
                            openRandomGunUI(); // 執行下一個動作
                        }
                    }
                });
                timer.setRepeats(false); // 不讓它重複
                timer.start();
            }
		});

		lblNewLabel_1.setBounds(813, 635, 73, 29);
		contentPane.add(lblNewLabel_1);
		setScaledImage(lblNewLabel_1, "/image/pic22.png");

		JLabel pic1 = new JLabel("");
		pic1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");

			}
		});
		pic1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic26.png");
			}
		});
		pic1.setBounds(48, 423, 96, 68);
		contentPane.add(pic1);
		
		JLabel pic2 = new JLabel("");
		pic2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic25.png");
			}
		});
		pic2.setBounds(161, 417, 96, 74);
		contentPane.add(pic2);
		
		JLabel pic3 = new JLabel("");
		pic3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic36.png");
			}
		});
		pic3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic3.setBounds(270, 417, 96, 74);
		contentPane.add(pic3);
		
		JLabel pic4 = new JLabel("");
		pic4.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic24.png");
			}
		});
		pic4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic4.setBounds(384, 417, 96, 74);
		contentPane.add(pic4);
		
		JLabel pic5 = new JLabel("");
		pic5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic37.png");
			}
		});
		pic5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic5.setBounds(495, 417, 96, 74);
		contentPane.add(pic5);
		
		JLabel pic6 = new JLabel("");
		pic6.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic39.png");
			}
		});
		pic6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic6.setBounds(601, 417, 101, 74);
		contentPane.add(pic6);
		
		JLabel pic7 = new JLabel("");
		pic7.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic40.png");
			}
		});
		pic7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic7.setBounds(716, 417, 101, 74);
		contentPane.add(pic7);
		
		JLabel pic8 = new JLabel("");
		pic8.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic41.png");
			}
		});
		pic8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic8.setBounds(827, 417, 101, 74);
		contentPane.add(pic8);
		
		JLabel pic9 = new JLabel("");
		pic9.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic38.png");
			}
		});
		pic9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic9.setBounds(938, 417, 101, 74);
		contentPane.add(pic9);
		
		JLabel pic10 = new JLabel("");
		pic10.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic42.png");
			}
		});
		pic10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic10.setBounds(1049, 417, 101, 74);
		contentPane.add(pic10);
		
		JLabel pic11 = new JLabel("");
		pic11.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic35.png");
			}
		});
		pic11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic11.setBounds(43, 516, 101, 74);
		contentPane.add(pic11);
		
		JLabel pic12 = new JLabel("");
		pic12.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic34.png");
			}
		});
		pic12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic12.setBounds(154, 516, 101, 74);
		contentPane.add(pic12);
		
		JLabel pic13 = new JLabel("");
		pic13.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic43.png");
			}
		});
		pic13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic13.setBounds(265, 516, 101, 74);
		contentPane.add(pic13);
		
		JLabel pic14 = new JLabel("");
		pic14.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic33.png");
			}
		});
		pic14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
				
			}
		});
		pic14.setBounds(379, 516, 101, 74);
		contentPane.add(pic14);
		
		JLabel pic15 = new JLabel("");
		pic15.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic32.png");
			}
		});
		pic15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic15.setBounds(490, 516, 101, 74);
		contentPane.add(pic15);
		
		JLabel pic16 = new JLabel("");
		pic16.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic31.png");
			}
		});
		pic16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic16.setBounds(601, 516, 101, 74);
		contentPane.add(pic16);
		
		JLabel pic17 = new JLabel("");
		pic17.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic30.png");
			}
		});
		pic17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic17.setBounds(716, 516, 101, 74);
		contentPane.add(pic17);
		
		JLabel pic18 = new JLabel("");
		pic18.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic29.png");
			}
		});
		pic18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic18.setBounds(827, 516, 101, 74);
		contentPane.add(pic18);
		
		JLabel pic19 = new JLabel("");
		pic19.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic28.png");
			}
		});
		pic19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				setScaledImage(lblNewLabel, "/image/pic21.png");
			}
		});
		pic19.setBounds(938, 516, 101, 74);
		contentPane.add(pic19);
		
		

	}

	private void setScaledImage(JLabel label, String imagePath) {
		ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(scaledImage));
	}

	public void openRandomGunUI() {
		int randomNumber = (int) (Math.random() * 15); // 生成 0、1 或 2

		switch (randomNumber) {
		case 0:
			Gun1UI gun1 = new Gun1UI();
			gun1.setVisible(true);
			dispose(); // 关闭当前窗口
			break;
		case 1:
			Gun2UI gun2 = new Gun2UI();
			gun2.setVisible(true);
			dispose(); // 关闭当前窗口
			break;
		case 2:
			Gun3UI gun3 = new Gun3UI();
			gun3.setVisible(true);
			dispose(); // 关闭当前窗口
			break;
		case 3:
			Gun4UI gun4 = new Gun4UI();
			gun4.setVisible(true);
			dispose(); // 关闭当前窗口
			break;

		case 4:
			Gun5UI gun5 = new Gun5UI();
			gun5.setVisible(true);
			dispose(); // 关闭当前窗口
			break;
		case 5:
			Gun6UI gun6 = new Gun6UI();
			gun6.setVisible(true);
			dispose(); // 关闭当前窗口
			break;
		case 6:
			Gun7UI gun7 = new Gun7UI();
			gun7.setVisible(true);
			dispose(); // 关闭当前窗口
			break;
		case 7:
			Gun8UI gun8 = new Gun8UI();
			gun8.setVisible(true);
			dispose(); // 关闭当前窗口
			break;
		case 8:
			Gun9UI gun9 = new Gun9UI();
			gun9.setVisible(true);
			dispose(); // 关闭当前窗口
			break;
		case 9:
			Gun10UI gun10 = new Gun10UI();
			gun10.setVisible(true);
			dispose(); // 关闭当前窗口
			break;
		case 10:
			Gun11UI gun11 = new Gun11UI();
			gun11.setVisible(true);
			dispose(); // 关闭当前窗口
			break;
		case 11:
			Gun12UI gun12 = new Gun12UI();
			gun12.setVisible(true);
			dispose(); // 关闭当前窗口
			break;
		case 12:
			Gun13UI gun13 = new Gun13UI();
			gun13.setVisible(true);
			dispose(); // 关闭当前窗口
			break;
		case 13:
			Gun14UI gun14 = new Gun14UI();
			gun14.setVisible(true);
			dispose(); // 关闭当前窗口
			break;
		case 14:
			Gun15UI gun15 = new Gun15UI();
			gun15.setVisible(true);
			dispose(); // 关闭当前窗口
			break;
		default:
			break;
		}
	}
	public void setOpenRandomCalled(boolean openRandomCalled) {
        this.openRandomCalled = openRandomCalled;
    }

    public boolean isOpenRandomCalled() {
        return openRandomCalled;
    }
}
