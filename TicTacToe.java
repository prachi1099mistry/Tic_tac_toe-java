import java.awt.Frame;
import java.awt.Dialog;
import java.awt.Button;
import java.awt.Label;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

class TicTacToeGame extends Frame implements ActionListener
{
	Button []b;
	int c=0;
	TicTacToeGame()
	{
		setLayout(new GridLayout(3,3));
		setTitle("TIC-TAC-TOE");
		b=new Button[9];
		for(int i=0;i<9;i++)
		{
			b[i]=new Button();
			add(b[i]);
			b[i].addActionListener(this);
		}
		setVisible(true);
		setSize(400,400);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(c%2==0)
		{
			if(ae.getSource()==b[0]){
				b[0].setLabel("X");
				c++;
				winCheck();
			}
			else if(ae.getSource()==b[1]){
				b[1].setLabel("X");
				c++;
				winCheck();
			}
			else if(ae.getSource()==b[2]){
				b[2].setLabel("X");
				c++;
				winCheck();
			}
			else if(ae.getSource()==b[3]){
				b[3].setLabel("X");
				c++;
				winCheck();
			}
			else if(ae.getSource()==b[4]){
				b[4].setLabel("X");
				c++;
			}
			else if(ae.getSource()==b[5]){
				b[5].setLabel("X");
				c++;
				winCheck();
			}
			else if(ae.getSource()==b[6]){
				b[6].setLabel("X");
				c++;
			}
			else if(ae.getSource()==b[7]){
				b[7].setLabel("X");
				c++;
				winCheck();
			}
			else if(ae.getSource()==b[8]){
				b[8].setLabel("X");
				c++;
				winCheck();
			}
		}
		else
		{
			if(ae.getSource()==b[0]){
				b[0].setLabel("O");
				c++;
				winCheck();
			}
			else if(ae.getSource()==b[1]){
				b[1].setLabel("O");
				c++;
				winCheck();
			}
			else if(ae.getSource()==b[2]){
				b[2].setLabel("O");
				c++;
				winCheck();
			}
			else if(ae.getSource()==b[3]){
				b[3].setLabel("O");
				c++;
				winCheck();
			}
			else if(ae.getSource()==b[4]){
				b[4].setLabel("O");
				c++;
				winCheck();
			}
			else if(ae.getSource()==b[5]){
				b[5].setLabel("O");
				c++;
				winCheck();
			}
			else if(ae.getSource()==b[6]){
				b[6].setLabel("O");
				c++;
				winCheck();
			}
			else if(ae.getSource()==b[7]){
				b[7].setLabel("O");
				c++;
				winCheck();
			}
			else if(ae.getSource()==b[8]){
				b[8].setLabel("O");
				c++;
				winCheck();
			}
		}

	}
	public void winCheck()
	{
		if (b[0].getLabel()=="X" && b[1].getLabel()=="X" && b[2].getLabel()=="X" || 
			b[3].getLabel()=="X" && b[4].getLabel()=="X" && b[5].getLabel()=="X" ||
			b[6].getLabel()=="X" && b[7].getLabel()=="X" && b[8].getLabel()=="X" ||
			b[0].getLabel()=="X" && b[3].getLabel()=="X" && b[6].getLabel()=="X" ||
			b[1].getLabel()=="X" && b[4].getLabel()=="X" && b[7].getLabel()=="X" ||
			b[2].getLabel()=="X" && b[5].getLabel()=="X" && b[8].getLabel()=="X" ||
			b[0].getLabel()=="X" && b[4].getLabel()=="X" && b[8].getLabel()=="X" ||
			b[2].getLabel()=="X" && b[4].getLabel()=="X" && b[6].getLabel()=="X")
			//new Dialog(this).add(new Label("X wins")); 
			System.out.println("X wins");
		else if (b[0].getLabel()=="O" && b[1].getLabel()=="O" && b[2].getLabel()=="O" || 
			b[3].getLabel()=="O" && b[4].getLabel()=="O" && b[5].getLabel()=="O" ||
			b[6].getLabel()=="O" && b[7].getLabel()=="O" && b[8].getLabel()=="O" ||
			b[0].getLabel()=="O" && b[3].getLabel()=="O" && b[6].getLabel()=="O" ||
			b[1].getLabel()=="O" && b[4].getLabel()=="O" && b[7].getLabel()=="O" ||
			b[2].getLabel()=="O" && b[5].getLabel()=="O" && b[8].getLabel()=="O" ||
			b[0].getLabel()=="O" && b[4].getLabel()=="O" && b[8].getLabel()=="O" ||
			b[2].getLabel()=="O" && b[4].getLabel()=="O" && b[6].getLabel()=="O")
			//new Dialog(this).add(new Label("O wins")); 
			System.out.println("O wins");
	}
}

class TicTacToe
{
	public static void main(String[] args)
	{
		new TicTacToeGame();
	}
}