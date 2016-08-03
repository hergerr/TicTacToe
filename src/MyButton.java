import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MyButton extends JButton {
	int imgCounter = 0;
	int[] tabOfIndexes = new int[9];
	ImageIcon whiteImg = new ImageIcon("resources/white.jpg");
	public static ImageIcon xImg = new ImageIcon("resources/x.png");
	public static ImageIcon oImg = new ImageIcon("resources/o.png");
	
	
	public MyButton(ImageIcon img){
		this.addActionListener(new ListenForButton());
		this.setIcon(img);
	}
	
	public void markFieldwithO(){
		int i = 0;
		while(!Field.buttonTab[i].isEmpty()){
			++i;
		}
		Field.buttonTab[i].setIcon(oImg);
	}
	
	public boolean isEmpty(){
		if(this.getIcon() == whiteImg) return true; //TODO why it doesn't work with imgCounter 
		else return false;
	}
	
	public MyButton(){
		this.addActionListener(new ListenForButton());
		this.setIcon(whiteImg);
	}
	
	
private class ListenForButton implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		++imgCounter;
		imgCounter %= 3;	
			switch(imgCounter){
			case 0: setIcon(whiteImg);
			break;
			case 1: setIcon(xImg);
			break;
			case 2: setIcon(oImg);
			break;
			}
			markFieldwithO();
			
		}
	
	}
}