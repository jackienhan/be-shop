package com.nhandn.shop.dto;

import java.io.Serializable;
import java.util.Date;

public abstract class AbstractDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    protected Date createdAt;
    protected Date updatedAt;

}
