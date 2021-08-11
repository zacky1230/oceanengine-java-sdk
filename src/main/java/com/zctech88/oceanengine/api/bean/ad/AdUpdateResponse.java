package com.zctech88.oceanengine.api.bean.ad;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;

@Data
public class AdUpdateResponse extends OceanEngineResponse<AdUpdateResponse.Data> {

    @lombok.Data
    public static class Data {
        Long ad_id;
        Long need_audit;
    }

}
