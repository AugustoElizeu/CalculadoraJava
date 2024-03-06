package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Simbulos extends JPanel implements ActionListener{
	
	private JTextField TFC;
	
	private char op;
	private double n1;
	private double n2;
	
	private JButton plus = new JButton("+");;
    private JButton minus = new JButton("-");
	private JButton times = new JButton("*");
	private JButton divided = new JButton("/");
	private JButton cleared;
	private JButton button3;
	
	public Simbulos(JTextField TFC) {
		this.TFC = TFC;
		
		setLayout(new GridLayout(5,1));
		
		butConf(plus);
		plus.addActionListener(this);
        add(plus);
        
		butConf(minus);
		minus.addActionListener(this);
        add(minus);
        
		butConf(times);
		times.addActionListener(this);
        add(times);
        
		butConf(divided);
		divided.addActionListener(this);
        add(divided);
        
        cleared = new JButton("C");
        cleared.addActionListener(this);
		butConf(cleared);
        add(cleared);
	}
    public void butConf(JButton button) {
    	button.setBackground(new Color(70,130,180));
		button.setFont(new Font("Arial", Font.BOLD, 32));
    }
    
    public void getButt(JButton button3) {
    	this.button3 = button3;
    	
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(TFC.getText().isEmpty()) {
			return;
		}
		JButton btn = (JButton) e.getSource();
		if(btn == cleared) {
			op='\u0000';
			TFC.setText("");
		} else if(button3 == btn) {
			
			n2 = Double.parseDouble(TFC.getText());
			Double results=0.0;
			if(btn == plus) {
				results = n1+n2;
			}else if(btn == minus) {
				results = n1-n2;
			}else if(btn == times) {
				results = n1*n2;
			}else if(btn == divided) {
				results = n1/n2;
			}
			
			TFC.setText(results.toString());
			op='\u0000';
			n1 = results;
			n2 = 0.0;
			
		} else {
			op = btn.getText().charAt(0);
			n1 = Double.parseDouble(TFC.getText());
			TFC.setText("");
		}
	}
}
