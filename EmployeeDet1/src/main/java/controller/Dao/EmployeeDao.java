package controller.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import controller.model.Product;

@Component
public class EmployeeDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional

	public void createEmployee(Product product) {
		this.hibernateTemplate.save(product);
	}
     
	public List<Product> getProduct() {
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}

	@Transactional
	public void deleteId(int eid) {
		Product p = this.hibernateTemplate.load(Product.class, eid);
		this.hibernateTemplate.delete(p);
	}

	public void getSingle(int eid) {
		this.hibernateTemplate.get(Product.class, eid);
	}

}
