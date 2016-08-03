import javax.swing.*;
import java.awt.GridLayout;


public class Field extends JFrame{
	
	public static MyButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
	public static MyButton[] buttonTab = {button1, button2, button3, button4, button5, button6, button7, button8, button9};

	public static void main(String[] args){
		new Field();
	}
	
	Field(){
		this.setSize(400, 400);
		this.setTitle("Game");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		GridLayout gridLayout = new GridLayout(3,3);
		setLayout(gridLayout);
		for(int i = 0; i < 9; ++i){
			buttonTab[i] = new MyButton();
			add(buttonTab[i]);
		}		
		this.setVisible(true);
		win();
	}
	
	public void win(){
		if(((Field.button1.getIcon() == MyButton.xImg) && (Field.button2.getIcon() == MyButton.xImg) && (Field.button3.getIcon() == MyButton.xImg)) 
		|| ((Field.button4.getIcon() == MyButton.xImg) && (Field.button5.getIcon() == MyButton.xImg) && (Field.button6.getIcon() == MyButton.xImg))
		|| ((Field.button7.getIcon() == MyButton.xImg) && (Field.button8.getIcon() == MyButton.xImg) && (Field.button9.getIcon() == MyButton.xImg))
		|| ((Field.button1.getIcon() == MyButton.xImg) && (Field.button5.getIcon() == MyButton.xImg) && (Field.button9.getIcon() == MyButton.xImg))
		|| ((Field.button3.getIcon() == MyButton.xImg) && (Field.button5.getIcon() == MyButton.xImg) && (Field.button7.getIcon() == MyButton.xImg))
		|| ((Field.button1.getIcon() == MyButton.xImg) && (Field.button4.getIcon() == MyButton.xImg) && (Field.button7.getIcon() == MyButton.xImg))
		|| ((Field.button2.getIcon() == MyButton.xImg) && (Field.button5.getIcon() == MyButton.xImg) && (Field.button8.getIcon() == MyButton.xImg))
		|| ((Field.button3.getIcon() == MyButton.xImg) && (Field.button6.getIcon() == MyButton.xImg) && (Field.button9.getIcon() == MyButton.xImg))){
			JOptionPane.showMessageDialog(Field.this, "You won", "You won", JOptionPane.INFORMATION_MESSAGE);
			// player won				  
		}
		else if(((Field.button1.getIcon() == MyButton.oImg) && (Field.button2.getIcon() == MyButton.oImg) && (Field.button3.getIcon() == MyButton.oImg)) 
		|| ((Field.button4.getIcon() == MyButton.oImg) && (Field.button5.getIcon() == MyButton.oImg) && (Field.button6.getIcon() == MyButton.oImg))
		|| ((Field.button7.getIcon() == MyButton.oImg) && (Field.button8.getIcon() == MyButton.oImg) && (Field.button9.getIcon() == MyButton.oImg))
		|| ((Field.button1.getIcon() == MyButton.oImg) && (Field.button5.getIcon() == MyButton.oImg) && (Field.button9.getIcon() == MyButton.oImg))
		|| ((Field.button3.getIcon() == MyButton.oImg) && (Field.button5.getIcon() == MyButton.oImg) && (Field.button7.getIcon() == MyButton.oImg))
		|| ((Field.button3.getIcon() == MyButton.oImg) && (Field.button5.getIcon() == MyButton.oImg) && (Field.button7.getIcon() == MyButton.oImg))
		|| ((Field.button1.getIcon() == MyButton.oImg) && (Field.button4.getIcon() == MyButton.oImg) && (Field.button7.getIcon() == MyButton.oImg))
		|| ((Field.button2.getIcon() == MyButton.oImg) && (Field.button5.getIcon() == MyButton.oImg) && (Field.button8.getIcon() == MyButton.oImg))
		|| ((Field.button3.getIcon() == MyButton.oImg) && (Field.button6.getIcon() == MyButton.oImg) && (Field.button9.getIcon() == MyButton.oImg))){
			JOptionPane.showMessageDialog(Field.this, "Computer won", "Computer won", JOptionPane.INFORMATION_MESSAGE);
			// computer won
		}
		
		else JOptionPane.showMessageDialog(Field.this, "Draw", "Draw", JOptionPane.INFORMATION_MESSAGE);
		
		
	}
}