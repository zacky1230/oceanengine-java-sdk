package com.zctech88.oceanengine.api.bean.ad;

import com.zctech88.oceanengine.api.bean.BaseModel;
import lombok.Data;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class CreativeGetDetailRequest extends BaseModel {
    Long advertiser_id;
    Long ad_id;


    public String toQueryString() {
        StringBuilder builder = new StringBuilder();
        builder.append("?advertiser_id=").append(advertiser_id);
        builder.append("&ad_id=").append(ad_id);
        return builder.toString();
    }
}
