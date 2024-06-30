package controller.gunshop;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import controller.lotto.HistoryUI;
import controller.member.LoginSuccessUI;
import model.GunShop;
import model.Member;
import util.cal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.List;

public class GunShopUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private DefaultTableModel model;
    private JTextField textField;

    private String[] guns = {
        "Zeus-x27", "R8-Revolver", "P250", "Five-SeveN", "Desert Eagle",
        "NOVA", "XM1014", "MP5-SD", "P90", "M249", "SCAR-20", "M4A1-S",
        "FAMAS", "AUG", "AWP"
    };

    private int[] prices = {
        800, 800, 500, 700, 900, 1200, 1600, 1500, 1350, 1950, 2400, 2250, 1850, 2600, 3200
    };

    private boolean[] gunClicked = new boolean[15]; // 用于跟踪每个gun是否已被点击

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GunShopUI frame = new GunShopUI();
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
    public GunShopUI() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setBounds(100, 100, 1393, 787);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField = new JTextField("總金額共 : 0$");
        textField.setForeground(new Color(255, 255, 255));
        textField.setFont(new Font("微軟正黑體", Font.BOLD, 25));
        textField.setEditable(false);
        textField.setOpaque(false);
        textField.setBorder(null);
        textField.setBounds(1150, 410, 220, 61);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("**每種裝備限購一個**");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 25));
        lblNewLabel_1.setBounds(10, 146, 307, 68);
        contentPane.add(lblNewLabel_1);

        JLabel gun1 = new JLabel("");
        gun1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateGunCount(0);
            }
        });
        gun1.setBounds(193, 293, 101, 68);
        contentPane.add(gun1);
        setScaledImage(gun1, "/image/gun1.png");

        JLabel gun2 = new JLabel("");
        gun2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateGunCount(1);
            }
        });
        gun2.setBounds(313, 210, 101, 68);
        contentPane.add(gun2);
        setScaledImage(gun2, "/image/gun2.png");

        JLabel gun3 = new JLabel("");
        gun3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateGunCount(2);
            }
        });
        gun3.setBounds(313, 293, 101, 68);
        contentPane.add(gun3);
        setScaledImage(gun3, "/image/gun3.png");

        JLabel gun4 = new JLabel("");
        gun4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateGunCount(3);
            }
        });
        gun4.setBounds(313, 371, 101, 68);
        contentPane.add(gun4);
        setScaledImage(gun4, "/image/gun4.png");

        JLabel gun5 = new JLabel("");
        gun5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateGunCount(4);
            }
        });
        gun5.setBounds(313, 449, 101, 68);
        contentPane.add(gun5);
        setScaledImage(gun5, "/image/gun5.png");

        JLabel gun6 = new JLabel("");
        gun6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateGunCount(5);
            }
        });
        gun6.setBounds(439, 128, 126, 68);
        contentPane.add(gun6);
        setScaledImage(gun6, "/image/gun6.png");

        JLabel gun7 = new JLabel("");
        gun7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateGunCount(6);
            }
        });
        gun7.setBounds(439, 210, 126, 68);
        contentPane.add(gun7);
        setScaledImage(gun7, "/image/gun7.png");

        JLabel gun8 = new JLabel("");
        gun8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateGunCount(7);
            }
        });
        gun8.setBounds(439, 293, 126, 68);
        contentPane.add(gun8);
        setScaledImage(gun8, "/image/gun8.png");

        JLabel gun9 = new JLabel("");
        gun9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateGunCount(8);
            }
        });
        gun9.setBounds(439, 371, 126, 68);
        contentPane.add(gun9);
        setScaledImage(gun9, "/image/gun9.png");

        JLabel gun10 = new JLabel("");
        gun10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateGunCount(9);
            }
        });
        gun10.setBounds(439, 449, 126, 68);
        contentPane.add(gun10);
        setScaledImage(gun10, "/image/gun10.png");

        JLabel gun11 = new JLabel("");
        gun11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateGunCount(10);
            }
        });
        gun11.setBounds(591, 128, 137, 68);
        contentPane.add(gun11);
        setScaledImage(gun11, "/image/gun11.png");

        JLabel gun12 = new JLabel("");
        gun12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateGunCount(11);
            }
        });
        gun12.setBounds(591, 210, 137, 68);
        contentPane.add(gun12);
        setScaledImage(gun12, "/image/gun12.png");

        JLabel gun13 = new JLabel("");
        gun13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateGunCount(12);
            }
        });
        gun13.setBounds(591, 293, 137, 68);
        contentPane.add(gun13);
        setScaledImage(gun13, "/image/gun13.png");

        JLabel gun14 = new JLabel("");
        gun14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateGunCount(13);
            }
        });
        gun14.setBounds(591, 371, 137, 68);
        contentPane.add(gun14);
        setScaledImage(gun14, "/image/gun14.png");

        JLabel gun15 = new JLabel("");
        gun15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateGunCount(14);
            }
        });
        gun15.setBounds(591, 449, 137, 68);
        contentPane.add(gun15);
        setScaledImage(gun15, "/image/gun15.png");

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 538, 1360, 200);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(scrollPane);

        JTable output = new JTable();
        output.setForeground(new Color(255, 255, 255));
        output.setFont(new Font("微軟正黑體", Font.BOLD, 20));
        output.setRowHeight(output.getRowHeight() + 50); // 增加每一行的高度
        scrollPane.setViewportView(output);
        output.setOpaque(false);
        output.setBackground(new Color(0, 0, 0, 0));
        output.setBorder(null);

        String[] columnNames = {"裝備名稱", "數量", "金額"};
        model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (int i = 0; i < guns.length; i++) {
            model.addRow(new Object[]{guns[i], 0, prices[i]});
        }
        output.setModel(model);

        // 设置表头字体
        JTableHeader header = output.getTableHeader();
        header.setFont(new Font("微軟正黑體", Font.BOLD, 20));

        // 设置列的字体和宽度
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        for (int i = 0; i < output.getColumnCount(); i++) {
            TableColumn column = output.getColumnModel().getColumn(i);
            column.setPreferredWidth(column.getPreferredWidth() + 20); // 增加列的宽度
            column.setCellRenderer(renderer);
        }

        JLabel show = new JLabel("");
        show.setForeground(new Color(255, 255, 255));
        show.setFont(new Font("微軟正黑體", Font.BOLD, 40));
        show.setBounds(330, 5, 799, 61);
        contentPane.add(show);

        JButton btnNewButton_1_2_1 = new JButton("抽槍紀錄");
        btnNewButton_1_2_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                HistoryUI h = new HistoryUI();
                h.setVisible(true);
            }
        });
        Object o = cal.readFile("csgomember.txt");
        Member m = (Member) o;
        show.setText(m.getName() + ",請開始選擇您要購買的裝備");
        btnNewButton_1_2_1.setForeground(Color.WHITE);
        btnNewButton_1_2_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        btnNewButton_1_2_1.setBackground(Color.BLACK);
        btnNewButton_1_2_1.setBounds(10, 10, 203, 57);
        contentPane.add(btnNewButton_1_2_1);
        
        JButton btnNewButton = new JButton("重新選購");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                resetTable();
            }
        });
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setBounds(10, 471, 168, 57);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("離開遊戲");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		dispose();
        	}
        });
        btnNewButton_1.setForeground(Color.WHITE);
        btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        btnNewButton_1.setBackground(Color.BLACK);
        btnNewButton_1.setBounds(1201, 72, 168, 57);
        contentPane.add(btnNewButton_1);
        
        JButton btnNewButton_1_1 = new JButton("回操作頁");
        btnNewButton_1_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		LoginSuccessUI l=new LoginSuccessUI();
        		l.setVisible(true);
        		dispose();
        	}
        });
        btnNewButton_1_1.setForeground(Color.WHITE);
        btnNewButton_1_1.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        btnNewButton_1_1.setBackground(Color.BLACK);
        btnNewButton_1_1.setBounds(1201, 5, 168, 57);
        contentPane.add(btnNewButton_1_1);
        
        JButton btnNewButton_1_2 = new JButton("確認購買");
        btnNewButton_1_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		saveDataToFile();
        		CheckUI checkUI = new CheckUI();
        		checkUI.setVisible(true);
        		dispose();
        	}
        });
        btnNewButton_1_2.setForeground(Color.WHITE);
        btnNewButton_1_2.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        btnNewButton_1_2.setBackground(Color.BLACK);
        btnNewButton_1_2.setBounds(1189, 471, 168, 57);
        contentPane.add(btnNewButton_1_2);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 50));
        lblNewLabel.setBounds(0, 0, 1379, 752);
        setScaledImage(lblNewLabel, "/image/shop.png");
        contentPane.add(lblNewLabel);
    }

    private void setScaledImage(JLabel label, String imagePath) {
        ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(scaledImage));
    }

    private void updateGunCount(int index) {
        if (!gunClicked[index] ) {
            int count = (int) model.getValueAt(index, 1);
            model.setValueAt(count + 1, index, 1);
            gunClicked[index] = true; // 标记为已点击
        }
        updateTotalCost();
    }

    private void updateTotalCost() {
        int totalCost = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            int quantity = (int) model.getValueAt(i, 1);
            int price = (int) model.getValueAt(i, 2);
            totalCost += quantity * price;
        }
        textField.setText("總金額共 : " + totalCost + "$");
    }

    private void resetTable() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.setValueAt(0, i, 1);
        }
        for (int i = 0; i < gunClicked.length; i++) {
            gunClicked[i] = false; // reset clicked Statement
        }
        updateTotalCost();
    }

    private void saveDataToFile() {
        List<GunShop> gunShopList = new ArrayList<>();
        Member m = (Member) cal.readFile("csgomember.txt");
        for (int i = 0; i < model.getRowCount(); i++) {
            String equipmentName = (String) model.getValueAt(i, 0);
            int quantity = (int) model.getValueAt(i, 1);
            int price = (int) model.getValueAt(i, 2);

            if (quantity > 0) { // Only save rows where quantity is greater than 0
                GunShop g = new GunShop();
                g.setMemberNo(m.getMemberno());
                g.setName(m.getName());
                g.setEquipmentName(equipmentName);
                g.setQuantity(quantity);
                g.setPrice(price);
                gunShopList.add(g);
            }
        }
        cal.saveFile("gunshop.txt", gunShopList);
        JOptionPane.showMessageDialog(null, "已儲存至購物車！");
       
    }
}
