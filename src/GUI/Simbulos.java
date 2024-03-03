package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Simbulos {
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JButton times = new JButton("X");
	JButton divided = new JButton("/");
	JButton equals = new JButton("=");
	JButton cleared = new JButton("C");
    public void symbols(JPanel window) {
    	butConf(plus);
    	butConf(minus);
    	butConf(times);
    	butConf(divided);
    	butConf(equals);
    	butConf(cleared);
        window.add(plus);
        window.add(minus);
        window.add(times);
        window.add(divided);
        window.add(equals);
        window.add(cleared);
    }
    public void butConf(JButton button) {
    	button.setBackground(new Color(70,130,180));
		button.setFont(new Font("Arial", Font.BOLD, 32));
    }
}
