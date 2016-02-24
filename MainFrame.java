import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//create the main window class
public class MainFrame extends JFrame implements ActionListener
{
	//initialize the main menu
	JMenuBar jMenuBar1=new JMenuBar();
	JMenu jMenuFile =new JMenu("文件");
	JMenuItem jMenuFileExit = new JMenuItem("退出");
	JMenu jMenu1=new JMenu("学生管理");
	JMenuItem jMenuItem1 = new JMenuItem("添加学生");
	JMenuItem jMenuItem2 = new JMenuItem("删除学生");
	JMenuItem jMenuItem3 = new JMenuItem("修改学生信息");
	JMenu jMenu2=new JMenu("学生查询");
	JMenuItem jMenuItem4 = new JMenuItem("浏览全部学生");

	//construtor method
	public MainFrame()
	{
	JPanel contentPane =(JPanel)getContentPane();
	contentPane.setLayout(new BorderLayout());

	setSize(new Dimension(450,450));
	setTitle("学生信息管理系统");

	setJMenuBar(jMenuBar1);

	jMenuBar1.add(jMenuFile);
	jMenuBar1.add(jMenu1);
	jMenuBar1.add(jMenu2);
	jMenuBar1.add(jMenuFileExit);

	jMenuFile.add(jMenuFileExit);
	
	jMenu1.add(jMenuItem1);
	jMenu1.add(jMenuItem2);
	jMenu1.add(jMenuItem3);
	jMenu2.add(jMenuItem4);

	jMenuFileExit.addActionListener(this);
	jMenuItem1.addActionListener(this);
	jMenuItem2.addActionListener(this);
	jMenuItem3.addActionListener(this);
	jMenuItem4.addActionListener(this);
	//jMenuItem5.addActionListener(this);

	Icon bug=new ImageIcon(getClass().getResource("book.jpg"));
	JLabel label=new JLabel(bug,SwingConstants.CENTER);

	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	//the action method
	public void actionPerformed(ActionEvent actionEvent)
	{
		//onclik the exit
		if(actionEvent.getSource()==jMenuFileExit)
		{
			System.exit(0);
		}

		//onclik the addstudent
		if(actionEvent.getSource()==jMenuItem1)
		{
			AddStudentPanel add=new AddStudentPanel();
			this.remove(this.getContentPane());
			this.setContentPane(add);
			this.setVisible(true);
		}

		//delete the student
		if(actionEvent.getSource()==jMenuItem2)
		{
			DeleteStudentPanel delete=new DeleteStudentPanel();
			this.remove(this.getContentPane());
			this.setContentPane(delete);
			this.setVisible(true);
		}

		//change the student
		if(actionEvent.getSource()==jMenuItem3)
		{
			UpdateStudentPanel mod=new UpdateStudentPanel();
			this.remove(this.getContentPane());
			this.setContentPane(mod);
			this.setVisible(true);
		}

		//scan all of the student
		if(actionEvent.getSource()==jMenuItem4)
		{
			ListStudentPanel list=new ListStudentPanel();
			this.remove(this.getContentPane());
			this.setContentPane(list);
			this.setVisible(true);
		}
	}
}
