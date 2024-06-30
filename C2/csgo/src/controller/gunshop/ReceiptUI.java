package controller.gunshop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.forum.ForumUI;
import model.Member;
import util.cal;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class ReceiptUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ReceiptUI frame = new ReceiptUI("", "");
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
    public ReceiptUI(String additionalText, String purchaseTime) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1231, 672);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 42, 1008, 547);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(null);
        contentPane.add(scrollPane);
        
        
        JTextArea output = new JTextArea();
        output.setEditable(false);
        scrollPane.setViewportView(output);
        output.setForeground(new Color(255, 255, 255));
        output.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        output.setOpaque(false);
        output.setBorder(null);
        output.setBackground(new Color(0,0,0,0));
        
        Member m = (Member) cal.readFile("csgomember.txt");
        output.setText("會員標號 : " + m.getMemberno() +
                "                   玩家 : " + m.getName() +
                "\n"+"\n信箱 : " + m.getEmail() +
                "        購買時間 : " + purchaseTime + 
                "\n---------------------------------------------------------------------"+
                "\n購買項目如下 : "+
                "\n\n");
        
        output.append(additionalText); // 追加 CheckUI 的內容
        
        JButton buy_2_1 = new JButton("離開遊戲");
        buy_2_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		dispose();
        	}
        });
        buy_2_1.setForeground(Color.WHITE);
        buy_2_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        buy_2_1.setBackground(Color.BLACK);
        buy_2_1.setBounds(1039, 486, 168, 57);
        contentPane.add(buy_2_1);
        
        
        JButton buy_2 = new JButton("列印明細");
        buy_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {

				output.setForeground(new Color(0, 0, 0));//打印時更改字體顏色
				output.setFont(new Font("微軟正黑體", Font.BOLD, 25));//打印時更改字體
				// 創建 PrinterJob
		        PrinterJob printerJob = PrinterJob.getPrinterJob();
		        // 設置 JTextArea 为 Printable
		        printerJob.setPrintable(output.getPrintable(null, null));
		        // 顯示打印對話框
		        if (printerJob.printDialog()) {
		            try {
		                // 打印 JTextArea 内容
		                printerJob.print();
		                JOptionPane.showMessageDialog(null, "遊戲維護中!將把您轉移至遊戲論壇");
		                ForumUI x= new ForumUI();
		                x.setVisible(true);
		                dispose();
		            } catch (PrinterException ex) {
		                ex.printStackTrace();
		            }}else {
			            // 取消打印時,用這個字體顏色
		            	output.setForeground(new Color(255, 255, 255));
		            	output.setFont(new Font("微軟正黑體", Font.BOLD, 25));
			        }

        	}
        });
        buy_2.setForeground(Color.WHITE);
        buy_2.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        buy_2.setBackground(Color.BLACK);
        buy_2.setBounds(1039, 568, 168, 57);
        contentPane.add(buy_2);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(0, 0, 1217, 641);
        contentPane.add(lblNewLabel);
        setScaledImage(lblNewLabel,"/image/pic10.jpg");
        
       
       
    }

    private void setScaledImage(JLabel label, String imagePath) {
        ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(scaledImage));
    }
}
