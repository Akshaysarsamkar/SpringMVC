package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.orderDao;
import model.Order;

@Service
public class orderService {
	
	@Autowired
	private orderDao dao;
	
	public int createorder(Order order) {
		
		int i = dao.saveorder(order);
		
		return i;
		
	}
	
	
}
