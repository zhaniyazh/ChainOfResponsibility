public class Chain implements Handler{
    private Handler changeHandler;
    @Override
    public void setHandler(Handler nextHandler) {
        changeHandler = nextHandler;
    }
    @Override
    public void support(Request issue) {
        if (changeHandler != null) {
            changeHandler.support(issue);
        } else {
            System.out.println("A higher-level handle cannot pass a support request up to a lower-level handle");
        }
    }
}
