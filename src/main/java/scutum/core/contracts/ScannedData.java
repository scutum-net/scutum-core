package scutum.core.contracts;

import java.util.Dictionary;

public class ScannedData {
    private final Integer customerId;
    private final Integer providerId;
    private final String providerName;

    private final String data;
    private final Integer scanId;
    private final Integer machineId;

    public ScannedData(Integer customerId,
                       Integer providerId,
                       String providerName,
                       Integer machineId,
                       Integer scanId,
                       String data) {
        // customer id
        this.customerId = customerId;
        this.providerId = providerId;
        this.providerName = providerName;
        this.machineId = machineId;
        this.scanId = scanId;
        this.data = data;
    }

    public Integer getCustomerId() { return customerId; }

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

    public String getProviderName() {
        return providerName;
    }
}
