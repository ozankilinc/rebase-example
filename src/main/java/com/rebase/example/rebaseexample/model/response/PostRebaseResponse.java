package com.rebase.example.rebaseexample.model.response;

import com.rebase.example.rebaseexample.model.BaseRebaseResponse;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class PostRebaseResponse extends BaseRebaseResponse {
    private String title;
    private String documentId;
    private String url;
}
