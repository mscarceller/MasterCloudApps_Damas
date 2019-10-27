  
package models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.Coordinate;


public class CoordinateTest {

    @Test
    public void givenCoordinateWhenCreateCoordinateThenCorrectCoordenates(){
        int coordX = 2;
        int coordY = 1;
        Coordinate coordinate = new Coordinate(coordX,coordY);
        assertEquals(coordX, coordinate.getCoordX());
        assertEquals(coordY, coordinate.getCoordY());
    }

}