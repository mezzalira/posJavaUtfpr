package br.edu.utfpr.aulaVraptor.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.edu.utfpr.aulaVraptor.model.Cliente;

@Stateless
public class ClienteDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void save(Cliente cliente) {
		em.persist(cliente);
	}

	public List<Cliente> listAll() {
		return em.createQuery("select o from Cliente o", Cliente.class).getResultList();
	}

	public Cliente load(Long codigo) {
		TypedQuery<Cliente> query = em.createQuery("select o from Cliente o where o.codigo=:codigo", Cliente.class);
		query.setParameter("codigo", codigo);
		return query.getSingleResult();
	}
	
	
}
