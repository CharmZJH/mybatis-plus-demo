package com.person.mybatisplusdemo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhoujiehao
 * @since 2020-03-12
 */
public class User implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 用户ID
     */
        private String userId;

      /**
     * 用户账号
     */
      private String account;

      /**
     * 部门
     */
      private String department;

      /**
     * 角色ID
     */
      private String roleId;

      /**
     * 用户密码
     */
      private String password;

      /**
     * 认证TOKEN
     */
      private String token;

      /**
     * 用户昵称
     */
      private String userName;

      /**
     * 分公司ID
     */
      private String companyId;

      /**
     * 工厂ID
     */
      private String gcId;

      /**
     * 是否管理员
     */
      private String isAdmin;

      /**
     * 是否有效
     */
      private String isActive;

      /**
     * 备注
     */
      private String remark;

    private String createMan;

    private LocalDateTime createTime;

    private String updateMan;

    private LocalDateTime updateTime;

      /**
     * 1普通员工  2领导
     */
      private Integer usertype;

    
    public String getUserId() {
        return userId;
    }

      public void setUserId(String userId) {
          this.userId = userId;
      }
    
    public String getAccount() {
        return account;
    }

      public void setAccount(String account) {
          this.account = account;
      }
    
    public String getDepartment() {
        return department;
    }

      public void setDepartment(String department) {
          this.department = department;
      }
    
    public String getRoleId() {
        return roleId;
    }

      public void setRoleId(String roleId) {
          this.roleId = roleId;
      }
    
    public String getPassword() {
        return password;
    }

      public void setPassword(String password) {
          this.password = password;
      }
    
    public String getToken() {
        return token;
    }

      public void setToken(String token) {
          this.token = token;
      }
    
    public String getUserName() {
        return userName;
    }

      public void setUserName(String userName) {
          this.userName = userName;
      }
    
    public String getCompanyId() {
        return companyId;
    }

      public void setCompanyId(String companyId) {
          this.companyId = companyId;
      }
    
    public String getGcId() {
        return gcId;
    }

      public void setGcId(String gcId) {
          this.gcId = gcId;
      }
    
    public String getIsAdmin() {
        return isAdmin;
    }

      public void setIsAdmin(String isAdmin) {
          this.isAdmin = isAdmin;
      }
    
    public String getIsActive() {
        return isActive;
    }

      public void setIsActive(String isActive) {
          this.isActive = isActive;
      }
    
    public String getRemark() {
        return remark;
    }

      public void setRemark(String remark) {
          this.remark = remark;
      }
    
    public String getCreateMan() {
        return createMan;
    }

      public void setCreateMan(String createMan) {
          this.createMan = createMan;
      }
    
    public LocalDateTime getCreateTime() {
        return createTime;
    }

      public void setCreateTime(LocalDateTime createTime) {
          this.createTime = createTime;
      }
    
    public String getUpdateMan() {
        return updateMan;
    }

      public void setUpdateMan(String updateMan) {
          this.updateMan = updateMan;
      }
    
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

      public void setUpdateTime(LocalDateTime updateTime) {
          this.updateTime = updateTime;
      }
    
    public Integer getUsertype() {
        return usertype;
    }

      public void setUsertype(Integer usertype) {
          this.usertype = usertype;
      }

    @Override
    public String toString() {
        return "User{" +
              "userId=" + userId +
                  ", account=" + account +
                  ", department=" + department +
                  ", roleId=" + roleId +
                  ", password=" + password +
                  ", token=" + token +
                  ", userName=" + userName +
                  ", companyId=" + companyId +
                  ", gcId=" + gcId +
                  ", isAdmin=" + isAdmin +
                  ", isActive=" + isActive +
                  ", remark=" + remark +
                  ", createMan=" + createMan +
                  ", createTime=" + createTime +
                  ", updateMan=" + updateMan +
                  ", updateTime=" + updateTime +
                  ", usertype=" + usertype +
              "}";
    }
}
