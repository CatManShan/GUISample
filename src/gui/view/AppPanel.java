package gui.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import gui.controller.GUIController;

public class AppPanel extends JPanel
{
	private GUIController controller;
	private JLabel sampleLabel;
	private JButton sampleButton;
	private SpringLayout sampleLayout;
	
	public AppPanel(GUIController controller)
	{
		super();
		
		this.controller = controller;
		
		sampleLabel = new JLabel("This is a sample label");
		sampleButton = new JButton("Sample Button");
		sampleLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		//setLayout(sampleLayout);
		add(sampleButton);
		add(sampleLabel);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		sampleButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent mouseClick)
				{
					changeBackground();
				}
			});
	}
	
	private void changeBackground()
	{
		Random rand = new Random();
		setBackground(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
	}
}
