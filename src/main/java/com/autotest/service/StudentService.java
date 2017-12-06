package com.autotest.service;

import com.autotest.model.Student;
import com.autotest.dao.student.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yu on 17/12/5.
 */
@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;


	public StudentDao getStudentDao(){
		return this.studentDao;
	}

	public  void insertStudent(){
		Student student = new Student();
		student.setId(333);
		student.setName("名啊");
		student.setAge("19");
		studentDao.insert(student);
	}
}