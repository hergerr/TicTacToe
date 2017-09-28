import javax.swing.*;
import java.awt.event.*;


public class ImageButton extends JToggleButton {
	int[] tabOfIndexes = new int[9];
	int imgCounter = 0;
	public ImageIcon whiteImg = new ImageIcon("resources/white.jpg");
	public static ImageIcon xImg = new ImageIcon("resources/x.png");
	public static ImageIcon oImg = new ImageIcon("resources/o.png");
	
	
	public ImageButton(ImageIcon img){
		this.addActionListener(new ListenForButton());
		this.setIcon(img);
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	
	}
	
	public void markFieldwithO(){
		int i = (int)(Math.random()*9);
		if(Field.buttonTab[i].isEmpty()) Field.buttonTab[i].setIcon(oImg);
		else i = (int)(Math.random()*9);
		System.out.println(i);
		this.setIcon(oImg);
		
	}
	
	public boolean isEmpty(){
		if(this.getIcon() == whiteImg) return true; //TODO why it doesn't work with imgCounter 
		else return false;
	}
	
	public ImageButton(){
		this.addActionListener(new ListenForButton());
		this.setIcon(whiteImg);
	}
	
	
private class ListenForButton implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		++imgCounter;
		System.out.println(imgCounter);
			
		}
	
	}
}