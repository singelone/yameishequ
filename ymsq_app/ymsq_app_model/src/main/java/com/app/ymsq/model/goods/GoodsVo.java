package com.app.ymsq.model.goods;

import java.math.BigDecimal;

public class GoodsVo {

    private Integer goodsId;

    private String goodsNo;

    /**
     * 商品分类id
     */
    private Integer goodsCategory;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品销售价格
     */
    private BigDecimal sellPrice;

    /**
     * 销量
     */
    private Long salesNum;

    /**
     * 库存
     */
    private Integer stockNum;

    /**
     * 父id
     */
    private Integer pid;

    /**
     * 商品类型 1超市商品  2超市租赁  3快递取件  4快递寄件 5净水器租赁  6空气进化租赁
     */
    private Byte goodsType;

    private Integer rangeAge;

    /**
     * 商品品牌
     */
    private String brand;

    /**
     * 商家id
     */
    private Integer sellerId;

    /**
     * 商品促销id
     */
    private Integer goodsSalesSpec;
    private String categoryName;
    private String sellerNo;
    private String sellerName;
    private String sellerType;


}
