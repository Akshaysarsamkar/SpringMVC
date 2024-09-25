package Dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import model.Order;

@Repository
public class orderDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveorder(Order order) {
		return (int) hibernateTemplate.save(order);

	}

}
