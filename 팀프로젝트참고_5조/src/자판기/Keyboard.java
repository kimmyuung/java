package 자판기;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoard implements KeyListener
{
	@Override
	public void keyTyped(KeyEvent e){
	}
	@Override
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == 65) {
			if(Controller.자금<300) { // 자금이 부족하면 구매할 수 없음
            	
            }
            else { // 콜라 1개 구매, 자금 차감
            	Controller.콜라++; 
            	Controller.자금 -= 300 ;
	            
            }
		}else if(e.getKeyCode() == 83) {
			if(Controller.자금<200) {
            	
            }
            else{
            	Controller.환타++; 
            	Controller.자금 -= 200;
            	
            }
		}else if(e.getKeyCode() == 68) {
			if(Controller.자금<100) {
            	
            }
            else{
            	Controller.사이다++; 
            	Controller.자금 -= 100;
            	
            }
		}else if(e.getKeyCode() == 70) {
			if(Controller.자금<1000) {
            	
            }
            else{
            	Controller.레드불++; 
            	Controller.자금 -= 1000;
            	
            }
		}
	}
	
	
	@Override
	public void keyReleased(KeyEvent e) {}

//	 void GUI() {
//		Frame f = new Frame("Demo");
//		f.setLayout(new FlowLayout());
//		f.setSize(200, 200);
//		Label l = new Label();
//		l.setText("This is a demonstration");
//		f.add(l);
//		f.setVisible(true);
//		f.setAlwaysOnTop(true);
//		
//	
//	}

	void showKey() {
		
	}
	
//	}
	public static void main(String[] args)
	{
		//Setting the Frame and Labels
		Frame f = new Frame("Demo");
		f.setLayout(new FlowLayout());
		f.setSize(200, 200);
		Label l = new Label();
		l.setText("This is a demonstration");
		f.add(l);
		f.setVisible(true);
		
		//Creating and adding the key listener
		KeyBoard k = new KeyBoard();
		f.addKeyListener(k);
		f.setAlwaysOnTop(true);
	}
}