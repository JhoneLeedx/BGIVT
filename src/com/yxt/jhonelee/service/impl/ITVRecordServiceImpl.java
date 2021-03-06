package com.yxt.jhonelee.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yxt.jhonelee.mapper.ITVRecordMapper;
import com.yxt.jhonelee.model.ITVRecord;
import com.yxt.jhonelee.service.ITVRecordService;

@Service
@Transactional
public class ITVRecordServiceImpl implements ITVRecordService{

	@Resource
	private ITVRecordMapper mapper;

	@Override
	public ITVRecord SelectAllRecord(int id) {
		// TODO Auto-generated method stub
		return mapper.SelectAllRecord(id);
	}

	@Override
	public Integer InsertRecord(ITVRecord itvRecord) {
		// TODO Auto-generated method stub
		return mapper.InsertRecord(itvRecord);
	}
	
}
