package com.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.utils.JacksonObjectMapper;
import Modal.Player;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class TeamConfigTest {

    public static final String INDIA = "India";
    public static final String WICKET_KEEPER = "Wicket-keeper";

    private JacksonObjectMapper jacksonObjectMapper;

    @BeforeTest
    public void setUp(){
        jacksonObjectMapper = new JacksonObjectMapper();
    }


    /*This is the test for the problem 1: Write a test that validates that the team has only 4 foreign Players.*/
    @Parameters("fileName")
    @Test
    public void verifyOnlyFourForeignPlayersInTeam(String fileName) throws IOException {
        var teamData = jacksonObjectMapper.getDataInObjectFromJson(fileName);

        List<Player> foreignPlayerList =  teamData.getPlayer().stream()
                .filter(f -> !f.getCountry().equalsIgnoreCase(INDIA))
                .collect(Collectors.toList());

        Assertions.assertThat(foreignPlayerList).hasSize(4);
    }



    /*This is the test for the problem 1: Write a test that validates that there is at-least one wicket Keeper.*/
    @Parameters("fileName")
    @Test
    public void verifyMinimumOneWicketKeeperInTeam(String fileName) throws IOException {
        var playerData = jacksonObjectMapper.getDataInObjectFromJson(fileName);
        System.out.println( playerData.getPlayer());

        List<Player> wicketKeeperList = playerData.getPlayer().stream()
                .filter(w -> w.getRole().equalsIgnoreCase(WICKET_KEEPER))
                .collect(Collectors.toList());

        Assertions.assertThat(wicketKeeperList).hasSizeGreaterThanOrEqualTo(1);
        System.out.println("verifyMinimumOneWicketKeeperInTeam IS EXECUTED!!!!!");
    }
}
