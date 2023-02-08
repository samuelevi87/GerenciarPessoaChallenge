package com.sl3v1.gerenciarpessoachallenge.endereco;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logradouro;
    private String cep;
    private String numero;
    private String cidade;
    @Enumerated(EnumType.ORDINAL)
    private TipoEndereco tipoEndereco;
    @Column(name = "principal")
    private boolean principal;

    public Endereco(Long id, String logradouro, String cep, String numero, String cidade, TipoEndereco tipoEndereco) {
        this.id = id;
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
        this.tipoEndereco = tipoEndereco;
    }

    public Endereco() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }
    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public boolean isPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", logradouro='" + logradouro + '\'' +
                ", cep='" + cep + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", tipoEndereco=" + tipoEndereco +
                ", principal=" + principal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Endereco endereco = (Endereco) o;

        if (principal != endereco.principal) return false;
        if (!id.equals(endereco.id)) return false;
        if (!Objects.equals(logradouro, endereco.logradouro)) return false;
        if (!Objects.equals(cep, endereco.cep)) return false;
        if (!Objects.equals(numero, endereco.numero)) return false;
        if (!Objects.equals(cidade, endereco.cidade)) return false;
        return tipoEndereco == endereco.tipoEndereco;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (logradouro != null ? logradouro.hashCode() : 0);
        result = 31 * result + (cep != null ? cep.hashCode() : 0);
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        result = 31 * result + (cidade != null ? cidade.hashCode() : 0);
        result = 31 * result + (tipoEndereco != null ? tipoEndereco.hashCode() : 0);
        result = 31 * result + (principal ? 1 : 0);
        return result;
    }
}
