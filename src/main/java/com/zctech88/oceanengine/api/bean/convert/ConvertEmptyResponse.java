package com.zctech88.oceanengine.api.bean.convert;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.experimental.Accessors;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@lombok.Data
@Accessors(chain = true)
public class ConvertEmptyResponse extends OceanEngineResponse<ConvertEmptyResponse.Data> {

    @lombok.Data
    public static class Data {

    }
}
