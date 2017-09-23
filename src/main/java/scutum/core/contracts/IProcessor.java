package scutum.core.contracts;

public interface IProcessor {
    Integer getProviderId();
    Alert[] process(ScannedData data);
}
