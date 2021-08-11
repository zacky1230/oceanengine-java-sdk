package com.zctech88.oceanengine.api.bean.creative_word;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import com.zctech88.oceanengine.api.bean.file.ImageQueryResponse;
import lombok.Data;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class WordUpdateResponse extends OceanEngineResponse<ImageQueryResponse.Data> {

    @lombok.Data
    public static class Data {
        String creative_word_id;
    }
}
