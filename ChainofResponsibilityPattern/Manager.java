package ChainofResponsibilityPattern;

public class Manager implements AuthorizationHandler{
    //private AuthorizationHandler nextHandler;
    
    @Override
    public void authorize(int amount){
        if(amount > 1000000){
            System.out.println("Manager: Authorized amount of " + amount);
        }
        else{
            System.out.println("Authorization Denied");
        }
    }

    @Override
    public void setNextHandler(AuthorizationHandler nextHandler){
        // Manager is the last handler in the chain, so we don't set a next handler
    }
    
}
