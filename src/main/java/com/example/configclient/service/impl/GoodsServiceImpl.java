package com.example.configclient.service.impl;

import com.example.configclient.dao.GoodsDao;
import com.example.configclient.dao.UserDao;
import com.example.configclient.model.dto.GoodsDto;
import com.example.configclient.model.vo.Goods;
import com.example.configclient.model.vo.User;
import com.example.configclient.service.GoodsService;
import com.example.configclient.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author helloc
 * @Date 2020/3/2 10:55
 * @Version 1.0
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsDao goodsDao;
    @Override
    public Goods updateGoods(GoodsDto goodsDto) {
        Goods goods =new Goods();
        goods.setGoodsid(goodsDto.getGoodsId());
        goods.setGoodsname(goodsDto.getGoodsName());
        goods.setCount(goodsDto.getCount());
        goods=goodsDao.save(goods);
        return goods;
    }
}
