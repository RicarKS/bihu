package com.xt.bihu.controller;

import com.xt.bihu.entity.Topic;
import com.xt.bihu.entity.User;
import com.xt.bihu.mapper.TopicMapper;
import com.xt.bihu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TestController {
    @Autowired
    private TopicMapper topicMapper;

    @GetMapping("/test")
    public String test(){
        Topic topic = new Topic();
        topic.setTopicName("ddd1");
        topic.setTopicDesc("ddd1");
        topic.setTopicFollowedCount(200);
        topicMapper.insertSelective(topic);

        return "ID:" + topic.getTopicId();
    }
}
