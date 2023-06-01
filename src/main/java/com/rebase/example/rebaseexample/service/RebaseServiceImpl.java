package com.rebase.example.rebaseexample.service;

import com.rebase.example.rebaseexample.model.request.GetRebaseRequest;
import com.rebase.example.rebaseexample.model.request.PostRebaseRequest;
import com.rebase.example.rebaseexample.model.response.GetRebaseResponse;
import com.rebase.example.rebaseexample.model.response.PostRebaseResponse;
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
                .id("2")
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
    public void deleteRebaseById(String id) {
        log.info("Rebase id: " + id);
    }
}
