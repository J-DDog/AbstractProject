package view;

import javax.swing.JFrame;

import controller.AbsController;

public class AbsFrame extends JFrame
{
	
	AbsController baseController;
	
	public AbsFrame(AbsController baseController)
	{
		this.baseController = baseController;
		
		setupFrame();
	}
	
	
	private void setupFrame()
	{
		
	}
}
