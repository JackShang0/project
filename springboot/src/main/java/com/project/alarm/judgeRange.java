package com.project.alarm;

/**
 * @description:  判断阈值是否在某个范围
 * @author: shangqj
 * @date: 2024/6/3
 * @version: 1.0
 */
public class judgeRange {
    private static final String [] alarmLevelDes = {"提示","次要","重要","紧急"};
    public static AlarmLevel judgeRange(String v1, String v2, String v3,String v4,String tar) {
        double value1 = Double.parseDouble(v1);
        double value2 = Double.parseDouble(v2);
        double value3 = Double.parseDouble(v3);
        double value4 = Double.parseDouble(v4);
        double[] doubles = new double[]{value1,value2,value3,value4};

        double threshold = Double.parseDouble(tar);
        AlarmLevel alarm = new AlarmLevel();
        for (int i = 0; i < doubles.length; i += 2) {
            if (threshold >= doubles[i] && threshold < doubles[i + 1]) {
                alarm.setLevel(i / 2);
                alarm.setThreshold(String.valueOf(doubles[i]));
                alarm.setLevelDescription(alarmLevelDes[i/2]);
                return alarm;
            }
        }
        return new AlarmLevel().setLevel(0).setThreshold(String.valueOf(doubles[0])).setLevelDescription(alarmLevelDes[0]);
    }


    /**
     * 判断告警是不是在某个阈值之间
     * @param v 真实值
     * @param low 下限
     * @param up 上限
     * @return boolean
     */
    public static boolean isWithinRange(String v, String low, String up) {
        double value = Double.parseDouble(v);
        double lower = Double.parseDouble(low);
        double upper = Double.parseDouble(up);
        return value >= lower && value <= upper;
    }
}
