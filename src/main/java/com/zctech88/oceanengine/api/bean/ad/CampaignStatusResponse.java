package com.zctech88.oceanengine.api.bean.ad;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;

import java.util.List;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class CampaignStatusResponse extends OceanEngineResponse<CampaignStatusResponse.Data> {

    @lombok.Data
    public static class Data {
        List<Long> campaign_ids;
    }

}
