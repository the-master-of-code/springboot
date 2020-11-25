package com.xyl.springboot.login.service;

import com.xyl.springboot.login.entity.LoginInfo;
import java.util.List;

/**
 * 账号密码表(LoginInfo)表服务接口
 *
 * @author makejava
 * @since 2020-11-20 11:29:38
 */
public interface LoginInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LoginInfo queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LoginInfo> queryAllByLimit(int offset, int limit);
    
    /**
     * 查询多条数据
     *
     * @param loginInfo 实例对象
     * @return 对象列表
     */
    List<LoginInfo> queryAll(LoginInfo loginInfo);

    /**
     * 新增数据
     *
     * @param loginInfo 实例对象
     * @return 实例对象
     */
    LoginInfo insert(LoginInfo loginInfo);

    /**
     * 修改数据
     *
     * @param loginInfo 实例对象
     * @return 实例对象
     */
    LoginInfo update(LoginInfo loginInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}