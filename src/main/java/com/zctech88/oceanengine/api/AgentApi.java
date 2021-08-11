package com.zctech88.oceanengine.api;

import com.zctech88.oceanengine.api.bean.agent.*;
import com.zctech88.oceanengine.support.HttpMethod;
import com.zctech88.oceanengine.support.OceanEngineResource;
import com.zctech88.oceanengine.support.OceanEngineRestException;
import com.zctech88.oceanengine.support.UrlConst;

import java.util.Objects;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
public class AgentApi extends OceanEngineResource {

    public static ListAdverResponse listAdver(String token, Integer page, Integer pageSize) throws OceanEngineRestException {
        page = Objects.isNull(page) ? 1 : page;
        pageSize = Objects.isNull(pageSize) ? 10 : pageSize;
        String url = String.format(UrlConst.AGENT_ADVER_LIST_URL, page, pageSize);
        return execute(HttpMethod.GET, url, "", ListAdverResponse.class, token);
    }

    public static CreateAdverResponse createAdver(String token, CreateAdverRequest request) throws OceanEngineRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AGENT_ADVER_CREATE_URL, payload, CreateAdverResponse.class, token);
    }

    public static UpdateAdverResponse updateAdver(String token, UpdateAdverRequest request) throws OceanEngineRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AGENT_ADVER_UPDATE_URL, payload, UpdateAdverResponse.class, token);
    }

    public static ListChildResponse listChild(String token, Integer page, Integer pageSize) throws OceanEngineRestException {
        page = Objects.isNull(page) ? 1 : page;
        pageSize = Objects.isNull(pageSize) ? 10 : pageSize;
        String url = String.format(UrlConst.AGENT_CHILD_LIST_URL, page, pageSize);
        return execute(HttpMethod.GET, url, "", ListChildResponse.class, token);
    }


}
