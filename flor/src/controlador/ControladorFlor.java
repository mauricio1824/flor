/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoFlor;
import javax.swing.JOptionPane;
import modelo.Flor;
import tela.manutencao.ManutencaoFlor;

public class ControladorFlor {
   public static void inserir(ManutencaoFlor man){
        Flor objeto = new Flor();
        objeto.setAno(Integer.parseInt(man.jtfAno.getText()));
        objeto.setNomepopular(man.jtfNomePopular.getText());
        objeto.setNomecientifico(man.jtfNomeCientifico.getText());
        objeto.setTamanhodapetala(Double.parseDouble(man.jtfTamanhodaPetala.getText()));
        objeto.setTamanhodasepala(Double.parseDouble(man.jtfTamanhodaSepala.getText()));
        boolean resultado = DaoFlor.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
  public static void alterar(ManutencaoFlor man){
        Flor objeto = new Flor();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setAno(Integer.parseInt(man.jtfAno.getText()));
        objeto.setNomepopular(man.jtfNomePopular.getText());
        objeto.setNomecientifico(man.jtfNomeCientifico.getText());
        objeto.setTamanhodapetala(Double.parseDouble(man.jtfTamanhodaPetala.getText()));
        objeto.setTamanhodasepala(Double.parseDouble(man.jtfTamanhodaSepala.getText()));
        boolean resultado = DaoFlor.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
