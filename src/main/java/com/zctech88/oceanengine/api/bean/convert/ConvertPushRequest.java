package com.zctech88.oceanengine.api.bean.convert;

import com.zctech88.oceanengine.api.bean.BaseModel;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
@Accessors(chain = true)
public class ConvertPushRequest extends BaseModel {
    Long advertiser_id;
    Long convert_id;
    List<Long> target_advertiser_ids;
}
