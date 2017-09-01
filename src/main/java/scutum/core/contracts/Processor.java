package scutum.core.contracts;

public interface Processor {
    Object process(ScannedData data);
    Integer getProviderId();
}
