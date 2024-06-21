package com.findemployee.dto;

public class UserInfoDTO {

	private String roleName;
	private String candidateName;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [roleName=" + roleName + ", candidateName=" + candidateName + "]";
	}

}
