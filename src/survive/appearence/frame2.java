package survive.appearence;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

class frame_whole{
	JFrame frm_deflault;
	
	JToggleButton btnLoca;
	JToggleButton btnChar;
	JToggleButton btnReci;
	JToggleButton btnInven;
	JToggleButton btnEsc;
    Panel panel;
    GridLayout gl_bottom;
	ButtonGroup bg_bottom; 
    
	public frame_whole() {
		
		// ��ü â ����
		frm_deflault = new JFrame("Last Man Standing");
		
		gl_bottom = new GridLayout(1,5);
		bg_bottom = new ButtonGroup();
		

		// ��ư ��ü ���� -  JButton Ÿ���� ��ü ���� + "��ư�̸�"
		btnLoca = new JToggleButton("LOCATION");
	    btnChar = new JToggleButton("STATUS");
	    btnReci = new JToggleButton("RECIPE");
	    btnInven = new JToggleButton("INVENTORY");
	    btnEsc = new JToggleButton("EXIT");
	    
	    // Panel panel_bottom = new Panel(); // �г� ��ü ����  
	}
	
	public void luanchFrame() {
		
		// Jframe ���� �����̳ʸ� �÷���
		Container con_bottom = frm_deflault.getContentPane();
		con_bottom.setLayout(gl_bottom);
		
        // ��ư �׷쿡 ��ư�� �߰�  // Jframe ���� �����̳ʿ� ��ư �߰�(��üȭ) - ��ǳ�� ����� ���� �۾�
		bg_bottom.add(btnLoca); con_bottom.add(btnLoca);
		bg_bottom.add(btnChar); con_bottom.add(btnChar);
		bg_bottom.add(btnReci); con_bottom.add(btnReci);
		bg_bottom.add(btnInven); con_bottom.add(btnInven);
		bg_bottom.add(btnEsc); con_bottom.add(btnEsc);
		
		/*
        frm_deflault.getContentPane().add(btnLoca);      
        frm_deflault.getContentPane().add(btnChar);
        frm_deflault.getContentPane().add(btnReci);
        frm_deflault.getContentPane().add(btnInven);
        frm_deflault.getContentPane().add(btnEsc);
        */
       
        // ��ư�� ũ�� ���� - (margin-left,margin-top,width,height)
		/*
        btnLoca.setBounds(0, 750, 240, 50);
        btnChar.setBounds(240, 750, 240, 50);
        btnReci.setBounds(480, 750, 240, 50);
        btnInven.setBounds(720, 750, 240, 50);
        btnEsc.setBounds(960, 750, 240, 50);
        */
        
		//������ �Ϲ� ����
		frm_deflault.setSize(1216, 839); // ������ ũ�� ���� (���� �ȼ�)
		frm_deflault.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
		frm_deflault.setVisible(true); // �������� ���̵��� ����
		frm_deflault.setResizable(false); // âũ�� ���� (false) => ���� �Ұ���
	}
}

public class frame2 {
public static void main(String[] args) {

		frame_whole mainFrame = new frame_whole();
		mainFrame.luanchFrame();

		
        // System.out.println(frm_deflault.getContentPane().getSize()); // ������ ���� ũ�⸦ �ܼ� â�� �����
       /*
        FlowLayout fLay_bottom = new FlowLayout(); // ���̾ƿ� ����
        FlowLayout fLay_main = new FlowLayout();
        frm_deflault.getContentPane().setLayout(fLay_main); //���̾ƿ� ���� (�ȿ� fLay) ������ ���� ��
        frm_deflault.getContentPane().setLayout(fLay_bottom);
        */
       
       /*
       
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
       */
   
       
//�����ǳ�
}
}