package com.green.glampick.repository;

import com.green.glampick.dto.request.user.PostReviewRequestDto;
import com.green.glampick.entity.ReviewImageEntity;
import com.green.glampick.repository.resultset.GetUserReviewResultSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Repository
public interface ReviewImageRepository extends JpaRepository<ReviewImageEntity, Long> {

    List<ReviewImageEntity> findByReviewId(long reviewId);
    List<ReviewImageEntity> findByReviewIdIn(List<Long> reviewIds);

    ReviewImageEntity findByReviewImageId(long reviewId);
}
