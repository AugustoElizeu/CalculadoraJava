package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class Pannels extends JFrame {
	
	private JPanel painel2 = new JPanel(new BorderLayout());
	private JTextField CDT = new JTextField();
	
	public Pannels() {
		super("CARUCURATOR");
		
    	//Ele encerra o programa após fechado
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Define o Tamanho
        setSize(350,500);
        //Configura pro java swing iniciar no centro da tela
        setLocationRelativeTo(null);
        //Impede o redimencionamento do programa
        setResizable(false);
        
        setLayout(new BorderLayout());
        
        TextFieldConfig tfc = new TextFieldConfig();
        add(BorderLayout.NORTH, tfc);
        
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());
        painel.add(BorderLayout.CENTER,new NumButtons(tfc.getTxtNumber()));
        painel.add(BorderLayout.EAST,new Simbulos(tfc.getTxtNumber()));
		
        add(BorderLayout.CENTER,painel);
        
      //Deixa visivel nosso programa
        setVisible(true);
	}

    public static void main(String[] args) throws Exception {
    	new Pannels();
 
       
    }

}
