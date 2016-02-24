import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.util.List;
import javax.swing.*;
import javax.swing.border.*;

 class UpdateStudentPanel extends JPanel
{
	private StudentUI userInterface1,userInterface2;	
	private JButton firstButton1,secondButton1,firstButton2,secondButton2;
	String snoUpdate;
	String sqlString;
	
	public UpdateStudentPanel()
	{
	String names1[]={"������Ҫ�޸ĵ�ѧ����ѧ��:"};
	userInterface1=new StudentUI(names1);
	String names2[]={"ѧ ��","�� ��","�� ��","�� ��","�� �� ϵ"};
	userInterface2=new StudentUI(names2);
	
	this.setLayout(new FlowLayout());
	
	Box box =Box.createVerticalBox();
	box.add(userInterface1);
	box.add(userInterface2);
	this.add(box);

	firstButton1=userInterface1.getDoTask1Button();
	firstButton1.setText("ȷ��");
	firstButton1.addActionListener(
	new ActionListener()
	  {
		public void actionPerformed(ActionEvent event)
		{
		DisplayRecord();
		}
	 }
	);
	
	secondButton1=userInterface1.getDoTask2Button();
	secondButton1.setText("���");
	secondButton1.addActionListener(
	new ActionListener()
	  {
		public void actionPerformed(ActionEvent event)
		{
		userInterface1.clearFields();
		}
	 }
	);

	firstButton2=userInterface2.getDoTask1Button();
	firstButton2.setText("ȷ���޸�");
	firstButton2.addActionListener(
	new ActionListener()
	  {
		public void actionPerformed(ActionEvent event)
		{
		UpdateRecord();
		}
	 }
	);

	secondButton2=userInterface2.getDoTask2Button();
	secondButton2.setText("����");
	secondButton2.addActionListener(
	new ActionListener()
	  {
		public void actionPerformed(ActionEvent event)
		{
		userInterface2.clearFields();
		}
	 }
	);
	setSize(400,260);
	setVisible(true);
	}






	public void DisplayRecord()
	{
	String fieldValues1[]=userInterface1.getFieldValues();
	String fieldValues2[]=new String[5];
	
	if(!fieldValues1[StudentUI.SNO].equals(""))
		{
		snoUpdate=fieldValues1[0];
		   try
		   {
			String sqlString="select*from student"+"when sno='"+ fieldValues1[0] +"'";
			StudentManager studentmanager=new StudentManager();
			List<Student>list =studentmanager.Query(sqlString);
			if(list.size()!=0)
			{
			fieldValues1[0]=list.get(0).getSno();
			fieldValues1[1]=list.get(0).getSname();
			fieldValues1[2]=list.get(0).getSsex();
			fieldValues1[3]=String.valueOf(list.get(0).getSage());
			fieldValues1[4]=list.get(0).getSdept();
			userInterface2.setFieldValues(fieldValues2);
			}
			else
			{
			userInterface2.clearFields();
			JOptionPane.showMessageDialog(UpdateStudentPanel.this,"Not found this record!","Find Result",JOptionPane.INFORMATION_MESSAGE);
			}
		   }
		   catch(Exception ee)
		   {
			System.out.println(ee);
		   }
		}
	else
	JOptionPane.showMessageDialog(UpdateStudentPanel.this,"Bad sno number ","Invalid number format",JOptionPane.ERROR_MESSAGE);
	}



	

	public void UpdateRecord()
	{
		String fieldValues[]=userInterface2.getFieldValues();
		if(!fieldValues[StudentUI.SNO].equals(""))
		{
		     try
			{
			int numberAge=Integer.parseInt(fieldValues[StudentUI.SAGE]);
			String sqlString ="Update student set "+"sno='" + fieldValues[0] + "',"+
			"sname='" + fieldValues[1] + "',"+
			"ssex='" + fieldValues[2] + "',"+
			"sage='" + numberAge + "',"+
			"sdept='" + fieldValues[4] + 
			"'where sno='"+snoUpdate+"'";
			System.out.println(sqlString);

			StudentManager studentmanager=new StudentManager();
			int result=studentmanager.execUpdate(sqlString);
			if(result!=0)
			   {
				JOptionPane.showMessageDialog(this,"Upadte sucess!","Update Result",JOptionPane.INFORMATION_MESSAGE);
			   }
			}
		    catch(NumberFormatException formatException)
				{
				JOptionPane.showMessageDialog(this,"Bad age number ","Invalid number format",JOptionPane.ERROR_MESSAGE);
				}
		    catch(SQLException ee)
				{	
				System.out.println(ee);
				}			
		}
		else
		JOptionPane.showMessageDialog(this,"Bad sno number ","Student number is empty!",JOptionPane.ERROR_MESSAGE);
		
	}
}

	