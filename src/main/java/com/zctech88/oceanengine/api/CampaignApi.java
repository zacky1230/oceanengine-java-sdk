package com.zctech88.oceanengine.api;

import com.zctech88.oceanengine.api.bean.ad.*;
import com.zctech88.oceanengine.support.HttpMethod;
import com.zctech88.oceanengine.support.OceanEngineResource;
import com.zctech88.oceanengine.support.OceanEngineRestException;
import com.zctech88.oceanengine.support.UrlConst;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
public class CampaignApi extends OceanEngineResource {

    public static CampaignGetResponse get(String token, CampaignGetRequest request) throws OceanEngineRestException {
        String url = UrlConst.AD_CAMPAIGN_GET_URL + request.toQueryString();
        return execute(HttpMethod.GET, url, "", CampaignGetResponse.class, token);
    }

    public static CampaignCreateResponse create(String token, CampaignCreateRequest request) throws OceanEngineRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AD_CAMPAIGN_CREATE_URL, payload, CampaignCreateResponse.class, token);
    }

    public static CampaignUpdateResponse update(String token, CampaignUpdateRequest request) throws OceanEngineRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AD_CAMPAIGN_UPDATE_URL, payload, CampaignUpdateResponse.class, token);
    }

    public static CampaignStatusResponse status(String token, CampaignStatusRequest request) throws OceanEngineRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AD_CAMPAIGN_STATUS_URL, payload, CampaignStatusResponse.class, token);
    }

}
