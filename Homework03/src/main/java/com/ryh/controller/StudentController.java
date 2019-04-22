package com.ryh.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ryh.bean.Result;
import com.ryh.bean.Student;
import com.ryh.service.StudentService;

@RequestMapping("students")
@Controller
public class StudentController { 

	@Autowired
    private StudentService stService;
	private Map<String, Object> data = new HashMap<String, Object>();
	private List<Object> list = new ArrayList<Object>();
	/*
	 * @RequestMapping("/stQuery") public String stQuery(Model model) {
	 * 
	 * List<Student>students = stService.findAll(); model.addAttribute("students",
	 * students);
	 * 
	 * return "stQuery";
	 * 
	 * }
	 */
	
    @RequestMapping("stQuery")      
    public Result finadAllS(HttpServletRequest request){        
        
        List<Student> students = stService.findAll(); 
        request.setAttribute("listStudent",students);
             
        Result result = new Result(0,"�ɹ�",data);   
        return result;
    }
    
    @ResponseBody
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Result addSt(Student st) {
    	Result result = null;
    	System.out.println(st.getName());
    	if(st.getName() != null && st.getAge() != 0) {
    		data.put("id", st.getId());
    		stService.addSt(st);
    		result = new Result(0,"�ɹ����ѧ����Ϣ",data);
    	}
    	
    	else if(st.getName() == null){
    		result = new Result(-1,"���ʧ�ܣ���������Ϊ��");
    	}
    	
    	else 
    		result = new Result(-1,"���ʧ�ܣ����䲻��Ϊ��");
    	
    		
		
		return result;
      	
    	
    }
    
    @ResponseBody
    @RequestMapping(value= "fetch", method = RequestMethod.GET)
    public Result fetchSt(@RequestParam("page")Integer page, @RequestParam("page_size")Integer page_size) {
    	Result result = null;
    	int onset = page*page_size;
    	try {
    		list = stService.fetchSt(onset, page_size);
    	    data.put("list", JSON.toJSON(list));
    	    result = new Result(0,"�ɹ���ѯѧ����Ϣ",data);
    	}
    	catch(Exception e){
    		e.printStackTrace();
    		result = new Result(-1,"��ѯʧ��");
    	}
    	
		
		return result;
    	  	
    	
    }
    
    @ResponseBody
    @RequestMapping(value = "update/{student_id}" , method = RequestMethod.POST)
    public Result updateSt(@PathVariable("student_id")Integer id, Student st) {
    	Result result = null;
    	st.setId(id);
    	try {
    		stService.updateSt(st);
    		result = new Result(0,"�ɹ��޸�ѧ����Ϣ");
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		result = new Result(-1,"�޸�ʧ��");
    	}
		
		return result;
    }
    
    
    @ResponseBody
    @RequestMapping(value= "delete", method = RequestMethod.POST)
    public Result deleteSt(@PathVariable("student_ids")String ids) {
    	Result result = null;
    	try {
    		stService.deleteSt(ids);
    		result = new Result(0,"�ɹ�ɾ��ѧ����Ϣ");
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		result = new Result(-1,"ɾ��ʧ��");
    	}
		
		return result;
    	
    }
    
    
    
	
}
