package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.Aluno;
import model.dao.AlunoDAO;

public class GuiAlterar extends JFrame {

    private JTextField tfMat, tfNome, tfIdade, tfEmail;
    private JLabel lbMat, lbNome, lbIdade, lbEmail;
    private JButton btPesquisar, btLimpar;
    private static GuiAlterar frame;

    public GuiAlterar() {
        inicializarcomponentes();
        definirEventos();
    }

    private void inicializarcomponentes() {
        setTitle("Alterar");
        setBounds(0, 0, 300, 350);
        setLayout(null);
        tfMat = new JTextField(3);
        tfNome = new JTextField(5);
        tfIdade = new JTextField(3);
        tfEmail = new JTextField(5);
        lbMat = new JLabel("Matricula");
        lbNome = new JLabel("Nome");
        lbIdade = new JLabel("Idade");
        lbEmail = new JLabel("Email");
        btPesquisar = new JButton("Pesquisar");
        btLimpar = new JButton("Alterar");
        tfMat.setBounds(90, 30, 80, 25);
        lbMat.setBounds(10, 30, 80, 25);
        tfNome.setBounds(90, 75, 150, 25);
        lbNome.setBounds(10, 75, 80, 25);
        tfIdade.setBounds(90, 120, 60, 25);
        lbIdade.setBounds(10, 120, 80, 25);
        tfEmail.setBounds(90, 165, 150, 25);
        lbEmail.setBounds(10, 165, 80, 25);

        btPesquisar.setBounds(20, 210, 100, 25);
        btLimpar.setBounds(150, 210, 80, 25);
        add(tfMat);
        add(tfNome);
        add(tfIdade);
        add(tfEmail);
        add(lbMat);
        add(lbNome);
        add(lbIdade);
        add(lbEmail);
        add(btPesquisar);
        add(btLimpar);

    }

    private void definirEventos() {
        btPesquisar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                GuiPesquisar.abrir();
                
            }
        });
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Aluno a = new Aluno();
                a.setMat(Integer.parseInt(tfMat.getText()));
                a.setNome(tfNome.getText());
                a.setIdade(Integer.parseInt(tfIdade.getText()));
                a.setEmail(tfEmail.getText());
                AlunoDAO conAl = new AlunoDAO();
                conAl.alterar(a);
            }
        });
    }

    public static void abrir() {
        frame = new GuiAlterar();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }
}
