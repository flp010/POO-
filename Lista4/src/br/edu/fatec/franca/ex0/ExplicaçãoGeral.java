package br.edu.fatec.franca.ex0;

public class ExplicaçãoGeral {

    // Java é uma linguagem orientada a objetos que utiliza diversos conceitos essenciais
// Vamos abordar alguns dos principais conceitos, desde os básicos até os avançados como polimorfismo

// 1. Estrutura Básica de um Programa Java
// Um programa Java começa com a definição de uma classe e o ponto de entrada é o método main

    /*public class Main {
        public static void main(String[] args) {
            // Exibe uma mensagem no console
            System.out.println("Olá, mundo!");
        }
    }*/

// 2. Classes e Objetos
// Classes são modelos para criar objetos. Um objeto é uma instância de uma classe

    /*public class Pessoa {
        // Atributos da classe
        String nome;
        int idade;

        // Construtor para inicializar atributos
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        // Método da classe que imprime uma saudação
        public void saudacao() {
            System.out.println("Olá, meu nome é " + nome + " e eu tenho " + idade + " anos.");
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Criação de um objeto do tipo Pessoa
            Pessoa p1 = new Pessoa("Carlos", 30);
            // Chamando o método saudacao
            p1.saudacao();
        }
    }*/

// 3. Herança
// Herança permite que uma classe herde propriedades e métodos de outra classe

/*    public class Funcionario {
        // Atributos comuns a todos os funcionários
        protected String nome;
        protected float salario;

        // Construtor que inicializa nome e salário
        public Funcionario(String nome, float salario) {
            this.nome = nome;
            this.salario = salario;
        }

        // Método para calcular o salário
        public float calculaSalario() {
            return this.salario;
        }
    }

    // Classe Gerente que herda de Funcionario
    public class Gerente extends Funcionario {
        // Atributo exclusivo de Gerente
        private float bonus;

        // Construtor da classe Gerente que chama o construtor da superclasse
        public Gerente(String nome, float salario, float bonus) {
            super(nome, salario);  // super se refere à superclasse (Funcionario)
            this.bonus = bonus;
        }

        // Sobrescrita do método calculaSalario para incluir o bônus
        @Override
        public float calculaSalario() {
            return super.calculaSalario() + this.bonus;
        }
    }*/

// 4. Polimorfismo
// Polimorfismo permite tratar objetos de diferentes subclasses como se fossem da superclasse,
// mas utilizando o comportamento específico de cada subclasse

    /*public class Main {
        // Método que utiliza polimorfismo, aceitando qualquer objeto do tipo Funcionario
        public static void polimorfismo(Funcionario funcionario) {
            // O método calculaSalario será chamado com base na subclasse real do objeto
            System.out.println("Salário: " + funcionario.calculaSalario());
        }

        public static void main(String[] args) {
            // Criando um objeto do tipo Gerente
            Funcionario gerente = new Gerente("Paulo", 5000.0f, 1000.0f);
            // Chamando o método polimorfismo, que usará a implementação de Gerente
            polimorfismo(gerente);
        }
    }*/

// 5. Sobrescrita de Métodos (Override)
// Sobrescrever um método significa redefinir o comportamento de um método herdado de uma superclasse

 /*   @Override
    public float calculaSalario() {
        return this.salario + this.bonus;
    }*/

// @Override indica que o método da subclasse está substituindo a implementação herdada da superclasse

// 6. Listas e Iteração (Coleções)
// Em Java, coleções são usadas para armazenar grupos de objetos. A interface List e a classe ArrayList são comuns

  /*  List<Funcionario> Funcs = new ArrayList<Funcionario>();  // Criação de uma lista de funcionários
Funcs.add(new Gerente("Paulo", 5000.0f, 1000.0f));  // Adicionando um Gerente à lista
Funcs.add(new Assistente("João", 3000.0f, 200.0f));  // Adicionando um Assistente à lista

// Iterando sobre a lista de funcionários e calculando seus salários
for (Funcionario func : Funcs) {
        System.out.println(func.calculaSalario());
    }*/

    // 7. Cálculo da Folha de Pagamento com Polimorfismo
// Este método percorre uma lista de funcionários e calcula o salário total de cada um

    /*   public static void calculaFolhaPgto(List<Funcionario> funcionarios) {
        float soma = 0;  // Variável que armazenará a soma dos salários
        for (Funcionario funcionario : funcionarios) {
            // Chama o método calculaSalario de cada objeto na lista, utilizando polimorfismo
            soma += funcionario.calculaSalario();
        }
        // Exibe o total da folha de pagamento
        System.out.println("Total da folha de pagamento: " + soma);
    }*/

// 8. Boas Práticas para Aprendizado
// - Praticar com exemplos simples e entender a estrutura do código
// - Revisar conceitos de herança, polimorfismo e sobrescrita constantemente
// - Modificar e expandir exemplos existentes para fixar o aprendizado



}