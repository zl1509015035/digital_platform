package com.it.web.model.req;

import lombok.Data;

@Data
public class UserReq {
    private String userName;
    private String userPassword;
    private String startTime;
    private String endTime;
}
