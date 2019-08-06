package org.mbov.cloud.sso.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 大部分时候直接用User即可不必扩展
 * @author ChengJianSheng
 * @date 2019-02-11
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class MyUser extends User {

    /**
     * 注释内容
     */
    private static final long serialVersionUID = -6657655476746153657L;

    private Integer departmentId;   //  举个例子，部门ID

    private String mobile;  //  举个例子，假设我们想增加一个字段，这里我们增加一个mobile表示手机号

    public MyUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public MyUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }
}
