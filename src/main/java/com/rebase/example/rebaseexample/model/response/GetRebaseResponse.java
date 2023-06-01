package com.rebase.example.rebaseexample.model.response;

import com.rebase.example.rebaseexample.model.BaseRebaseResponse;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class GetRebaseResponse extends BaseRebaseResponse {

    private String title;
    private String documentId;
}
