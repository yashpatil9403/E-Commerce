package com.data.DTO;

public class UserRegistrationDto {
	
	  private String userName;
	    private String userEmail;
	    private String userPassword;
	    private String mobNumber;
	    private String userPic;
	    private String userAddress;
	    private String role;
		
	    private UserRegistrationDto() {
			super();
			// TODO Auto-generated constructor stub
		}

		private UserRegistrationDto(String userName, String userEmail, String userPassword, String mobNumber, String userPic,
				String userAddress, String role) {
			super();
			this.userName = userName;
			this.userEmail = userEmail;
			this.userPassword = userPassword;
			this.mobNumber = mobNumber;
			this.userPic = userPic;
			this.userAddress = userAddress;
			this.role = role;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public String getUserPassword() {
			return userPassword;
		}

		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}

		public String getMobNumber() {
			return mobNumber;
		}

		public void setMobNumber(String mobNumber) {
			this.mobNumber = mobNumber;
		}

		public String getUserPic() {
			return userPic;
		}

		public void setUserPic(String userPic) {
			this.userPic = userPic;
		}

		public String getUserAddress() {
			return userAddress;
		}

		public void setUserAddress(String userAddress) {
			this.userAddress = userAddress;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}
	    
	    

}
