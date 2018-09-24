package com.nexyliya.dramacookie.entities;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

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
@Table(name="USERS")
public class User {

	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	
	@Size(max=100)
	private @NonNull String login;
	
	@Size(max=100)
	private @NonNull String email;
	
	private @NonNull String password;
	
	@Size(max=50)
	private @NonNull Role role;
	
	private String ipAddress;
	
	private UserStatus status;
	private LocalDateTime creationDate;
	private LocalDateTime lastChangeDate;
	private LocalDateTime lastAccessDate;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "user")
	private Profile profile;
	
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
