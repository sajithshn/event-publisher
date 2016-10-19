package publisher.schedular.util;

/**
 * Created by sajith on 8/3/16.
 */
public class SwitchingConfigurations {
    /**
     * Threshold throughput in TPS
     */
    private static double thresholdThroughput;

    /**
     * Threshold latency for start the VM in milliseconds
     */
    private static double vmStartTriggerThresholdLatency;

    /**
     * IP and port of the public cloud server which receives event.
     */
    private static Endpoint publicCloudEndpoint;

    /**
     * System will keep monitoring if the latency is below the threshold for tolerancePeriod. Once duration exceeds
     * tolerancePeriod it will start the VM
     */
    private static long tolerancePeriod;

    /**
     * Time taken for the VM to start
     */
    private static long vmStartDelay;

    /**
     * How long the before starting the next billing period of VM.
     */
    private static long vmBillingSessionDuration;

    /**
     * The threshold latency to start publishing data to private cloud.
     */
    private static long publicCloudPublishThresholdLatency;

    /**
     * Minimum events that should be sent public cloud in order to keep VM without shutting down
     */
    private static long minEventsToKeepVm;

    /**
     * The threshold latency to start the second VM.
     */
    private static long secondaryVmStartupThreshold;

    public static long getSecondaryVmDataPublishThreshold() {
        return secondaryVmDataPublishThreshold;
    }

    public static void setSecondaryVmDataPublishThreshold(long secondaryVmDataPublishThreshold) {
        SwitchingConfigurations.secondaryVmDataPublishThreshold = secondaryVmDataPublishThreshold;
    }

    /**
     * The threshold latency to start the second VM.
     */
    private static long secondaryVmDataPublishThreshold;

    /**
     * Number of times to see the secondary VM start up threshold to initiate the secondary VM start up
     */
    private static int secondaryVmStartupThresholdConsecutiveCount;

    public static int getSecondaryVmStartupThresholdConsecutiveCount() {
        return secondaryVmStartupThresholdConsecutiveCount;
    }

    public static void setSecondaryVmStartupThresholdConsecutiveCount(int secondaryVmStartupThresholdConsecutiveCount) {
        SwitchingConfigurations.secondaryVmStartupThresholdConsecutiveCount = secondaryVmStartupThresholdConsecutiveCount;
    }

    public static long getSecondaryVmStartupThreshold() {
        return secondaryVmStartupThreshold;
    }

    public static void setSecondaryVmStartupThreshold(long secondaryVmStartupThreshold) {
        SwitchingConfigurations.secondaryVmStartupThreshold = secondaryVmStartupThreshold;
    }

    public static long getVmBillingSessionDuration() {
        return vmBillingSessionDuration;
    }

    public static void setVmBillingSessionDuration(long vmBillingSessionDuration) {
        SwitchingConfigurations.vmBillingSessionDuration = vmBillingSessionDuration;
    }

    public static long getVmStartDelay() {
        return vmStartDelay;
    }

    public static void setVmStartDelay(long vmStartDelay) {
        SwitchingConfigurations.vmStartDelay = vmStartDelay;
    }


    public static long getTolerancePeriod() {
        return tolerancePeriod;
    }

    public static void setTolerancePeriod(long tolerancePeriod) {
        SwitchingConfigurations.tolerancePeriod = tolerancePeriod;
    }

    public static double getThresholdThroughput() {
        return thresholdThroughput;
    }

    public static void setThresholdThroughput(double thresholdThroughput) {
        SwitchingConfigurations.thresholdThroughput = thresholdThroughput;
    }

    public static double getVmStartTriggerThresholdLatency() {
        return vmStartTriggerThresholdLatency;
    }

    public static void setThresholdLatency(double getThresholdLatency) {
        SwitchingConfigurations.vmStartTriggerThresholdLatency = getThresholdLatency;
    }

    public static Endpoint getPublicCloudEndpoint() {
        return publicCloudEndpoint;
    }

    public static void setPublicCloudEndpoint(String ipAddress, int port) {
        SwitchingConfigurations.publicCloudEndpoint = new Endpoint(ipAddress, port);
    }

    public static long getPublicCloudPublishThresholdLatency() {
        return publicCloudPublishThresholdLatency;
    }

    public static void setPublicCloudPublishThresholdLatency(long publicCloudPublishThresholdLatency) {
        SwitchingConfigurations.publicCloudPublishThresholdLatency = publicCloudPublishThresholdLatency;
    }

    public static long getMinEventsToKeepVm() {
        return minEventsToKeepVm;
    }

    public static void setMinEventsToKeepVm(long minEventsToKeepVm) {
        SwitchingConfigurations.minEventsToKeepVm = minEventsToKeepVm;
    }
}
