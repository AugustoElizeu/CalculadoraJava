package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class Simbulos {
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JButton times = new JButton("X");
	JButton divided = new JButton("/");
	JButton equals = new JButton("=");
	JButton cleared = new JButton("C");
	TextFieldConfig textFusca = new TextFieldConfig();
    public void symbols(JPanel window) {
    	butConf(plus);
    	plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFusca.valueBut("+");
                		
            }
        });
    	butConf(minus);
    	minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFusca.valueBut("-");
                		
            }
        });
    	butConf(times);
    	times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFusca.valueBut("*");
                		
            }
        });
    	
    	butConf(divided);
    	divided.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFusca.valueBut("/");
                		
            }
        });
    	
    	butConf(equals);
    	equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                		
            }
        });
    	
    	butConf(cleared);
    	cleared.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFusca.valueBut(" ");
                		
            }
        });
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
