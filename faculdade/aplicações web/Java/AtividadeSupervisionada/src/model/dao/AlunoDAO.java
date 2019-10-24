package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import model.Aluno;
import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlunoDAO {

    private Connection con = null;

    public AlunoDAO() {
        con = ConnectionFactory.getConnection();
    }

    public void adicionar(Aluno aluno) {
        String sql = "INSERT INTO alunos (nome, idade, email) values(?, ?, ?); ";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setString(3, aluno.getEmail());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Aluno inserido com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar o aluno ao banco de dados\n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void alterar(Aluno aluno) {
        String sql = "UPDATE alunos SET nome = ?, idade = ?, email = ? WHERE mat = ?; ";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setString(3, aluno.getEmail());
            stmt.setInt(4, aluno.getMat());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Aluno Alterado com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o cadastro do aluno. \n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void remover(int mat) {
        String sql = "DELETE FROM alunos WHERE mat = ?; ";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, mat);

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Aluno deletado com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar o cadastro do aluno. \n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Aluno> consultar(int mat){
        String sql = "SELECT mat as Matricula, nome as Nome FROM alunos WHERE mat = ?;";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Aluno> alunos = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, mat);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Aluno a = new Aluno();
                a.setMat(rs.getInt("Matricula"));
                a.setNome(rs.getString("Nome"));
                alunos.add(a);
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao consultar o cadastro do aluno. \n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return alunos;
    }
    public List<Aluno> listar(){
        String sql = "SELECT mat as Matricula, nome as Nome, idade as Idade, email as Email FROM alunos;";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Aluno> alunos = new ArrayList<>();
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Aluno a = new Aluno();
                a.setMat(rs.getInt(1));
                a.setNome(rs.getString(2));
                 a.setIdade(rs.getInt(3));
                a.setEmail(rs.getString(4));
                alunos.add(a);
            }
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao consultar o cadastro do aluno. \n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return alunos;
    }
    
}
