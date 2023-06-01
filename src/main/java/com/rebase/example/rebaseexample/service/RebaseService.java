package com.rebase.example.rebaseexample.service;

import com.rebase.example.rebaseexample.model.request.GetRebaseRequest;
import com.rebase.example.rebaseexample.model.request.PostRebaseRequest;
import com.rebase.example.rebaseexample.model.response.GetRebaseResponse;
import com.rebase.example.rebaseexample.model.response.PostRebaseResponse;

public interface RebaseService {

    GetRebaseResponse getRebase(GetRebaseRequest request);

    void deleteRebaseById(String id);

    PostRebaseResponse postRebase(PostRebaseRequest request);
}
