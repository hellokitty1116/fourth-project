package controller;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.member.LoginSuccessUI;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuideUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea textArea; // 將 textArea 設置為類的成員變量
    private String[] sentences = {
        "歡迎來到CSGO的世界,我是您的遊戲說明員Alice"
        + "\n(按Enter顯示下一句對話)",
        "首先歡迎您來到本遊戲的封測階段!"
        +"\n封測階段會有免費抽槍活動,直到您抽到滿意的槍枝為止",
        "請注意!封測階段的槍枝皆為絕版槍枝!",
        "抽到的槍枝會在遊戲公測後讓您自行挑選其中之一"
        +"\n挑選後,會自動將該槍枝移動至您的物品欄",
        "抽槍活動和商店系統是分開的"
        + "\n若您有其他裝備的需求,可至商店處購買",
        "好的!說明到此結束!接下來請您慢慢探索遊戲世界吧!"
    };
    private int sentenceIndex = 0;
    private int charIndex = 0;
    private Timer charTimer;
    private boolean buttonsVisible = false; // 新增變數

    private JButton btnNewButton;
    private JButton btnNewButton_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GuideUI frame = new GuideUI();
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
    public GuideUI() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setBounds(100, 100, 1360, 783);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        btnNewButton = new JButton("進入遊戲世界");
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		LoginSuccessUI l=new LoginSuccessUI();
        		l.setVisible(true);
        		dispose();
        	}
        });
        btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 40));
        btnNewButton.setBounds(197, 543, 1022, 63);
        btnNewButton.setOpaque(false);
        btnNewButton.setBorder(null);
        btnNewButton.setBackground(new Color(0, 0, 0, 0));
        btnNewButton.setForeground(Color.WHITE); // 設置文字顏色為白色
        btnNewButton.setVisible(false); // 設置為不可見
        contentPane.add(btnNewButton);

        btnNewButton_1 = new JButton("離開遊戲");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		dispose();
        	}
        });
        btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 40));
        btnNewButton_1.setBounds(197, 616, 1022, 63);
        btnNewButton_1.setOpaque(false);
        btnNewButton_1.setBorder(null);
        btnNewButton_1.setBackground(new Color(0, 0, 0, 0));
        btnNewButton_1.setForeground(Color.WHITE); // 設置文字顏色為白色
        btnNewButton_1.setVisible(false); // 設置為不可見
        contentPane.add(btnNewButton_1);

        textArea = new JTextArea(); // 初始化 textArea
        textArea.setForeground(new Color(255, 255, 255));
        textArea.setFont(new Font("微軟正黑體", Font.BOLD, 40));
        textArea.setBounds(192, 539, 1027, 145);
        textArea.setOpaque(false);
        textArea.setEditable(false); // 設置為不可編輯
        contentPane.add(textArea);

        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (buttonsVisible) {
                        textArea.setText(""); // 清除對話內容
                        btnNewButton.setVisible(true); // 顯示按鈕
                        btnNewButton_1.setVisible(true); // 顯示按鈕
                    } else {
                        showNextSentence();
                    }
                }
            }
        });

        JLabel lblNewLabel_1 = new JLabel("Alice");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 35));
        lblNewLabel_1.setBounds(267, 482, 99, 44);
        lblNewLabel_1.setOpaque(false);
        lblNewLabel_1.setBorder(null);
        lblNewLabel_1.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(lblNewLabel_1);

        JLabel pic1 = new JLabel("");
        pic1.setBounds(-7, 189, 1343, 673);
        contentPane.add(pic1);
        setScaledImage(pic1, "/image/dialog.png");

        JLabel pic2 = new JLabel("");
        pic2.setBounds(10, 152, 330, 584);
        contentPane.add(pic2);
        setScaledImage(pic2, "/image/girl1.png");

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(0, 0, 1353, 748);
        contentPane.add(lblNewLabel);
        setScaledImage(lblNewLabel, "/image/pic11.jpg");

        textArea.requestFocusInWindow(); // 確保 textArea 獲得焦點

        // 自動顯示第一句話
        showFirstSentence();
    }

    private void setScaledImage(JLabel label, String imagePath) {
        ImageIcon icon = new ImageIcon(PreOrderGameUI.class.getResource(imagePath));
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(scaledImage));
    }

    private void showFirstSentence() {
        String sentence = sentences[sentenceIndex];
        charTimer = new Timer(60, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (charIndex < sentence.length()) {
                    textArea.append(String.valueOf(sentence.charAt(charIndex)));
                    charIndex++;
                } else {
                    charTimer.stop();
                    sentenceIndex++;
                }
            }
        });
        charTimer.start();
    }

    private void showNextSentence() {
        if (charTimer != null && charTimer.isRunning()) {
            charTimer.stop(); // 停止當前計時器
        }

        if (sentenceIndex < sentences.length) {
            textArea.setText("");
            charIndex = 0;
            String sentence = sentences[sentenceIndex];
            charTimer = new Timer(60, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (charIndex < sentence.length()) {
                        textArea.append(String.valueOf(sentence.charAt(charIndex)));
                        charIndex++;
                    } else {
                        charTimer.stop();
                        sentenceIndex++;
                        if (sentenceIndex == sentences.length) {
                            buttonsVisible = true;
                        }
                    }
                }
            });
            charTimer.start();
        }
    }
}
