package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * ??ɱ????
 *
 * @author saiyu
 * @email yusai2413@gmail.com
 * @date 2024-06-25 14:27:27
 */
@Data
@TableName("sms_seckill_session")
public class SeckillSessionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ???????
     */
    private String name;
    /**
     * ÿ?տ?ʼʱ?
     */
    private Date startTime;
    /**
     * ÿ?ս???ʱ?
     */
    private Date endTime;
    /**
     * ????״̬
     */
    private Integer status;
    /**
     * ????ʱ?
     */
    private Date createTime;

}