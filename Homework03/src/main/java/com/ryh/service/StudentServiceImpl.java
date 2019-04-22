package com.ryh.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ryh.bean.Student;
import com.ryh.mapper.StudentMapper;
import com.ryh.service.StudentService;

//@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)  //表示数据库隔离级别为如果当前有就使用当前，如果没有就创建新的事务，隔离级别为：读已提交，也就是数据在写入的时候是无法被读的，只有提交后才能让其他事务读取，防止数据库发生脏读
@Transactional
@Service("StudentService")
public class StudentServiceImpl implements StudentService{

	
	
	@Resource
    private StudentMapper stMapper; //用AutoWired注入DB层
	
    
	@Override
	public List<Student> findAll() {
		// TODO 自动生成的方法存根
		return stMapper.findAll();
	}

	
	@Override
	public void updateSt(Student st) {
		// TODO 自动生成的方法存根
		if(st != null) {
			stMapper.updateSt(st);
		}
		
	}


	@Override
	public void deleteSt(String ids) {
		// TODO 自动生成的方法存根
		if(ids != null) {
			stMapper.deleteSt(ids);
		}
	}


	@Override
	public void addSt(Student st) {
		// TODO 自动生成的方法存根
		if(st != null) {
			stMapper.addSt(st);
		}
	}


	@Override
	public List<Object> fetchSt(Integer onset, Integer page_size) {
		// TODO 自动生成的方法存根
		
		return stMapper.fetchSt(onset, page_size);
		
	}
	
	

}
