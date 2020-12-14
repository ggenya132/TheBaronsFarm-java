//package hbcu.stay.ready.baronsfarm;

//import hbcu.stay.ready.baronsfarm.classes.Edible;
//import hbcu.stay.ready.baronsfarm.classes.Chicken;
//import hbcu.stay.ready.baronsfarm.classes.EdibleEgg;
//import org.junit.Assert;
//import org.junit.Test;

//public class ChickenTest {
//
//    @Test
//    public void yieldTest(){
//        //Given
//        Chicken chicken = new Chicken();
//
//        //When
//        EdibleEgg expected = new EdibleEgg();
//        EdibleEgg actual = chicken.yield();
//        //Then
//        Assert.assertTrue(actual instanceof EdibleEgg);
//    }
//    @Test
//    public void TestHasBeenFertilized(){
//        Chicken chicken = new Chicken();
//        boolean actual = chicken.hasBeenFertilized();
//
//        Assert.assertFalse(actual);
//    }
//    @Test(expected = StackOverflowError.class)
//    public void eatTest(){
//        Chicken chicken = new Chicken();
//        EdibleEgg expected = new EdibleEgg();
//        EdibleEgg actual = chicken.eat();
//
//        Assert.assertTrue(actual instanceof EdibleEgg);
//    }
//    @Test(expected = StackOverflowError.class)
//    public void edibleTest(){
//        Chicken chicken = new Chicken();
//        String expected = "Yummy EdibleEgg!";
//        String actual = chicken.Edible();
//
//        Assert.assertEquals(expected,actual);
//    }
//    @Test(expected = StackOverflowError.class)
//    public void eat2Test(){
//        Edible edible = new Edible();
//        Chicken chicken = new Chicken();
//        String expected = "" + edible.toString();
//        EdibleEgg actual = chicken.eat();
//
//        Assert.assertTrue(actual instanceof EdibleEgg);
//    }
//
//}
