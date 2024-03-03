package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class Pannels {
    JFrame janela = new JFrame("calculadora");
    JPanel painel = new JPanel(new GridLayout(4, 3));
    JPanel painel2 = new JPanel(new BorderLayout());
    JPanel painel3 = new JPanel(new GridLayout(6,1));
    TextFieldConfig txt = new TextFieldConfig();
    Simbulos sim = new Simbulos();
    NumButtons btno = new NumButtons();
    public void open(){
        //Define o Tamanho
        janela.setSize(350,500);
        //Impede o redimencionamento do programa
        janela.setResizable(false);
        //Configura pro java swing iniciar no centro da tela
        janela.setLocationRelativeTo(null);
        //Ele encerra o programa após fechado
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        //Deixa visivel nosso programa
        janela.setVisible(true);
        //mudar a cor da janela
        janela.setBackground(new Color(205,133,63));
        
        
        txt.textboxd(painel2);
        sim.symbols(painel3);
        btno.buttonsd(painel);
        janela.getContentPane().setLayout(new BorderLayout());
        janela.getContentPane().add(painel2, BorderLayout.NORTH);
        janela.getContentPane().add(painel, BorderLayout.CENTER);
        janela.getContentPane().add(painel3, BorderLayout.EAST);
    }

}
