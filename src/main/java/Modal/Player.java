package Modal;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.Objects;

public class Player {

    private String name;
    private String  country;
    private String  role;

    @JsonAlias("price-in-crores")
    private Double  pricesInCrores;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Double getPricesInCrores() {
        return pricesInCrores;
    }

    public void setPricesInCrores(Double pricesInCrores) {
        this.pricesInCrores = pricesInCrores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return name.equals(player.name) && country.equals(player.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", role='" + role + '\'' +
                ", pricesInCrores=" + pricesInCrores +
                '}';
    }
}
