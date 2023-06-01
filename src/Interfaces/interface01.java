package Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class interface01 extends JFrame {
    public static void mostraInterface01(){
        //Jframe basico
        JFrame meuFrame = new JFrame("Frame01"); //Cria o nivel mais basico para a interface
        meuFrame.setSize(500,300); //Seta o tamanho do frame

        //JPanel basico
        JPanel meuPainel = new JPanel(); //Cria um painel para a interface
        meuPainel.setSize(400,300); //Seta o tamanho do painel
        //meuPainel.setLayout(new GridBagLayout()); //faz tudo ficar centralizado no painel

        //JTextField basico
        JLabel meuLabel = new JLabel(); //Cria um label (Um nome, texto para se colocar)
        meuLabel.setText("Digite um numero:");//Coloca um texto no dito label

        //JTextArea
        JTextArea minhaAreaTexto = new JTextArea(5,20); //cria uma area para se digitar um texto


        //JRadioButton
        ButtonGroup grupo1 = new ButtonGroup();//cria um grupo de botões, para que apenas 1 possa ser selecionado
        JRadioButton meuBotao = new JRadioButton();//Cria um botao para se pressionar
        meuBotao.setText("Pressione");//Da nome ao botao meuBotao
        JRadioButton meuBotao2 = new JRadioButton(); //Cria outro botao
        meuBotao2.setText("Aqui");//Da nome ao novo botao
        grupo1.add(meuBotao);//Adiciona o botao1 ao grupo
        grupo1.add(meuBotao2);//Adiciona o botao2 ao grupo

        //JComboBox
        JComboBox meuSeletor = new JComboBox<>(); //Cria o seletor
        meuSeletor.addItem("1 - Cinematica"); //Adiciona a opção 1 - Cinematica ao seletor
        meuSeletor.addItem("2 - Termodinamica"); //Adiciona a opção 2 - Termodinamica
        System.out.println(meuSeletor.getSelectedIndex());

        //JButton
        JButton enviar = new JButton("Enviar");//cria um botao com nome enviar
        JButton sair = new JButton("Sair");//cria um botao com nome sair


        //conectar o painel aos "filhos"
        meuPainel.add(meuLabel); //adiciona o label ao painel
        meuPainel.add(minhaAreaTexto);//adiciona a area para se ecrever no painel
        meuPainel.add(meuBotao);//adiciona o radioButton ao painel
        meuPainel.add(meuBotao2);//adiciona outro botao do mesmo grupo
        meuPainel.add(meuSeletor);//adiciona um seletor ao painel
        meuPainel.add(enviar);//adiciona um botao ao painel
        meuPainel.add(sair);//adiciona um botao ao painel

        //conectar o painel ao frame
        meuFrame.add(meuPainel);//conecta o painel ao frame

        //fazer o frame ficar visivel
        meuFrame.setVisible(true);//deixa o frame visivel
    }
}
