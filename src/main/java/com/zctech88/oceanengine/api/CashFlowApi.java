package com.zctech88.oceanengine.api;

import com.zctech88.oceanengine.api.bean.cashflow.*;
import com.zctech88.oceanengine.support.HttpMethod;
import com.zctech88.oceanengine.support.OceanEngineResource;
import com.zctech88.oceanengine.support.OceanEngineRestException;
import com.zctech88.oceanengine.support.UrlConst;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
public class CashFlowApi extends OceanEngineResource {

    public static CashResponse transferAdver(String token, CashRequest request) throws OceanEngineRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AGENT_TRANSFER_URL, payload, CashResponse.class, token);
    }

    public static CashResponse refundAdver(String token, CashRequest request) throws OceanEngineRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AGENT_REFUND_URL, payload, CashResponse.class, token);
    }

    public static AdverBalanceQueryResponse adverBalanceGet(String token, Long advertiserId) throws OceanEngineRestException {
        String url = String.format(UrlConst.ADVER_FOUND_BALANCE_URL, advertiserId);
        return execute(HttpMethod.GET, url, "", AdverBalanceQueryResponse.class, token);
    }


    public static AdverFundDailyResponse fundDailyReport(String token, AdverFundDailyRequest request) throws OceanEngineRestException {
        String url = UrlConst.ADVER_FOUND_DAILY_REPORT_URL + request.toQueryString();
        return execute(HttpMethod.GET, url, "", AdverFundDailyResponse.class, token);
    }

    public static AdverFundDetailResponse fundTransaction(String token, AdverFundDetailRequest request) throws OceanEngineRestException {
        String url = UrlConst.ADVER_FOUND_TRANX_DETAIL_URL + request.toQueryString();
        return execute(HttpMethod.GET, url, "", AdverFundDetailResponse.class, token);
    }
}
