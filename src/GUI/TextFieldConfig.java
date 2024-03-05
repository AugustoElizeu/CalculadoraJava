package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class TextFieldConfig extends JPanel {
	
	private JTextField CDT;
	
	public TextFieldConfig(){
		
		setLayout(new FlowLayout());
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 5);
		CDT = new JTextField(7);
		CDT.setHorizontalAlignment(JTextField.RIGHT);
	    CDT.setEditable(false);
	    CDT.setFont(new Font("Monospace",Font.CENTER_BASELINE,48));
	    CDT.setBorder(new EmptyBorder(20,10,20,10));
	    CDT.setBorder(border);
	    CDT.setSize(30,60);
	    add(CDT);
	}
	
	public JTextField getTxtNumber() {
		
		return CDT;
	}
}
