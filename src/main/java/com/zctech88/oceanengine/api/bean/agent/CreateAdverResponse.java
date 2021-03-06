package com.zctech88.oceanengine.api.bean.agent;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class CreateAdverResponse extends OceanEngineResponse<CreateAdverResponse.Data> {

    @lombok.Data
    public static class Data {
        Long advertiser_id;
    }
}
