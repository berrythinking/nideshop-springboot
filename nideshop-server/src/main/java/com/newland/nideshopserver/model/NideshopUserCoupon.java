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
@Table(name = "nideshop_user_coupon")
public class NideshopUserCoupon {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private Byte couponId;
    private String couponNumber;
    private Integer userId;
    private Integer usedTime;
    private Integer orderId;

}
