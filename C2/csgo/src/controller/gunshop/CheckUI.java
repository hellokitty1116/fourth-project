package controller.gunshop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import dao.impl.GunShopDaoImpl;
import model.GunShop;
import model.Member;
import util.cal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class CheckUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CheckUI frame = new CheckUI();
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
    public CheckUI() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setBounds(100, 100, 1207, 737);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(42, 78, 766, 597);
        scrollPane.setOpaque(false);
        scrollPane.setBorder(null);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBackground(new Color(0,0,0,0));
        contentPane.add(scrollPane);

        JTextArea output = new JTextArea();
        scrollPane.setViewportView(output);
        output.setForeground(new Color(255, 255, 255));
        output.setFont(new Font("微軟正黑體", Font.BOLD, 25));
        output.setOpaque(false);
        output.setBackground(new Color(0, 0, 0, 0));
        

        // 讀取文件並顯示到 TextArea 中
        List<GunShop> gunShopList = (List<GunShop>) cal.readFile("gunshop.txt");
        StringBuilder sb = new StringBuilder();
        int totalCost = 0;
        for (GunShop g : gunShopList) {
            int cost = g.getQuantity() * g.getPrice();
            sb.append("裝備名稱: ").append(g.getEquipmentName())
              .append("，數量: ").append(g.getQuantity())
              .append("，金額: ").append(cost).append("$\n");
            totalCost += cost;
        }
        sb.append("\n總金額: ").append(totalCost).append("$");

        output.setText(sb.toString());

        JButton buy = new JButton("完成購買");
        buy.setForeground(Color.WHITE);
        buy.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        buy.setBackground(Color.BLACK);
        buy.setBounds(1015, 602, 168, 57);
        contentPane.add(buy);
        buy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                insertDataToDatabase(gunShopList);
                ZonedDateTime now = ZonedDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
                String purchaseTime = now.format(formatter);
                openReceiptUI(output.getText(), purchaseTime);
            }
        });
        
        JLabel show = new JLabel("New label");
        show.setForeground(new Color(255, 255, 255));
        show.setFont(new Font("微軟正黑體", Font.BOLD, 45));
        show.setBounds(31, 0, 1152, 68);
        contentPane.add(show);
        Object o = cal.readFile("csgomember.txt");
        Member m = (Member) o;
        show.setText("玩家" + m.getName() + "您好,請再次確認是否購買下列裝備");
        
        
        JButton buy_1 = new JButton("重新挑選");
        buy_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                GunShopUI x = new GunShopUI();
                x.setVisible(true);
                dispose();
            }
        });
        buy_1.setForeground(Color.WHITE);
        buy_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        buy_1.setBackground(Color.BLACK);
        buy_1.setBounds(837, 602, 168, 57);
        contentPane.add(buy_1);
        
        JButton buy_2 = new JButton("離開遊戲");
        buy_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });
        buy_2.setForeground(Color.WHITE);
        buy_2.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        buy_2.setBackground(Color.BLACK);
        buy_2.setBounds(1015, 530, 168, 57);
        contentPane.add(buy_2);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(0, 0, 1193, 706);
        contentPane.add(lblNewLabel);
        setScaledImage(lblNewLabel, "/image/pic15.jpg");
    }

    private void setScaledImage(JLabel label, String imagePath) {
        ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(scaledImage));
    }

    private void insertDataToDatabase(List<GunShop> gunShopList) {
        GunShopDaoImpl dao = new GunShopDaoImpl();
        for (GunShop g : gunShopList) {
            dao.add(g);
        }
        JOptionPane.showMessageDialog(null, "購買已完成！");
    }

    private void openReceiptUI(String additionalText, String purchaseTime) {
        ReceiptUI receiptUI = new ReceiptUI(additionalText, purchaseTime);
        receiptUI.setVisible(true);
        dispose();
    }
}
