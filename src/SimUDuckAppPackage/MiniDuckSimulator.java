package SimUDuckAppPackage;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MallardDuck mallard = new MallardDuck();
//		mallard.performQuack();
//		mallard.performFly();
//		Duck model = new ModelDuck();
//		model.performFly();
		//changing the behavior dynamically : 
//To change a duck�s behavior at runtime, just call the duck�s setter method for that behavior
//		model.setFlyBehavior(new FlyRocketPowered());
//		model.performFly();
		
		Device dv = new Device();
		dv.performDeviceCalling();
		dv.setQuackBehavior(new Squeak());
		dv.performDeviceCalling();


	} 

}
