public interface Handler {
    void support(Request issue);
    void setHandler(Handler NewHandler);
}
