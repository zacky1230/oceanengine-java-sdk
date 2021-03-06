package com.zctech88.oceanengine.api.bean.report;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;




import java.util.List;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class ReportAdResponse extends OceanEngineResponse<ReportAdResponse.Data> {

    @lombok.Data
    public static class Data {
        List<ReportAd> list;
    }

    @lombok.Data
    public static class ReportAd extends ReportBase {

        String _id;
        Long ad_id;
        String pricing;
        String status;
        Long adid;
        String name;
        Boolean fix;

    }
}
