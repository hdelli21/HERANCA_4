package MAIN;
import UTILIDADES.FUNCOESUTEIS;

public class MAIN {

    public static void main(String[] args) {
        // Instância da classe FuncoesUteis
        FUNCOESUTEIS funcoes = new FUNCOESUTEIS();

        // Método de soma
        int resultadoSoma = funcoes.somarNumeros(5, 7);
        System.out.println("Resultado da soma: " + resultadoSoma);

        // Método para desenhar o triângulo
        System.out.println("Triângulo de altura 5:");
        funcoes.desenharTriangulo(5);

        // Método para exibir o conteúdo do arquivo
        System.out.println("Conteúdo do arquivo:");
        funcoes.exibirConteudoArquivo("caminho/para/seu/arquivo.txt");
    }
}
