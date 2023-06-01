package Interfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interface02 extends JFrame implements ActionListener{
    private JFrame meuFrame;
    private JPanel meupainel;
    private JTextArea areaVelocidade, areaPosicaoi, areaPosicaof, areaInstantI, areaInstantf;
    private JLabel labelVel, labelPosicaoI, labelPosicaoF, labelInstantI, labelInstantf;
    private JButton botaoEnviar, botaoSair;
    public interface02(){
        setTitle("Interface02");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        labelVel = new JLabel("Velocidade: ");
        areaVelocidade = new JTextArea(1,20);
        labelPosicaoI = new JLabel("Posição Inicial: ");
        areaPosicaoi = new JTextArea(1, 20);
        labelPosicaoF = new JLabel("Posição Final: ");
        areaPosicaof = new JTextArea(1, 20);
        labelInstantI = new JLabel("Instante Inicial: ");
        areaInstantI = new JTextArea(1,20);
        labelInstantf = new JLabel("Instante Final: ");
        areaInstantf = new JTextArea(1,20);
        botaoEnviar = new JButton("Enviar");
        botaoSair = new JButton("Sair");
        add(labelVel);
        add(areaVelocidade);
        add(labelPosicaoI);
        add(areaPosicaoi);
        add(labelPosicaoF);
        add(areaPosicaof);
        add(labelInstantI);
        add(areaInstantI);
        add(labelInstantf);
        add(areaInstantf);
        add(botaoEnviar);
        add(botaoSair);
        setVisible(true);

        botaoEnviar.getActionListeners();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Enviado");
    }
}
