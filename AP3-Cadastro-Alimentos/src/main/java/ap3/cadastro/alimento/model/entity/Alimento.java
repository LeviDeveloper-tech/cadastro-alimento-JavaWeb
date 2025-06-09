package ap3.cadastro.alimento.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cadastro_alimento" )
public class Alimento {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alimento")
	private Integer idAlimento;
	@Column(name="nome_alimento", length = 255, nullable = false)
	private String nomeAlimento;
	@Column(name="data_validade", nullable = false)
	private Date dataValidade;
	@Column(name="tipo_alimento", nullable = false)
	private String tipoAlimento; 

	
	public Integer getIdAlimento() {
		return idAlimento;
	}
	public void setIdAlimento(Integer idAlimento) {
		this.idAlimento = idAlimento;
	}
	public String getNomeAlimento() {
		return nomeAlimento;
	}
	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	public String getTipoAlimento() {
		return tipoAlimento;
	}
	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}
	

}
