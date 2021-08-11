package com.zctech88.oceanengine.api.bean.cashflow;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class CashResponse extends OceanEngineResponse<CashResponse.Data> {

    @lombok.Data
    public static class Data {
        String transaction_seq;
    }
}
