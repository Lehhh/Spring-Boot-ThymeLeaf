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

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ENDERECOS")
public class Endereco extends AbstractEntity<Long>{

    @Column(nullable = false)
    private String logradouro;
    @Column(nullable = false)
    private String bairro;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false, length = 2)
    @Enumerated(EnumType.STRING)
    private UF uf;

    private String cep;
    @Column(nullable = false, length = 5)
    private Integer numero;

    private String complemento;
}
