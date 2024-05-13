package dieting_data;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DoneListener implements ActionListener{
	MainFrame currentFrame;
	JPanel currentModel;
	JRadioButton currentButton;
	
	public DoneListener(MainFrame currentFrame, JPanel currentModel, JRadioButton currentButton) {
		this.currentFrame = currentFrame;
		this.currentModel = currentModel;
		this.currentButton = currentButton;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		

		currentButton.setSelected(false);
	}
}
