package com.it.web.model.req;

import com.it.web.common.Constant;
import lombok.Data;

@Data
public class UserReq {
    private String userName;
    private String userPassword;
    private String isDeleted = Constant.NOT_DELETED;

    private String startTime;

    private String endTime;

    private Integer pageNum = 1;
    private Integer pageSize = 10;

}
