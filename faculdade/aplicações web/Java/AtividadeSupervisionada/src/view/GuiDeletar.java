package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.dao.AlunoDAO;

public class GuiDeletar extends JFrame{

    private JTextField tfMat;
    private JLabel lbMat;
    private JButton btDeletar, btLimpar;
    private static GuiDeletar frame;

    public GuiDeletar() {
        inicializarcomponentes();
        definirEventos();
    }

    private void inicializarcomponentes() {
        setTitle("Excluir");
        setBounds(0, 0, 320, 200);
        setLayout(null);
        tfMat = new JTextField(5);
        lbMat = new JLabel("Digite a Matricula");
        btDeletar = new JButton("Deletar");
        btLimpar = new JButton("Limpar");
        tfMat.setBounds(115, 30, 150, 25);
        lbMat.setBounds(10, 30, 100, 25);
        btDeletar.setBounds(60, 75, 80, 25);
        btLimpar.setBounds(200, 75, 80, 25);
        add(tfMat);
        add(lbMat);
        add(btDeletar);
        add(btLimpar);

    }

    private void definirEventos() {
        btDeletar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                AlunoDAO conAl = new AlunoDAO();
                conAl.remover(Integer.parseInt(tfMat.getText()));
                frame.setVisible(false);
            }
        });
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tfMat.setText("");
            }
        });
    }

    public static void abrir() {
        frame = new GuiDeletar();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }

}
