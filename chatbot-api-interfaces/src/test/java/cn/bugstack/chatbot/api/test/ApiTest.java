package cn.bugstack.chatbot.api.test;
//单元测试

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

public class ApiTest {
    @Test
    public void query_unswered_question() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet get = new HttpGet("https://api.zsxq.com/v2/groups/51112814851444/topics?scope=unanswered_questions&count=20");


        get.addHeader("cookie", "sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%2218b7ed978f3c24-03d743c668a5c-26031151-1395396-18b7ed978f4822%22%2C%22first_id%22%3A%22%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E5%BC%95%E8%8D%90%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC%22%2C%22%24latest_referrer%22%3A%22https%3A%2F%2Fbugstack.cn%2F%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMThiN2VkOTc4ZjNjMjQtMDNkNzQzYzY2OGE1Yy0yNjAzMTE1MS0xMzk1Mzk2LTE4YjdlZDk3OGY0ODIyIn0%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D%2C%22%24device_id%22%3A%2218b7ed978f3c24-03d743c668a5c-26031151-1395396-18b7ed978f4822%22%7D; zsxq_access_token=CA056C99-4528-E3C4-5630-C35227435289_361B847964630109; abtest_env=product; zsxqsessionid=3fb8b4d4bfa52182910c95b22789ce04");
        get.addHeader("Content-Type", "application/json, charset=utf8");
        CloseableHttpResponse response = httpClient.execute(get);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());

        }


    }

    @Test
    public void answer() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost("https://api.zsxq.com/v2/topics/211455288844221/answer");
        post.addHeader("cookie", "sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%2218b7ed978f3c24-03d743c668a5c-26031151-1395396-18b7ed978f4822%22%2C%22first_id%22%3A%22%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E5%BC%95%E8%8D%90%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC%22%2C%22%24latest_referrer%22%3A%22https%3A%2F%2Fbugstack.cn%2F%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMThiN2VkOTc4ZjNjMjQtMDNkNzQzYzY2OGE1Yy0yNjAzMTE1MS0xMzk1Mzk2LTE4YjdlZDk3OGY0ODIyIn0%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D%2C%22%24device_id%22%3A%2218b7ed978f3c24-03d743c668a5c-26031151-1395396-18b7ed978f4822%22%7D; zsxq_access_token=CA056C99-4528-E3C4-5630-C35227435289_361B847964630109; abtest_env=product; zsxqsessionid=3fb8b4d4bfa52182910c95b22789ce04");
        post.addHeader("Content-Type", "application/json, charset=utf8");
        String paramJson = "{\n" +
                "  \"req_data\": {\n" +
                "    \"text\": \"嗯嗯~\\n\",\n" +
                "    \"image_ids\": []\n" +
                "  }\n" +
                "}";
        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);
        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());

        }
    }

}
