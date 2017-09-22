package scutum.core.contracts;

public interface IProcessor {
    Alert[] process(ScannedData data);
}
