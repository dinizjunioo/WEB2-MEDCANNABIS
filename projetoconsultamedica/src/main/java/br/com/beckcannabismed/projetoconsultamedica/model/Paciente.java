package br.com.beckcannabismed.projetoconsultamedica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Paciente")

public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_paciente;

    @Column
    (length = 50)
    private String name;

    @Column
    (length = 10)
    private String data_nasc;

    @Column
    (length = 50)
    private String endereco;

    @Column
    (length = 12) // 084 996 - 107 - 502
    private String telefone;

    @Column
    (length = 10) // 04 / 05 / 2024
    private String data_admissao;

    public Paciente()
    {

    }

    public Paciente(String name)
    {
        this.name = name;
    }


    public Paciente(String name, String data_nasc, String endereco,  
    String telefone, String data_admissao)
    {
        this.name = name;
        this.data_nasc = data_nasc;
        this.endereco = endereco;
        this.telefone = telefone;
        this.data_admissao = data_admissao;
    }


    public Integer getId() {
        return this.id_paciente;
    }
    public void setId(Integer id) {
        this.id_paciente = id;
    }

    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNasc() {
        return this.data_nasc;
    }
    public void setDataNasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getDateAdmissao() {
        return this.data_admissao;
    }
    public void setDateAdmissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }
    
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString()
    {
        return "Paciente --> [Nome: " + this.name + ", data de nascimento: " 
        + this.data_nasc + ", Endereço: " + this.endereco + ", Telefone: " + this.telefone + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Paciente other = (Paciente) obj;
        if (id_paciente == null) {
            if (other.id_paciente != null)
                return false;
        } else if (!id_paciente.equals(other.id_paciente))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (data_nasc == null) {
            if (other.data_nasc != null)
                return false;
        } else if (!data_nasc.equals(other.data_nasc))
            return false;
        if (endereco == null) {
            if (other.endereco != null)
                return false;
        } else if (!endereco.equals(other.endereco))
            return false;
        if (data_admissao == null) {
            if (other.data_admissao != null)
                return false;
        } else if (!data_admissao.equals(other.data_admissao))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        return true;
    }
}
