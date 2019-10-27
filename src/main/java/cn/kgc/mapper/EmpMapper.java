package cn.kgc.mapper;

import cn.kgc.domain.Emp;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmpMapper {
    @Select("select * from emp")
    List<Emp> queryAllEmp();
}
