package com.st.springbootmybatis.mapper;

import com.st.springbootmybatis.bean.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    public Department getDepartment(Integer id);
    @Delete("delect   form department where id=#{id}")
    public int delectDeptById(Integer id);
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);
    @Update("updata department set departmentName=#{departmentName} where id =#{id}")
    public int updataDept(Department department);
}
