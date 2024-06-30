package controller.lotto;

import java.awt.EventQueue;
import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import model.Member;
import model.views.LottoViews;
import service.Impl.LottoViewsServiceImpl;
import util.cal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HistoryUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable show;
	private JScrollPane scrollPane;
	private JButton btnNewButton_1_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HistoryUI frame = new HistoryUI();
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
	public HistoryUI() {
		JOptionPane.showMessageDialog(null, "抽獎獲得的槍枝,將在遊戲公測後挑選並發送至物品欄");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1281, 844);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel words = new JLabel("**抽槍紀錄**");
		words.setForeground(new Color(255, 255, 255));
		words.setFont(new Font("微軟正黑體", Font.BOLD, 50));
		words.setBounds(504, 24, 312, 87);
		contentPane.add(words);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(65, 141, 1157, 566);
		scrollPane.setOpaque(false);
		scrollPane.getViewport().setOpaque(false); 
		scrollPane.setBorder(null);
		contentPane.add(scrollPane);
		
		show = new JTable();
		show.setForeground(new Color(255, 255, 255));
		show.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		show.setOpaque(false);
		show.setBackground(new Color(0, 0, 0, 0));
		show.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // 禁止自动调整列宽
		
		scrollPane.setViewportView(show);
		
		// 设置JTableHeader的字体和大小
        JTableHeader header = show.getTableHeader();
        header.setFont(new Font("微軟正黑體", Font.BOLD, 30));
        header.setForeground(new Color(255, 255, 255));
        header.setBackground(new Color(0, 0, 0));
		
		Object o = cal.readFile("csgomember.txt");
		Member m= (Member) o;
		
		List<LottoViews> l=new LottoViewsServiceImpl().queryByMemberno(m.getMemberno());
		String[] columnNames = {"會員編號", "玩家", "槍枝名稱", "數量", "抽槍時間"};
		DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // 设置所有单元格不可编辑
            }
        };
		for (LottoViews lo : l)
		{
			Object[] row = {
					lo.getMemberno(),
					lo.getName(),
					lo.getGunname(),
					lo.getAmount(),
					lo.getDatetime()
					
				};
				model.addRow(row);
		}
		show.setModel(model);
		// 设置JTable的首选大小
        show.setPreferredScrollableViewportSize(new java.awt.Dimension(1500, 800));

        // 设置每列的首选宽度
        TableColumn column;
        for (int i = 0; i < show.getColumnCount(); i++) {
            column = show.getColumnModel().getColumn(i);
            if (i == show.getColumnCount() - 1) {
                column.setPreferredWidth(450); // 设置最后一列的宽度
            } else if (i == 2) { // 第四列是”槍枝名稱”列，从0开始计数
                column.setPreferredWidth(350); // 设置“槍枝名稱”列的宽度
            } else {
                column.setPreferredWidth(150); // 其他列的宽度
            }
            
        }
		
        show.setRowHeight(40);
		
    	btnNewButton_1_2 = new JButton("關閉");
    	btnNewButton_1_2.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			dispose();
    		}
    	});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("微軟正黑體", Font.BOLD, 35));
		btnNewButton_1_2.setBackground(Color.BLACK);
		btnNewButton_1_2.setBounds(10, 10, 157, 57);
		contentPane.add(btnNewButton_1_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1272, 813);
		setScaledImage(lblNewLabel,"/image/pic12.jpg");
		contentPane.add(lblNewLabel);
		
	
		
		
		
		
	}
	private void setScaledImage(JLabel label, String imagePath) {
		ImageIcon icon = new ImageIcon(this.getClass().getResource(imagePath));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(scaledImage));
	}
}
