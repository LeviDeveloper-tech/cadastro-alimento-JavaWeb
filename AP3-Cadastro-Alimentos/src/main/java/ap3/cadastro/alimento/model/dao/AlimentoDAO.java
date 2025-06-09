package ap3.cadastro.alimento.model.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ap3.cadastro.alimento.model.entity.Alimento;
import ap3.cadastro.alimento.util.JPAUtil;

public class AlimentoDAO {
	
	public static void salvar(Alimento alimento) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(alimento);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void remover(Alimento alimento) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		alimento = em.find(Alimento.class, alimento.getIdAlimento());
		em.remove(alimento);
		em.getTransaction().commit();	
		em.close();
	}
	
	public static List<Alimento> listarTodos() {
		EntityManager em = JPAUtil.getEntityManager();
		Query consulta = em.createQuery("select alimento from Alimento alimento");
		List<Alimento> lista = consulta.getResultList();
		em.close();
		
		return  lista;
		
	}
	
}
