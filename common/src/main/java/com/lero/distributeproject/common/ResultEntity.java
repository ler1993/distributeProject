package com.lero.distributeproject.common;

import com.lero.distributeproject.common.transferEntity.baseInterface.TransferEntity;

public class ResultEntity<T>  implements TransferEntity {

    private T data;


    @Override
    public Object getData() {
        return null;
    }

    @Override
    public void setData(Object o) {

    }
}
