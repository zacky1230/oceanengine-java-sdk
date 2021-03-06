package com.zctech88.oceanengine.api.bean.ad;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class CreativeGetDetailResponse extends OceanEngineResponse<CreativeGetDetailResponse.CreativeInfos> {

    @Data
    public static class CreativeInfos extends CreativeInfoBase {
        String modify_time;
        Long adverid;
        Long adid;
        Long agentid;
        String updateTime;
    }
}
