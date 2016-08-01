import javax.swing.*;
import java.awt.GridLayout;


public class Field extends JFrame{
	
	MyButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
	MyButton[] buttonTab = {button1, button2, button3, button4, button5, button6, button7, button8, button9};

	public static void main(String[] args){
		new Field();
	}
	
	Field(){
		this.setSize(400, 400);
		this.setTitle("Game");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridLayout gridLayout = new GridLayout(3,3);
		setLayout(gridLayout);
		for(int i = 0; i < 9; ++i){
			buttonTab[i] = new MyButton();
			add(buttonTab[i]);
		}		
		this.setVisible(true);
	}
}