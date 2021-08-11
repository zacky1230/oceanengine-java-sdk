package com.zctech88.oceanengine.api.bean.file;

import com.alibaba.fastjson.JSON;
import com.zctech88.oceanengine.api.bean.BaseModel;
import com.zctech88.oceanengine.support.utils.URIUtil;
import lombok.Data;

import java.util.List;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class ImageQueryRequest extends BaseModel {
    Long advertiser_id;
    List<String> image_ids;

    public String toQueryString() {
        return "advertiser_id=" + advertiser_id + "&image_ids=" + URIUtil.encodeURIComponent(JSON.toJSONString(image_ids));
    }
}
