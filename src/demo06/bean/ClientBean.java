package demo06.bean;

public class ClientBean {
    private String clientName;
    private double clientIntegral;
    private String clientType;

    @Override
    public String toString() {
        return "ClientBean{" +
                "clientName='" + clientName + '\'' +
                ", clientIntegral='" + clientIntegral + '\'' +
                ", clientType='" + clientType + '\'' +
                '}';
    }

    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getClientIntegral() {
        return clientIntegral;
    }
    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public void setClientIntegral(double clientIntegral) {
        this.clientIntegral = clientIntegral;
    }
}
