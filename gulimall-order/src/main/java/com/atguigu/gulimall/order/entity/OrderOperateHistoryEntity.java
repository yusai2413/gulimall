package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * ??????????ʷ??¼
 *
 * @author saiyu
 * @email yusai2413@gmail.com
 * @date 2024-06-25 14:57:53
 */
@Data
@TableName("oms_order_operate_history")
public class OrderOperateHistoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ????id
     */
    private Long orderId;
    /**
     * ??????[?û???ϵͳ????̨????Ա]
     */
    private String operateMan;
    /**
     * ????ʱ?
     */
    private Date createTime;
    /**
     * ????״̬??0->?????1->????????2->?ѷ?????3->?????ɣ?4->?ѹرգ?5->??Ч??????
     */
    private Integer orderStatus;
    /**
     * ??ע
     */
    private String note;

}
