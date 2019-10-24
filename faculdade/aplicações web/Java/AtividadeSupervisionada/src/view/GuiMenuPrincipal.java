package view;

import connection.ConnectionFactory;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import model.Aluno;
import model.dao.AlunoDAO;

public class GuiMenuPrincipal extends JFrame {

    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo;
    private JMenuItem miCadastrar, miExcluir, miPesquisar, miAlterar, miSair;
    private JTable table;
    private JScrollPane scrollTable;
    private JButton btReload;

    public GuiMenuPrincipal() {
        inicializarComponentes();
        definirEventos();
        carregaTabela();
    }

    private void inicializarComponentes() {
        setTitle("Gerenciador de Alunos");
        setBounds(0, 0, 800, 600);
        contentPane = getContentPane();
        btReload = new JButton("Recarregar registros");
        mnBarra = new JMenuBar();
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic('A');
        miCadastrar = new JMenuItem("Cadastrar");
        miExcluir = new JMenuItem("Excluir");
        miPesquisar = new JMenuItem("Pesquisar");
        miAlterar = new JMenuItem("Alterar");
        miSair = new JMenuItem("Sair");
        miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
        table = new JTable();
        scrollTable = new JScrollPane();
        btReload.setBounds(300, 500, 200, 25);
        scrollTable.setBounds(50, 75, 500, 300);

        table.setModel(new DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String[]{
                    "Matricula", "Nome", "Idade", "Email"
                }
        ));
        scrollTable.setViewportView(table);

        
        add(btReload);
        add(scrollTable);
        mnArquivo.add(miCadastrar);
        mnArquivo.add(miExcluir);
        mnArquivo.add(miPesquisar);
        mnArquivo.add(miAlterar);
        mnArquivo.add(miSair);
        mnBarra.add(mnArquivo);
        setJMenuBar(mnBarra);

    }

   private void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        modelo.setNumRows(0);
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(50);
        table.getColumnModel().getColumn(3).setPreferredWidth(150);

        AlunoDAO conAl = new AlunoDAO();
       try{
        for(Aluno a: conAl.listar()){
            modelo.addRow(new Object[]{
                a.getMat(),
                a.getNome(),
                a.getIdade(),
                a.getEmail()
            });
        }
       } catch(Exception e){
           JOptionPane.showMessageDialog(null, "Erro ao consultar o cadastro dos alunos. \n" + e, "Erro", JOptionPane.ERROR_MESSAGE);
       }
    }

    ;
    private void definirEventos() {
        btReload.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                carregaTabela();
            }
        });
        miCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                GuiCadastrar.abrir();
            }
        });
        miExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                GuiDeletar.abrir();
            }
        });
        miPesquisar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                GuiPesquisar.abrir();
            }
        });
        miAlterar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                GuiAlterar.abrir();
            }
        });

        miSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GuiMenuPrincipal frame = new GuiMenuPrincipal();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
                frame.setVisible(true);
            }
        });
    }

}
