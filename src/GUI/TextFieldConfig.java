package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class TextFieldConfig {
	private JTextField CDT = new JTextField();
	private Border border = BorderFactory.createLineBorder(Color.gray, 10);
	
	public void valueBut(String str) {
		CDT.setText(str);
		System.out.print(str);
	}
	
	public void textboxd(JPanel window) {
		 CDT.setHorizontalAlignment(JTextField.RIGHT);
	     CDT.setEditable(true);
	     CDT.setFont(new Font("Arial",Font.CENTER_BASELINE,48));
	     CDT.setBorder(new EmptyBorder(20,10,20,10));
	     CDT.setBorder(border);
	     CDT.setSize(30,60);
	     window.add(CDT);
	}
}
