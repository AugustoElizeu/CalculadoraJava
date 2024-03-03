package GUI;
import javax.swing.*;
import java.awt.*;

public class Pannels {
    JFrame janela = new JFrame("calculadora");
    JPanel painel = new JPanel(new GridLayout(4, 3));
    JPanel painel2 = new JPanel(new BorderLayout());
    JPanel painel3 = new JPanel(new GridLayout(6,1));
    JTextField CDT = new JTextField();
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
        CDT.setHorizontalAlignment(JTextField.RIGHT);
        CDT.setEditable(false);
        CDT.setFont(new Font("Arial",Font.CENTER_BASELINE,48));
        
        
        painel2.add(CDT);
        sim.symbols(painel3);
        btno.buttonsd(painel);
        janela.getContentPane().setLayout(new BorderLayout());
        janela.getContentPane().add(painel2, BorderLayout.NORTH);
        janela.getContentPane().add(painel, BorderLayout.CENTER);
        janela.getContentPane().add(painel3, BorderLayout.EAST);
    }

}
