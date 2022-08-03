package com.example.news;

public class Model
{
    private  String header;
    private  String desc;
    private String imageurl;
    private  String urlwebpage;

    public String getUrlwebpage() {
        return urlwebpage;
    }

    public void setUrlwebpage(String urlwebpage) {
        this.urlwebpage = urlwebpage;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
