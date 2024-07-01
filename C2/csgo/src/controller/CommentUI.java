package controller;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.impl.CommentDaoImpl;
import model.Comment;
import model.Member;
import util.cal;
import javax.swing.SwingConstants;

public class CommentUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea displayArea;
    private JTextField inputField;
    private CommentDaoImpl commentDao;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CommentUI frame = new CommentUI();
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
    public CommentUI() {
        commentDao = new CommentDaoImpl();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1062, 798);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(245, 222, 212));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel showpanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(new Color(255, 255, 255, 128)); // 設置白色半透明
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        showpanel.setBounds(41, 10, 970, 94);
        showpanel.setOpaque(false);
        showpanel.setLayout(null);
        contentPane.add(showpanel);
        
        JLabel lblNewLabel_1 = new JLabel("CSGO 遊戲評論區");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        lblNewLabel_1.setBounds(227, 24, 501, 48);
        showpanel.add(lblNewLabel_1);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(21, 168, 1000, 500);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        contentPane.add(scrollPane);

        displayArea = new JTextArea() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(new Color(255, 255, 255, 80)); // 設置白色半透明
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        displayArea.setForeground(new Color(0, 0, 0));
        displayArea.setFont(new Font("微軟正黑體", Font.BOLD, 20));
        displayArea.setEditable(false);
        displayArea.setOpaque(false);
        scrollPane.setViewportView(displayArea);

        inputField = new JTextField();
        inputField.setBounds(21, 686, 800, 43);
        contentPane.add(inputField);

        JButton sendButton = new JButton("送出評論");
        sendButton.setFont(new Font("微軟正黑體", Font.BOLD, 17));
        sendButton.setBounds(850, 699, 150, 30);
        contentPane.add(sendButton);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(752, 57, 286, 139);
        contentPane.add(lblNewLabel);
        setScaledImage(lblNewLabel, "/image/comment1.png"); 

        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sendComment();
            }
        });

        loadComments();
    }

    private void sendComment() {
        String commentText = inputField.getText();
        if (commentText.isEmpty()) {
            return; // 空評論不處理
        }

        Member m = (Member) cal.readFile("csgomember.txt");
        Comment comment = new Comment();
        comment.setMemberno(m.getMemberno());
        comment.setName(m.getName());
        comment.setComment(commentText);
        commentDao.add(comment);

        inputField.setText(""); // 清空輸入框
        loadComments(); // 重新加載評論
    }

    private void loadComments() {
        List<Comment> comments = commentDao.getAllComments();
        displayArea.setText(""); // 清空顯示區域
        for (Comment c : comments) {
            displayArea.append("會員編號: " + c.getMemberno() + "    暱稱: " + c.getName() + "\n\n");
            displayArea.append(c.getComment() + "\n\n");
            displayArea.append("留言日期 : " + c.getTime() + "\n");
            displayArea.append("---------------------------------------------------------\n");
        }
    }

    private void setScaledImage(JLabel label, String imagePath) {
		ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(scaledImage));
	}
}
