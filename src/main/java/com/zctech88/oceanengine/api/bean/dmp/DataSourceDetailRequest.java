package com.zctech88.oceanengine.api.bean.dmp;

import com.alibaba.fastjson.JSON;
import com.zctech88.oceanengine.api.bean.BaseModel;
import com.zctech88.oceanengine.support.utils.URIUtil;
import lombok.Data;

import java.util.List;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class DataSourceDetailRequest extends BaseModel {
    Long advertiser_id;
    List<String> data_source_id_list;

    public String queryString() {
        return "advertiser_id=" + advertiser_id + "&data_source_id_list=" + URIUtil.encodeURIComponent(JSON.toJSONString(data_source_id_list));
    }
}
