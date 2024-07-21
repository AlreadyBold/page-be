package KKSC.page.domain.member.dto.response;

import KKSC.page.domain.member.entity.Member;
import KKSC.page.domain.member.entity.Permission;

public record MemberResponse(
        String email,
        String username,
        String studentId
) {
    public static MemberResponse from(Member member) {
        return new MemberResponse(
                member.getEmail(),
                member.getUsername(),
                member.getStudentId()
        );
    }
}
