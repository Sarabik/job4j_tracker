package ru.job4j.tracker.store;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.SqlTracker;
import static org.assertj.core.api.Assertions.*;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class SqlTrackerTest {

    private static Connection connection;

    @BeforeAll
    public static void initConnection() {
        try (InputStream in = SqlTrackerTest.class.getClassLoader().getResourceAsStream("test.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            connection = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")

            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @AfterAll
    public static void closeConnection() throws SQLException {
        connection.close();
    }

    @AfterEach
    public void wipeTable() throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("delete from items")) {
            statement.execute();
        }
    }

    @Test
    public void whenSaveItemAndFindByGeneratedIdThenMustBeTheSame() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = tracker.add(new Item("item"));
        assertThat(tracker.findById(item.getId())).isEqualTo(item);
    }

    @Test
    public void whenSaveTwoItemsAndReplaceFirstBySecond() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item1 = tracker.add(new Item("item1"));
        int id = item1.getId();
        Item item2 = new Item("item2");
        tracker.replace(id, item2);
        assertThat(tracker.findById(id).getName()).isEqualTo(item2.getName());
    }

    @Test
    public void whenSaveOneItemAndDeleteIt() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = tracker.add(new Item("item"));
        tracker.delete(item.getId());
        assertThat(tracker.findAll().size()).isEqualTo(0);
    }

    @Test
    public void whenAddThreeItemsAndFindAll() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item1 = tracker.add(new Item("item1"));
        Item item2 = tracker.add(new Item("item2"));
        Item item3 = tracker.add(new Item("item3"));
        assertThat(tracker.findAll()).containsAll(List.of(item1, item2, item3));
    }

    @Test
    public void whenSaveItemAndFindItByName() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = tracker.add(new Item("item"));
        assertThat(tracker.findByName("item").get(0)).isEqualTo(item);
    }

}
