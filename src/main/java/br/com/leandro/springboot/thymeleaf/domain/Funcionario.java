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
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long> {
    @Column(nullable = false)
    private String nome;
//    columnDefinition, define como sera o tipo de dado que sera inserido no banco de dados.
    @Column(nullable = false, columnDefinition = ("DECIMAL(7,2) DEFAULT 0.00"))
    private BigDecimal salario;
    @Column(name = "data_entrada", nullable = false, columnDefinition = ("DATE"))
    private LocalDate dataEntrada;
    @Column(name = "data_saida", columnDefinition = ("DATE"))
    private LocalDate data_saida;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id_fk")
    private Endereco endereco;
    @ManyToOne
    @JoinColumn(name= "cargo_id_fk")
    private Cargo cargo;
}
