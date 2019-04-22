package com.ryh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ryh.bean.Student;

@Repository
public interface StudentMapper {

//	@Select("SELECT * FROM STUDENT") 
	public List<Student> findAll();
	
	public void updateSt(Student st);
	
	public void deleteSt(String ids);
	
	public void addSt(Student st);
	
	public List<Object> fetchSt(@Param("onset")Integer onset, @Param("page_size")Integer page_size);
	
}
