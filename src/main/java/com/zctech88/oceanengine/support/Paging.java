package com.zctech88.oceanengine.support;

import com.zctech88.oceanengine.api.bean.BaseModel;
import lombok.Data;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class Paging extends BaseModel {
    Integer page;
    Integer page_size;
    Integer total_number;
    Integer total_page;
}
