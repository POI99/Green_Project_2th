package com.green.glampick.dto.response.owner.get;

import com.green.glampick.common.response.ResponseCode;
import com.green.glampick.common.response.ResponseMessage;
import com.green.glampick.dto.ResponseDto;
import com.green.glampick.dto.object.owner.BookBeforeItem;
import com.green.glampick.dto.object.owner.BookCancelItem;
import com.green.glampick.dto.object.owner.BookCompleteItem;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Getter
@Setter
public class GetOwnerBookListResponseDto extends ResponseDto {

    private List<BookBeforeItem> before;
    private List<BookCompleteItem> complete;
    private List<BookCancelItem> cancel;

    private GetOwnerBookListResponseDto(List<BookBeforeItem> before
        , List<BookCompleteItem> complete, List<BookCancelItem> cancel) {
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        this.before = before;
        this.complete = complete;
        this.cancel = cancel;
    }

    public static ResponseEntity<ResponseDto> success(List<BookBeforeItem> before
            , List<BookCompleteItem> complete, List<BookCancelItem> cancel) {
        GetOwnerBookListResponseDto result = new GetOwnerBookListResponseDto(before, complete, cancel);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public static ResponseEntity<ResponseDto> wrongGlampId() {
        ResponseDto result = new ResponseDto(ResponseCode.VALIDATION_FAILED, "글램핑Id를 올바르게 입력해주세요");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }
}
