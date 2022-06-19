package examplesPro;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ed {

	public static void main(String[] args) {
		
		JLabel lablel = new JLabel("to access the next page press left click and to access the previos page press right click");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setLocation(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(lablel);
		
	
		
		
		
	
		JFrame frame1 = new JFrame();
		ImageIcon sho1 = new ImageIcon("D:\\nnn\\sho1.png");
		ImageIcon sho2 = new ImageIcon("D:\\nnn\\sho2.png");
		ImageIcon sho3 = new ImageIcon("D:\\nnn\\sho3.png");
		ImageIcon sho4 = new ImageIcon("D:\\nnn\\sho4.png");
		ImageIcon sho5 = new ImageIcon("D:\\nnn\\sho5.png");
		JLabel label1 = new JLabel();
		label1.setIcon(sho1);
		frame1.add(label1);
		
		
		label1.addMouseListener(new MouseListener() {
			int l = 0;
			
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			if(l < 5) {
				if(e.getButton() == 1) {
					l++;
				} }
			if(l > 0) {
				if(e.getButton() == 3) {
					l--;
				} }
				
				
				switch(l) {
				case 1:
					label1.setIcon(sho1);
					break;
				case 2:
					label1.setIcon(sho2);
					break;
				case 3:
					label1.setIcon(sho3);
					break;
				case 4:
					label1.setIcon(sho4);
					break;
				case 5:
					label1.setIcon(sho5);
					break;
				}
			}
			
		});
			
		


		
		frame1.setLayout(new FlowLayout());
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(400,400);
		frame1.setLocationRelativeTo(null);
		frame1.setVisible(true);
		
		

	}

}
