package survive.appearence;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

class BottomContainer{

	
}

public class frame {
public static void main(String[] args) {

JFrame frm_deflault = new JFrame("Last Man Standing");



		//������ �Ϲ� ����
		frm_deflault.setSize(1216, 839); // ������ ũ�� ���� (���� �ȼ�)
		frm_deflault.setLocationRelativeTo(null); // �������� ȭ�� ����� ��ġ
		frm_deflault.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
        frm_deflault.setVisible(true); // �������� ���̵��� ����
        // System.out.println(frm_deflault.getContentPane().getSize()); // ������ ���� ũ�⸦ �ܼ� â�� �����
        FlowLayout fLay_bottom = new FlowLayout(); // ���̾ƿ� ����
        FlowLayout fLay_main = new FlowLayout();
        frm_deflault.getContentPane().setLayout(fLay_main); //���̾ƿ� ���� (�ȿ� fLay) ������ ���� ��
        frm_deflault.getContentPane().setLayout(fLay_bottom);
        frm_deflault.setResizable(false); // âũ�� ���� (false) => ���� �Ұ���
       
        // ��ư ��ü ���� -  JButton Ÿ���� ��ü ���� + "��ư�̸�"
        JButton btnLoca = new JButton("LOCATION");
        JButton btnChar = new JButton("STATUS");
        JButton btnReci = new JButton("RECIPE");
        JButton btnInven = new JButton("INVENTORY");
        JButton btnEsc = new JButton("EXIT");
      
        JSplitPane jsp = new JSplitPane();
        
        // ��ư �߰� - �����ӿ� ��ư�� �߰����� -> ��üȭ
        frm_deflault.getContentPane().add(btnLoca);      
        frm_deflault.getContentPane().add(btnChar);
        frm_deflault.getContentPane().add(btnReci);
        frm_deflault.getContentPane().add(btnInven);
        frm_deflault.getContentPane().add(btnEsc);
       
        // ��ư�� ũ�� ���� - (margin-left,margin-top,width,height)
        btnLoca.setBounds(0, 750, 240, 50);
        btnChar.setBounds(240, 750, 240, 50);
        btnReci.setBounds(480, 750, 240, 50);
        btnInven.setBounds(720, 750, 240, 50);
        btnEsc.setBounds(960, 750, 240, 50);
       
       
        btnLoca.addActionListener(event -> {
        JLabel imgLblLoca = new JLabel(); // �̹����� �� ����
        frm_deflault.getContentPane().add(imgLblLoca);
        ImageIcon bsImgLoca = new ImageIcon("src/survive/img/home.png"); // �󺧿� ���� �̹��� ��ü ����
        imgLblLoca.setIcon(bsImgLoca); // �󺧿� �̹��� ��ü ����
        imgLblLoca.setBounds(0, 0, 1200,750); // ũ�� ����
        imgLblLoca.setHorizontalAlignment(JLabel.CENTER);
        frm_deflault.getContentPane().add(imgLblLoca); // �����ӿ� ����
        });
       
        btnChar.addActionListener(event -> {
        JLabel imgLblChar = new JLabel(); // �̹����� �� ����
        frm_deflault.getContentPane().add(imgLblChar);
        ImageIcon bsImgChar = new ImageIcon("src/survive/img/charactor.png"); // �󺧿� ���� �̹��� ��ü ����
        imgLblChar.setIcon(bsImgChar); // �󺧿� �̹��� ��ü ����
        imgLblChar.setBounds(0, 0, 1200,750); // ũ�� ����
        imgLblChar.setHorizontalAlignment(JLabel.CENTER);
        frm_deflault.getContentPane().add(imgLblChar); // �����ӿ� ����
        });
       
        btnReci.addActionListener(event -> {
        // ��ư Ŭ���ÿ� �߻��ϴ� �̺�Ʈ ���
        	
        });
       
        btnInven.addActionListener(event -> {
        // ��ư Ŭ���ÿ� �Ͼ�� �̺�Ʈ�� ����
        });
       
        btnEsc.addActionListener(event -> {
        // ��ư Ŭ���ÿ� �Ͼ�� �̺�Ʈ�� ����
        });
       
   
       
//�����ǳ�
}
}