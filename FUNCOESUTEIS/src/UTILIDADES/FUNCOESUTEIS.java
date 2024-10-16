package UTILIDADES;

import java.io.BufferedReader; // Importa a classe BufferedReader para leitura eficiente de texto de arquivos.
import java.io.FileReader;     // Importa a classe FileReader para abrir e ler arquivos de texto como uma sequência de caracteres.
import java.io.IOException;     // Importa a classe IOException para tratar possíveis erros durante operações de entrada e saída (I/O).

public class FUNCOESUTEIS {

    // Método para somar dois números
    public int somarNumeros(int numero1, int numero2) {
        return numero1 + numero2;
    }

    // Método para exibir um triângulo de altura definida
    public void desenharTriangulo(int tamanho) {
        for (int i = 1; i <= tamanho; i++) {
            System.out.println("x".repeat(i));
        }
    }
// Método para imprimir o conteúdo de um arquivo
public void exibirConteudoArquivo(String caminhoDoArquivo) {
    try (BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo))) {
        String linha;
        // Lê cada linha do arquivo até que não haja mais linhas
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);  // Imprime cada linha lida do arquivo
        }
    } catch (IOException e) {
        // Captura e trata possíveis erros de leitura do arquivo
        System.out.println("Erro ao ler o arquivo: " + e.getMessage());
    }
}
    }


