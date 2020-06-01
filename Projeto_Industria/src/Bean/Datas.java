package Bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Datas {

    public String resultado, data_normal;

    DateFormat formatoOriginal = new SimpleDateFormat("dd/MM/yyyy");
    DateFormat formatoBD = new SimpleDateFormat("yyyy-MM-dd");

    // Classe que converte os formatos de datas
    public String data_paraBD() { //Pega a data do dia em que foi clicado no botão pagar conta ou conta recebida
        try {
            Date hoje = new Date(); //Data do clique
            resultado = formatoBD.format(hoje); //Muda para o formato do BD

            return (resultado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de data inválido!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public String data_normal(String data) { //Formato padrão
        try {
            String dataSeparada[];
            dataSeparada = data.split("/");
            String num_ano = dataSeparada[0];
            String num_mes = dataSeparada[1];
            String num_dia = dataSeparada[2];
            
            data_normal =  num_dia+"/"+num_mes+"/"+num_ano;
            
            return (data_normal);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao formatar data!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

}
