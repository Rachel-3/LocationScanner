package com.example.locationscanner;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class KakaoSearchResult {
    @SerializedName("documents")
    List<KakaoDocument> documents;


    public List<KakaoDocument> getDocuments() {
        return documents;
    }
}