package cn.bugstack.chatbot.api.domain.zsxq;

import cn.bugstack.chatbot.api.domain.zsxq.model.aggregates.UnAnsweredQuestionsAggregates;
import org.slf4j.Logger;

import java.io.IOException;

//知识星球api接口
public interface IZsxqApi {

    UnAnsweredQuestionsAggregates queryUnAnsweredQuestionTopicId(String groupId, String cookie) throws IOException;

    boolean answer(String groupId, String cookie, String topicId, String text, boolean silened) throws IOException;

}
