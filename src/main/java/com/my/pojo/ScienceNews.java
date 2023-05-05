package com.my.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("science_news")
public class ScienceNews {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String title;
    private String text;
    private Long like;
    private String date;
    private Long page_view;
}