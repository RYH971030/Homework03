package com.ryh.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ryh.bean.Student;
import com.ryh.mapper.StudentMapper;
import com.ryh.service.StudentService;

//@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)  //��ʾ���ݿ���뼶��Ϊ�����ǰ�о�ʹ�õ�ǰ�����û�оʹ����µ����񣬸��뼶��Ϊ�������ύ��Ҳ����������д���ʱ�����޷������ģ�ֻ���ύ����������������ȡ����ֹ���ݿⷢ�����
@Transactional
@Service("StudentService")
public class StudentServiceImpl implements StudentService{

	
	
	@Resource
    private StudentMapper stMapper; //��AutoWiredע��DB��
	
    
	@Override
	public List<Student> findAll() {
		// TODO �Զ����ɵķ������
		return stMapper.findAll();
	}

	
	@Override
	public void updateSt(Student st) {
		// TODO �Զ����ɵķ������
		if(st != null) {
			stMapper.updateSt(st);
		}
		
	}


	@Override
	public void deleteSt(String ids) {
		// TODO �Զ����ɵķ������
		if(ids != null) {
			stMapper.deleteSt(ids);
		}
	}


	@Override
	public void addSt(Student st) {
		// TODO �Զ����ɵķ������
		if(st != null) {
			stMapper.addSt(st);
		}
	}


	@Override
	public List<Object> fetchSt(Integer onset, Integer page_size) {
		// TODO �Զ����ɵķ������
		
		return stMapper.fetchSt(onset, page_size);
		
	}
	
	

}
