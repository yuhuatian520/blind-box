package com.hexin.techlonogy.vo.noticeinfovo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoticeInfoVo implements Serializable {
    /**
     * 标识
     */
    private Integer id;
    /**
     * 图片地址
     */
    private String imgAddress;

}
