package com.dao;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.bean.Student;

public class StudentDaoTest {

	static SqlSessionFactory sessionFac;
	static Reader reader;
	static SqlSession session;

	public static void testSaveStudent() {
		session = sessionFac.openSession();
		StudentDao dao = session.getMapper(StudentDao.class);
		Student student = new Student("admin4");
		int code = dao.saveStudent(student);
		// assertEquals(1, code);
	}

	@Test
	public static void findStudentBySid() {
		session = sessionFac.openSession();
		StudentDao dao = session.getMapper(StudentDao.class);
		Student stu = dao.findStudentBySid(1);
		if (stu == null) {
			fail("Not yet implemented");
		} else {
			System.out.println(stu.toString());
		}
	}

	@Test
	public void deleteStudentBySid(int sid) {
		session = sessionFac.openSession();
		StudentDao dao = session.getMapper(StudentDao.class);
		int code = dao.deleteStudentBySid(2);
		assertEquals(1, code);
	}

	static {
		try {
			reader = Resources.getResourceAsReader("Configuration.xml");
			sessionFac = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			fail("Not yet implemented");
		}
	}

	public static void updateStudentInfo() {
		session = sessionFac.openSession();
		StudentDao dao = session.getMapper(StudentDao.class);
		Student sutdent = new Student();
		sutdent.setSid(1);
		sutdent.setName("Íõ·Æ");
		int code = dao.updateStudentBySid(sutdent);
		System.out.println(code == 0 ? "fail !" : "success!");
	}

	public static void main(String[] args) {
		// session = sessionFac.openSession();
		// StudentDao dao = session.getMapper(StudentDao.class);
		// int code = dao.deleteStudentBySid(3);
		// System.out.println("code: " + code);
		// testSaveStudent();
		updateStudentInfo();
		findStudentBySid();
	}
}
