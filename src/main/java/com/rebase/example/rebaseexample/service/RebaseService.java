package com.rebase.example.rebaseexample.service;

import com.rebase.example.rebaseexample.model.request.GetRebaseRequest;
import com.rebase.example.rebaseexample.model.response.GetRebaseResponse;

public interface RebaseService {

    GetRebaseResponse getRebase(GetRebaseRequest request);
}
