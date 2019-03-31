package pl.spring.dto;

import java.util.Objects;

public class CustomerDTO {

    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public int hashCode() {

        return Objects.hash(login);
    }

    @Override
    public String toString() {
        return "TopUserDTO{" +
                "login='" + login + '\'' +

                '}';
    }


}
