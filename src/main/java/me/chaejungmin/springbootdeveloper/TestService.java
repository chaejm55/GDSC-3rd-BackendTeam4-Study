package me.chaejungmin.springbootdeveloper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    private final MemberRepository memberRepository;
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
