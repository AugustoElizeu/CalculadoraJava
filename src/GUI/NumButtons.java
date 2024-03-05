package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumButtons extends JPanel implements ActionListener {
	
	private Color cor = new Color(114, 47, 55);
	private JTextField TFC;
	
	public NumButtons(JTextField TFC) {
		this.TFC = TFC;
		
		setLayout(new GridLayout(4,3));
    	for(int x=1; x<11;x++) {
    		String num = Integer.toString(x);
    		JButton button = new JButton(num);
    		if(x<10) {
    			button.setBackground(cor);
    			butConf(button);
    			button.addActionListener(this);
    			add(button);
    		}
    		else {
    			JButton button2 = new JButton(".");
    			button = new JButton("0");
    			num = "0";
    			JButton button3 = new JButton("=");		
    			butConf(button);
    			butConf(button2);
    			butConf(button3);
    			button.addActionListener(this);
    			button2.addActionListener(this);
    			add(button2);
    			add(button);
    			add(button3);
    		}
    		 
    	}
    	return;
	}
    public void butConf(JButton button) {
    	button.setBackground(cor);
		button.setFont(new Font("Arial", Font.BOLD, 32));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
		
    	if(TFC.getText().length() == 10) {
    		return;
    	}
    	JButton btn = (JButton) e.getSource();
    	String number = btn.getText();
    	TFC.setText(TFC.getText() + number);
    }
}
