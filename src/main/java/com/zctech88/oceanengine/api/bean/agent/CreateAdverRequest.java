package com.zctech88.oceanengine.api.bean.agent;

import com.zctech88.oceanengine.api.bean.BaseModel;
import lombok.Data;

import java.util.List;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class CreateAdverRequest extends BaseModel {
    private String name;
    private String company;
    private String email;
    private String role;
    private String password;
    private Long promotion_area;
    private Long center_province;
    private Long center_city;
    private String contacter;
    private String phonenumber;
    private String telephone;
    private String address;
    private String description;
    private String license_no;
    private String license_province;
    private String license_city;
    private String license_file_id;
    private String brand;
    private List<String> qualification;

}
