package com.zctech88.oceanengine.api.bean.dmp;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class DataSourceUploadResponse extends OceanEngineResponse<DataSourceUploadResponse.Data> {
    @lombok.Data
    public static class Data {
        String file_path;
    }
}
