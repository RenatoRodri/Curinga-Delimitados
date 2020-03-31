package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Retangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Shape> myshape = new ArrayList<>();
		myshape.add(new Circle(2.0));
		myshape.add(new Retangle(2.0, 4.0));
		
		System.out.println("Total Area: " + totalArea(myshape));
		
		sc.close();	
	}
		public static double totalArea(List <? extends Shape> list) {
			double sum = 0.0;
			for(Shape s : list) {
				sum += s.area();
			}
			return sum;
			
		}
		
	
	}

