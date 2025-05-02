package ChainofResponsibilityPattern;

public class Cashier implements AuthorizationHandler{
    private AuthorizationHandler nextHandler;
    
    @Override
    public void authorize(int amount){
        if(amount <= 10000){
            System.out.println("Cashier: Authorized amount of " + amount);
        }
        else if(nextHandler != null){
            if(amount >= 1000000){
                System.out.println("Cashier forwarding to SeniorOfficer...");
            }
            else{
                System.out.println("Cashier Authorized...");
            }
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
