package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NumButtons {
	
	Color cor = new Color(114, 47, 55);
	TextFieldConfig textFusca = new TextFieldConfig();
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
    			window.add(new JPanel());
    			button = new JButton("0");
    			num = "0";
    			butConf(button);
    			window.add(button);
    		}
    		String aux = button.getText();
    		button.addActionListener(new ActionListener() {
    	            @Override
    	            public void actionPerformed(ActionEvent e) {
    	                textFusca.valueBut(aux);
    	                		
    	            }
    	        });
    	        
    	}
    }
    public void butConf(JButton button) {
    	button.setBackground(cor);
		button.setFont(new Font("Arial", Font.BOLD, 32));
    }
}
