package AppDemTien;
import javax.swing.*;
import java.awt.*;

public class ManHinhTinhToan extends JFrame {

	 private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JTextField inputTien;
	    private JTextField MenhGia500;
	    private JTextField MenhGia200;
	    private JTextField MenhGia100;
	    private JTextField MenhGia50;
	    private JTextField MenhGia20;
	    private JTextField MenhGia10;
	    private JTextField MenhGia5;
	    private JTextField MenhGia2;
	    private JTextField MenhGia1;

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
	        
	        MenhGia500 = new JTextField();
	        MenhGia500.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia500.setColumns(10);
	        MenhGia500.setBounds(135, 22, 63, 20);
	        manHinhPhai.add(MenhGia500);
	        
	        MenhGia200 = new JTextField();
	        MenhGia200.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia200.setColumns(10);
	        MenhGia200.setBounds(135, 60, 63, 20);
	        manHinhPhai.add(MenhGia200);
	        
	        MenhGia100 = new JTextField();
	        MenhGia100.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia100.setColumns(10);
	        MenhGia100.setBounds(135, 99, 63, 20);
	        manHinhPhai.add(MenhGia100);
	        
	        MenhGia50 = new JTextField();
	        MenhGia50.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia50.setColumns(10);
	        MenhGia50.setBounds(135, 137, 63, 20);
	        manHinhPhai.add(MenhGia50);
	        
	        MenhGia20 = new JTextField();
	        MenhGia20.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia20.setColumns(10);
	        MenhGia20.setBounds(135, 177, 63, 20);
	        manHinhPhai.add(MenhGia20);
	        
	        MenhGia10 = new JTextField();
	        MenhGia10.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia10.setColumns(10);
	        MenhGia10.setBounds(135, 220, 63, 20);
	        manHinhPhai.add(MenhGia10);
	        
	        MenhGia5 = new JTextField();
	        MenhGia5.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia5.setColumns(10);
	        MenhGia5.setBounds(135, 261, 63, 20);
	        manHinhPhai.add(MenhGia5);
	        
	        MenhGia2 = new JTextField();
	        MenhGia2.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia2.setColumns(10);
	        MenhGia2.setBounds(135, 304, 63, 20);
	        manHinhPhai.add(MenhGia2);
	        
	        MenhGia1 = new JTextField();
	        MenhGia1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia1.setColumns(10);
	        MenhGia1.setBounds(135, 342, 63, 20);
	        manHinhPhai.add(MenhGia1);
	        manHinhTrai.setLayout(null);
	        
	        JLabel lblNewLabel = new JLabel("Nhập vào số tiền cần đếm");
	        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
	        lblNewLabel.setBounds(20, 108, 179, 14);
	        manHinhTrai.add(lblNewLabel);
	        
	        inputTien = new JTextField();
	        inputTien.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        inputTien.setBounds(20, 135, 169, 20);
	        manHinhTrai.add(inputTien);
	        inputTien.setColumns(10);
	        
	        JLabel lblChn = new JLabel("Chú ý: đơn vị tiền tệ sẽ là VNĐ");
	        lblChn.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        lblChn.setBounds(20, 185, 169, 14);
	        manHinhTrai.add(lblChn);
	        
	        JButton btnDem = new JButton(" Bắt đầu đếm");
	        btnDem.setFont(new Font("Tahoma", Font.BOLD, 13));
	        btnDem.setBounds(48, 230, 117, 23);
	        manHinhTrai.add(btnDem);
	        splitPane.setDividerLocation(200); // Thiết lập vị trí của đường chia

	        // Đặt JSplitPane vào panel chính
	        mainPanel.add(splitPane, BorderLayout.CENTER);

	        // Đặt panel chính là nội dung của frame
	        setContentPane(mainPanel);
	    }
}
