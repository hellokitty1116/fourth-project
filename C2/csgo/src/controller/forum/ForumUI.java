package controller.forum;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import controller.member.LoginSuccessUI;
import model.Member;
import util.cal;

public class ForumUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPanel outputpanel;  // 将 outputpanel 定义为类的字段
    private JTextArea textArea_1; // 定义textArea_1为类的字段
    private Timer charTimer; // 用于逐字播放文本的定时器
    private int sentenceIndex = 0;
    private int charIndex = 0;
    private boolean buttonsEnabled = false; // 控制按钮启用状态的标志
    private String[] sentences = {
            "歡迎來到CSGO的遊戲論壇,我是您的說明員-崔智云"
            + "\n(請點選此處並按下Enter顯示下一句對話)",
            "本論壇分為四個區塊 : "
            +"\n維護公告,分析報告,遊戲故事介紹,角色陣營介紹",
            "若您想觀看本遊戲的故事背景,請點選遊戲故事介紹"
            + "\n若您想了解本遊戲的各個角色人物,請點選角色陣營介紹",
            "分析報告內容主要為本遊戲中關於玩家、物品的比例分析"+
            "\n維護公告將會在每週四例行維護時間前,下午15:00更新",
            "好的!說明到此結束!接下來請您慢慢探索論壇吧!"
        };

    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    private JButton btnNewButton_3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ForumUI frame = new ForumUI();
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
    public ForumUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1322, 892);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        outputpanel = new JPanel();  // 正确初始化类字段 outputpanel
        outputpanel.setBounds(306, 139, 970, 693);
        outputpanel.setOpaque(false);
        contentPane.add(outputpanel);
        outputpanel.setLayout(null);  // 确保 layout manager 与原始代码一致
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setBounds(0, 159, 252, 534);
        outputpanel.add(lblNewLabel_4);
        setScaledImage(lblNewLabel_4, "/image/girl3.png");
        
        JLabel lblNewLabel_5 = new JLabel("崔智云");
        lblNewLabel_5.setForeground(new Color(255, 255, 255));
        lblNewLabel_5.setFont(new Font("微軟正黑體", Font.BOLD, 25));
        lblNewLabel_5.setBounds(201, 389, 84, 27);
        outputpanel.add(lblNewLabel_5);
        
        textArea_1 = new JTextArea();
        textArea_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        textArea_1.setBounds(152, 428, 774, 94);
        textArea_1.setOpaque(false);
        textArea_1.setEditable(false); // 设置为不可编辑
        outputpanel.add(textArea_1);

        textArea_1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (!buttonsEnabled) {
                        showNextSentence();
                    }
                }
            }
        });
        
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setBounds(80, 358, 890, 211);
        outputpanel.add(lblNewLabel_3);
        setScaledImage(lblNewLabel_3, "/image/dialog2.png");
        
        JTextArea textArea = new JTextArea(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(new Color(255, 255, 255, 128)); // 設置白色半透明
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        textArea.setBounds(0, 0, 970, 693);
        textArea.setOpaque(false);
        outputpanel.add(textArea);

        JPanel buttonpanel = new JPanel();
        buttonpanel.setBounds(10, 0, 275, 855);
        buttonpanel.setBackground(new Color(0, 0, 0, 0));
        buttonpanel.setOpaque(false);
        contentPane.add(buttonpanel);
        buttonpanel.setLayout(null);

        btnNewButton_1 = new JButton("分析報告");
        btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 38));
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setBackground(Color.BLACK);
        btnNewButton_1.setBounds(0, 578, 265, 69);
        btnNewButton_1.setEnabled(false);
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (buttonsEnabled) {
                    switchPanel(new Tablet1UI().panel);
                }
            }
        });
        buttonpanel.add(btnNewButton_1);

        btnNewButton_2 = new JButton("遊戲故事背景");
        btnNewButton_2.setFont(new Font("微軟正黑體", Font.BOLD, 38));
        btnNewButton_2.setForeground(Color.WHITE);
        btnNewButton_2.setBackground(Color.BLACK);
        btnNewButton_2.setBounds(0, 674, 265, 69);
        btnNewButton_2.setEnabled(false);
        btnNewButton_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (buttonsEnabled) {
                    switchPanel(new Tablet2UI().panel);
                }
            }
        });
        buttonpanel.add(btnNewButton_2);

        btnNewButton_3 = new JButton("角色陣營介紹");
        btnNewButton_3.setFont(new Font("微軟正黑體", Font.BOLD, 38));
        btnNewButton_3.setForeground(Color.WHITE);
        btnNewButton_3.setBackground(Color.BLACK);
        btnNewButton_3.setBounds(0, 765, 265, 69);
        btnNewButton_3.setEnabled(false);
        btnNewButton_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (buttonsEnabled) {
                    switchPanel(new Tablet3UI().panel);
                }
            }
        });
        buttonpanel.add(btnNewButton_3);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(ForumUI.class.getResource("/image/forum1.gif")));
        lblNewLabel_2.setBounds(10, 10, 255, 216);
        buttonpanel.add(lblNewLabel_2);
        
        Member m = (Member) cal.readFile("csgomember.txt");
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 236, 265, 230);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        buttonpanel.add(scrollPane);
        
        JTextArea info = new JTextArea();
        scrollPane.setViewportView(info);
        info.setForeground(new Color(255, 255, 255));
        info.setEditable(false);
        info.setFont(new Font("微軟正黑體", Font.BOLD, 20));
        info.setOpaque(false);
      
        String playerinfo = "               玩家資訊"
                + "\n帳號 : " + m.getAccount()
                + "\n暱稱 : " + m.getName()
                + "\n稱號 : " + "尚未開放"
                + "\n性別 : " + m.getSex()
                + "\n信箱 : " + m.getEmail()
                + "\n註冊時間 : " + "\n" + m.getDatetime();
        
        info.setText(playerinfo);
        info.setCaretPosition(0);
        
                btnNewButton = new JButton("維護公告");
                btnNewButton.setBounds(0, 487, 265, 69);
                buttonpanel.add(btnNewButton);
                btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 38));
                btnNewButton.setForeground(Color.WHITE);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setEnabled(false);
                btnNewButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (buttonsEnabled) {
                            switchPanel(new Tablet4UI().panel);
                        }
                    }
                });

        JPanel showpanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(new Color(255, 255, 255, 128)); // 設置白色半透明
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        showpanel.setBounds(306, 21, 970, 94);
        showpanel.setOpaque(false);
        showpanel.setLayout(null);
        contentPane.add(showpanel);
        
        JLabel lblNewLabel_1 = new JLabel("CSGO 官方遊戲論壇");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        lblNewLabel_1.setBounds(233, 24, 501, 48);
        showpanel.add(lblNewLabel_1);
        
        JButton btnNewButton_4 = new JButton("返回選單");
        btnNewButton_4.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		LoginSuccessUI y=new LoginSuccessUI();
        		y.setVisible(true);
        		dispose();
        	}
        });
        btnNewButton_4.setForeground(new Color(0, 0, 0));
        btnNewButton_4.setFont(new Font("微軟正黑體", Font.BOLD, 20));
        btnNewButton_4.setEnabled(false);
        btnNewButton_4.setBackground(new Color(255, 255, 255));
        btnNewButton_4.setBounds(826, 0, 144, 34);
        showpanel.add(btnNewButton_4);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(0, 0, 1308, 855);
        contentPane.add(lblNewLabel);
        setScaledImage(lblNewLabel, "/image/cyberpunk2.jpg");
        
        // 自动播放第一句话
        showFirstSentence();
    }

    private void setScaledImage(JLabel label, String imagePath) {
        ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(scaledImage));
    }

    private void enableButtons() {
        buttonsEnabled = true;
        btnNewButton.setEnabled(true);
        btnNewButton_1.setEnabled(true);
        btnNewButton_2.setEnabled(true);
        btnNewButton_3.setEnabled(true);
    }

    private void showFirstSentence() {
        String sentence = sentences[sentenceIndex];
        charTimer = new Timer(50, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (charIndex < sentence.length()) {
                    textArea_1.append(String.valueOf(sentence.charAt(charIndex)));
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
            charTimer.stop(); // 停止当前计时器
        }

        if (sentenceIndex < sentences.length) {
            textArea_1.setText("");
            charIndex = 0;
            String sentence = sentences[sentenceIndex];
            charTimer = new Timer(50, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (charIndex < sentence.length()) {
                        textArea_1.append(String.valueOf(sentence.charAt(charIndex)));
                        charIndex++;
                    } else {
                        charTimer.stop();
                        sentenceIndex++;
                        if (sentenceIndex == sentences.length) {
                            enableButtons();
                        }
                    }
                }
            });
            charTimer.start();
        }
    }

    private void switchPanel(JPanel panel) {
        panel.setBounds(0, 0, outputpanel.getWidth(), outputpanel.getHeight());
        outputpanel.removeAll();
        outputpanel.add(panel);
        outputpanel.repaint();
        outputpanel.revalidate();
    }
}
