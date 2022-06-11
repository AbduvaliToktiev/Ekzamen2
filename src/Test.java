public class Test {
    public static void main(String[] args) {
        Phone redmi = new Phone();
        redmi.setNumber(706173081);
        redmi.setModel("Redmi");
        redmi.setWeight(500.0);
        System.out.println(redmi);
        redmi.receiveCall("Abduvali");
        redmi.receiveCall(555777760);
        redmi.sendMessage(777738264, 706288234, 707677545);
        System.out.println();
        Phone iphone = new Phone();
        iphone.setNumber(701101204);
        iphone.setModel("Iphone");
        iphone.setWeight(400.8);
        System.out.println(iphone);
        iphone.receiveCall("Aziz");
        iphone.receiveCall(702657875);
        iphone.sendMessage(777777777, 705700700);
        System.out.println();
        Phone samsung = new Phone();
        samsung.setNumber(700316178);
        samsung.setModel("Samsung");
        samsung.setWeight(450.5);
        System.out.println(samsung);
        samsung.receiveCall("Ruslan");
        samsung.receiveCall(555677552);
        samsung.sendMessage(222676545, 777644565, 555500500, 707833458);
    }
}
