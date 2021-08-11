package com.zctech88.oceanengine.api.bean.auth;


import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class RefreshTokenResponse extends OceanEngineResponse<RefreshTokenResponse.Data> {

    @lombok.Data
    public static class Data {
        private String access_token;
        private Integer expires_in;
        private String refresh_token;
        private Integer refresh_token_expires_in;
    }
}
