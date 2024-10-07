package br.edu.fatec.franca.testa;
import br.edu.fatec.franca.ex1.Cidade;
import br.edu.fatec.franca.ex1.IEmpregado;
import br.edu.fatec.franca.ex1.Pessoa;

public class TestaPessoaCidade {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Cidade cidade = new Cidade();
        cidade.alimenta(pessoa);
        cidade.cobraDe(pessoa);
        cidade.contrata(pessoa);
        cidade.registra(pessoa);
        cidade.contrata((IEmpregado)pessoa);
    }
}
