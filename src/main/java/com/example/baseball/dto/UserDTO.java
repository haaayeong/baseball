package com.example.baseball.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	
// 아이디 ( not null, unique, 길이 설정( 4~16 ), 영어 숫자 포함해서 써야함 )
// 비밀번호 ( not null, unique, 길이 설정( 8~20 ), 영어, 숫자, 특수문자 포함해서 써야함. )
// 닉네임 설정 ( not null, unique, 길이 설정(30) )
// 이메일 ( not null, 이메일 형식만 지키면 됨 )
	@NotNull(message = "아이디는 반드시 입력하셔야 합니다.")
	@NotBlank(message = "아이디는 반드시 입력하셔야 합니다.")
	@Size(min = 4, max = 16, message = "아이디는 4~16자 이내로 입력하셔야 합니다.")
	@Pattern(regexp = "^[a-z0-9]*$", message = "아이디는 소문자와 숫자만 사용하여 입력하셔야 합니다.")
	private String username;
	
	@NotNull(message = "비밀번호는 반드시 입력하셔야 합니다.")
	@NotBlank(message = "비밀번호는 반드시 입력하셔야 합니다.")
	@Size(min = 6, max = 20, message = "비밀번호는 6~20자 이내로 입력하셔야 합니다.")
	@Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()=])[A-Za-z\\d~!@#$%^&*()=]*$", message = "비밀번호는 영문 대소문자, 숫자, 특수문자(~!@#$%^&*()=)를 포함하여 입력하셔야합니다.")
	private String password;
	
	@NotNull(message = "닉네임은 반드시 입력하셔야 합니다.")
	@NotBlank(message = "닉네임은 반드시 입력하셔야 합니다.")
	@Pattern(regexp = "^[가-힣a-zA-Z0-9]{1,20}$", message = "닉네임은 특수문자를 포함하지 않은 1~20자 이내로 입력하셔야 합니다.")
	private String nickname;
	
	@NotNull(message = "이메일은 반드시 입력하셔야 합니다.")
	@NotBlank(message = "이메일은 반드시 입력하셔야 합니다.")
	@Email(message = "이메일은 이메일 형식으로 입력하셔야 합니다.")
	private String email;

}
