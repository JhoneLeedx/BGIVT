package com.yxt.jhonelee.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yxt.jhonelee.model.HealthSign;

public interface HealthSignMapper {

	public List<HealthSign> HealthUserSignCount(@Param(value = "mNum") int mNum,
			@Param(value = "list") List<String> list, @Param(value = "startPos") int startPos,
			@Param(value = "pageSize") int pageSize);// 用户健康签到数据

	public int UserSignCount(@Param(value = "mNum") int mNum, @Param(value = "list") List<String> list);// 用户总数

	public List<HealthSign> HealthDocSignCount(@Param(value = "mNum") int mNum,
			@Param(value = "list") List<String> list, @Param(value = "startPos") int startPos,
			@Param(value = "pageSize") int pageSize);// 医生健康签到数据

	public int DocSignCount(@Param(value = "mNum") int mNum, @Param(value = "list") List<String> list);// 医生总数

	public List<HealthSign> noUserSign(@Param(value="mTime")int mTime);// 健康档案未签约用户扫码信息

	public List<HealthSign> noDocSign(@Param(value="mTime")int mTime);// 健康档案未签约医生扫码信息

}
