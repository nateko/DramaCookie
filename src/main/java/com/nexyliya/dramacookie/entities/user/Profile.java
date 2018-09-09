package com.nexyliya.dramacookie.entities.user;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.nexyliya.dramacookie.enums.Gender;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import lombok.AccessLevel;


@Entity
@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
public class Profile {

	@Id private Long userId;
	private @NonNull String firstName;
	private @NonNull String lastName;
	private LocalDate birthDate;
	@Getter(AccessLevel.NONE) private String pictureUrl;
	private @NonNull Gender gender;
	private String description;
	
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
