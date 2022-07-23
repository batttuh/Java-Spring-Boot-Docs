
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerManager customerManager=new CustomerManager(new CustomerDal());
		CustomerManager customerManager1=new CustomerManager(new MySqlCustomerDal());

		customerManager.add();

	}

}
