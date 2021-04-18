package com.hexin.techlonogy.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MyExceptionInfo extends RuntimeException{
    private Integer code;
    private String msg;
}
