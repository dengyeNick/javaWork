package com.example.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Company: 十亿网络科技
 * Author: dengy
 * Email: 3291134235@qq.com
 * CreateTime: 2019年05月13日 16时36分
 * Description: <p></p>
 */
public class CrawlText {

    /***
     * 获取文本
     *
     * @param autoDownloadFile
     *            自动下载文件
     * @param Multithreading
     *            多线程 默认false
     * @param Url
     *            网站链接
     * @throws IOException
     */
    public static void getText(boolean autoDownloadFile, boolean Multithreading, String Url) throws IOException {


        String rule = "abs:href";


        List<String> urlList = new ArrayList<String>();


        Document document = Jsoup.connect(Url)
                .userAgent("Mozilla\" to \"Mozilla/5.0 (Windows NT 10.0; WOW64; rv:50.0)")
                .timeout(400000).ignoreContentType(true)
                .get();

        System.out.println(document.toString());
        Elements urlNode = document.select("a[href$=.html]");

        for (Element element : urlNode) {
            urlList.add(element.attr(rule));
        }

        CrawTextThread crawTextThread = new CrawTextThread(urlList);
        crawTextThread.start();


    }

}
