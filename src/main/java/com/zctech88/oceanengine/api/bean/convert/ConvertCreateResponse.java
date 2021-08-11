package com.zctech88.oceanengine.api.bean.convert;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
@Accessors(chain = true)
public class ConvertCreateResponse extends OceanEngineResponse<ConvertCreateResponse.Data> {
    @lombok.Data
    public static class Data {
        private Long id;
        private String opt_status;
        private String status;
    }

}
