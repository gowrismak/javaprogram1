
public class GenericProgram1 {

	public static void main(String[] args) {
		Product prod=new Product("10ps","perfume");
		//Product<String,String> prod=new Product("10ps","perfume");
		//String productid=prod.productid;
		/*String productid=(String)prod.productid;
		 System.out.println(productid);
         int productid=(int)prod.productid;
		 System.out.println(productid);*/
		
		
		
   System.out.println(prod);
	}

	}
/*class Product
{
	 Object productid;//Object= some time productid is number od alpha numericso go Object
	 Object productdescription;
public Product(Object productid,Object productdescription)
{this.productid=productid;
this.productdescription=productdescription;
}
public String toString()
{
	return "product{" + "Productid=" + productid + ",Productdesctiption=" + productdescription + "}";
}
}*/
class Product<T,U>
{
	T productid;//Object= some time productid is number od alpha numericso go Object
	U productdescription;
public Product(T productid,U productdescription)
{this.productid=productid;
this.productdescription=productdescription;
}
public String toString()
{
	return "product{" + "Productid=" + productid + ",Productdesctiption=" + productdescription + "}";
}
}
