package com.project.list;

import lombok.Data;

@Data
public class Bean_FloodArbor {


// ARBOR    DATA_ID,DATA_TYPE,
// IMPACT_BPS,IMPACT_PPS,HOST_ADDRESS,IMPACT_BOUNDARY,DEAL_DATE,START_TIME,STOP_TIME

    public int dataId;
    public String dataType;
    public String impactBps;
    public String impactPps;
    public String hostAddress;
    public String impactBoundary;
    public String dealDate;
    public String startTime;
    public String stopTime;

}
