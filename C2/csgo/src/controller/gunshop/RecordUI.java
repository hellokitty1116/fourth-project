package controller.gunshop;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import dao.impl.GunShopDaoImpl;
import model.GunShop;
import model.Member;
import util.cal;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RecordUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable output;
	private JLabel words;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecordUI frame = new RecordUI();
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
	public RecordUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1325, 705);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 72, 1226, 551);
		scrollPane.setBackground(new Color(0,0,0,0));
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false);
		contentPane.add(scrollPane);
		
		output = new JTable();
		output.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		output.setForeground(new Color(255, 255, 255));
		output.setOpaque(false);
		output.setBorder(null);
		output.setBackground(new Color(0,0,0,0));
		output.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // 禁止自动调整列宽
		scrollPane.setViewportView(output);
		
		// 设置JTableHeader的字体和大小
        JTableHeader header = output.getTableHeader();
        header.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        header.setForeground(new Color(255, 255, 255));
        header.setBackground(new Color(0, 0, 0));
        Object o = cal.readFile("csgomember.txt");
		Member m= (Member) o;
        List<GunShop> l=new GunShopDaoImpl().selectByMemberno(m.getMemberno());
        String[] columnNames = {"會員編號", "玩家", "裝備名稱", "數量","價格", "購買時間"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // 设置所有单元格不可编辑
            }
        };
        for (GunShop g : l)
        {
        	Object[] row = {
        			g.getMemberNo(),
        			g.getName(),
        			g.getEquipmentName(),
        			g.getQuantity(),
        			g.getPrice(),
        			g.getDatetime()
        	};
        	model.addRow(row);
        };
        output.setModel(model);
        output.setPreferredScrollableViewportSize(new java.awt.Dimension(1500, 800));
        
        TableColumn column;
        for (int i = 0; i < output.getColumnCount(); i++) {
            column = output.getColumnModel().getColumn(i);
            if (i == output.getColumnCount() - 1) {
                column.setPreferredWidth(450); // 设置最后一列的宽度
            } else if (i == 2) { // 第三列是”裝備名稱”列，从0开始计数
                column.setPreferredWidth(250); // 设置“裝備名稱”列的宽度
            } else {
                column.setPreferredWidth(150); // 其他列的宽度
            }
            
        }
		
        output.setRowHeight(40);

    	words = new JLabel("**裝備購買紀錄**");
		words.setForeground(Color.WHITE);
		words.setFont(new Font("微軟正黑體", Font.BOLD, 40));
		words.setBounds(484, 0, 342, 75);
		contentPane.add(words);
		
		btnNewButton_1 = new JButton("關閉");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("微軟正黑體", Font.BOLD, 35));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(10, 5, 157, 57);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1311, 675);
		contentPane.add(lblNewLabel);
		setScaledImage(lblNewLabel, "/image/pic16.jpg");
		

		
	
		
		
	}
	private void setScaledImage(JLabel label, String imagePath) {
		ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(scaledImage));
	}
}
