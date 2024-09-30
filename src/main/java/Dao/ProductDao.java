package Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import model.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void addnote(Product product) {
		hibernateTemplate.saveOrUpdate(product);
	}

	public List<Product> getalldata() {
		List<Product> all = hibernateTemplate.loadAll(Product.class);
		System.out.println(all.getClass());
		return all;
	}

	@Transactional
	public void deletedata(int id) {
		Product notes = hibernateTemplate.load(Product.class, id);
		this.hibernateTemplate.delete(notes);
	}

	@Transactional
	public void Update(Product product) {
		hibernateTemplate.update(product);
	}

	public Product getSingledata(int id) {
		Product product = this.hibernateTemplate.get(Product.class, id);
		return product;

	}

}
