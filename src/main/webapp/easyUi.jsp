<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/10/11
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="easyUI/css/demo.css">
    <script src="js/jquery-1.8.3.js" type="text/javascript" language="JavaScript"></script>
    <!--jquery.easyui.min.js包含了easyUI中的所有插件-->
    <script src="js/jquery.easyui.min.js" type="text/javascript" language="JavaScript"></script>
    <script language="JavaScript">
        $(function () {
            $("#but1").click(function () {
                $('#dg').datagrid({
                    url:'getEmpData',
                    pagination:true,
                    columns:[[
                        {field:'eid',title:'编号',width:100},
                        {field:'ename',title:'姓名',width:100},
                        {field:'esex',title:'性别',width:100},
                        {field:'estartime',title:'时间',width:100,
                            formatter: function(value,row,index){
                                var d=new Date(value);
                                var text=d.getFullYear()+"年"+(d.getMonth()+1)+"月"+d.getDay()+"日";
                                return text;
                            }
                        },
                        {field:'epay',title:'工资',width:100},
                        {field:'price',title:'Price',width:100,align:'right'}
                    ]]
                });
            })
        })
    </script>
</head>
<body>
<input type="button" value="显示员工信息" id="but1">
<table id="dg"></table>
</body>
</html>
