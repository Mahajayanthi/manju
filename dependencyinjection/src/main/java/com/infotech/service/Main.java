package com.infotech.service;

public class Main {

	public static  void main(String[] args) {
		AbstractapplicationContext ctx=new 	classpathxmlapplicationcontent();
		Communication communication=  ctx.getbean("communication",Communication.class);
		communication.Communicate();
		System.out.println("hi jayu");

}
}
