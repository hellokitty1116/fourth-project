package controller.forum;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.text.AttributedString;
import java.text.DecimalFormat;
import java.util.Map;
import dao.impl.GunShopDaoImpl;

public class Chart3UI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public ChartPanel chartPanel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Chart3UI frame = new Chart3UI();
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
    public Chart3UI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 925, 783);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null); // 使用绝对布局

        // 创建一个数据集
        DefaultPieDataset dataset = createDataset();
        // 创建一个饼图
        JFreeChart chart = createChart(dataset, "裝備購買比例圖");
        // 将图表显示在面板中
        chartPanel = new ChartPanel(chart);
        chartPanel.setBounds(32, 29, 721, 572); // 设置 chartPanel 尺寸
        contentPane.add(chartPanel);
    }

    private DefaultPieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        GunShopDaoImpl gunShopDao = new GunShopDaoImpl();
        Map<String, Integer> equipmentCounts = gunShopDao.getEquipmentCounts();

        for (Map.Entry<String, Integer> entry : equipmentCounts.entrySet()) {
            dataset.setValue(entry.getKey(), entry.getValue());
        }

        return dataset;
    }

    private JFreeChart createChart(DefaultPieDataset dataset, String title) {
        JFreeChart chart = ChartFactory.createPieChart(
                title,
                dataset,
                true, // 显示图例
                true, // 生成工具提示
                false // 生成URL链接
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("微軟正黑體", Font.BOLD, 12));
        plot.setNoDataMessage("沒有可用數據");
        plot.setCircular(true);

        // 设置自定义标签生成器
        plot.setLabelGenerator(new CustomPieSectionLabelGenerator());

        // 设置标题字体
        chart.getTitle().setFont(new Font("微軟正黑體", Font.BOLD, 30));

        // 设置图例字体
        chart.getLegend().setItemFont(new Font("微軟正黑體", Font.PLAIN, 12));

        return chart;
    }

    private static class CustomPieSectionLabelGenerator implements PieSectionLabelGenerator {
        private static final DecimalFormat COUNT_FORMAT = new DecimalFormat("0");
        private static final DecimalFormat PERCENT_FORMAT = new DecimalFormat("0%");

        @Override
        public String generateSectionLabel(PieDataset dataset, Comparable key) {
            Number value = dataset.getValue(key);
            double total = getTotal(dataset);
            double percent = value.doubleValue() / total;
            return String.format("%s : %d, 佔全體%s",
                    key,
                    value.intValue(),
                    PERCENT_FORMAT.format(percent));
        }

        @Override
        public AttributedString generateAttributedSectionLabel(PieDataset dataset, Comparable key) {
            return null; // 不需要实现
        }

        private double getTotal(PieDataset dataset) {
            double total = 0.0;
            for (int i = 0; i < dataset.getItemCount(); i++) {
                Number value = dataset.getValue(i);
                if (value != null) {
                    total += value.doubleValue();
                }
            }
            return total;
        }
    }
}
