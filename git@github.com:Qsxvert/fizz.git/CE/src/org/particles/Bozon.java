package org.particles;

public class Bozon {
	
	private float spin;
	private float ectro;
	private float mass;
	private float x;
	private float y;
	private float t;
	private float speed;
	private float direction;
	
	public Bozon(float spin, float ectro, float mass, float x, float y, float t, float speed, float direction) {
		super();
		this.spin = spin;
		this.ectro = ectro;
		this.mass = mass;
		this.x = x;
		this.y = y;
		this.t = t;
		this.speed = speed;
		this.direction = direction;
	}
	
	public Bozon() {
		
	}
	
	public float getSpin() {
		return spin;
	}
	public void setSpin(float spin) {
		this.spin = spin;
	}
	public float getEctro() {
		return ectro;
	}
	public void setEctro(float ectro) {
		this.ectro = ectro;
	}
	public float getMass() {
		return mass;
	}
	public void setMass(float mass) {
		this.mass = mass;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getT() {
		return t;
	}
	public void setT(float t) {
		this.t = t;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public float getDirection() {
		return direction;
	}
	public void setDirection(float direction) {
		this.direction = direction;
	}

}
