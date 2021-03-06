package com.zctech88.oceanengine.api.bean.agent;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import com.zctech88.oceanengine.support.Paging;
import lombok.Data;

import java.util.List;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class ListAdverResponse extends OceanEngineResponse<ListAdverResponse.Data> {
    Paging page_info;

    @lombok.Data
    public static class Data {
        List<Long> advertiser_ids;
    }
}
