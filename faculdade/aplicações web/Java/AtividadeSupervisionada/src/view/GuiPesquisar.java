package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.Aluno;
import model.dao.AlunoDAO;

public class GuiPesquisar extends JFrame {

    private JTextField tfMat;
    private JLabel lbMat;
    private JButton btPesquisar, btLimpar;
    private static GuiPesquisar frame;
    private JTable table;
    private JScrollPane scrollTable;

    public GuiPesquisar() {
        inicializarcomponentes();
        definirEventos();
    }

    private void inicializarcomponentes() {
        setTitle("Pesquisar");
        setBounds(0, 0, 350, 300);
        setLayout(null);
        tfMat = new JTextField(5);
        lbMat = new JLabel("Digite a Matricula para pesquisar");
        btPesquisar = new JButton("Pesquisar");
        btLimpar = new JButton("Limpar");
        tfMat.setBounds(220, 30, 50, 25);
        lbMat.setBounds(10, 30, 210, 25);
        btPesquisar.setBounds(60, 75, 100, 25);
        btLimpar.setBounds(200, 75, 80, 25);
        table = new JTable();
        scrollTable = new JScrollPane();
        scrollTable.setBounds(10, 120, 300, 100);

        table.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Matricula", "Nome"
                }
        ));
        scrollTable.setViewportView(table);
        add(scrollTable);
        add(tfMat);
        add(lbMat);
        add(btPesquisar);
        add(btLimpar);

    }

    private void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setNumRows(0);
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);

        AlunoDAO conAl = new AlunoDAO();
        try {
            for (Aluno a : conAl.consultar(Integer.parseInt(tfMat.getText()))) {
                modelo.addRow(new Object[]{
                    a.getMat(),
                    a.getNome()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar o cadastro dos alunos. \n" + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void definirEventos() {
        btPesquisar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                carregaTabela();
            }
        });
        btLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                tfMat.setText("");
                table.setModel(new DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Matricula", "Nome"
                        }
                ));
                scrollTable.setViewportView(table);
            }
        });
    }

    public static void abrir() {
        frame = new GuiPesquisar();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }

}
