package com.fanhl.test.t2015.t09.t20151003;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Book {
    /**
     * 期刊号
     */
    public String issn;
    /**
     * 期刊名称
     */
    public String name;
    /**
     * 发布日期
     */
    public String date;

    /**
     * 存放上一次退出时读到的页数
     */
    public int readedPageNum;
    /**
     * 总页数
     */
    public int pageCount;

    /**
     * 相对路径(存放漫画在mExternalDir中的位置)
     */
    public String relativePath;

    ///////////////////////////以下来自NHentai

    /**
     * 必须获取到的数据
     */
    public String title, other, bookId;

    /**
     * 次要数据
     */
    public String previewImageUrl, bigCoverImageUrl, titleJP, galleryId;


    public int thumbHeight = 0, thumbWidth = 0;

    public String parodies, language, artist, group;
    public ArrayList<String> tags       = new ArrayList<>();
    public ArrayList<String> characters = new ArrayList<>();

    public String uploadTime, uploadTimeText;

    public Book() {
        this(null, null, null);
    }

    public Book(String title, String other, String bookId) {
        this(title, other, bookId, null);
    }

    public Book(String title, String other, String bookId, String previewImageUrl) {
        this.title = title;
        this.other = other;
        this.bookId = bookId;
        this.previewImageUrl = previewImageUrl;
    }

    public String getAvailableTitle() {
        return name;
//        return this.titleJP != null ? this.titleJP : this.title;
    }

    public String toJSONString() {
        return new Gson().toJson(this);
    }

}
