package br.com.lotofacil;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Scanner;

import javax.swing.*;

public class LotofacilGUI extends JFrame{
    // Atributos
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou ímpar");
    private JLabel jLabelMensagem = new JLabel("Exemplo de Simples Janela");
    // Construtor
    public LotofacilGUI(){
        this.setTitle("Lotofácil - Interface Gráfica");
        this.setSize(400,200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255,255,255));
        painel.add(jButtonAposta1); painel.add(jButtonAposta2); painel.add(jButtonAposta3);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); // Exibir janela

        jButtonAposta1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aposta1();
            }
            });
        jButtonAposta1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aposta2();
            }
        });
        jButtonAposta1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aposta3();
            }
        });
}
    public static void main(String[] args) {new LotofacilGUI();}

    private void aposta1() {
        String aposta = JOptionPane.showInputDialog(null, "Digite um número de 0 a 100: ");
        int numApostado = Integer.parseInt(aposta);
        Random rnd = new Random();
        int numSorteado = rnd.nextInt(101);
        JOptionPane.showMessageDialog(null, "Numero sorteado: " + numSorteado);

        if(numApostado == numSorteado){
            JOptionPane.showMessageDialog(null, "Você ganhou milzão.");
        }else {
            JOptionPane.showMessageDialog(null, "Você perdeu!, o número sorteado foi: " + numSorteado);
        }
    }

    private void aposta2() {

    }

    private void aposta3() {

    }
}

