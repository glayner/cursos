package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.Aluno;
import model.dao.AlunoDAO;

public class GuiCadastrar extends JFrame {

    private JTextField tfNome, tfIdade, tfEmail;
    private JLabel lbNome, lbIdade, lbEmail;
    private JButton btGravar, btLimpar;
    private static GuiCadastrar frame;

    public GuiCadastrar() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Cadastrar");
        setBounds(0, 0, 320, 200);
        setLayout(null);
        tfNome = new JTextField(4);
        tfIdade = new JTextField(1);
        tfEmail = new JTextField(5);
        lbNome = new JLabel("Nome");
        lbIdade = new JLabel("Idade");
        lbEmail = new JLabel("Email");
        btGravar = new JButton("Gravar");
        btLimpar = new JButton("Limpar");
        tfNome.setBounds(60, 30, 100, 25);
        lbNome.setBounds(10, 30, 40, 25);
        tfIdade.setBounds(220, 30, 60, 25);
        lbIdade.setBounds(170, 30, 40, 25);
        tfEmail.setBounds(60, 75, 200, 25);
        lbEmail.setBounds(10, 75, 40, 25);
        btGravar.setBounds(60, 120, 80, 25);
        btLimpar.setBounds(200, 120, 80, 25);
        add(tfNome);
        add(tfIdade);
        add(tfEmail);
        add(lbNome);
        add(lbIdade);
        add(lbEmail);
        add(btGravar);
        add(btLimpar);

    }

    private void definirEventos() {
        btGravar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               Aluno a1 = new Aluno();
               AlunoDAO conA1 = new AlunoDAO();
               a1.setNome(tfNome.getText());
               a1.setIdade(Integer.parseInt(tfIdade.getText()));
               a1.setEmail(tfEmail.getText());
               conA1.adicionar(a1);
               frame.setVisible(false);
            }
        });
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tfNome.setText("");
                tfIdade.setText("");
                tfEmail.setText("");
            }
        });
    }

    public static void abrir() {
        frame = new GuiCadastrar();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }

}
