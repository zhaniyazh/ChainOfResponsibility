package chain2;

public class Application {
    public static void main(String[] args) {
        Chain chain = new Chain();
        Handler hardwareHandler = new Hardware();
        Handler  softwareHandler = new Software();
        Handler networkHandler = new Network();
        chain.setHandler(hardwareHandler);
        hardwareHandler.setHandler(softwareHandler);
        softwareHandler.setHandler(networkHandler);

        Request hardware = new Request(1, "Hardware issue", 1, Request.Type.hardware);
        Request software = new Request(2, "Software issue", 2, Request.Type.software);
        Request network = new Request(3, "Network issue", 3, Request.Type.network);

        softwareHandler.support(hardware);
        softwareHandler.support(software);
        softwareHandler.support(network);
    }
}
