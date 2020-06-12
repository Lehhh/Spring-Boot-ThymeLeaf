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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name= "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{
    @Column(name="nome", nullable = false, unique = true, length = 60)
    private String nome;
    @OneToMany(mappedBy = "departamento")
    private List<Cargo> cargo;
}
