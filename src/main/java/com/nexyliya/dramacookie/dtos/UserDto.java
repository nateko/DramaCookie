package com.nexyliya.dramacookie.dtos;

import java.time.LocalDateTime;

import com.nexyliya.dramacookie.enums.Role;
import com.nexyliya.dramacookie.enums.UserStatus;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class UserDto {

	private Long id;
	private String login;
	private String email;
	private Role role;
	private String ipAddress;
	private UserStatus status;
	private String password;
	private LocalDateTime creationDate;
	private LocalDateTime lastChangeDate;
	private LocalDateTime lastAccessDate;
	
	public UserDto(Long id, String login, String email, Role role, String ipAddress, UserStatus status,
			LocalDateTime creationDate, LocalDateTime lastChangeDate, LocalDateTime lastAccessDate) {
		
		super();
		this.id = id;
		this.login = login;
		this.email = email;
		this.role = role;
		this.ipAddress = ipAddress;
		this.status = status;
		this.creationDate = creationDate;
		this.lastChangeDate = lastChangeDate;
		this.lastAccessDate = lastAccessDate;
	}

	public UserDto(Long id, String login, String email, Role role, String ipAddress, UserStatus status) {
		super();
		this.id = id;
		this.login = login;
		this.email = email;
		this.role = role;
		this.ipAddress = ipAddress;
		this.status = status;
	}
	
}
