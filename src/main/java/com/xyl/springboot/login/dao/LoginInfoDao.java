package com.xyl.springboot.login.dao;

import com.xyl.springboot.login.entity.LoginInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 账号密码表(LoginInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-20 08:59:11
 */
@Mapper
public interface LoginInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LoginInfo queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<LoginInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param loginInfo 实例对象
     * @return 对象列表
     */
    List<LoginInfo> queryAll(LoginInfo loginInfo);

    /**
     * 新增数据
     *
     * @param loginInfo 实例对象
     * @return 影响行数
     */
    int insert(LoginInfo loginInfo);

    /**
     * 修改数据
     *
     * @param loginInfo 实例对象
     * @return 影响行数
     */
    int update(LoginInfo loginInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}