import java.awt.*;
class Main
{
	public static void main(String[] args)
	{
		//create UI 
		MainFrame frame=new MainFrame();
		//get screen's size
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize=frame.getSize();

		//make the main windows at the center
		if(frameSize.height>screenSize.height)
			frameSize.height=screenSize.height;
		if(frameSize.width>screenSize.width)
			frameSize.width=screenSize.width;

		frame.setLocation((screenSize.width-frameSize.width)/2,(screenSize.height-frameSize.height)/2);
		//frame.setResizable(false);
		frame.setVisible(true);
	}
}