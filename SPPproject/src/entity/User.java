package entity;

/**
 * Created by Администратор on 28.04.2017.
 */
public class User extends Entity {
    private String name;
    private String surname;
    private String fathersName;
    private Integer roleId;
    private String passportNumber;
    private String login;
    private String password;
    private String email;

    public User() {
        super();
    }

    public User(Integer id, String name, String surname, String fathersName, Integer roleId, String passportNumber,
                String login, String password, String email) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.fathersName = fathersName;
        this.roleId = roleId;
        this.passportNumber = passportNumber;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!getName().equals(user.getName())) return false;
        if (!getSurname().equals(user.getSurname())) return false;
        if (!getFathersName().equals(user.getFathersName())) return false;
        if (!getRoleId().equals(user.getRoleId())) return false;
        if (getPassportNumber() != null ? !getPassportNumber().equals(user.getPassportNumber()) : user.getPassportNumber() != null)
            return false;
        if (!getLogin().equals(user.getLogin())) return false;
        if (!getPassword().equals(user.getPassword())) return false;
        return getEmail() != null ? getEmail().equals(user.getEmail()) : user.getEmail() == null;
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getSurname().hashCode();
        result = 31 * result + getFathersName().hashCode();
        result = 31 * result + getRoleId().hashCode();
        result = 31 * result + (getPassportNumber() != null ? getPassportNumber().hashCode() : 0);
        result = 31 * result + getLogin().hashCode();
        result = 31 * result + getPassword().hashCode();
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", roleId=" + roleId +
                ", passportNumber='" + passportNumber + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
