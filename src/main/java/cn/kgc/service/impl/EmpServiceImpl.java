package cn.kgc.service.impl;

import cn.kgc.domain.Emp;
import cn.kgc.mapper.EmpMapper;
import cn.kgc.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageInfo<Emp> getByEmpPage(int curPage, int pageSize) {
        //开启分页
        PageHelper.startPage(curPage,pageSize);
        List<Emp> list = empMapper.queryAllEmp();
        PageInfo<Emp> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<Emp> getAllEmp() {

        return empMapper.queryAllEmp();
    }
}
