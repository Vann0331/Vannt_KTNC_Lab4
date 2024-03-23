package ItemTest;

import com.example.lab4.Item;
import com.example.lab4.ItemManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ItemManagerTest {
    private ItemManager itemManager = new ItemManager();
    private List<Item> items = new ArrayList<>();


    ////ADD TEST
    @Test
    public void them01() {

        itemManager.addItem(new Item(8, "Vân"));
        Assertions.assertEquals(1, itemManager.getItems().size());
    }

    @Test
    public void them02() {

        itemManager.addItem(new Item(8, "annnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"));
        Assertions.assertEquals(1, itemManager.getItems().size());
    }

    @Test
    public void them03() {

        itemManager.addItem(new Item(8, "Vânnnn"));
        Assertions.assertEquals(1, itemManager.getItems().size());
    }

    @Test
    public void them04() {

        try {
            itemManager.addItem(new Item(8, "Vannnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"));
            Assertions.fail("Name khong hop le!");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(0, itemManager.getItems().size());
        }
    }

    @Test
    public void them05() {

        itemManager.addItem(new Item(8, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkk"));
        Assertions.assertEquals(1, itemManager.getItems().size());
    }

    @Test
    public void them06() {

        itemManager.addItem(new Item(1, "Vannn"));
        Assertions.assertEquals(1, itemManager.getItems().size());
    }

    @Test
    public void them07() {

        itemManager.addItem(new Item(5, "kkkkkkkkkkkkkkkkkkkk"));
        Assertions.assertEquals(1, itemManager.getItems().size());
    }

    @Test
    public void them08() {

        try {
            itemManager.addItem(new Item(5, " ggggggggggggggggggggggggggggggggggggggggggggggggggggggg"));
            Assertions.fail("Name khong hop le!");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(0, itemManager.getItems().size());
        }
    }


    @Test
    public void them09() {

        itemManager.addItem(new Item(5, "Va"));
        Assertions.assertEquals(1, itemManager.getItems().size());
    }

    @Test
    public void them010() {

        itemManager.addItem(new Item(5, " kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk"));
        Assertions.assertEquals(1, itemManager.getItems().size());
    }



//    ///TEST UPDATE
//
    @Test
    public void update01() {
        itemManager.addItem(new Item(8, " Vân"));
        itemManager.updateItem(8, "Vânn");
        assertEquals("Vânn", itemManager.getItems().get(0).getName());
    }
    @Test
    public void update02() {
        itemManager.addItem(new Item(8, " Vân"));
        itemManager.updateItem(8, "annnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        assertEquals("annnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn", itemManager.getItems().get(0).getName());
    }
    @Test
    public void update03() {
        itemManager.addItem(new Item(8, " Vân"));
        itemManager.updateItem(8, "annnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnv");
        assertEquals("annnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnv", itemManager.getItems().get(0).getName());
    }
    @Test
    public void update04() {

        itemManager.addItem(new Item(1, "InitialName"));

        itemManager.updateItem(1, "ggggggggggggggggggggggggggggggggggggggggggggggggggggggg");
        Assertions.fail("Name khong hop le!");

        Assertions.assertEquals(0, itemManager.getItems().size());

    }
    @Test
    public void update05() {
        itemManager.addItem(new Item(8, " Vân"));
        itemManager.updateItem(8, "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkmmmmm");
        assertEquals("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkmmmmm", itemManager.getItems().get(0).getName());
    }
    @Test
    public void update06() {
        itemManager.addItem(new Item(1, " Vân"));
        itemManager.updateItem(1, "NguyenVana");
        assertEquals("NguyenVana", itemManager.getItems().get(0).getName());
    }
    @Test
    public void update07() {
        itemManager.addItem(new Item(5, " Vân"));
        itemManager.updateItem(5, "NguyenVanaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        assertEquals("NguyenVanaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", itemManager.getItems().get(0).getName());
    }
    @Test
    public void update08() {

        itemManager.addItem(new Item(5, "Vân"));

        itemManager.updateItem(5, "van22222");
        Assertions.fail("Name khong hop le!");

        Assertions.assertEquals(0, itemManager.getItems().size());

    }
    @Test
    public void update09() {
        itemManager.addItem(new Item(5, " Vân"));
        itemManager.updateItem(5, "M");
        assertEquals("M", itemManager.getItems().get(0).getName());
    }
    @Test
    public void update010() {
        itemManager.addItem(new Item(5, " Vân"));
        itemManager.updateItem(5, "bamuoimotcccccccccccccccccccccc");
        assertEquals("bamuoimotcccccccccccccccccccccc", itemManager.getItems().get(0).getName());
    }







//    ///TEST DELETE


    // Phân vùng 1: id < 1
    @Test
    public void delete01() {

        boolean result = itemManager.deleteItem(0);

        Assertions.assertEquals(0, itemManager.getItems().size());

    }

    // Phân vùng 2: 1 <= id <= 20
    @Test
    public void delete02() {

        itemManager.addItem(new Item(1, "van"));

        boolean result = itemManager.deleteItem(1);
        assertEquals(0, itemManager.getItems().size());
    }

    // Phân vùng 3: id > 20
    @Test
    public void delete03() {

        boolean result = itemManager.deleteItem(21);

        Assertions.assertEquals(0, itemManager.getItems().size());

    }

    // Phân vùng 1: id < 1
    @Test
    public void delete04() {

        boolean result = itemManager.deleteItem(-1);
        Assertions.assertEquals(0, itemManager.getItems().size());
    }

    // Phân vùng 2: 1 <= id <= 20
    @Test
    public void delete05() {

        itemManager.addItem(new Item(5, "oai"));

        boolean result = itemManager.deleteItem(5);
        assertEquals(0, itemManager.getItems().size());
    }

    // Phân vùng 2: 1 <= id <= 20
    @Test
    public void delete06() {

        itemManager.addItem(new Item(20, "Name"));

        boolean result = itemManager.deleteItem(20);

        assertEquals(0, itemManager.getItems().size());    }

    // Phân vùng 3: id > 20
    @Test
    public void delete07() {
        // Arrange
        ItemManager itemManager = new ItemManager();

        // Act
        boolean result = itemManager.deleteItem(100);

        assertEquals(0, itemManager.getItems().size());
    }

    // Phân vùng 1: id < 1
    @Test
    public void delete08() {

        boolean result = itemManager.deleteItem(0);


        assertEquals(0, itemManager.getItems().size());      }

    // Phân vùng 2: 1 <= id <= 20
    @Test
    public void delete09() {

        itemManager.addItem(new Item(10, "Name"));

        boolean result = itemManager.deleteItem(10);
        assertEquals(0, itemManager.getItems().size());
    }



    @Test
    public void delete10() {

        boolean result = itemManager.deleteItem(-20);

        // Assert
        assertEquals(0, itemManager.getItems().size());
    }

}
