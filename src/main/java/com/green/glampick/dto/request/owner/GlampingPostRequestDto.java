package com.green.glampick.dto.request.owner;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class GlampingPostRequestDto {
    // glamping 테이블
    @JsonIgnore
    private long userId;
    @Schema(example = "뉴욕 카라반", description = "글램핑 이름")
    private String glampName;
    @Schema(example = "대구광역시 중구 109-2", description = "글램핑 주소")
    private String glampLocation;
    @Schema(example = "서울경기", description = "지역 분류")
    private String region;
    @Schema(example = "10000", description = "추가 인원에 대한 추가 요금")
    private int extraCharge;
    @Schema(example = "소개소개", description = "글램핑 소개")
    private String intro;
    @Schema(example = "글램핑입니다", description = "기본 정보")
    private String basic;
    @Schema(example = "이거 저거 주의해주세요", description = "이용 안내")
    private String notice;
    @Schema(example = "해수욕장 10분", description = "추가 위치 정보")
    private String traffic;

    // 이미지
    @JsonIgnore
    private String glampingImg;
    // 이미지 업로드를 위한 pk
    @JsonIgnore
    private long glampId;

}
