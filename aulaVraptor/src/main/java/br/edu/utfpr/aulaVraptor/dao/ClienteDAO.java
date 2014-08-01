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
	
	public void inserir(Cliente cliente) {
		em.persist(cliente);
	}
	
	public void alterar(Cliente cliente) {
		em.merge(cliente);
	}
	
	public void remover(Long codigo) {
		em.remove(em.getReference(Cliente.class, codigo));
	}

	public List<Cliente> listAll() {
		return em.createQuery("select o from Cliente o", Cliente.class).getResultList();
	}

	public Cliente load(Long codigo) {
		TypedQuery<Cliente> query = em.createQuery("select o from Cliente o where o.codigo=:codigo", Cliente.class);
		query.setParameter("codigo", codigo);
		return query.getSingleResult();
	}

	public List<Cliente> list(String nome) {
		TypedQuery<Cliente> query = em.createQuery("select o from Cliente o where o.nome like :nome", Cliente.class);
		query.setParameter("nome", "%"+nome+"%");
		return query.getResultList();
	}
	
	
}
