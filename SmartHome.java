 class SmartHome {
     static final class Device {
     static final int MAX_DEVICES = 50;
        private int deviceID;
        private String deviceName;
        Device(int deviceID, String deviceName) {
            this.deviceID = deviceID;
            this.deviceName = deviceName;
        }
 final String getDeviceInfo() {
            return "Device ID: " + deviceID + ", Device Name: " + deviceName;
        }
    }
    static final class Configuration {
        static final int MAX_POWER_LIMIT = 5000;
    }
    abstract static class DeviceType {
        
        abstract String getDeviceCategory();
    }
    static class LightDevice extends DeviceType {
        String getDeviceCategory() {
            return "Light Device";
        }
    }
 static class FanDevice extends DeviceType {
         public String getDeviceCategory() {
            return "Fan Device";
        }
    }
    public static void main(String[] args) {
        Device device = new Device(101, "Smart Light");
        System.out.println(device.getDeviceInfo());
       System.out.println("Max Power Limit: " + Configuration.MAX_POWER_LIMIT);
        DeviceType lightDevice = new LightDevice();
        DeviceType fanDevice = new FanDevice();

        System.out.println("Light Device Category: " + lightDevice.getDeviceCategory());
        System.out.println("Fan Device Category: " + fanDevice.getDeviceCategory());
    }
}
