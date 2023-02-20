package Modal;

import java.util.List;
import java.util.Objects;

public class Team {
    private String name;
    private String location;
    private List<Player> player;

    public Team() {
    }

    public Team(String name, String location, List<Player> player) {
        this.name = name;
        this.location = location;
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return name.equals(team.name) && location.equals(team.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", player=" + player +
                '}';
    }
}
