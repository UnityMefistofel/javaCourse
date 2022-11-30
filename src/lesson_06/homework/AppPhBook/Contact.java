package lesson_06.homework.AppPhBook;

public class Contact {
    private String nameStr;
    private String phNumStr;
    private String emailStr;

    public String getName() {
        return nameStr;
    }

    public void setName(String nameStr) {
        this.nameStr = nameStr;
    }

    public String getEmail() {
        return emailStr;
    }

    public void setEmail(String emailStr) {
        this.emailStr = emailStr;
    }

    public String getPhoneNum() {
        return phNumStr;
    }

    public void setPhoneNum(String phNumStr) {
        this.phNumStr = phNumStr;
    }

    public Contact() {}
    public Contact(String name, String phoneNum, String email) {
        this.setName(name);
        this.setPhoneNum(phoneNum);
        this.setEmail(email);
    }

}
