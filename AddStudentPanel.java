import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class AddStudentPanel extends JPanel
{
	private JButton clearButton,writeButton;
	private StudentUI userInterface;
	String names1[]={"ѧ ��","�� ��","�� ��","�� ��","�� �� ϵ"};

	//setupgui
	public AddStudentPanel()
	{
	setLayout(new BorderLayout());
	userInterface =new StudentUI(names1);
	this.add(userInterface,BorderLayout.NORTH);
	
	writeButton=userInterface.getDoTask1Button();
	writeButton.setText("����");
	writeButton.addActionListener(
	
		new ActionListener()
		{
		public void actionPerformed(ActionEvent event)
		{
			String fieldValues[]=userInterface.getFieldValues();
			if(!fieldValues[StudentUI.SNO].equals(""))
			{
			try{	
			int numberAge=Integer.parseInt(fieldValues[StudentUI.SAGE]);
			String sqlString ="INSERT INTO student"+"VALUES('" + fieldValues[0] + "','" + fieldValues[1] + "','" + fieldValues[2] + "','" + fieldValues[3] + "')";
			StudentManager studentmanager=new StudentManager();
				int result=studentmanager.execUpdate(sqlString);
			if(result!=0)
			   {
				userInterface.clearFields();
				JOptionPane.showMessageDialog(AddStudentPanel.this,"Inserted sucess!","Insert Result",JOptionPane.INFORMATION_MESSAGE);
			   }
			   }
			catch(NumberFormatException formatException)
				{
				JOptionPane.showMessageDialog(AddStudentPanel.this,"Bad age number ","Invalid number format",JOptionPane.ERROR_MESSAGE);
				}
			catch(SQLException ee)
				{	
				System.out.println(ee);
				}
			}
			else
			JOptionPane.showMessageDialog(AddStudentPanel.this,"Bad sno number ","Student number is empty!",JOptionPane.ERROR_MESSAGE);
			
		}
		}
	);
		clearButton =userInterface.getDoTask2Button();
		clearButton.setText("���");
		clearButton.addActionListener(
		new ActionListener()
		{
		public void actionPerformed(ActionEvent event)
			{
			userInterface.clearFields();
			}
		}
	);

	}
}