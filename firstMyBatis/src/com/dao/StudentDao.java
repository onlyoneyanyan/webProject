package com.dao;

import com.bean.Student;

public interface StudentDao {
	// ¼����Ϣ
	public int saveStudent(Student student);

	// ����sid ����ѧ����Ϣ
	public Student findStudentBySid(int sid);

	// ����sid ɾ��ѧ����Ϣ
	public int deleteStudentBySid(int sid);

	// ����sid �޸�ѧ����ϵ
	public int updateStudentBySid(Student student);
}
