public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone() {

    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Номер телефона: " + "+996" + number + "\n" +
                "Модель телефона: " + model + "\n" +
                "Вес телефона: " + weight + " гр/кг";
    }


    void receiveCall(String name) {
        System.out.println("Звонит: " + "{" + name + "}");
    }

    void receiveCall(int number) {
        System.out.println("Номер телефона звонящего: " + "+996" + number);
    }

    void sendMessage(int... numberReturn) {
        int count = 0;
        System.out.println("Номера телефонов которым будет отправлено сообщение: ");
        for (int i = 0; i < numberReturn.length; i++) {
            System.out.println("+996" + numberReturn[i]);
            count++;
        }
            System.out.println("Количество созданных номеров: " + count);
    }
}
