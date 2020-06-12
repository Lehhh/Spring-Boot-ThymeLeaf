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

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Getter @Setter
    private ID id;
}
