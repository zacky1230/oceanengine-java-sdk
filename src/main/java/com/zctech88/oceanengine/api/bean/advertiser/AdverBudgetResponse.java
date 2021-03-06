package com.zctech88.oceanengine.api.bean.advertiser;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import com.zctech88.oceanengine.support.code.BudgetMode;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
public class AdverBudgetResponse extends OceanEngineResponse<List<AdverBudgetResponse.Data>> {

    @lombok.Data
    public static class Data {
        List<AdverBudgetInfo> list;
    }

    @lombok.Data
    public static class AdverBudgetInfo {
        private Long advertiser_id;
        private BigDecimal budget;
        private BudgetMode budget_mode;
    }
}
