package com.capg.sprint1.dadims.model;

public class RawMaterialSpecs {

	String rmsId;
	String name;
	double pricePerUnit;
	int duration;
	String description;
	
	public RawMaterialSpecs() {
		super();
	}

	public RawMaterialSpecs(String rmsId, String name, double pricePerUnit, int duration, String description) {
		super();
		this.rmsId = rmsId;
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.duration = duration;
		this.description = description;
	}

	public String getRmsId() {
		return rmsId;
	}

	public void setRmsId(String rmsId) {
		this.rmsId = rmsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "RawMaterialSpecs [rmsId=" + rmsId + ", name=" + name + ", pricePerUnit=" + pricePerUnit + ", duration="
				+ duration + ", description=" + description + "]";
	}
	
	
	
}
