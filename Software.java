package chain2;

public class Software implements Handler{
    private Handler changeHandler;
    @Override
    public void support(Request issue) {
        if (issue.getType() == Request.Type.software) {
            System.out.println( "Software system is solving the issue: " + issue.getDescription());
        } else if (changeHandler != null) {
            changeHandler.support(issue);
        }
    }

    @Override
    public void setHandler(Handler NewHandler) {
        changeHandler = NewHandler;
    }
}
