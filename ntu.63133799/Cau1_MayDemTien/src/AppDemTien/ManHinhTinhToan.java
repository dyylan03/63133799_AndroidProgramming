package AppDemTien;
import javax.swing.*;
import java.awt.*;

public class ManHinhTinhToan extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_500;
    private JTextField textField_200;
    private JTextField textField_100;
    private JTextField textField_50;
    private JTextField textField_20;
    private JTextField textField_10;
    private JTextField textField_5;
    private JTextField textField_2;
    private JTextField textField_1;

    public ManHinhTinhToan() {
    	setFont(new Font("Dialog", Font.PLAIN, 18));
    	setTitle("CHƯƠNG TRÌNH ĐẾM TIỀN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 559, 410);

        // Tạo một panel để chứa nội dung bên trong JSplitPane
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Tạo hai màn hình con
        JPanel manHinhTrai = new JPanel();
        JPanel manHinhPhai = new JPanel();

        // Thiết lập layout của mỗi panel con
        manHinhTrai.setBackground(new Color(255, 255, 255));
        manHinhPhai.setBackground(new Color(255, 255, 255));

        // Tạo JSplitPane để chia màn hình thành hai phần
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, manHinhTrai, manHinhPhai);
        manHinhPhai.setLayout(null);
        
        JLabel gia500 = new JLabel("Mệnh giá 500.000");
        gia500.setFont(new Font("Tahoma", Font.PLAIN, 13));
        gia500.setBounds(29, 24, 107, 14);
        manHinhPhai.add(gia500);
        
        JLabel gia200 = new JLabel("Mệnh giá 200.000");
        gia200.setFont(new Font("Tahoma", Font.PLAIN, 13));
        gia200.setBounds(29, 62, 107, 14);
        manHinhPhai.add(gia200);
        
        JLabel gia100 = new JLabel("Mệnh giá 100.000");
        gia100.setFont(new Font("Tahoma", Font.PLAIN, 13));
        gia100.setBounds(29, 101, 107, 14);
        manHinhPhai.add(gia100);
        
        JLabel gia50 = new JLabel("Mệnh giá 50.000");
        gia50.setFont(new Font("Tahoma", Font.PLAIN, 13));
        gia50.setBounds(29, 139, 107, 14);
        manHinhPhai.add(gia50);
        
        JLabel gia20 = new JLabel("Mệnh giá 20.000");
        gia20.setFont(new Font("Tahoma", Font.PLAIN, 13));
        gia20.setBounds(29, 179, 107, 14);
        manHinhPhai.add(gia20);
        
        JLabel gia10 = new JLabel("Mệnh giá 10.000");
        gia10.setFont(new Font("Tahoma", Font.PLAIN, 13));
        gia10.setBounds(29, 222, 107, 14);
        manHinhPhai.add(gia10);
        
        JLabel gia5 = new JLabel("Mệnh giá 5.000");
        gia5.setFont(new Font("Tahoma", Font.PLAIN, 13));
        gia5.setBounds(29, 263, 107, 14);
        manHinhPhai.add(gia5);
        
        JLabel gia2 = new JLabel("Mệnh giá 2.000");
        gia2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        gia2.setBounds(29, 306, 107, 14);
        manHinhPhai.add(gia2);
        
        JLabel gia1 = new JLabel("Mệnh giá 1.000");
        gia1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        gia1.setBounds(29, 344, 107, 14);
        manHinhPhai.add(gia1);
        
        textField_500 = new JTextField();
        textField_500.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField_500.setColumns(10);
        textField_500.setBounds(135, 22, 63, 20);
        manHinhPhai.add(textField_500);
        
        textField_200 = new JTextField();
        textField_200.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField_200.setColumns(10);
        textField_200.setBounds(135, 60, 63, 20);
        manHinhPhai.add(textField_200);
        
        textField_100 = new JTextField();
        textField_100.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField_100.setColumns(10);
        textField_100.setBounds(135, 99, 63, 20);
        manHinhPhai.add(textField_100);
        
        textField_50 = new JTextField();
        textField_50.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField_50.setColumns(10);
        textField_50.setBounds(135, 137, 63, 20);
        manHinhPhai.add(textField_50);
        
        textField_20 = new JTextField();
        textField_20.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField_20.setColumns(10);
        textField_20.setBounds(135, 177, 63, 20);
        manHinhPhai.add(textField_20);
        
        textField_10 = new JTextField();
        textField_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField_10.setColumns(10);
        textField_10.setBounds(135, 220, 63, 20);
        manHinhPhai.add(textField_10);
        
        textField_5 = new JTextField();
        textField_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField_5.setColumns(10);
        textField_5.setBounds(135, 261, 63, 20);
        manHinhPhai.add(textField_5);
        
        textField_2 = new JTextField();
        textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField_2.setColumns(10);
        textField_2.setBounds(135, 304, 63, 20);
        manHinhPhai.add(textField_2);
        
        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField_1.setColumns(10);
        textField_1.setBounds(135, 342, 63, 20);
        manHinhPhai.add(textField_1);
        manHinhTrai.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Nhập vào số tiền cần đếm");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel.setBounds(20, 108, 179, 14);
        manHinhTrai.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
        textField.setBounds(20, 135, 169, 20);
        manHinhTrai.add(textField);
        textField.setColumns(10);
        
        JLabel lblChn = new JLabel("Chú ý: đơn vị tiền tệ sẽ là VNĐ");
        lblChn.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblChn.setBounds(20, 185, 169, 14);
        manHinhTrai.add(lblChn);
        
        JButton btnNewButton = new JButton(" Bắt đầu đếm");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNewButton.setBounds(48, 230, 117, 23);
        manHinhTrai.add(btnNewButton);
        splitPane.setDividerLocation(200); // Thiết lập vị trí của đường chia

        // Đặt JSplitPane vào panel chính
        mainPanel.add(splitPane, BorderLayout.CENTER);

        // Đặt panel chính là nội dung của frame
        setContentPane(mainPanel);
    }
}
