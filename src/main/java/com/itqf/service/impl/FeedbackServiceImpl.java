package com.itqf.service.impl;

import com.itqf.mapper.FeedbackMapper;
import com.itqf.pojo.Feedback;
import com.itqf.service.FeedbackService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 爱明天，更爱大佬
 */
@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Resource
    private FeedbackMapper feedbackMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Feedback record) {
        return 0;
    }

    @Override
    @Transactional
    public int insertSelective(Feedback record) {
        return feedbackMapper.insertSelective(record);
    }

    @Override
    public Feedback selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Feedback record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Feedback record) {
        return 0;
    }
}
