package com.zctech88.oceanengine.api.bean.file;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class VideoQueryResponse extends OceanEngineResponse<VideoQueryResponse.Image> {

    @Data
    public static class Image {
        Integer size;
        Integer width;
        Integer height;
        String format;
        String url;
        String signature;
        String poster_url;
        Integer bit_rate;
        Integer duration;
        String id;
    }
}
