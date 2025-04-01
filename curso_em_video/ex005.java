// Programa que usa swing para uma interface gráfica que mostra quando o botão foi apertado.
import java.awt.*;
import javax.swing.*;

public class ex005 {
    public static void main(String[] args) {
        // Criar a janela
        JFrame janela = new JFrame("Janela com Botão");
        janela.setSize(300, 200);
        janela.setLayout(new BorderLayout()); // Define o layout
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criar um rótulo (texto)
        JLabel texto = new JLabel("Clique no botão!", SwingConstants.CENTER);

        // Criar um botão
        JButton botao = new JButton("Clique aqui");

        // Adicionar ação ao botão
        botao.addActionListener(e -> {
            if (texto.getText().equals("Clique no botão!")) {
                texto.setText("Botão clicado! 🎉");
            } else {
                texto.setText("Clique no botão!");
            }
        });

        // Adicionar componentes à janela
        janela.add(texto, BorderLayout.NORTH); // Texto em cima
        janela.add(botao, BorderLayout.CENTER); // Botão no centro

        // Tornar a janela visível
        janela.setVisible(true);
    }
}