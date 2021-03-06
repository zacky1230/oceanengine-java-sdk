package com.zctech88.oceanengine.api.bean.convert;

import com.zctech88.oceanengine.api.bean.BaseModel;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
@Accessors(chain = true)
public class ConvertListIdRequest extends BaseModel {
    Long advertiser_id;
    Long convert_ids;
    String opt_status;
    Integer page = 1;
    Integer page_size = 100;

    public String toQueryString() {
        return "advertiser_id=" + advertiser_id + "&page=" + page + "&page_size=" + page_size;
    }
}
