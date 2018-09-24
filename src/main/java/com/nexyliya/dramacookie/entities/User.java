package com.nexyliya.dramacookie.entities.user;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.nexyliya.dramacookie.enums.Role;
import com.nexyliya.dramacookie.enums.UserStatus;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class User {

	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	private @NonNull String login;
	private @NonNull String email;
	private @NonNull String password;
	private @NonNull Role role;
	private String ipAddress;
	private UserStatus status;
	private LocalDateTime creationDate;
	private LocalDateTime lastChangeDate;
	private LocalDateTime lastAccessDate;
	
	public User(String login, String email, String password, Role role, String ipAddress, UserStatus status) {
		super();
		this.login = login;
		this.email = email;
		this.password = password;
		this.role = role;
		this.ipAddress = ipAddress;
		this.status = status;
	}
	
	public long getMembershipLengthInDays() {
		return ChronoUnit.DAYS.between(this.creationDate, LocalDateTime.now());
	}
	
	public long getMembershipLengthInMonths() {
		return ChronoUnit.MONTHS.between(this.creationDate, LocalDateTime.now());
	}
	
	public long getMembershipLengthInYears() {
		return ChronoUnit.YEARS.between(this.creationDate, LocalDateTime.now());
	}
}
