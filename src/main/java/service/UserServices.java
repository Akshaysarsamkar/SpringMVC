package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.StudentDao;
import model.Student;

@Service
public class UserServices {

	@Autowired
	private StudentDao dao;

	public int createStudent(Student student) {
		return this.dao.saveStudent(student);
	}
}
