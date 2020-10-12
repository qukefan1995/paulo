package com.china.paulo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import tech.xinke.core.abstracts.AbstractBaseController;
import tech.xinke.core.abstracts.AbstractBaseTask;
import tech.xinke.core.log.configuration.LogUtil;
import tech.xinke.core.result.Result;
import tech.xinke.core.result.ResultVo;
import tech.xinke.core.util.pyxis.PyxisConfig;

/**
 * Copyright © 2020 Xinke(Shanghai) Network Science and Technology Co., Ltd. All rights reserved
 *
 * @Author: kefan.qu
 * @Date: 2020-08-27 2020/8/27 18:04
 * @Description:
 * @Version: v1.0
 */
@RestController
@RequestMapping(produces = "application/json;charset=utf-8")
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    private static final String INFO_HEADER = "testController";

    @Qualifier("taskExecutor")
    @Autowired
    private AsyncTaskExecutor asyncTaskExecutor;

    @PostMapping("{version}/test")
    public DeferredResult<ResultVo<Object>> task(){
        String name = PyxisConfig.getProperty("xinke.dingtalk.application-name");
        log.info(LogUtil.infoHeader(INFO_HEADER).append("入口").toString());
        return new AbstractBaseController<Object>(asyncTaskExecutor){
            @Override
            public void doBiz(DeferredResult<ResultVo<Object>> result) {
                log.info(LogUtil.infoHeader(INFO_HEADER).
                        append("任务已开始,测试参数1={},测试参数2={}").toString(), 1,2);
                result.setResult(Result.success());
                log.info(LogUtil.infoHeader(INFO_HEADER).append("任务已结束").toString());
            }
        }.execute(60000L, INFO_HEADER);
    }

    public void timingTask(){
        new AbstractBaseTask() {
            @Override
            protected void doTask() {
                //相关业务写在这里
            }
        }.executeTask("标题");
    }
}
