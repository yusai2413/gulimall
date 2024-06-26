package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * Ʒ?
 *
 * @author saiyu
 * @email yusai2413@gmail.com
 * @date 2024-06-25 10:59:41
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Ʒ??id
     */
    @TableId
    private Long brandId;
    /**
     * Ʒ????
     */
    private String name;
    /**
     * Ʒ??logo??ַ
     */
    private String logo;
    /**
     * ???
     */
    private String descript;
    /**
     * ??ʾ״̬[0-????ʾ??1-??ʾ]
     */
    private Integer showStatus;
    /**
     * ????????ĸ
     */
    private String firstLetter;
    /**
     * ???
     */
    private Integer sort;

}
