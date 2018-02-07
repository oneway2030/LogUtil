package com.oneway.log.parser;


import com.oneway.log.common.LogConstant;

/**
 * @Description: 解析器接口
 * @author:
 * @date: 16/12/11 10:59.
 */
public interface Parser<T> {
    String LINE_SEPARATOR = LogConstant.BR;

    Class<T> parseClassType();

    String parseString(T t);
}
