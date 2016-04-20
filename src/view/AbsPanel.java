package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import controller.AbsController;

public class AbsPanel extends JPanel
{
	private AbsController baseController;
	
	private SpringLayout baseLayout;
	private JButton sortButton;
	private JTextArea textArea;
	
	public AbsPanel(AbsController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		sortButton = new JButton("Sort");
		textArea = new JTextArea("");

		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(sortButton);
		this.add(textArea);
	}

	private void setupLayout()
	{

		baseLayout.putConstraint(SpringLayout.EAST, sortButton, -166, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, sortButton, 6, SpringLayout.SOUTH, textArea);
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textArea, -295, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, textArea, -112, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				textArea.setText(textArea.getText() + "\n" + baseController.showMemes());
				
			}
			
		});
	}

}
