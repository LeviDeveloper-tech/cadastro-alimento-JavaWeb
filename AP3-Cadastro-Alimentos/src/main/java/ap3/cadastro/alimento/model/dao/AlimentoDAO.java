package ap3.cadastro.alimento.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ap3.cadastro.alimento.util.JPAUtil;
import ap3.cadastro.alimentos.entity.Alimento;

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
