package com.home.gotravel.dao.impl;

import com.home.gotravel.dao.SellerDao;
import com.home.gotravel.domain.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("sellerDao")
public class SellerDaoImpl implements SellerDao {

    @Autowired
    private JdbcTemplate template;



    @Override
    public Seller findById(int id) {

        String sql = "select * from tab_seller where sid = ? ";
        return template.queryForObject(sql,new BeanPropertyRowMapper<Seller>(Seller.class),id);
    }
}
