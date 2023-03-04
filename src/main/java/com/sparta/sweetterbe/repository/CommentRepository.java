package com.sparta.sweetterbe.repository;

import com.sparta.sweetterbe.entity.Comment;
import com.sparta.sweetterbe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByPostId(Long id);

    List<Comment> findAllByUserOrderByCreatedAtDesc(User user);
}

