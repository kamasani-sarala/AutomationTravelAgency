package com.automation.entity;


	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	public class Route {
	
		@Id
		@GeneratedValue
		private int rId;
		private String startLocation;
		private String endLocation;
		private int distance;
		
		public Route() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Route(int rId, String startLocation, String endLocation, int distance) {
			super();
			this.rId = rId;
			this.startLocation = startLocation;
			this.endLocation = endLocation;
			this.distance = distance;
		}
		public int getrId() {
			return rId;
		}
		public void setrId(int rId) {
			this.rId = rId;
		}
		public String getStartLocation() {
			return startLocation;
		}
		public void setStartLocation(String startLocation) {
			this.startLocation = startLocation;
		}
		public String getEndLocation() {
			return endLocation;
		}
		public void setEndLocation(String endLocation) {
			this.endLocation = endLocation;
		}
		public int getDistance() {
			return distance;
		}
		public void setDistance(int distance) {
			this.distance = distance;
		}
		@Override
		public String toString() {
			return "Route [rId=" + rId + ", startLocation=" + startLocation + ", endLocation=" + endLocation + ", distance="
					+ distance + "]";
		}
		
		
	}


