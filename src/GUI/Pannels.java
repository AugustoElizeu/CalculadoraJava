package GUI;
import javax.swing.*;
import java.awt.*;

public class Pannels {
    JFrame janela = new JFrame("calculadora");
    JPanel painel = new JPanel(new GridLayout(3, 3));
    JPanel painel2 = new JPanel(new BorderLayout());
    JPanel painel3 = new JPanel(new BorderLayout());
    JTextField CDT = new JTextField();
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
        
        textboxd();
           
        btno.buttonsd(painel);
        janela.getContentPane().setLayout(new BorderLayout());
        janela.getContentPane().add(painel2, BorderLayout.NORTH);
        janela.getContentPane().add(painel, BorderLayout.CENTER);
    }

    public void textboxd(){
        //Define tamanho e posição da nossa caixa de texto
        CDT.setPreferredSize(new Dimension(100,50));
        //Adiciona ela no nosso painel
        painel2.add(CDT, BorderLayout.CENTER);
    }
}
