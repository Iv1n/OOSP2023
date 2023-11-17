package Pattern8;

public class main8 {
    public static void main(String[] args) {
        TextField textField = new TextField(new TextFieldMemento(""));

        textField.write("lol");
        textField.save();

        textField.write("Amogus");

        System.out.println("Текущий текст в редакторе:" + textField.getCurrentText());

        textField.save();
        System.out.println("Текущий текст в редакторе после изменения:" +textField.getCurrentText());

        textField.restore();

        System.out.println("Текущий текст в редакторе после восстановления: " + textField.getCurrentText());
    }
}
