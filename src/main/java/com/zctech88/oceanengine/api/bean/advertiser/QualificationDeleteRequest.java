package com.zctech88.oceanengine.api.bean.advertiser;


import com.zctech88.oceanengine.api.bean.BaseModel;
import lombok.Data;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class QualificationDeleteRequest extends BaseModel {
    Long advertiser_id;
    Long qualification_id;
}
