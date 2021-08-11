package com.zctech88.oceanengine.api.bean.advertiser;


import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;

import java.util.List;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class AdverPublicInfoResponse extends OceanEngineResponse<List<AdverPublicInfoResponse.Data>> {

    @lombok.Data
    public static class Data {
        private Long id;
        private String name;
        private String company;
    }

}
