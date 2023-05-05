package com.my.pojo;



import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@TableName("springboot_user")
@Data
//有参构造无（所有）
@AllArgsConstructor
//无参构造
@NoArgsConstructor
//找到实体类型，设置表的别名
@TableName("user")
public class User {
    @TableId(value = "id",type = IdType.AUTO)//使用数据库的自动递增，默认没有主键，使用long生成的
    private Long id;
    private String username;
    private String password;
}
