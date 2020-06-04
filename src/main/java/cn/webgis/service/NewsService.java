package cn.webgis.service;

import cn.webgis.pojo.News;

public interface NewsService {

    String getAllForPoint();

    String getAllForLine();

    String getNewsForEcharts();

    String getProvinceMap();

    String getHotNews();

    String getTitle(String news_id);

    String getNews();

    String getColdNews();

    String getWarmNews();

    void addData(News news);

    void deleteData(String comment_id);

    String queryChartData();
}
