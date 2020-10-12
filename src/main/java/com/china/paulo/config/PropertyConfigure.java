package com.china.paulo.config;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import tech.xinke.core.util.pyxis.PyxisConfig;

/**
 * Copyright © 2020 Xinke(Shanghai) Network Science and Technology Co., Ltd. All rights reserved
 *
 * @Author: kefan.qu
 * @Date: 2020-10-10 2020/10/10 15:51
 * @Description:
 * @Version: v1.0
 */
@Configuration
public class PropertyConfigure implements EnvironmentAware {

    @Override
    public void setEnvironment(Environment environment) {
        PyxisConfig.environment = environment;
    }
}
