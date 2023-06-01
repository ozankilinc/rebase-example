package com.rebase.example.rebaseexample.service;

import com.rebase.example.rebaseexample.model.request.GetRebaseRequest;
import com.rebase.example.rebaseexample.model.request.PostRebaseRequest;
import com.rebase.example.rebaseexample.model.request.UpdateRebaseRequest;
import com.rebase.example.rebaseexample.model.response.GetRebaseResponse;
import com.rebase.example.rebaseexample.model.response.PostRebaseResponse;
import com.rebase.example.rebaseexample.model.response.UpdateRebaseResponse;

public interface RebaseService {

    GetRebaseResponse getRebase(GetRebaseRequest request);

    PostRebaseResponse postRebase(PostRebaseRequest request);

    UpdateRebaseResponse updateRebase(UpdateRebaseRequest request);

    void deleteRebase(String id);
}
