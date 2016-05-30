package cn.cug.laboratory.service;

import cn.cug.laboratory.model.persistent.PageModel;
import cn.cug.laboratory.model.persistent.User;

/**
 * Created by HXY on 2016/5/24.
 */

public interface UserService {
    /**
     *
     * @param user
     * @return
     */
    public String getAuth(User user);

    /**
     *
     * @param stuId
     * @param newPwd
     */
    public void updatePassword(String stuId,String newPwd);

    /**
     * @author: shixing
     * @since : 1.0.0
     * @function:动态插入信息
     */
    public void insertSelective(User record);


    /**
     * @author: shixing
     * @since : 1.0.0
     * @function:根据id删除
     */
    public void deleteByPrimaryKey(String id);

    /**
     * @author: shixing
     * @since : 1.0.0
     * @function:根据id修改任意信息
     */
    public int updateByPrimaryKeySelective(User record);

    /**
     * @author: shixing
     * @function:根据id查询信息
     * @since : 1.0.0
     */
    public User selectByPrimaryKey(String id);

    /**
     * @author: shixing
     * @since : 1.0.0
     * @function:模糊分页查询
     */
    public PageModel selectUserByUserNameAndAuth(Integer currentPage,
                                                 Integer offset,
                                                 User user);


    /**
     * @author: shixing
     * @function:根据用户名和密码查找用户
     * @since : 1.0.0
     */
    public User selectUserByUserNameAndPWD(User user);

}
