import br.edu.fatec.franca.Assistente;
import br.edu.fatec.franca.Diretor;
import br.edu.fatec.franca.Funcionario;
import br.edu.fatec.franca.Gerente;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void calculaFolhaPgto(List<Funcionario> funcionarios){
        float soma = 0;
        for(Funcionario funcionario : funcionarios) {
            soma += funcionario.calculaSalario();
        }
        System.out.println("O total da folha é " + soma);
    }

    public static void polimorfismo(Funcionario funcionario){ // Polimorfismo recebe os parametros da superclasse
        System.out.println(funcionario.toString());
    }
    public static void main(String[] args) {
        Assistente ass1 = new Assistente("Pedro ", "Franca ", "123456789-0 ", 3000.00f, 8f);
        polimorfismo(ass1);

        Gerente gen1 = new Gerente("Paulo ", "Cristais ", "987654321-0 ", 5000.00f, 3000f);
        polimorfismo(gen1);

        Diretor dir1 = new Diretor("Marcos ", "Rifaina ", "321654987-5 ", 8000, 1000);
        polimorfismo(dir1);

        List<Funcionario> Funcs = new ArrayList<Funcionario>();
        Funcs.add(ass1);
        Funcs.add(gen1);
        Funcs.add(dir1);
        calculaFolhaPgto(Funcs);
    }
}