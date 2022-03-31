package 자판기;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
public class Btn {
   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;
 
   public Btn() {
      prepareGUI(); //GUI 란 Graphical user interface 의 줆말 
      				// 지금까지 배운건 command-line text mode로 입력받는것인데 GUI 를써서 마우스 입력을 받을수있다
   }
 
   public static void main(String[] args) {
      Btn buttons = new Btn();
      buttons.showButton();
      
   }
   
 
   private void prepareGUI() {
      // Frame 에 대한 셋팅
      mainFrame = new Frame("음료 추가"); // 프레임 이름
      mainFrame.setSize(400, 200); // 프레임 사이즈
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.setLocation(880, 640); // 프레임위치
      mainFrame.addWindowListener(new WindowAdapter() { // 프레임 닫을시 스레드 종료
         public void windowClosing(WindowEvent windowEvent) {
            System.exit(0);
         }
      });
 
      // 상단에 있는 라벨
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      headerLabel.setText("음료를 선택해 주세요");
 
      // 하단 상태값 라벨
      statusLabel = new Label();
      statusLabel.setText("선택중....");
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350, 100);
 
      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());
 
      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);
   }
 
   void showButton() { // 버튼
      Button btn1 = new Button("콜라[300]");
      Button btn2 = new Button("환타[200]");
      Button btn3 = new Button("사이다[100]");
      Button btn4 = new Button("레드불[1,000]");
   
      controlPanel.add(btn1);
      controlPanel.add(btn2);
      controlPanel.add(btn3);
      controlPanel.add(btn4);
 
      btn1.addActionListener(new ActionListener() { // 버튼클릭시 동작설정
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("콜라가 선택되었습니다.");
            if(Controller.자금<300) { // 자금이 부족하면 구매할 수 없음
            	statusLabel.setText("자금이 부족하여 구매할 수 없습니다.");
            }
            else { // 콜라 1개 구매, 자금 차감
            	Controller.콜라++; 
            	Controller.자금 -= 300 ;
	            
            }
         }
      });
 
      btn2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("환타가 선택되었습니다.");
            if(Controller.자금<200) {
            	statusLabel.setText("자금이 부족하여 구매할 수 없습니다.");
            }
            else{
            	Controller.환타++; 
            	Controller.자금 -= 200;
            	
            }
         }
      });
 
      btn3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("사이다가 선택되었습니다.");
            if(Controller.자금<100) {
            	statusLabel.setText("자금이 부족하여 구매할 수 없습니다.");
            }
            else{
            	Controller.사이다++; 
            	Controller.자금 -= 100;
            	
            }
         }
      });
      
      btn4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            statusLabel.setText("레드불이 선택되었습니다.");
            if(Controller.자금<1000) {
            	statusLabel.setText("자금이 부족하여 구매할 수 없습니다.");
            }
            else{
            	Controller.레드불++; 
            	Controller.자금 -= 1000;
            	
            }
         }
      });
 
      mainFrame.setVisible(true);
      mainFrame.setAlwaysOnTop(true); // 항상 위에
 
   }
   
   void closeButton() {
	   mainFrame.setVisible(false);
   }
}