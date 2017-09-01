package scutum.core.contracts;

public class ScannedData {
    private final Integer providerId;
    private final Integer machineId;
    private final Integer scanId;
    private final String data;

    public ScannedData(Integer providerId, Integer machineId, Integer scanId, String data) {
        this.providerId = providerId;
        this.machineId = machineId;
        this.scanId = scanId;
        this.data = data;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public Integer getScanId() {
        return scanId;
    }

    public String getData() {
        return data;
    }
}
