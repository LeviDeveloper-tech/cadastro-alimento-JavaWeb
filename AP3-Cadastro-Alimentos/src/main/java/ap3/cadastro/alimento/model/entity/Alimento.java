package ap3.cadastro.alimento.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alimento {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAlimento;
	@Column(length = 15, nullable = false)
	private String nomeAlimento;
	@Column(nullable = false)
	private Date dataValidade;
	@Column(nullable = false)
	private String tipoAlimento; //verdura, fruta, laticínio. 

	
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
