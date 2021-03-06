package com.zctech88.oceanengine.api.bean.file;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class VideoCoverImgResponse extends OceanEngineResponse<VideoCoverImgResponse.Image> {

    @Data
    public static class Image {
        String url;
        Integer width;
        Integer height;
        String id;
    }
}
