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
	
	private JButton plus;
	private JButton minus;
	private JButton times;
	private JButton divided;
	private JButton cleared;
	
	public Simbulos(JTextField CDT) {
		this.TFC = TFC;
		
		setLayout(new GridLayout(5,1));
		
		plus = new JButton("+");
		butConf(plus);
        add(plus);
        
		minus = new JButton("-");
		butConf(minus);
        add(minus);
        
		times = new JButton("*");
		butConf(times);
        add(times);
        
		divided = new JButton("/");
		butConf(divided);
        add(divided);
        
		cleared = new JButton("C");
		butConf(cleared);
        add(cleared);
	}
    public void butConf(JButton button) {
    	button.setBackground(new Color(70,130,180));
		button.setFont(new Font("Arial", Font.BOLD, 32));
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
