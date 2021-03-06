package com.yxt.jhonelee.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yxt.jhonelee.model.User;

/**
 * 
 * @author JhoneLee 与数据库ITV_REGIST表对应的接口
 */

public interface UserMapper {
	
	public List<User> findUserBydocId();// 查询所有用户

	public List<User> findAllUser(int id);// 查询某个医生id下的所有用户信息

	public List<User> selectUserByPage(@Param(value = "id") int docid, @Param(value = "startPos") int startPos,
			@Param(value = "pageSize") int pageSize, @Param(value = "timeInt") int timeInt);// 分页显示某个医生id下的所有用户信息

	public int getUserCount(@Param(value = "id") int docid, @Param(value = "timeInt") int timeInt);// 得到总数

	public List<User> selectUserHomeBypage(@Param(value = "startPos") int startPos,
			@Param(value = "pageSize") int pageSize, @Param(value = "timeInt") int timeInt,
			@Param(value = "mId") int mId);// 分页得到所有用户最新的数据

	public int getHomeCount(@Param(value = "timeInt") int timeInt, @Param(value = "mId") int mId);// 得到首页的数据的总数
	
	
	public String getCodeValueString(String mCodeValue);//得到codevalue下包括codevalue的所有值

}
