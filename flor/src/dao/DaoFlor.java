/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Flor;

public class DaoFlor {
        public static boolean inserir(Flor objeto) {
        String sql = "INSERT INTO flor (ano, nomepopular, nomecientifico, tamanhodapetala, tamanhodasepala) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getAno());
            ps.setString(2, objeto.getNomepopular());
            ps.setString(3, objeto.getNomecientifico());
            ps.setDouble(4, objeto.getTamanhodapetala());
            ps.setDouble(5, objeto.getTamanhodasepala());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
         public static void main(String[] args) {
        Flor objeto = new Flor();
        objeto.setAno(2018);
        objeto.setNomepopular("Hortência");
        objeto.setNomecientifico("Hydrangea");
        objeto.setTamanhodapetala(4.2);
        objeto.setTamanhodasepala(2.1);
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
