package com.green.glampick.service.implement;

import com.green.glampick.dto.ResponseDto;
import com.green.glampick.dto.request.user.*;
import com.green.glampick.dto.response.user.*;
import com.green.glampick.entity.ReviewEntity;
import com.green.glampick.repository.ReviewRepository;
import com.green.glampick.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    private final ReviewRepository reviewRepository;

    @Override
    public ResponseEntity<? super GetBookResponseDto> getBook(GetBookRequestDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<? super PatchBookResponseDto> cancelBook(PatchBookRequestDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<? super PostReviewResponseDto> postReview(PostReviewRequestDto dto) {

        try {
            ReviewEntity reviewEntity = new ReviewEntity(dto);
            this.reviewRepository.save(reviewEntity);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDto.databaseError();
        }

        return PostReviewResponseDto.success();

    }

    @Override
    public ResponseEntity<? super DeleteReviewResponseDto> deleteReview(int email) {
        return null;
    }

    @Override
    public ResponseEntity<? super GetReviewResponseDto> getReview(GetReviewRequestDto email) {
        return null;
    }

    @Override
    public ResponseEntity<? super GetFavoriteGlampingListResponseDto> getFavoriteGlamping(GetFavoriteGlampingRequestDto email) {
        return null;
    }

    @Override
    public ResponseEntity<? super GetUserResponseDto> getUser(GetUserRequestDto email) {
        return null;
    }

    @Override
    public ResponseEntity<? super UpdateUserResponseDto> updateUser(UpdateUserRequestDto email) {
        return null;
    }

    @Override
    public ResponseEntity<? super DeleteUserResponseDto> deleteUser(int userId) {
        return null;
    }
}
