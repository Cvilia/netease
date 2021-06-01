package com.cvilia.netease.bean.login;

import com.cvilia.netease.bean.INeteaseBean;

/**
 * created by: cvilia
 * e-mail: cvilia@163.com
 * date: 2021-06-02-1:09
 * describe:手机绑定信息
 */
public class BindPhone implements INeteaseBean {

    private String countrycode;
    private String cellphone;
    private boolean hasPassword;

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public boolean isHasPassword() {
        return hasPassword;
    }

    public void setHasPassword(boolean hasPassword) {
        this.hasPassword = hasPassword;
    }
}
