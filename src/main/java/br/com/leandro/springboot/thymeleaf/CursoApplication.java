/**
 * Informações do desenvolvedor:
 * Dev: Leandro Shiniti Tacara
 * Email: leandro.tacara@hotmail.com
 * Github: https://github.com/Lehhh
 * Linkedin: https://www.linkedin.com/in/leandro-shiniti-tacara/
 * Data: 12/06/2020 19:18
 * projeto: Curso
 */

package br.com.leandro.springboot.thymeleaf;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println();
	}
}
