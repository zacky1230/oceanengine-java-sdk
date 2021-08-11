package com.zctech88.oceanengine.api.bean.query_tool;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;

import java.util.List;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class QueryAdQualityResponse extends OceanEngineResponse<QueryAdQualityResponse.Data> {

    @lombok.Data
    public static class Data {
        List<Quality> list;
    }

    @lombok.Data
    public static class Quality {
        Long ad_id;
        Float quality_score;
        Float ctr_score;
        Float web_score;
        Float cvr_score;
    }
}
