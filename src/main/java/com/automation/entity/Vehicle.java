package com.automation.entity;



	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	@Entity
	public class Vehicle {
	
		@Id
		@GeneratedValue
		private int vId;
		private String vehicleType;
		private String currentLocation;
		private int capacity;
		
		public Vehicle() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Vehicle(int vId, String vehicleType, String currentLocation, int capacity) {
			super();
			this.vId = vId;
			this.vehicleType = vehicleType;
			this.currentLocation = currentLocation;
			this.capacity = capacity;
		}
		public int getvId() {
			return vId;
		}
		public void setvId(int vId) {
			this.vId = vId;
		}
		public String getVehicleType() {
			return vehicleType;
		}
		public void setVehicleType(String vehicleType) {
			this.vehicleType = vehicleType;
		}
		public String getCurrentLocation() {
			return currentLocation;
		}
		public void setCurrentLocation(String currentLocation) {
			this.currentLocation = currentLocation;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		@Override
		public String toString() {
			return "Vehicle [vId=" + vId + ", vehicleType=" + vehicleType + ", currentLocation=" + currentLocation
					+ ", capacity=" + capacity + "]";
		}
		
		
	}


