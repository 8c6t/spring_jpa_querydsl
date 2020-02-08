package com.hachicore.querydsl.repository;

import com.hachicore.querydsl.dto.MemberSearchCondition;
import com.hachicore.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {

    List<MemberTeamDto> search(MemberSearchCondition condition);

}
