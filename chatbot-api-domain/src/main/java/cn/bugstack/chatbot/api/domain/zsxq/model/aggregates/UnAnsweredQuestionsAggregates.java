package cn.bugstack.chatbot.api.domain.zsxq.model.aggregates;

import cn.bugstack.chatbot.api.domain.zsxq.model.res.RespData;
//未回答问题的聚合信息
public class UnAnsweredQuestionsAggregates {
    private boolean succeeded;
    private RespData respData;

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    public RespData getRespData() {
        return respData;
    }

    public void setRespData(RespData respData) {
        this.respData = respData;
    }
}
