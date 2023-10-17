package com.udemy.spring.learnspringframework.game;

public class Pacman implements GamingConsole{
	
	public void up() {
		System.out.println("ghost");
	}
	
	public void down() {
		System.out.println("eat");
	}
	public void left() {
		System.out.println("left");
	}
	public void right() {
		System.out.println("right");
	}

}
