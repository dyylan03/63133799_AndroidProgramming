package AppDemTien;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	 private static final long serialVersionUID = 1L;
//	    private JPanel contentPane;
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
	        MenhGia500.setEnabled(false);
	        MenhGia500.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia500.setColumns(10);
	        MenhGia500.setBounds(135, 22, 63, 20);
	        manHinhPhai.add(MenhGia500);
	        
	        MenhGia200 = new JTextField();
	        MenhGia200.setEnabled(false);
	        MenhGia200.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia200.setColumns(10);
	        MenhGia200.setBounds(135, 60, 63, 20);
	        manHinhPhai.add(MenhGia200);
	        
	        MenhGia100 = new JTextField();
	        MenhGia100.setEnabled(false);
	        MenhGia100.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia100.setColumns(10);
	        MenhGia100.setBounds(135, 99, 63, 20);
	        manHinhPhai.add(MenhGia100);
	        
	        MenhGia50 = new JTextField();
	        MenhGia50.setEnabled(false);
	        MenhGia50.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia50.setColumns(10);
	        MenhGia50.setBounds(135, 137, 63, 20);
	        manHinhPhai.add(MenhGia50);
	        
	        MenhGia20 = new JTextField();
	        MenhGia20.setEnabled(false);
	        MenhGia20.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia20.setColumns(10);
	        MenhGia20.setBounds(135, 177, 63, 20);
	        manHinhPhai.add(MenhGia20);
	        
	        MenhGia10 = new JTextField();
	        MenhGia10.setEnabled(false);
	        MenhGia10.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia10.setColumns(10);
	        MenhGia10.setBounds(135, 220, 63, 20);
	        manHinhPhai.add(MenhGia10);
	        
	        MenhGia5 = new JTextField();
	        MenhGia5.setEnabled(false);
	        MenhGia5.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia5.setColumns(10);
	        MenhGia5.setBounds(135, 261, 63, 20);
	        manHinhPhai.add(MenhGia5);
	        
	        MenhGia2 = new JTextField();
	        MenhGia2.setEnabled(false);
	        MenhGia2.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia2.setColumns(10);
	        MenhGia2.setBounds(135, 304, 63, 20);
	        manHinhPhai.add(MenhGia2);
	        
	        MenhGia1 = new JTextField();
	        MenhGia1.setEnabled(false);
	        MenhGia1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        MenhGia1.setColumns(10);
	        MenhGia1.setBounds(135, 342, 63, 20);
	        manHinhPhai.add(MenhGia1);
	        
	        JLabel lblNewLabel_1 = new JLabel("tờ");
	        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        lblNewLabel_1.setBounds(208, 24, 46, 14);
	        manHinhPhai.add(lblNewLabel_1);
	        
	        JLabel lblNewLabel_1_1 = new JLabel("tờ");
	        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        lblNewLabel_1_1.setBounds(208, 63, 46, 14);
	        manHinhPhai.add(lblNewLabel_1_1);
	        
	        JLabel lblNewLabel_1_2 = new JLabel("tờ");
	        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        lblNewLabel_1_2.setBounds(208, 102, 46, 14);
	        manHinhPhai.add(lblNewLabel_1_2);
	        
	        JLabel lblNewLabel_1_3 = new JLabel("tờ");
	        lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        lblNewLabel_1_3.setBounds(208, 140, 46, 14);
	        manHinhPhai.add(lblNewLabel_1_3);
	        
	        JLabel lblNewLabel_1_4 = new JLabel("tờ");
	        lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        lblNewLabel_1_4.setBounds(208, 180, 46, 14);
	        manHinhPhai.add(lblNewLabel_1_4);
	        
	        JLabel lblNewLabel_1_5 = new JLabel("tờ");
	        lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        lblNewLabel_1_5.setBounds(208, 223, 46, 14);
	        manHinhPhai.add(lblNewLabel_1_5);
	        
	        JLabel lblNewLabel_1_6 = new JLabel("tờ");
	        lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        lblNewLabel_1_6.setBounds(208, 264, 46, 14);
	        manHinhPhai.add(lblNewLabel_1_6);
	        
	        JLabel lblNewLabel_1_7 = new JLabel("tờ");
	        lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        lblNewLabel_1_7.setBounds(208, 307, 46, 14);
	        manHinhPhai.add(lblNewLabel_1_7);
	        
	        JLabel lblNewLabel_1_8 = new JLabel("tờ");
	        lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
	        lblNewLabel_1_8.setBounds(208, 345, 46, 14);
	        manHinhPhai.add(lblNewLabel_1_8);
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
	        btnDem.setBounds(20, 230, 169, 23);
	        manHinhTrai.add(btnDem);
	        
	        JButton btnRefesh = new JButton("Làm mới");
	        btnRefesh.setFont(new Font("Tahoma", Font.BOLD, 13));
	        btnRefesh.setBounds(20, 288, 169, 23);
	        manHinhTrai.add(btnRefesh);
	        splitPane.setDividerLocation(200); // Thiết lập vị trí của đường chia

	        // Đặt JSplitPane vào panel chính
	        mainPanel.add(splitPane, BorderLayout.CENTER);

	        // Đặt panel chính là nội dung của frame
	        setContentPane(mainPanel);
	        btnDem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String inputString = inputTien.getText();

	                if (!inputString.isEmpty() && inputString.matches("\\d+")) {
	                	

	                    if (inputString.length() >= 10) {
	                    	
	                        JOptionPane.showMessageDialog(ManHinhTinhToan.this, "Số tiền nhập vào vượt quá giới hạn!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	                        return;
	                    }
	                    int amount = Integer.parseInt(inputString);

	                    int count500 = amount / 500000;
	                    int count200 = (amount % 500000) / 200000;
	                    int count100 = ((amount % 500000) % 200000) / 100000;
	                    int count50 = (((amount % 500000) % 200000) % 100000) / 50000;
	                    int count20 = ((((amount % 500000) % 200000) % 100000) % 50000) / 20000;
	                    int count10 = (((((amount % 500000) % 200000) % 100000) % 50000) % 20000) / 10000;
	                    int count5 = ((((((amount % 500000) % 200000) % 100000) % 50000) % 20000) % 10000) / 5000;
	                    int count2 = (((((((amount % 500000) % 200000) % 100000) % 50000) % 20000) % 10000) % 5000) / 2000;
	                    int count1 = ((((((((amount % 500000) % 200000) % 100000) % 50000) % 20000) % 10000) % 5000) % 2000) / 1000;

	                    MenhGia500.setText(Integer.toString(count500));
	                    MenhGia200.setText(Integer.toString(count200));
	                    MenhGia100.setText(Integer.toString(count100));
	                    MenhGia50.setText(Integer.toString(count50));
	                    MenhGia20.setText(Integer.toString(count20));
	                    MenhGia10.setText(Integer.toString(count10));
	                    MenhGia5.setText(Integer.toString(count5));
	                    MenhGia2.setText(Integer.toString(count2));
	                    MenhGia1.setText(Integer.toString(count1));
	                } else {
	                    JOptionPane.showMessageDialog(ManHinhTinhToan.this, "Số tiền nhập không hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });

	     // Thêm sự kiện cho nút "Làm mới"
	        btnRefesh.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Xóa nội dung của các text field
	                inputTien.setText("");
	                MenhGia500.setText("");
	                MenhGia200.setText("");
	                MenhGia100.setText("");
	                MenhGia50.setText("");
	                MenhGia20.setText("");
	                MenhGia10.setText("");
	                MenhGia5.setText("");
	                MenhGia2.setText("");
	                MenhGia1.setText("");
	            }
	        });


	    }
}
