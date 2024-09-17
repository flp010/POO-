package br.edu.fatec.franca.ex0.teste;
import br.edu.fatec.franca.ex0.Assistente;
import br.edu.fatec.franca.ex0.Diretor;
import br.edu.fatec.franca.ex0.Funcionario;
import br.edu.fatec.franca.ex0.Gerente;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // Método para calcular a folha de pagamento de uma lista de funcionários
    public static void calculaFolhaPgto(List<Funcionario> funcionarios) {
        // O parâmetro 'funcionarios' é uma lista do tipo Funcionario.
        // List é uma interface Java que define um tipo de estrutura de dados similar a um vetor (array),
        // mas com algumas diferenças importantes: List é uma coleção dinâmica, ou seja, seu tamanho pode crescer
        // e diminuir dinamicamente, ao contrário de um array fixo.

        // A classe List é tipada para o tipo Funcionario, o que significa que só pode armazenar objetos
        // que sejam instâncias de Funcionario ou suas subclasses (Diretor, Gerente, Assistente, etc.).
        // Isso é possível porque todas essas classes herdam de Funcionario, utilizando o conceito de polimorfismo.
        float soma = 0; // Variável para acumular a soma total dos salários de todos os funcionários.
        // O loop for-each percorre cada elemento da lista 'funcionarios'.
        // O tipo de cada elemento é Funcionario, mas como Diretor, Gerente e Assistente
        // também são subclasses de Funcionario, o polimorfismo entra em ação aqui.
        // Embora o tipo declarado do objeto seja Funcionario, o Java irá chamar automaticamente
        // o método `calculaSalario()` da classe correta (seja Diretor, Gerente ou Assistente).
        for (Funcionario funcionario : funcionarios) {
            // Aqui é onde o polimorfismo acontece. O método `calculaSalario` foi sobrescrito (override) em
            // várias subclasses (Diretor, Gerente, Assistente). Dependendo do tipo real do objeto (Diretor,
            // Gerente, Assistente), o método sobrescrito específico será invocado.
            // Mesmo que o tipo declarado seja Funcionario, o Java chama o método da classe correspondente.
            soma += funcionario.calculaSalario();
            // A expressão acima adiciona o resultado do método `calculaSalario` do funcionário atual à variável 'soma'.
            // Por exemplo, se o 'funcionario' for um Diretor, o método sobrescrito na classe Diretor será chamado,
            // que inclui o salário base mais o valor das ações. Se for um Assistente, será chamado o método da classe
            // Assistente, que considera as horas extras.
        }
        // Após o loop, o total acumulado da folha de pagamento é impresso.
        System.out.println("O total da folha é " + soma);
    }

    // Método para exibir informações de um funcionário (polimorfismo)
    public static void polimorfismo(Funcionario funcionario) {
        System.out.println(funcionario.toString()); // Chama o método toString do objeto, pode ser de qualquer classe
    }

    public static void main(String[] args) {

        // Criação de objetos das classes filhas
        Assistente ass1 = new Assistente("Pedro ", "Franca ", "123456789-0 ", 3000.00f, 8f);
        polimorfismo(ass1); // Exibe informações do Assistente

        Gerente gen1 = new Gerente("Paulo ", "Cristais ", "987654321-0 ", 5000.00f, 3000f);
        polimorfismo(gen1); // Exibe informações do Gerente

        Diretor dir1 = new Diretor("Marcos ", "Rifaina ", "321654987-5 ", 8000, 1000);
        polimorfismo(dir1); // Exibe informações do Diretor

        // Cria uma lista que armazenará objetos do tipo Funcionario
        // O List<Funcionario> é uma lista polimórfica que pode armazenar qualquer objeto que seja ou herde de Funcionario
        List<Funcionario> Funcs = new ArrayList<Funcionario>();
        // Adiciona à lista o objeto 'ass1', que é uma instância da classe Assistente (que herda de Funcionario)
        Funcs.add(ass1);
        // Adiciona à lista o objeto 'gen1', que é uma instância da classe Gerente (que herda de Funcionario)
        Funcs.add(gen1);
        // Adiciona à lista o objeto 'dir1', que é uma instância da classe Diretor (que herda de Funcionario)
        Funcs.add(dir1);
        // Chama o método calculaFolhaPgto, passando a lista Funcs como parâmetro
        // Este método vai iterar sobre todos os objetos da lista e somar os salários (usando polimorfismo)
        // O polimorfismo permite que o método calculaSalario seja chamado de acordo com o tipo real de cada objeto (Assistente, Gerente ou Diretor)
        calculaFolhaPgto(Funcs); // Calcula e imprime o total da folha de pagamento

    }
}