/**
 * Informações do desenvolvedor:
 * Dev: Leandro Shiniti Tacara
 * Email: leandro.tacara@hotmail.com
 * Github: https://github.com/Lehhh
 * Linkedin: https://www.linkedin.com/in/leandro-shiniti-tacara/
 * Data: 12/06/2020 19:18
 * projeto: Curso
 */

package br.com.leandro.springboot.thymeleaf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CARGO")
public class Cargo extends AbstractEntity<Long> {

    @Column(name="nome", nullable = false, unique = true, length = 60)
    private String nome;
    @ManyToOne @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;
    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;
}
