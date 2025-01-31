package com.threeoh.HowAbout.dateactivity.dto;

import com.threeoh.HowAbout.dateactivity.entity.DateActivity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
public record DateActivityResponse(

        @Schema(description = "데이트 활동 ID", example = "1")
        Long id,

        @Schema(description = "데이트 활동 제목", example = "성수동 분위기 좋은 와인바 가기")
        String title,

        @Schema(description = "데이트 활동 위치", example = "서울 성동구 연무장17길 5 4층")
        String location,

        @Schema(description = "데이트 활동 지속시간", example = "1시간 30분")
        String durationTime,

        @Schema(description = "데이트 활동에 대한 자세한 설명", example = "분위기 좋은 성수동에 위치한 엔티크 와인 바의 야외 루프탑에서 “옥상 수비드 부채살 스테이크”와 레드와인을 곁들여 즐기기")
        String description
) {
    public static DateActivityResponse from(DateActivity dateActivity) {
        if (dateActivity == null ) {
            return null;
        }
        return DateActivityResponse.builder()
                .id(dateActivity.getId())
                .title(dateActivity.getTitle())
                .location(dateActivity.getLocation())
                .durationTime(dateActivity.getDurationTime())
                .description(dateActivity.getDescription())
                .build();
    }
}
