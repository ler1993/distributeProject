package com.lero.distributeproject.common.transferEntity.baseInterface;

public interface TransferEntity<T> {

    public static final int STATUS_CODE_SUCCESS = 1;
    public static final int STATUS_CODE_FAIL = 0;
    public static final int STATUS_CODE_EXCEPTION = -1;
    public static final int STATUS_CODE_HYSTRIX = -2;

    T getData();

    void setData(T t);




}
