package com.nexyliya.dramacookie.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.nexyliya.dramacookie.enums.Gender;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
@Table(name="PROFILES")
public class Profile {

	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long id;
	
	@Size(max=100)
	private @NonNull String firstName;
	
	@Size(max=100)
	private @NonNull String lastName;
	
	private LocalDate birthDate;
	
	@Getter(AccessLevel.NONE) 
	private String pictureUrl;
	
	@Size(max=6)
	private @NonNull Gender gender;
	
	private String description;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
	
	public Profile(String firstName, String lastName, LocalDate birthDate, Gender gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	public String getPictureUrl() {
		return this.pictureUrl == null ? "/images/defaul_profile_pic.jpg" : this.pictureUrl;
	}
	
	
}
