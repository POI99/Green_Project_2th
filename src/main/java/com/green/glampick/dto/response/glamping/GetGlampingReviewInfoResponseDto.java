package com.green.glampick.dto.response.glamping;

import com.green.glampick.common.response.ResponseCode;
import com.green.glampick.common.response.ResponseMessage;
import com.green.glampick.dto.ResponseDto;
import com.green.glampick.dto.object.ReviewListItem;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashSet;
import java.util.List;

@Getter
@Setter
@Builder
public class GetGlampingReviewInfoResponseDto extends ResponseDto {
    private List<ReviewListItem> reviewListItems;
    private List<String> roomNames;
    private List<String> allReviewImage;
    private GetGlampingReviewInfoResponseDto() {
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
    }

    public static ResponseEntity<ResponseDto> success() {
        ResponseDto result = new ResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public GetGlampingReviewInfoResponseDto(List<ReviewListItem> reviewListItems, List<String> roomNames, List<String> allReviewImage) {

        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        this.reviewListItems = reviewListItems;
        this.roomNames = roomNames;
        this.allReviewImage = allReviewImage;

    }

}
