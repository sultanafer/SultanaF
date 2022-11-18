package learnAbstract;

public class Test {
public static void main(String[] args) {
	
MobileUser mu;
	   mu=new X();
		    mu.sendMessage();
        mu.call();
       
        
        mu=new Y();
        mu.sendMessage();
        mu.call();
}

}
