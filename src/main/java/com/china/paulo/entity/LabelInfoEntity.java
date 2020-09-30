package com.china.paulo.entity;


import com.china.paulo.config.db.DbTables;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Copyright © 2020 Xinke(Shanghai) Network Science and Technology Co., Ltd. All rights reserved
 *
 * @Author: kefan.qu
 * @Date: 2020/4/28 16:40
 * @Description: 中麦基金标签表
 * @Version: v1.0
 */
@Table(name = DbTables.LABEL_INFO)
public class LabelInfoEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 标签id
     */
    @Column(name = "label_id")
    private String labelId;

    /**
     * 标签名称
     */
    @Column(name = "label_name")
    private String labelName;

    /**
     * 标签描述
     */
    @Column(name = "label_desc")
    private String labelDesc;

    /**
     * 机构号
     */
    @Column(name = "org_id")
    private String orgId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 删除时间
     */
    @Column(name = "delete_time")
    private Date deleteTime;

    public LabelInfoEntity() {
    }

    public LabelInfoEntity(Date createTime, Date updateTime) {
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getLabelDesc() {
        return labelDesc;
    }

    public void setLabelDesc(String labelDesc) {
        this.labelDesc = labelDesc;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}
