package cn.kgc.controller;

import cn.kgc.domain.Emp;
import cn.kgc.service.EmpService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/showEmp")
    public String getAllEmp(Model model){
        List<Emp> list = empService.getAllEmp();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/getEmpData")
    @ResponseBody
    public List<Emp> getAllEmp(){
        List<Emp> list = empService.getAllEmp();
        return list;
    }

    //分页查询
    @RequestMapping("/getByEmpPage")
    @ResponseBody
    public Map<String,Object> getByEmpPage(Integer page,Integer rows){
        PageInfo<Emp> empPage = empService.getByEmpPage(page, rows);
        //当前页的数据
        List<Emp> list = empPage.getList();
        //总记录数
        long total = empPage.getTotal();
        Map<String,Object> map=new HashMap<>();
        map.put("rows",list);
        map.put("total",total);
        return map;
    }
}
