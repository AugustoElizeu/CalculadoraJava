package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NumButtons {
	
	Color cor = new Color(114, 47, 55);
	
    public void buttonsd(JPanel window){
    	for(int x=1; x<11;x++) {
    		String num = Integer.toString(x);
    		JButton button = new JButton(num);
    		if(x<10) {
    			button.setBackground(cor);
    			butConf(button);
    			window.add(button);
    		}
    		else {
    			button = new JButton("0");
    			butConf(button);
    			window.add(button);
    		}
    	}
    }
    public void butConf(JButton button) {
    	button.setBackground(cor);
		button.setFont(new Font("Arial", Font.BOLD, 32));
    }
}
