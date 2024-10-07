package br.edu.fatec.franca.ex1;

    public class Cidade {
        public void contrata(IProfessor p){
            p.ensina();
            p.trabalha();
        }
        //Sobrecarga de metodos
        public void contrata(IEmpregado e) {
            e.trabalha();
        }
        public void cobraDe(IContribuinte c) {
            c.pagarIR();
        }

        public void registra(ICidadao c) {
            c.tiraRg();
        }

        public void alimenta(Animal a ){
            a.come();
        }

    }
