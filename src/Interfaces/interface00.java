package Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interface00 extends JFrame implements ActionListener { //Como extendeu o JFrame, não é necessario inicializar um novo objetoJframe
    public interface00(){

        //JFrame
        setTitle("AULA 01"); //Da o nome ao frame
        setVisible(true); //Deixa o frame visivel
        setSize(800, 500); //Seta o tamanho do frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Padrao para parar o app ao fechar a tela
        setResizable(false); //Impossibilita mudar o tamanho
        setLocationRelativeTo(null); //Faz o frame aparecer bem no centro

        setLayout(null); //Reseta o layout

        //JButton
        JButton botao = new JButton("Clique aqui"); //Cria um objeto tipo botao
        botao.setBounds(100, 200, 250, 70); //Seta o tamanho e a posicao do botao no painel
        botao.setFont(new Font("Arial", Font.BOLD, 40)); //Muda a fonta do botoa para uma escolhida
        botao.setForeground(new Color(255, 255, 255)); //Muda a cor da letra do botao
        botao.setBackground(new Color(0x000000)); //Muda a cor do fundo do botao
        add(botao);


        JButton botao2 = new JButton("Clique aqui");
        botao2.setBounds(0, 0, 150, 70);
        botao2.setFont(new Font("Arial", Font.ITALIC, 20));
        botao2.setForeground(new Color(255, 255, 255));
        botao2.setBackground(new Color(0x00B5FF));
        add(botao2);

        botao.addActionListener(this);
        botao2.addActionListener(this::teste);
    }

    private void teste(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Deu bosta viado", "KKKK se fudeu",JOptionPane.WARNING_MESSAGE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Voce clicou aqui", "Titulo do JoptionPane", JOptionPane.WARNING_MESSAGE); //Faz aparecer uma mensagem quando aperta o botao
    }
}
