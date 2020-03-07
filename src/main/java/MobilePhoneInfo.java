import java.time.LocalDateTime;


public class MobilePhoneInfo {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String brief;

    private String brand;

    private String model;

    private String released;

    private String deviceCategory;

    private String platform;

    private String operationSystem;

    private String cpuClock;

    private String cpu;

    private String ramType;

    private String ramCapacity;

    private String nonVolatileMemoryCapacity;

    private String resolution;

    private String pixelDensity;

    private String graphicalController;

    private String gpuClock;

    private LocalDateTime createTime;

    private LocalDateTime added;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getDeviceCategory() {
        return deviceCategory;
    }

    public void setDeviceCategory(String deviceCategory) {
        this.deviceCategory = deviceCategory;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getCpuClock() {
        return cpuClock;
    }

    public void setCpuClock(String cpuClock) {
        this.cpuClock = cpuClock;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public String getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(String ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public String getNonVolatileMemoryCapacity() {
        return nonVolatileMemoryCapacity;
    }

    public void setNonVolatileMemoryCapacity(String nonVolatileMemoryCapacity) {
        this.nonVolatileMemoryCapacity = nonVolatileMemoryCapacity;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getPixelDensity() {
        return pixelDensity;
    }

    public void setPixelDensity(String pixelDensity) {
        this.pixelDensity = pixelDensity;
    }

    public String getGraphicalController() {
        return graphicalController;
    }

    public void setGraphicalController(String graphicalController) {
        this.graphicalController = graphicalController;
    }

    public String getGpuClock() {
        return gpuClock;
    }

    public void setGpuClock(String gpuClock) {
        this.gpuClock = gpuClock;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getAdded() {
        return added;
    }

    public void setAdded(LocalDateTime added) {
        this.added = added;
    }

    @Override
    public String toString() {
        return "MobilePhoneInfo{" +
        "id=" + id +
        ", brief=" + brief +
        ", brand=" + brand +
        ", model=" + model +
        ", released=" + released +
        ", deviceCategory=" + deviceCategory +
        ", platform=" + platform +
        ", operationSystem=" + operationSystem +
        ", cpuClock=" + cpuClock +
        ", cpu=" + cpu +
        ", ramType=" + ramType +
        ", ramCapacity=" + ramCapacity +
        ", nonVolatileMemoryCapacity=" + nonVolatileMemoryCapacity +
        ", resolution=" + resolution +
        ", pixelDensity=" + pixelDensity +
        ", graphicalController=" + graphicalController +
        ", gpuClock=" + gpuClock +
        ", createTime=" + createTime +
        ", added=" + added +
        "}";
    }
}