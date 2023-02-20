package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima com a mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Saitama";
        String endereco = "Cidade Z";
        double salario = 3700.77;
        String dataRecebimentoSalario = "19/02/2023";
        String assinaturaRecebedorDePagamento = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario;
        System.out.println(assinaturaRecebedorDePagamento);
    }
}
