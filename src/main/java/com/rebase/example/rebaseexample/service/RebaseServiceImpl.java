package com.rebase.example.rebaseexample.service;

import com.rebase.example.rebaseexample.model.request.GetRebaseRequest;
import com.rebase.example.rebaseexample.model.request.PostRebaseRequest;
import com.rebase.example.rebaseexample.model.request.UpdateRebaseRequest;
import com.rebase.example.rebaseexample.model.response.GetRebaseResponse;
import com.rebase.example.rebaseexample.model.response.PostRebaseResponse;
import com.rebase.example.rebaseexample.model.response.UpdateRebaseResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class RebaseServiceImpl implements RebaseService {
    @Override
    public GetRebaseResponse getRebase(GetRebaseRequest request) {
        log.info("GetRebaseRequest: {}", request);
        return GetRebaseResponse.builder()
                .id("1")
                .name("second")
                .title("title")
                .documentId("documentId")
                .build();
    }

    @Override
    public PostRebaseResponse postRebase(PostRebaseRequest request) {
        log.info("PostRebaseRequest: {}", request);
        return PostRebaseResponse.builder()
                .id("1")
                .name("second")
                .title("title")
                .documentId("documentId")
                .url("unknown")
                .build();
    }

    @Override
    public UpdateRebaseResponse updateRebase(UpdateRebaseRequest request) {
        log.info("UpdateRebaseRequest: {}", request);
        return UpdateRebaseResponse.builder()
                .id("1")
                .name("second")
                .ucc("uyu")
                .title("title")
                .documentId("documentId")
                .build();
    }
}
