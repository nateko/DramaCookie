package com.nexyliya.dramacookie.enums;

public enum UserStatus {

		ENABLED(1),
		DISABLED(0);
	
	private final int code;
	
	public int getCode() {
        return code;
    }
	
	UserStatus(int code) {
		this.code = code;
	}
	
}
