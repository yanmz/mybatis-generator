package com.itheima.shop.mapper;

import com.itheima.shop.pojo.TradeGoods;
import com.itheima.shop.pojo.TradeGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeGoodsMapper {
    int countByExample(TradeGoodsExample example);

    int deleteByExample(TradeGoodsExample example);

    int deleteByPrimaryKey(Long goodsId);

    int insert(TradeGoods record);

    int insertSelective(TradeGoods record);

    List<TradeGoods> selectByExample(TradeGoodsExample example);

    TradeGoods selectByPrimaryKey(Long goodsId);

    int updateByExampleSelective(@Param("record") TradeGoods record, @Param("example") TradeGoodsExample example);

    int updateByExample(@Param("record") TradeGoods record, @Param("example") TradeGoodsExample example);

    int updateByPrimaryKeySelective(TradeGoods record);

    int updateByPrimaryKey(TradeGoods record);
}