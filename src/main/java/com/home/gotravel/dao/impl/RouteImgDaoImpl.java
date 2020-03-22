package com.home.gotravel.dao.impl;

import com.home.gotravel.dao.RouteImgDao;
import com.home.gotravel.domain.RouteImg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("routeImgDao")
public class RouteImgDaoImpl implements RouteImgDao {

    @Autowired
    private JdbcTemplate template;


    @Override
    public List<RouteImg> findByRid(int rid) {
        String sql = "select * from tab_route_img where rid = ? ";
        return template.query(sql,new BeanPropertyRowMapper<RouteImg>(RouteImg.class),rid);
    }
}
