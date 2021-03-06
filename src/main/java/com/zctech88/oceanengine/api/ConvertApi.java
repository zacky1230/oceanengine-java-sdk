package com.zctech88.oceanengine.api;

import com.zctech88.oceanengine.api.bean.convert.*;
import com.zctech88.oceanengine.support.HttpMethod;
import com.zctech88.oceanengine.support.OceanEngineResource;
import com.zctech88.oceanengine.support.OceanEngineRestException;
import com.zctech88.oceanengine.support.UrlConst;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
public class ConvertApi extends OceanEngineResource {


    public static ConvertCreateResponse create(String token, ConvertCreateRequest request) throws OceanEngineRestException {
        String url = UrlConst.AD_CONVERT_CREATE_URL;
        String payload = request.toJSON();
        return execute(HttpMethod.POST, url, payload, ConvertCreateResponse.class, token);
    }

    public static ConvertEmptyResponse updateStatus(String token, ConvertStatusRequest request) {
        String url = UrlConst.AD_CONVERT_STATUS_URL;
        String payload = request.toJSON();
        return execute(HttpMethod.POST, url, payload, ConvertEmptyResponse.class, token);
    }

    public static ConvertEmptyResponse push(String token, ConvertPushRequest request) {
        String url = UrlConst.AD_CONVERT_PUSH_URL;
        String payload = request.toJSON();
        return execute(HttpMethod.POST, url, payload, ConvertEmptyResponse.class, token);
    }

    public static ConvertDetailResponse queryDetail(String token, ConvertDetailRequest request) throws OceanEngineRestException {
        String queryString = request.toQueryString();
        String url = UrlConst.AD_CONVERT_DETAIL_URL + "?" + queryString;
        return execute(HttpMethod.GET, url, "", ConvertDetailResponse.class, token);
    }


    public static ConvertListIdResponse list(String token, ConvertListIdRequest request) {
        String queryString = request.toQueryString();
        String url = UrlConst.AD_CONVERT_ADV_LIST_URL + "?" + queryString;
        return execute(HttpMethod.GET, url, "", ConvertListIdResponse.class, token);
    }

    public static ConvertQueryAvailableConvertIdResponse availableList(String token, ConvertQueryAvailableConvertIdRequest request) {
        String queryString = request.toQueryString();
        String url = UrlConst.AD_CONVERT_SERVERING_LIST_URL + "?" + queryString;
        return execute(HttpMethod.GET, url, "", ConvertQueryAvailableConvertIdResponse.class, token);
    }
}
