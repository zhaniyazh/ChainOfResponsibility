package chain2;

public class Network implements Handler{
    private Handler changeHandler;
    @Override
    public void support(Request issue) {
        if (issue.getType() == Request.Type.network) {
            System.out.println( "Network system is solving the issue: " + issue.getDescription());
        } else{
            System.out.println("Request cannot be handled, try later!");
        }
    }

    @Override
    public void setHandler(Handler NewHandler) {
        changeHandler = NewHandler;
    }
}
