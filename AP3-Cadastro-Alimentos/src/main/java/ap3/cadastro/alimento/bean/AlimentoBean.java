package ap3.cadastro.alimento.bean;


import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import ap3.cadastro.alimento.model.dao.AlimentoDAO;
import ap3.cadastro.alimento.model.entity.Alimento;

@ManagedBean
@ViewScoped
public class AlimentoBean {
	
		private Alimento alimento = new Alimento();
		private List<Alimento> listaAlimentos;
		
		public void salvar() {
			AlimentoDAO.salvar(alimento);
			FacesMessage mensagem = new FacesMessage("Alimento salvo com sucesso!");
			FacesContext.getCurrentInstance().addMessage(null, mensagem);
			alimento = new Alimento();
		}
		
		public void remover(Alimento alimento) {
			AlimentoDAO.remover(alimento);
			listaAlimentos = null;
			FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O alimento foi removido.");
			FacesContext.getCurrentInstance().addMessage(null, mensagem);
			
		}
		
		public void infoAlimento(Alimento alimento) {
			String informacoes ="<br/>" + "<br/>" +
					"ID do Alimento: " + alimento.getIdAlimento() + "<br/>" +
					"Nome do Alimento: " + alimento.getNomeAlimento() + "<br/>" +
					"Tipo do Alimento: " + alimento.getTipoAlimento() + "<br/>" +
					"Data de válidade: " + alimento.getDataValidade();
			
			FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO, "Informações do alimento", informacoes);
			FacesContext.getCurrentInstance().addMessage(null, mensagem);
		}
			
		
		public Alimento getAlimento() {
			return alimento;
		}

		public void setAlimento(Alimento alimento) {
			this.alimento = alimento;
		}

		public List<Alimento> getListaAlimentos() {
			if(listaAlimentos == null) {
				listaAlimentos = AlimentoDAO.listarTodos();
			}
			return listaAlimentos;
		}

		public void setListaAlimentos(List<Alimento> listaAlimentos) {
			this.listaAlimentos = listaAlimentos;
		}
		
		
	
}
