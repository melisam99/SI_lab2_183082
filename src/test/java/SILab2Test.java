import junit.framework.TestCase;
import org.hamcrest.core.StringContains;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SILab2Test extends TestCase {

    @Test
    void EveryBranchTest(){
        RuntimeException ex = null;

        //{[20,15,30],[24,0,0],[25,15,30]}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(20,15,30),
                    new Time(24,0,0),
                    new Time(25,15,30)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The hours are grater than the maximum"));

        // {[-5,10,20]}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(-5,10,20)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));

        // {[12,60,0]}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(12,60,0)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The minutes are not valid!"));

        // {[12,33,60]}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(12,33,60)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The seconds are not valid"));

        // {[24,1,1]}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(24,1,1)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));

        // {[20,10,10]}
        List<Integer> result = null;
        try {
            result = SILab2.function(Arrays.asList(
                    new Time(20,10,10)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNull(ex);
        assertNotNull(result);
        assertEquals(result,Arrays.asList(72080));


    }
    @Test
    void MultipleConditionsTest(){
        RuntimeException ex = null;
        //{-5,20,20}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(-5,20,20)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));

        //{25,0,0}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(25,0,0)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));

        //{20,21,22}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(20,21,22)));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNull(ex);

        //{20,-1,20}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(20,-1,20)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The minutes are not valid!"));

        //{20,60,20}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(20,60,20)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The minutes are not valid!"));

        //{20,21,22}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(20,21,22)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNull(ex);

        //{20,30,20}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(20,30,20)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNull(ex);

        //{20,31,61}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(20,31,61)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The seconds are not valid"));

        //{20,21,-1}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(20,21,-1)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The seconds are not valid"));

        //{24,0,0}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(24,0,0)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNull(ex);

        //{24,0,30}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(24,0,30)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));

        //{24,61,0}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(24,61,0)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));

        //{24,-1,-5}
        try {
            List<Integer> result = SILab2.function(Arrays.asList(
                    new Time(24,-1,-5)
            ));
        }catch (RuntimeException e){
            ex=e;
        }
        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));


    }
}