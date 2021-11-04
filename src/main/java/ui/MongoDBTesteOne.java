package ui;

import data.MongoDBConnection;
import model.Aluno;

public class MongoDBTesteOne {
    public static void main(String[] args) {
        MongoDBConnection c = new MongoDBConnection();

        c.insertAluno(new Aluno("Fabricio Silva",
                "Sistemas de informação",
                202102));

        c.insertAluno(new Aluno("João",
                "Sistemas de informação",
                202102));

        c.insertAluno(new Aluno("Maria",
                "Tecnólogo em análise e desenvolvimento de sistemas",
                202102));

        c.insertAlunoComCpf(new Aluno("Maria Silva",
                "Tecnólogo em análise e desenvolvimento de sistemas",
                202102,
                "123456789-00"));

        c.showAlunos();
    }
}
