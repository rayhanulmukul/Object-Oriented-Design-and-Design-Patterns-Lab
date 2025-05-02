package ChainofResponsibilityPattern;

public interface AuthorizationHandler {
    void authorize(int amount);
    void setNextHandler(AuthorizationHandler nextHandler);
}