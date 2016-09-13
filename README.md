由于Spring MVC的配置目前还比较混乱，因此本次考试使用的JSP+SERLET实现。<br/>
由于数据库密码可能不同，最后可以在src/main/resource下修改jdbccomfig里的相关信息。<br/>
mvn compile编译程序
由于数据库的Customer表并没有password字段，因此登陆的时候只要FIRST_NAME正确，密码任意便可进入管理系统,但不能为空。<br/>
然后在浏览器中输入http://localhost:8080/JspExam/jsp/index.jsp，然后操作