import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArq {

    public static void main(String[] args) {

        String nomeArquivo = "pedidos.csv";
        String separador = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {

            String linha;

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(separador);

                // Verifica se a linha lida tem pelo menos dois valores
                if (dados.length >= 2) {
                    System.out.println("Cliente: " + dados[0] + ", Data do Pedido: " + dados[1]);
                } else {
                    System.out.println("Linha inválida: " + linha);
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

    }
}
