package com.home.gotravel.web.servlet;

import com.home.gotravel.domain.Category;
import com.home.gotravel.service.CategoryService;
import com.home.gotravel.service.impl.CategoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/category/*")
public class CategoryServlet extends BaseServlet {

    private CategoryService service = ac.getBean("categoryService",CategoryService.class);

    /**
     * 查询所有
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(service);
        //1.调用service查询所有
        List<Category> cs = service.findAll();
        //2.序列化json返回
       writeValue(cs,response);

    }

}
