package com.kakao.problem.web.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProgramFindRequest {

    @NotNull
    private String regionCode;

}
