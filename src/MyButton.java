import javax.swing.*;
import java.awt.event.*;


public class MyButton extends JButton {
	int imgCounter = 0;
	ImageIcon whiteImg = new ImageIcon("resources/white.jpg");
	ImageIcon xImg = new ImageIcon("resources/x.png");
	ImageIcon oImg = new ImageIcon("resources/o.png");
	
	
	public MyButton(ImageIcon img){
		this.addActionListener(new ListenForButton());
		this.setIcon(img);
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
		}
	
	}

}