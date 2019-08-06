package org.mbov.cloud.sso.service.impl;

import org.mbov.cloud.sso.entity.SysUser;
import org.mbov.cloud.sso.repository.SysUserRepository;
import org.mbov.cloud.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ChengJianSheng
 * @date 2019-02-12
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public SysUser getByUsername(String username) {
        return sysUserRepository.findByUsername(username);
    }
}
