package com.docswebapps.java8;

public class AnonymousInnerClass {
	  public static void main(String[] args) {
	    new Thread(new Runnable() {
	      @Override
	      public void run() {
	        System.out.println("A thread created and running as an anonymous inner class...");
	      }
	    }).start();
	  }
}
