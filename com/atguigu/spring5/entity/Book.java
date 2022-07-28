package com.atguigu.spring5.entity;

public class Book {

		@Override
	public String toString() {
		return "Book [userId=" + userId + ", username=" + username + ", ustatus=" + ustatus + "]";
	}
		private String userId;
		private String username;
		private String ustatus;
		/**
		 * @return the userId
		 */
		public String getUserId() {
			return userId;
		}
		/**
		 * @return the username
		 */
		public String getUsername() {
			return username;
		}
		/**
		 * @return the ustatus
		 */
		public String getUstatus() {
			return ustatus;
		}
		/**
		 * @param userId the userId to set
		 */
		public void setUserId(String userId) {
			this.userId = userId;
		}
		/**
		 * @param username the username to set
		 */
		public void setUsername(String username) {
			this.username = username;
		}
		/**
		 * @param ustatus the ustatus to set
		 */
		public void setUstatus(String ustatus) {
			this.ustatus = ustatus;
		}
	
}
