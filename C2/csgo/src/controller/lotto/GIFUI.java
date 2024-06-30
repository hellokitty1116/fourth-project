package controller.lotto;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GIFUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	  private LottoUI lottoUI;
	  private boolean openRandomCalled = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LottoUI lottoUI = new LottoUI();
                    GIFUI frame = new GIFUI(lottoUI);
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
	public GIFUI(LottoUI lottoUI) {
		this.lottoUI = lottoUI;
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 938, 581);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("點擊跳過動畫");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	if (!openRandomCalled && !lottoUI.isOpenRandomCalled()) {
                    openRandomCalled = true;
                    lottoUI.setOpenRandomCalled(true);
                    dispose();
                    lottoUI.openRandomGunUI();
                }
            }
        });
        btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        btnNewButton.setOpaque(false);
        btnNewButton.setBorder(null);
        btnNewButton.setBackground(new Color(0, 0, 0, 0));
        btnNewButton.setBounds(664, 436, 232, 74);
        contentPane.add(btnNewButton);
        
     // 定時器，每500毫秒切換一次按鈕文本顏色
        Timer colorTimer = new Timer(500, new ActionListener() {
            private boolean visible = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                visible = !visible;
                btnNewButton.setForeground(visible ? Color.BLACK : Color.WHITE);
            }
        });
        colorTimer.start();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GIFUI.class.getResource("/image/抽獎動畫.gif")));
		lblNewLabel.setBounds(0, 0, 960, 569);
		contentPane.add(lblNewLabel);
	}	
		
}
