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



		//프레임 일반 설정
		frm_deflault.setSize(1216, 839); // 프레임 크기 설정 (단위 픽셀)
		frm_deflault.setLocationRelativeTo(null); // 프레임을 화면 가운데에 배치
		frm_deflault.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 프레임을 닫았을 때 메모리에서 제거되도록 설정
        frm_deflault.setVisible(true); // 프레임이 보이도록 설정
        // System.out.println(frm_deflault.getContentPane().getSize()); // 프레임 내부 크기를 콘솔 창에 출력함
        FlowLayout fLay_bottom = new FlowLayout(); // 레이아웃 생성
        FlowLayout fLay_main = new FlowLayout();
        frm_deflault.getContentPane().setLayout(fLay_main); //레이아웃 설정 (안에 fLay) 넣으면 적용 됨
        frm_deflault.getContentPane().setLayout(fLay_bottom);
        frm_deflault.setResizable(false); // 창크기 조절 (false) => 조절 불가능
       
        // 버튼 객체 생성 -  JButton 타입의 객체 생성 + "버튼이름"
        JButton btnLoca = new JButton("LOCATION");
        JButton btnChar = new JButton("STATUS");
        JButton btnReci = new JButton("RECIPE");
        JButton btnInven = new JButton("INVENTORY");
        JButton btnEsc = new JButton("EXIT");
      
        JSplitPane jsp = new JSplitPane();
        
        // 버튼 추가 - 프레임에 버튼을 추가해줌 -> 실체화
        frm_deflault.getContentPane().add(btnLoca);      
        frm_deflault.getContentPane().add(btnChar);
        frm_deflault.getContentPane().add(btnReci);
        frm_deflault.getContentPane().add(btnInven);
        frm_deflault.getContentPane().add(btnEsc);
       
        // 버튼별 크기 지정 - (margin-left,margin-top,width,height)
        btnLoca.setBounds(0, 750, 240, 50);
        btnChar.setBounds(240, 750, 240, 50);
        btnReci.setBounds(480, 750, 240, 50);
        btnInven.setBounds(720, 750, 240, 50);
        btnEsc.setBounds(960, 750, 240, 50);
       
       
        btnLoca.addActionListener(event -> {
        JLabel imgLblLoca = new JLabel(); // 이미지용 라벨 생성
        frm_deflault.getContentPane().add(imgLblLoca);
        ImageIcon bsImgLoca = new ImageIcon("src/survive/img/home.png"); // 라벨에 넣을 이미지 객체 생성
        imgLblLoca.setIcon(bsImgLoca); // 라벨에 이미지 객체 삽입
        imgLblLoca.setBounds(0, 0, 1200,750); // 크기 지정
        imgLblLoca.setHorizontalAlignment(JLabel.CENTER);
        frm_deflault.getContentPane().add(imgLblLoca); // 프레임에 삽입
        });
       
        btnChar.addActionListener(event -> {
        JLabel imgLblChar = new JLabel(); // 이미지용 라벨 생성
        frm_deflault.getContentPane().add(imgLblChar);
        ImageIcon bsImgChar = new ImageIcon("src/survive/img/charactor.png"); // 라벨에 넣을 이미지 객체 생성
        imgLblChar.setIcon(bsImgChar); // 라벨에 이미지 객체 삽입
        imgLblChar.setBounds(0, 0, 1200,750); // 크기 지정
        imgLblChar.setHorizontalAlignment(JLabel.CENTER);
        frm_deflault.getContentPane().add(imgLblChar); // 프레임에 삽입
        });
       
        btnReci.addActionListener(event -> {
        // 버튼 클릭시에 발생하는 이벤트 출력
        	
        });
       
        btnInven.addActionListener(event -> {
        // 버튼 클릭시에 일어나는 이벤트를 설정
        });
       
        btnEsc.addActionListener(event -> {
        // 버튼 클릭시에 일어나는 이벤트를 설정
        });
       
   
       
//문서의끝
}
}