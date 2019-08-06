package org.mbov.cloud.sso.service;

import org.mbov.cloud.sso.entity.SysUser;

/**
 * @author ChengJianSheng
 * @date 2019-02-12
 */
public interface UserService {

    SysUser getByUsername(String username);
}
