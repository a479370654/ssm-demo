package cn.kgc.service;


import cn.kgc.domain.Emp;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmpService {

    List<Emp> getAllEmp();

    PageInfo<Emp> getByEmpPage(int curPage, int pageSize);
}
