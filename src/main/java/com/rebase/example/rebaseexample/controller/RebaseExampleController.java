package com.rebase.example.rebaseexample.controller;

import com.rebase.example.rebaseexample.model.request.GetRebaseRequest;
import com.rebase.example.rebaseexample.model.request.PostRebaseRequest;
import com.rebase.example.rebaseexample.model.request.UpdateRebaseRequest;
import com.rebase.example.rebaseexample.model.response.GetRebaseResponse;
import com.rebase.example.rebaseexample.model.response.PostRebaseResponse;
import com.rebase.example.rebaseexample.model.response.UpdateRebaseResponse;
import com.rebase.example.rebaseexample.service.RebaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/rebase")
public class RebaseExampleController {

    @Autowired
    private RebaseService rebaseService;

    @PostMapping("/get-rebase")
    public ResponseEntity<GetRebaseResponse> getRebase(@RequestBody GetRebaseRequest request) {

        return ResponseEntity.ok(rebaseService.getRebase(request));
    }

    @DeleteMapping("/delete-rebase/{id}")
    public ResponseEntity<Void> deleteRebase(@PathVariable("id") String id) {
        rebaseService.deleteRebaseById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/post-rebase")
    public ResponseEntity<PostRebaseResponse> postRebase(@RequestBody PostRebaseRequest request) {
        return ResponseEntity.ok(rebaseService.postRebase(request));
    }

    @PutMapping("put-rebase")
    public ResponseEntity<UpdateRebaseResponse> updateRebase(@RequestBody UpdateRebaseRequest request) {
        return ResponseEntity.ok(rebaseService.updateRebase(request));
    }

    @DeleteMapping("/delete-rebase/{id}")
    public ResponseEntity<Void> deleteRebase(@PathVariable("id") String id) {
        rebaseService.deleteRebaseById(id);
        return ResponseEntity.ok().build();
    }
}
