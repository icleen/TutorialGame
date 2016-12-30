package com.tutorial.main;

import java.awt.Graphics;

public abstract class GameObject {

	protected int x, y;
	protected ID id;
	protected int velX, velY;
	
	public GameObject( int x, int y, ID id ) {
		this.x = x;
		this.y = y;
		this.id = id;
		velX = 0;
		velY = 0;
	}
	
	public abstract void tick();
	public abstract void render( Graphics g );
	
	public void setX( int x ) {
		this.x = x;
	}
	public int getX() {
		return this.x;
	}
	public void setY( int y ) {
		this.y = y;
	}
	public int getY() {
		return this.y;
	}
	public void setID( ID id ) {
		this.id = id;
	}
	public ID getID() {
		return this.id;
	}
	public void setVelX( int x ) {
		this.velX = x;
	}
	public int getVelX() {
		return this.velX;
	}
	public void setVelY( int y ) {
		this.velY = y;
	}
	public int getVelY() {
		return this.velY;
	}
	
}
