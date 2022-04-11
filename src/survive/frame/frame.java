package survive.frame;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

interface BottomButton {
	abstract void abc (); 
}

class FrameBottomButtonArray{

	ArrayList<Account> accountlist = new ArrayList<Account>();
	
}

public class frame {
	public static void main(String[] args) {

		JFrame frm_deflault = new JFrame("Last Man Standing");
		
		//프레임 일반 설정
		frm_deflault.setSize(1216, 839); // 프레임 크기 설정 (단위 픽셀)
		frm_deflault.setLocationRelativeTo(null); // 프레임을 화면 가운데에 배치
		frm_deflault.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 프레임을 닫았을 때 메모리에서 제거되도록 설정
        frm_deflault.setVisible(true); // 프레임이 보이도록 설정
        // System.out.println(frm_deflault.getContentPane().getSize()); // 프레임 내부 크기를 콘솔 창에 출력함
        
        FlowLayout fLay = new FlowLayout(); // 레이아웃 생성
        frm_deflault.getContentPane().setLayout(null); //레이아웃 설정 (안에 fLay) 넣으면 적용 됨
        frm_deflault.setResizable(false); // 창크기 조절 (false) => 조절 불가능
        
        // 버튼 추가 및 설정
        JButton btnLoca = new JButton("LOCATION"); // JButton 타입의 객체 생성 + "버튼이름" 
        frm_deflault.getContentPane().add(btnLoca);       // 프레임에 버튼을 추가해줌 -> 실체화
        btnLoca.setBounds(0, 750, 240, 50); //  (margin-left,margin-top,width,height)
        
        btnLoca.addActionListener(event -> {
        	
        	
        	JLabel imgLblLoca = new JLabel(); // 이미지용 라벨 생성
        	frm_deflault.getContentPane().add(imgLblLoca);
        	ImageIcon bsImgLoca = new ImageIcon("src/survive/img/home.png"); // 라벨에 넣을 이미지 객체 생성
        	imgLblLoca.setIcon(bsImgLoca); // 라벨에 이미지 객체 삽입
        	imgLblLoca.setBounds(0, 0, 1200,750); // 크기 지정
        	imgLblLoca.setHorizontalAlignment(JLabel.CENTER);
        	frm_deflault.getContentPane().add(imgLblLoca); // 프레임에 삽입
        });
        
        JButton btnChar = new JButton("STATUS");
        frm_deflault.getContentPane().add(btnChar);
        btnChar.setBounds(240, 750, 240, 50);
        
        btnChar.addActionListener(event -> {
        	
        	JLabel imgLblChar = new JLabel(); // 이미지용 라벨 생성
        	frm_deflault.getContentPane().add(imgLblChar);
        	ImageIcon bsImgChar = new ImageIcon("src/survive/img/charactor.png"); // 라벨에 넣을 이미지 객체 생성
        	imgLblChar.setIcon(bsImgChar); // 라벨에 이미지 객체 삽입
        	imgLblChar.setBounds(0, 0, 1200,750); // 크기 지정
        	imgLblChar.setHorizontalAlignment(JLabel.CENTER);
        	frm_deflault.getContentPane().add(imgLblChar); // 프레임에 삽입
        	
        });
        
        JButton btnReci = new JButton("RECIPE");
        frm_deflault.getContentPane().add(btnReci);
        btnReci.setBounds(480, 750, 240, 50);
        
        btnReci.addActionListener(event -> {

        	JLabel imgLblReci = new JLabel(); // 이미지용 라벨 생성
        	frm_deflault.getContentPane().add(imgLblReci);
        	ImageIcon bsImgReci = new ImageIcon("src/survive/img/charactor.png"); // 라벨에 넣을 이미지 객체 생성
        	imgLblReci.setIcon(bsImgReci); // 라벨에 이미지 객체 삽입
        	imgLblReci.setBounds(0, 0, 1200,750); // 크기 지정
        	imgLblReci.setHorizontalAlignment(JLabel.CENTER);
        	frm_deflault.getContentPane().add(imgLblReci); // 프레임에 삽입
        	
        });
        
        JButton btnInven = new JButton("INVENTORY");
        frm_deflault.getContentPane().add(btnInven);
        btnInven.setBounds(720, 750, 240, 50);
        
        btnInven.addActionListener(event -> {
        	// 버튼 클릭시에 일어나는 이벤트를 설정
        });
        
        JButton btnEsc = new JButton("EXIT");
        frm_deflault.getContentPane().add(btnEsc);
        btnEsc.setBounds(960, 750, 240, 50);
        
        btnEsc.addActionListener(event -> {
        	// 버튼 클릭시에 일어나는 이벤트를 설정
        });
        
    
        
	//문서의끝
	}
}
