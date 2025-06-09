package ap3.cadastro.alimento.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import ap3.cadastro.alimentos.entity.Alimento;

@ManagedBean
public class AlimentoBean {
	
		private Alimento alimento = new Alimento();
		private List<Alimento> listaAlimentos = new ArrayList();
		
		
	
}
