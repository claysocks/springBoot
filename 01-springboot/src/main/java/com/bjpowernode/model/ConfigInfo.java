package com.bjpowernode.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName:ConfigInfo
 * Package:com.bjpowernode.model
 * Description:<br/>
 *
 * @date:2021/4/14 13:37
 * @author:dingzhengzheng
 */
@Component
@ConfigurationProperties(prefix = "info.site")
public class ConfigInfo {
    private  String url;
    private String tel;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
