package com.atguigu.mp.beans;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author chenrentong
 * @create 2021-12-20 21:09
 */
@Getter
@Setter
@ToString
//@TableName(value="tbl_employee")
public class Employee {

    //@TableId(value="id" , type =IdType.AUTO)
    private Integer id;
    @TableField(value = "last_name")
    private String lastName;
    private String email;
    private Integer gender;
    private Integer age;
    @TableField(exist=false)
    private Double salary ;
}
