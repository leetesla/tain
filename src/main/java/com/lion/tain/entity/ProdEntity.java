package com.lion.tain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lion.tain.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lion
 * @since 2020-04-08
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("prod")
public class ProdEntity extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;


}
