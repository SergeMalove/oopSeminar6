package oopSeminar6.task8;

class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        // ������ ��������� ��������
        System.out.println("���������� ��������");
    }

    @Override
    public void turnOff() {
        // ������ ���������� ��������
        System.out.println("����������� ��������");
    }
}
