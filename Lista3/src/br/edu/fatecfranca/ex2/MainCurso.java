package br.edu.fatecfranca.ex2;

        public class MainCurso {
            public static void main(String[] args) {
                Aluno al1 = new Aluno(1, "Paulo", "paulo123");
                Aluno al2 = new Aluno(2, "Pedro", "pedro123");
                Aluno al3 = new Aluno(3, "Maria", "maria123");

                Professor prof1 = new Professor(1, "Carlão", "carlao123");
                Professor prof2 = new Professor(2, "Daniel", "Daniel123");

                Curso curso1 = new Curso(100, "ADS", "Exatas");

                // Criando disciplinas com IDs corretos
                curso1.addDisciplina(1000, "Eng Software", "ESO1", prof1);
                curso1.addDisciplina(2000, "POO", "POOO1", prof2);

                // Adicionando alunos nas disciplinas corretas (com IDs 1000 e 2000)
                curso1.addAluno(1000, al1);
                curso1.addAluno(1000, al2);
                curso1.addAluno(2000, al3);

                System.out.println(curso1.toString());
            }
        }
