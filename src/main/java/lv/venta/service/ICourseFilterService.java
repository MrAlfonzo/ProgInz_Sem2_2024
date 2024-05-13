package lv.venta.service;

import java.util.ArrayList;

import lv.venta.model.Course;

public interface ICourseFilterService {
	
	public abstract ArrayList<Course> selectCoursesByCreditpoints(int creditpoints) throws Exception;
	
	public abstract Course selectCourseByProfessorId(int id) throws Exception;
	
	public abstract ArrayList<Course> selectCourseByStudentId(int id) throws Exception;
	
}
