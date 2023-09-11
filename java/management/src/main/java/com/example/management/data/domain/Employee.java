package com.example.management.data.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName employee
 */
@TableName(value ="employee")
@Data
public class Employee implements Serializable {
    /**
     * 员工编号
     */
    @TableId(type = IdType.AUTO)
    private Integer empId;

    /**
     * 员工姓名
     */
    private String empName;

    /**
     * 在职状态，1：在职，2：离职
     */
    private Integer empState;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别(1男 2女)
     */
    private Integer sex;

    /**
     * 生日
     */
    private Date birthDate;

    /**
     * 现住址
     */
    private String currentAddr;

    /**
     * 联系人
     */
    private String conUser;

    /**
     * 联系电话
     */
    private String conMobile;

    /**
     * 联系地址
     */
    private String conAddr;

    /**
     * 入职时间
     */
    private Date joinTime;

    /**
     * 离职时间
     */
    private Date dimissionTime;

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
        Employee other = (Employee) that;
        return (this.getEmpId() == null ? other.getEmpId() == null : this.getEmpId().equals(other.getEmpId()))
            && (this.getEmpName() == null ? other.getEmpName() == null : this.getEmpName().equals(other.getEmpName()))
            && (this.getEmpState() == null ? other.getEmpState() == null : this.getEmpState().equals(other.getEmpState()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthDate() == null ? other.getBirthDate() == null : this.getBirthDate().equals(other.getBirthDate()))
            && (this.getCurrentAddr() == null ? other.getCurrentAddr() == null : this.getCurrentAddr().equals(other.getCurrentAddr()))
            && (this.getConUser() == null ? other.getConUser() == null : this.getConUser().equals(other.getConUser()))
            && (this.getConMobile() == null ? other.getConMobile() == null : this.getConMobile().equals(other.getConMobile()))
            && (this.getConAddr() == null ? other.getConAddr() == null : this.getConAddr().equals(other.getConAddr()))
            && (this.getJoinTime() == null ? other.getJoinTime() == null : this.getJoinTime().equals(other.getJoinTime()))
            && (this.getDimissionTime() == null ? other.getDimissionTime() == null : this.getDimissionTime().equals(other.getDimissionTime()))
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
        result = prime * result + ((getEmpId() == null) ? 0 : getEmpId().hashCode());
        result = prime * result + ((getEmpName() == null) ? 0 : getEmpName().hashCode());
        result = prime * result + ((getEmpState() == null) ? 0 : getEmpState().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthDate() == null) ? 0 : getBirthDate().hashCode());
        result = prime * result + ((getCurrentAddr() == null) ? 0 : getCurrentAddr().hashCode());
        result = prime * result + ((getConUser() == null) ? 0 : getConUser().hashCode());
        result = prime * result + ((getConMobile() == null) ? 0 : getConMobile().hashCode());
        result = prime * result + ((getConAddr() == null) ? 0 : getConAddr().hashCode());
        result = prime * result + ((getJoinTime() == null) ? 0 : getJoinTime().hashCode());
        result = prime * result + ((getDimissionTime() == null) ? 0 : getDimissionTime().hashCode());
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
        sb.append(", empId=").append(empId);
        sb.append(", empName=").append(empName);
        sb.append(", empState=").append(empState);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", sex=").append(sex);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", currentAddr=").append(currentAddr);
        sb.append(", conUser=").append(conUser);
        sb.append(", conMobile=").append(conMobile);
        sb.append(", conAddr=").append(conAddr);
        sb.append(", joinTime=").append(joinTime);
        sb.append(", dimissionTime=").append(dimissionTime);
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