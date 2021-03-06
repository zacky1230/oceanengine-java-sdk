package com.zctech88.oceanengine.api;

import com.zctech88.oceanengine.api.bean.ad.*;
import com.zctech88.oceanengine.support.HttpMethod;
import com.zctech88.oceanengine.support.OceanEngineResource;
import com.zctech88.oceanengine.support.OceanEngineRestException;
import com.zctech88.oceanengine.support.UrlConst;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
public class AdApi extends OceanEngineResource {

    public static AdGetResponse get(String token, AdGetRequest request) throws OceanEngineRestException {
        String url = UrlConst.AD_GROUP_GET_URL + request.toQueryString();
        return execute(HttpMethod.GET, url, "", AdGetResponse.class, token);
    }

    public static AdCreateResponse create(String token, AdCreateRequest request) throws OceanEngineRestException {
        String url = UrlConst.AD_GROUP_CREATE_URL;
        String payload = request.toJSON();
        return execute(HttpMethod.POST, url, payload, AdCreateResponse.class, token);
    }

    public static AdUpdateResponse update(String token, AdUpdateRequest request) throws OceanEngineRestException {
        String url = UrlConst.AD_GROUP_UPDATE_URL;
        String payload = request.toJSON();
        return execute(HttpMethod.POST, url, payload, AdUpdateResponse.class, token);
    }

    public static AdStatusResponse updateStatus(String token, AdStatusRequest request) throws OceanEngineRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AD_GROUP_STATUS_URL, payload, AdStatusResponse.class, token);
    }

    public static AdBudgetResponse updateBudget(String token, AdBudgetRequest request) throws OceanEngineRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AD_GROUP_BUDGET_URL, payload, AdBudgetResponse.class, token);
    }

    public static AdBidPriceResponse updateBidPrice(String token, AdBidPriceRequest request) throws OceanEngineRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AD_GROUP_BID_PRICE_URL, payload, AdBidPriceResponse.class, token);
    }


}
