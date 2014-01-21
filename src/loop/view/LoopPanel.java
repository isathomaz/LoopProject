package loop.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import loop.controller.LoopController;
import java.awt.Color;

public class LoopPanel extends JPanel
	{
		private LoopController baseController;
		private JScrollPane textPane;
		private SpringLayout baseLayout;
		private JButton submitButton;
		private JTextArea loopArea;
		
		public LoopPanel(LoopController baseController)
			{
			setBackground(new Color(135, 206, 235));
				this.baseController = baseController;
				
				submitButton = new JButton("Click here to begin");
				loopArea = new JTextArea(45,45);
				textPane = new JScrollPane(loopArea);
				baseLayout = new SpringLayout();
				baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 171, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, textPane, -6, SpringLayout.NORTH, submitButton);
				baseLayout.putConstraint(SpringLayout.EAST, textPane, 0, SpringLayout.EAST, submitButton);
				baseLayout.putConstraint(SpringLayout.WEST, textPane, 0, SpringLayout.WEST, submitButton);
				baseLayout.putConstraint(SpringLayout.WEST, submitButton, 22, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.EAST, submitButton, -23, SpringLayout.EAST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, textPane, 10, SpringLayout.NORTH, this);
				
				setupPanel();
				setupLayout();
				setupListeners();
			}
		
		private void setupPanel()
			{
				this.setLayout(baseLayout);
				this.add(textPane);
				this.add(submitButton);
				
				loopArea.setLineWrap(true);
				loopArea.setWrapStyleWord(true);
				
			}
		
		private void setupLayout()
			{
				
			}
		private void setupListeners()
			{
				submitButton.addActionListener(new ActionListener()
					{
						
						public void actionPerformed(ActionEvent click)
							{
								loopArea.append(baseController.getLoopResults());
								
							}
					});
			}
	}
