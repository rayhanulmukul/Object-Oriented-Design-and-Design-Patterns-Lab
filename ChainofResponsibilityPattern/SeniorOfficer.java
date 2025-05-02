package ChainofResponsibilityPattern;

public class SeniorOfficer implements AuthorizationHandler{
    private AuthorizationHandler nextHandler;
    
    @Override
    public void authorize(int amount){
        if(amount > 10000 && amount <= 1000000){
            System.out.println("Senior Officer: Authorized amount of " + amount);
        }
        else if(nextHandler != null){
            System.out.println("Senior Officer authorized...");
            nextHandler.authorize(amount);
        }
        else{
            System.out.println("Authorization Denied");
        }
    }

    @Override
    public void setNextHandler(AuthorizationHandler nextHandler){
        this.nextHandler = nextHandler;
    }
    
}
