package Inheritance;

	//Parent or Super Class
	class Dad {
		void House() {	System.out.println("House method Dad");	}
		void Car()	{	System.out.println("Car method Dad");	}
	}
	//Child or Sub Class
	class Kid extends Dad{
		void Bike()	{	System.out.println("Bike from Kid");	}
		void Car()	{	System.out.println("Car from Kid");	}
	}

	class Inherit {
		public static void main(String[] args) {
			Dad dad = new Dad();
			Kid kid = new Kid();
			kid.Bike();
			kid.Car();
			kid.House();
			dad.Car();
		}
	}
