package com.learning.practice.ocr.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

@Configuration
@ConfigurationProperties(prefix = "tess4j")
public class Tess4jConfiguration {

    private String dataPath;
    private String chineseTrainData;
    private String englishTrainData;

    public String getDataPath() {
        return dataPath;
    }

    public String getAbsoluteDataPath() throws IOException {
        return new ClassPathResource(dataPath).getFile().getAbsolutePath();
    }

    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }

    public String getChineseTrainData() {
        return chineseTrainData;
    }

    public void setChineseTrainData(String chineseTrainData) {
        this.chineseTrainData = chineseTrainData;
    }

    public String getEnglishTrainData() {
        return englishTrainData;
    }


    public void setEnglishTrainData(String englishTrainData) {
        this.englishTrainData = englishTrainData;
    }
}
