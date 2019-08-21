package com.example.jsoup;

import java.io.IOException;

/**
 * Company: 十亿网络科技
 * Author: dengy
 * Email: 3291134235@qq.com
 * CreateTime: 2019年05月13日 16时42分
 * Description: <p></p>
 */
public class TestJsoup {
    public static void main(String[] args) {
        try {
            CrawlText.getText(true, true, "https://test.panpartner.com/#/login");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
