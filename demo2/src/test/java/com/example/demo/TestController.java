package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@AutoConfigureMockMvc
@SpringBootTest(classes = DemoApplicationTests.class)
public class TestController {

	    //mockMvc TomcatサーバへデプロイすることなくHttpリクエスト・レスポンスを扱うためのMockオブジェクト
	    @Autowired
	    private MockMvc mockMvc;

	    // getリクエストでviewを指定し、httpステータスでリクエストの成否を判定
	    @Test
	    void init処理が走って200が返る() throws Exception {
	        // andDo(print())でリクエスト・レスポンスを表示
	        this.mockMvc.perform(get("/books")).andDo(print())
	            .andExpect(status().isOk());
	    }
}
