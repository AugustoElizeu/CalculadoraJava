import javax.swing.*;
public class Pannels {
    JFrame janela = new JFrame("calculadora");
    JTextField CDT = new JTextField();
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
    }

    public void textboxd(){
        //Define tamanho e posição da nossa caixa de texto
        CDT.setBounds(1,1,2,2);
        //Adiciona ela no nosso painel
        janela.add(CDT);
    }
}
