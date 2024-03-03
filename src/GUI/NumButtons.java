package GUI;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NumButtons {
	
    public void buttonsd(JPanel window){
    	for(int x=1; x<11;x++) {
    		String num = Integer.toString(x);
    		if(x==10) {
    			window.add(new JButton("0"));
    		}
    		else {
    			window.add(new JButton(num));
    		}
    	}
    }
}
