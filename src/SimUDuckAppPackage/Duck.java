package SimUDuckAppPackage;


	
	public abstract class Duck {
		//interface Type Variables that are going later to be referenced by a concrete implementation 
		// of that interface
		FlyBehavior flyBehavior;
		QuackBehavior quackBehavior;
		
		public Duck() {
		}
		// To allow the subclasses ducks to dynamically changes their flying and quacking behaviors
		public void setFlyBehavior(FlyBehavior fb) {
			flyBehavior = fb;
		}
		
		public void setQuackBehavior(QuackBehavior qb) {
			quackBehavior = qb;
		}
		
		public abstract void display();
		
		public void performFly() {
		flyBehavior.fly();
		}
		
		public void performQuack() {
		quackBehavior.quack();
		}
		
		public void swim() {
		System.out.println("All ducks float, even decoys !");

		}
	}
