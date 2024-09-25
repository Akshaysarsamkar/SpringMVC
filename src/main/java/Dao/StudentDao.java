package Dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import model.Student;

@Repository
public class StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveStudent(Student student) {

		int save = (Integer) this.hibernateTemplate.save(student);
		return save;
	}

}
