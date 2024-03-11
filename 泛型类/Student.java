package 泛型类;

public class Student {
    private String account;
    private String password;
    public Student(String account,String password){
        this.account=account;
        this.password=password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }
}
