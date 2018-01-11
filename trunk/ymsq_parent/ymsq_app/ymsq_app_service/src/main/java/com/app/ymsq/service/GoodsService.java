package com.app.ymsq.service;

import com.app.ymsq.model.goods.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> getEnjoinGoods (Goods goods);

    Goods getGoodsByPrimaryKey(Goods goods);

    int addGoods(Goods goods);
}
