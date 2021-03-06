package com.zctech88.oceanengine.api.bean.report;

import com.zctech88.oceanengine.api.bean.OceanEngineResponse;
import lombok.Data;



import java.util.List;

/**
 * @author <a href="mailto:gy1zc3@gmail.com">zacky</a>
 */
@Data
public class ReportAgentResponse extends OceanEngineResponse<ReportAgentResponse.Data> {


    @lombok.Data
    public static class Data {
        List<AgentReport> list;
    }

    @lombok.Data
    public static class AgentReport {
        String _id;
        Long advertiser_id;
        String date;
        Long show;
        Double cost;
        Long click;
        Long convert;
        Double ctr;
        Integer ad_num;
        Double cost_gd;
        Double cost_ocpm;
        Double cost_ocpc;
        Double cost_cpm;
        Double cost_cpa;
        Double cost_cpc;
        Double cost_cpt;
        Double cost_cpv;
        Double stat_cash;
        Double stat_grants;
        String name;
        Long adverid;
        Long agentid;
        String updateTime;
    }

}
