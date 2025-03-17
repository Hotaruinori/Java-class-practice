package Week04;

public class Polymorphism6 {
    /* 
    public void run(BMW bmw) {
    		bmw.run();
    }
	public void run(Tesla tesla) {
		tesla.run();
	}	*/
    public void run(Car car)
    {
            car.run();
    }
    
        public static void main(String[] args) {
            Polymorphism6 p = new Polymorphism6();
    		BMW bmw = new BMW();
    		p.run(bmw);
    		
    		Tesla tesla = new Tesla();
    		p.run(tesla);
            
            Car car = new BMW();
            p.run(car);

        }
    
    }
class Car {
    public void run() {
        System.out.println("Car is running");
    }
}

class BMW extends Car {
    public void run() {
        System.out.println("BMW is running");
    }
}

class Tesla extends Car {
    public void run() {
        System.out.println("Tesla is running");
    }
}
        