package beginner;

import java.util.Scanner;

public class MagicAndSword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < times; i++) {
			String[] input = sc.nextLine().split(" ");
			
			int width = Integer.parseInt(input[0]);
			int height = Integer.parseInt(input[1]);
			
			int pointZeroX = Integer.parseInt(input[2]);
			int pointZeroY = Integer.parseInt(input[3]);
			
			int maxRangeX = width + pointZeroX;
			int maxRangeY = height + pointZeroY;
			
			String[] input2 = sc.nextLine().split(" ");
			
			String type = input2[0];
			int typeLevel = Integer.parseInt(input2[1]);
			int xPosition = Integer.parseInt(input2[2]);
			int yPosition = Integer.parseInt(input2[3]);
			
			int damage = 0;
			int range = 0;
			
			if(type.equalsIgnoreCase("fire")) {
				damage = 200;
				if(typeLevel == 1)
					range = 20;
				else if(typeLevel == 2)
					range = 30;
				else if(typeLevel == 3)
					range = 50;
			}
			else if(type.equalsIgnoreCase("water")) {
				damage = 300;
				range = 10 + (15 * (typeLevel - 1));
			}
			else if(type.equalsIgnoreCase("earth")) {
				damage = 400;
				if(typeLevel == 1)
					range = 25;
				else if(typeLevel == 2)
					range = 55;
				else if(typeLevel == 3)
					range = 70;
			}
			else if(type.equalsIgnoreCase("air")) {
				damage = 100;
				if(typeLevel == 1)
					range = 18;
				else if(typeLevel == 2)
					range = 38;
				else if(typeLevel == 3)
					range = 60;
			}
			
			boolean hasDamage = false;
			double distanceBetween = 0;
			
			if(xPosition <= maxRangeX && xPosition >= pointZeroX && yPosition >= pointZeroY && yPosition <= maxRangeY)
				hasDamage = true;
			
			else if(xPosition >= pointZeroX && xPosition <= maxRangeX) {
				if(yPosition > maxRangeY)
					distanceBetween = distance(xPosition, xPosition, maxRangeY, yPosition);
				else if(yPosition < pointZeroY)
					distanceBetween = distance(xPosition, xPosition, pointZeroY, yPosition);
			}
			
			else if(yPosition <= maxRangeY && yPosition >= pointZeroY) {
				if(xPosition < pointZeroX)
					distanceBetween = distance(pointZeroX, xPosition, yPosition, yPosition);
				else if(xPosition > maxRangeX)
					distanceBetween = distance(maxRangeX, xPosition, yPosition, yPosition);
			}
			
			else if(yPosition > maxRangeY && xPosition < pointZeroX)
				distanceBetween = distance(pointZeroX, xPosition, maxRangeY, yPosition);
			
			else if(yPosition > maxRangeY && xPosition > maxRangeX)
				distanceBetween = distance(maxRangeX, xPosition, maxRangeY, yPosition);
			
			else if(yPosition < pointZeroY && xPosition < pointZeroX)
				distanceBetween = distance(pointZeroX, xPosition, pointZeroY, yPosition);
			
			else if(yPosition < pointZeroY && xPosition > maxRangeX)
				distanceBetween = distance(maxRangeX, xPosition, pointZeroY, yPosition);
			
			
			if(distanceBetween <= range)
				hasDamage = true;
			
			if(hasDamage)
				System.out.println(damage);
			else
				System.out.println("0");
		}
	}
	
	public static double distance(int x0,int x1,int y0,int y1) {
		return Math.sqrt((Math.pow((x1 - x0), 2) + Math.pow((y1 - y0), 2)));
	}
}
