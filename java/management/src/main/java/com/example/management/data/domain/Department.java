package com.example.management.data.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 公司部门
 * @TableName department
 */
@TableName(value ="department")
@Data
public class Department implements Serializable {
    /**
     * 部门编号
     */
    @TableId(type = IdType.AUTO)
    private Integer depId;

    /**
     * 部门名称
     */
    private String depName;

    /**
     * 部门状态(1:正常,-1:删除)
     */
    private Integer depState;

    /**
     * 部门管理员
     */
    private Integer depManageUserId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private Integer entryId;

    /**
     * 创建时间
     */
    private Date entryTime;

    /**
     * 更新人
     */
    private Integer modifyId;

    /**
     * 更新时间
     */
    private Date modifyTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Department other = (Department) that;
        return (this.getDepId() == null ? other.getDepId() == null : this.getDepId().equals(other.getDepId()))
            && (this.getDepName() == null ? other.getDepName() == null : this.getDepName().equals(other.getDepName()))
            && (this.getDepState() == null ? other.getDepState() == null : this.getDepState().equals(other.getDepState()))
            && (this.getDepManageUserId() == null ? other.getDepManageUserId() == null : this.getDepManageUserId().equals(other.getDepManageUserId()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getEntryId() == null ? other.getEntryId() == null : this.getEntryId().equals(other.getEntryId()))
            && (this.getEntryTime() == null ? other.getEntryTime() == null : this.getEntryTime().equals(other.getEntryTime()))
            && (this.getModifyId() == null ? other.getModifyId() == null : this.getModifyId().equals(other.getModifyId()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDepId() == null) ? 0 : getDepId().hashCode());
        result = prime * result + ((getDepName() == null) ? 0 : getDepName().hashCode());
        result = prime * result + ((getDepState() == null) ? 0 : getDepState().hashCode());
        result = prime * result + ((getDepManageUserId() == null) ? 0 : getDepManageUserId().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        result = prime * result + ((getEntryTime() == null) ? 0 : getEntryTime().hashCode());
        result = prime * result + ((getModifyId() == null) ? 0 : getModifyId().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", depId=").append(depId);
        sb.append(", depName=").append(depName);
        sb.append(", depState=").append(depState);
        sb.append(", depManageUserId=").append(depManageUserId);
        sb.append(", remark=").append(remark);
        sb.append(", entryId=").append(entryId);
        sb.append(", entryTime=").append(entryTime);
        sb.append(", modifyId=").append(modifyId);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}