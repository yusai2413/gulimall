package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * ??Ʒ???ۻظ???ϵ
 *
 * @author saiyu
 * @email yusai2413@gmail.com
 * @date 2024-06-25 10:59:42
 */
@Data
@TableName("pms_comment_replay")
public class CommentReplayEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ????id
     */
    private Long commentId;
    /**
     * ?ظ?id
     */
    private Long replyId;

}
