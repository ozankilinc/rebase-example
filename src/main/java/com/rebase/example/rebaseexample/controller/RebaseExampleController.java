package com.rebase.example.rebaseexample.controller;

import com.rebase.example.rebaseexample.model.request.GetRebaseRequest;
import com.rebase.example.rebaseexample.model.response.GetRebaseResponse;
import com.rebase.example.rebaseexample.service.RebaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/rebase")
public class RebaseExampleController {

    private final RebaseService rebaseService;

    @PostMapping("/get-rebase")
    public ResponseEntity<GetRebaseResponse> getRebase(@RequestBody GetRebaseRequest request) {
        return ResponseEntity.ok(rebaseService.getRebase(request));
    }
}
