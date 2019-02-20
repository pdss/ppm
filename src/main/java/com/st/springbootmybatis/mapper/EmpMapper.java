package com.st.springbootmybatis.mapper;

import com.st.springbootmybatis.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpMapper {
    public Employee getEmpById(Integer id);
    public void InsertEmp(Employee employee);
}
