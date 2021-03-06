package com.zctech88.oceanengine.api.bean.query_tool;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
@Accessors(chain = true)
public class QueryPredictTaResponse extends OceanEngineResponse<QueryPredictTaResponse.Data> {
    @lombok.Data
    @Accessors(chain = true)
    public static class Data {
        // 抖音视频预估用户覆盖量结果
        TaType aweme;
        // 火山视频预估用户覆盖量结果
        TaType hotsoon;
        // 西瓜视频预估用户覆盖量结果
        TaType video_app;
        //今日头条预估用户覆盖量结果
        TaType OceanEngine;
    }

    @lombok.Data
    @Accessors(chain = true)
    public static class TaType {
        Long num;
    }

}
