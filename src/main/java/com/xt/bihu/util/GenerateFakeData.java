package com.xt.bihu.util;

import com.xt.bihu.entity.*;
import com.xt.bihu.mapper.*;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Repository
public class GenerateFakeData {
    private Logger logger = Logger.getLogger(GenerateFakeData.class);
    @Autowired
    private AnswerCommentMapper answerCommentMapper;
    @Autowired
    private AnswerMapper answerMapper;
    @Autowired
    private CollectionMapper collectionMapper;
    @Autowired
    private QuestionCommentMapper questionCommentMapper;
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private QuestionTopicMapper questionTopicMapper;
    @Autowired
    private TopicMapper topicMapper;
    @Autowired
    private UserMapper userMapper;

    public void generateData(int number) {
        generateAnswer(number);
        generateAnswerComment(number);
        generateCollection(number);
        generateQuestion(number);
        generateQuestionComment(number);
        generateQuestionTopic(number);
        generateTopic();
        generateUser(number);
    }

    private void generateQuestion(int number) {
        Question question = new Question();
        Random random = new Random();
        for (int i = 0; i <= number; i++) {
            question.setQuestionTitle(random.nextInt(1000) + "这是一个问题标题-" + getCurrentDateTimeString());
            question.setQuestionContent(random.nextInt(1000) + "这是问题内容" + getCurrentDateTimeString());
            question.setQuestionFollowedCount(random.nextInt(500));
            question.setQuestionScannedCount(random.nextInt(5000));
            question.setQuestionTopicList("[{\"code\":1,\"name\":\"testTopic1\"},{\"code\":2," +
                    "\"name\":\"testTopic2\"}");
            question.setUserId((long) random.nextInt(number));
            logger.info(question.toString());
            questionMapper.insertSelective(question);
        }
    }

    private void generateUser(int number) {
        User user = new User();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            user.setEmail(random.nextInt(10000000) + "@qq.com");
            user.setUserAvatarUrl("G:\\毕业设计\\avatar\\defaultUserAvatar.png");
            user.setUserCollectCount(random.nextInt(100));
            user.setUserCollectedCount(random.nextInt(100));
            user.setUserFollowCount(random.nextInt(100));
            user.setUserFollowedCount(random.nextInt(100));
            user.setUserFullDesc(random.nextInt(1000) + "这是一条完整的用户介绍" + getCurrentDateTimeString());
            user.setUserGender(random.nextInt(2) == 0 ? "男" : "女");
            user.setUserLikedCount(random.nextInt(100));
            user.setUserName(random.nextInt(1000) + "用户名" + getCurrentDateTimeString());
            user.setUserPassword(DigestUtils.md5Hex("123456"));
            user.setUserScannedCount(random.nextInt(500));
            user.setUserSimpleDesc(random.nextInt(1000) + "这是一条简单的用户介绍" + getCurrentDateTimeString());
            logger.info(user.toString());
            userMapper.insertSelective(user);
        }
    }

    private void generateAnswer(int number){
        Answer answer = new Answer();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            answer.setAnswerCommentCount(random.nextInt(100));
            answer.setAnswerContent(random.nextInt(1000) + "这是答案内容" + getCurrentDateTimeString());
            answer.setAnswerLikedCount(random.nextInt(500));
            answer.setQuestionId((long)random.nextInt(number));
            answer.setUserId((long)random.nextInt(number));
            logger.info(answer.toString());
            assert answerMapper != null;
            answerMapper.insertSelective(answer);
        }
    }

    private void generateTopic(){
        Topic topic = new Topic();
        topic.setTopicDesc("这是testTopic1话题");
        topic.setTopicFollowedCount(233);
        topic.setTopicName("testTopic1");
        logger.info(topic.toString());
        topicMapper.insertSelective(topic);

        topic.setTopicDesc("这是testTopic2话题");
        topic.setTopicFollowedCount(234);
        topic.setTopicName("testTopic2");
        logger.info(topic.toString());
        topicMapper.insertSelective(topic);
    }

    private void generateCollection(int number) {
        Collection collection = new Collection();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            collection.setCollectionFollowedCount(random.nextInt(200));
            collection.setCollectionName(random.nextInt(100) + "测试收藏夹名称" + getCurrentDateTimeString());
            collection.setUserId((long)random.nextInt(number));
            logger.info(collection.toString());
            collectionMapper.insertSelective(collection);
        }
    }

    private void generateQuestionTopic(int number){
        QuestionTopic questionTopic = new QuestionTopic();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            questionTopic.setQuestionId((long)random.nextInt(number));
            questionTopic.setTopicId((long)random.nextInt(number));
            logger.info(questionTopic.toString());
            questionTopicMapper.insertSelective(questionTopic);
        }
    }

    private void generateAnswerComment(int number) {
        AnswerComment answerComment = new AnswerComment();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            answerComment.setAnswerCommentContent(random.nextInt(2000) + "这是评论内容" + getCurrentDateTimeString());
            answerComment.setAnswerCommentLikedCount(random.nextInt(1000));
            answerComment.setAnswerId((long)random.nextInt(number));
            answerComment.setUserId((long)random.nextInt(number));
            logger.info(answerComment.toString());
            answerCommentMapper.insertSelective(answerComment);
        }
    }

    private void generateQuestionComment(int number) {
        QuestionComment questionComment = new QuestionComment();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            questionComment.setQuestionCommentContent(random.nextInt(2000) + "这是评论内容" + getCurrentDateTimeString());
            questionComment.setQuestionCommentLikedCount(random.nextInt(1000));
            questionComment.setQuestionId((long)random.nextInt(number));
            questionComment.setUserId((long)random.nextInt(number));
            logger.info(questionComment.toString());
            questionCommentMapper.insertSelective(questionComment);
        }
    }

    private String getCurrentDateTimeString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        return simpleDateFormat.format(date);
    }
}
