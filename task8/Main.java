package oopSeminar6.task8;

public class Main {
    public static void main(String[] args) {
        // ������� ������� ����������� ���������
        Switchable lightBulb = new LightBulb();
        Switchable fan = new Fan();

        // ������� ��������� ���������
        DeviceManager deviceManager = new DeviceManager();

        // ���������� �������� � �������� �
        deviceManager.setDevice(lightBulb);
        deviceManager.turnOnDevice(); // ��������� ��������

        // ������������� �� ���������� � �������� ���
        deviceManager.setDevice(fan);
        deviceManager.turnOnDevice(); // ��������� �����������

        // ��������� ������� ���������� (����������)
        deviceManager.turnOffDevice(); // ���������� �����������
    }
}
