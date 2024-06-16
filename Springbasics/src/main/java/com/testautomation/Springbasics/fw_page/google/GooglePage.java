package com.testautomation.Springbasics.fw_page.google;


import com.testautomation.Springbasics.fw_page.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GooglePage extends Base {

    @Autowired
    private Search search;

    @Autowired
    private SearchResult searchResult;

    @Value("${application.url}")
    private String appURL;

    public void launch() {
        this.webDriver.get(appURL);
    }

    public Search getSearch() {
        return search;
    }

    public SearchResult getSearchResult() {
        return searchResult;
    }

    @Override
    public boolean isAt() {
        return this.search.isAt();
    }

}
