package com.dao;

import com.bean.Student;

public interface StudentDao {
	// 录入信息
	public int saveStudent(Student student);

	// 根据sid 查找学生信息
	public Student findStudentBySid(int sid);

	// 根据sid 删除学生信息
	public int deleteStudentBySid(int sid);

	// 根据sid 修改学生星系
	public int updateStudentBySid(Student student);
}
