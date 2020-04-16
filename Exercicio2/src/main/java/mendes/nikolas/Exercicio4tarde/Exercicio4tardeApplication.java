package mendes.nikolas.Exercicio4tarde;

import mendes.nikolas.Exercicio4tarde.model.Aluno;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio4tardeApplication {

	public static void main(String[] args) {

		SpringApplication.run(Exercicio4tardeApplication.class, args);

		Aluno aluno = new Aluno();

		aluno.setNota1(6.5);
		aluno.setNota2(9);
		aluno.mediaAritmetica();

		System.out.println("\f");
		System.out.println(aluno.toString());
	}
}
