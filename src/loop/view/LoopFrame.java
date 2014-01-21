package loop.view;

import javax.swing.JFrame;

import loop.controller.LoopController;

public class LoopFrame extends JFrame
	{
		private LoopController baseController;
		private LoopPanel basePanel;
		
		public LoopFrame(LoopController baseController)
			{
				this.baseController = baseController;
			basePanel = new LoopPanel(baseController);
				
				setupFrame();
			}
		
		
		private void setupFrame()
			{
				this.setContentPane(basePanel);
				this.setSize(500,500);
				this.setVisible(true);
			}
	}
