package com.zctech88.oceanengine.api.bean.ad;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;


/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class CampaignUpdateResponse extends OceanEngineResponse<CampaignUpdateResponse.Data> {

    @lombok.Data
    public static class Data {
        Long campaign_id;
    }

}
