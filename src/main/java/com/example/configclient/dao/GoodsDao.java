package com.example.configclient.dao;

import com.example.configclient.model.vo.Goods;
import com.example.configclient.model.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author helloc
 * @Date 2020/3/2 11:08
 * @Version 1.0
 */
public interface GoodsDao extends JpaRepository<Goods,Integer> {

    @Override
     Goods  save(Goods goods);
}
