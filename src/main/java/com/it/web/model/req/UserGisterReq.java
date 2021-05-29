package com.it.web.model.req;

import com.it.web.common.Constant;
import lombok.Data;

@Data
public class UserGisterReq {
    private String userName;
    private String userPassword;
    private String isDeleted = Constant.NOT_DELETED;
}
