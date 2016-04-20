package view;

import javax.swing.JFrame;

import controller.AbsController;

public class AbsFrame extends JFrame
{
	
	AbsController baseController;
	AbsPanel basePanel;
	
	public AbsFrame(AbsController baseController)
	{
		this.baseController = baseController;
		this.basePanel = new AbsPanel(baseController);
		
		setupFrame();
	}
	
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 600);
		this.setTitle("Things On The Internet");
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
