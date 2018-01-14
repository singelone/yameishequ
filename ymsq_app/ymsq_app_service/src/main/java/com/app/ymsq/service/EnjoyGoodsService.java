package com.app.ymsq.service;

import com.app.ymsq.model.goods.Goods;

import java.util.List;

public interface EnjoyGoodsService {
    List<Goods> getGoods (Goods goods);

    Goods getGoodsByPrimaryKey(Goods goods);
}
