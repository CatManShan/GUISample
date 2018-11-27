package gui.view;

import javax.swing.JFrame;

import gui.controller.GUIController;

public class AppFrame extends JFrame
{
	private AppPanel appPanel;
	
	public AppFrame(GUIController controller)
	{
		super();
		
		appPanel = new AppPanel(controller);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		setContentPane(appPanel);
		setSize(800, 800);
		setTitle("Sample GUI");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
