package com.st.springbootmybatis.controller;

import com.st.springbootmybatis.bean.Department;
import com.st.springbootmybatis.bean.Employee;
import com.st.springbootmybatis.mapper.DepartmentMapper;
import com.st.springbootmybatis.mapper.EmpMapper;
import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class testController {
    @Resource
    private DepartmentMapper departmentMapper;
    @Resource
    private EmpMapper empMapper;
    @GetMapping("/dept/{id}")
    public Department test(@PathVariable("id") Integer id){
        return departmentMapper.getDepartment(id);
    }
    @GetMapping("/dept")
    public Department insertDept(Department department){
        System.out.println(department.getDepartmentName());
        departmentMapper.insertDept(department);
        System.out.println(1);
        return department;
    }
    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id")Integer id){
        return empMapper.getEmpById(id);
    }
    @GetMapping("/emp")
    public Employee insertEmp(Employee employee){
        empMapper.InsertEmp(employee);
        System.out.println(3);
        return employee;
    }

}
