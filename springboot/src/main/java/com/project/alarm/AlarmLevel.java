package com.project.alarm;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @description:
 * @author: shangqj
 * @date: 2024/6/3
 * @version: 1.0
 */
@Data
@Accessors(chain = true)
public class AlarmLevel {

    Integer level;
    String levelDescription;
    String threshold;
}
