package com.green.glampick.service;

import com.green.glampick.dto.request.login.SignInRequestDto;
import com.green.glampick.dto.request.login.SignUpRequestDto;
import com.green.glampick.dto.response.login.PostSignInResponseDto;
import com.green.glampick.dto.response.login.PostSignUpResponseDto;
import com.green.glampick.dto.response.login.mail.PostMailCheckResponseDto;
import com.green.glampick.dto.response.login.mail.PostMailSendResponseDto;
import com.green.glampick.dto.response.login.sms.PostSmsCheckResponseDto;
import com.green.glampick.dto.response.login.sms.PostSmsSendResponseDto;
import com.green.glampick.dto.response.login.token.GetAccessTokenResponseDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface LoginService {

    //  최초 실행 시, 초기화를 한번만 진행  //
    void init();

    //  6자리의 랜덤 숫자코드를 생성  //
    int createKey();

    //  이메일 회원가입 처리  //
    ResponseEntity<? super PostSignUpResponseDto> signUpUser(SignUpRequestDto dto);

    //  이메일 로그인 처리  //
    ResponseEntity<? super PostSignInResponseDto> signInUser(HttpServletResponse res, SignInRequestDto dto);

    //  AccessToken 불러오기  //
    ResponseEntity<? super GetAccessTokenResponseDto> getAccessToken(HttpServletRequest req);

    //  휴대폰 인증 문자 보내기  //
    ResponseEntity<? super PostSmsSendResponseDto> sendOne(String userPhone);

    //  휴대폰 인증코드 체크하기  //
    ResponseEntity<? super PostSmsCheckResponseDto> checkPhone(String userPhone, int phoneKey);

    //  이메일 인증 보내기  //
    ResponseEntity<? super PostMailSendResponseDto> sendAuthCode(String userEmail);

    //  이메일 코드 체크하기  //
    ResponseEntity<? super PostMailCheckResponseDto> checkCode(String userEmail, int authKey);

}
