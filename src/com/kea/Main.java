package com.kea;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	Cat Oscar = new Cat();
	Oscar.name = "Oscar";
	Oscar.gender = "male";
	Oscar.age = 3;
	Oscar.weight = 7;
	Oscar.color = "brown";
	Oscar.texture = "striped";

	Cat Luna = new Cat();
	Luna.name = "Luna";
	Luna.gender = "female";
	Luna.age = 2;
	Luna.weight = 5;
	Luna.color = "gray";
	Luna.texture = "plain";

		System.out.println(""+Oscar);
		System.out.println("");
		System.out.println(""+Luna);
    }
}
