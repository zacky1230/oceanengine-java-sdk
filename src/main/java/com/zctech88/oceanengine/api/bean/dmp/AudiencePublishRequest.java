package com.zctech88.oceanengine.api.bean.dmp;

import com.zctech88.oceanengine.api.bean.BaseModel;

import lombok.Data;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class AudiencePublishRequest extends BaseModel {
    // "广告主ID")
    Long advertiser_id;
    // "人群包ID")
    Long custom_audience_id;
}
