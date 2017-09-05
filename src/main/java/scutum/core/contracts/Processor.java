package scutum.core.contracts;

public interface Processor {
    Integer getProviderId();
    Alert[] process(ScannedData data);
}
