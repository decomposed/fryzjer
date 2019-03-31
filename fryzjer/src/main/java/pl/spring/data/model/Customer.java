package pl.spring.data.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   //private String login;
    //private String password;
    @Column(unique = true, nullable = false, name = "first_name")
    private String firstName;
    @Column(unique = true, nullable = false, name = "last_name")
    private String lastName;
    @Column(unique = true, nullable = false, name = "telephone_Number")
    private String telephoneNumber;


   /* @ManyToMany
    @JoinTable(name = "users_known_sources", // Wskazujemy wprost nazwę tabeli mapująej
            joinColumns = @JoinColumn(name = "user_id"), // nazwę pola referencji do encji KnowledgeSource
            inverseJoinColumns = @JoinColumn(name = "source_id")
    )
    */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   /*public String getLogin() {
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
    */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                //", login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}

