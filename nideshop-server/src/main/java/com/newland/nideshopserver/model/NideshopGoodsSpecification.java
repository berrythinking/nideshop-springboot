package com.newland.nideshopserver.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author xzt
 * @CREATE2019-09-29 12:24
 */
@Getter
@Setter
@ToString
@Table(name = "nideshop_goods_specification")
public class NideshopGoodsSpecification {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private Integer goodsId;
    private Integer specificationId;
    private String value;
    private String picUrl;
    @Transient
    private String name;

}
