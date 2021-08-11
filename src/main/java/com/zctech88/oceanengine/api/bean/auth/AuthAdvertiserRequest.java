package com.zctech88.oceanengine.api.bean.auth;

import com.zctech88.oceanengine.api.bean.BaseModel;
import lombok.Data;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class AuthAdvertiserRequest extends BaseModel {
    private String access_token;
    private String app_id;
    private String secret;
}
