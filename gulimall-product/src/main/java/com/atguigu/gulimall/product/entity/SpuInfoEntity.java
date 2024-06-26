package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * spu??Ϣ
 *
 * @author saiyu
 * @email yusai2413@gmail.com
 * @date 2024-06-25 10:59:41
 */
@Data
@TableName("pms_spu_info")
public class SpuInfoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ??Ʒid
     */
    @TableId
    private Long id;
    /**
     * ??Ʒ???
     */
    private String spuName;
    /**
     * ??Ʒ????
     */
    private String spuDescription;
    /**
     * ????????id
     */
    private Long catalogId;
    /**
     * Ʒ??id
     */
    private Long brandId;
    /**
     *
     */
    private BigDecimal weight;
    /**
     * ?ϼ?״̬[0 - ?¼ܣ?1 - ?ϼ?]
     */
    private Integer publishStatus;
    /**
     *
     */
    private Date createTime;
    /**
     *
     */
    private Date updateTime;

}
