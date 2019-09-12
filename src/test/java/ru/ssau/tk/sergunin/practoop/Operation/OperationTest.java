package ru.ssau.tk.sergunin.practoop.Operation;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OperationTest {
    IdenticalOperation firstOperation=new IdenticalOperation();
    SqrtOperation secondOperation=new SqrtOperation();
    TangentOperation thirdOperation=new TangentOperation();
    double inf = Double.POSITIVE_INFINITY;
    @Test(groups={"unit1"})
    public void testIdenticalOperation(){
        assertEquals(firstOperation.apply(5), 5, 0.0001);
        assertEquals(firstOperation.apply(9), 9, 0.0001);
        assertEquals(firstOperation.applyTriple(5), 5, 0.0001);
    }
    @Test(groups={"unit1"})
    public void testSqrtOperation(){
        assertEquals(secondOperation.apply(5), Math.pow(5,1./2), 0.0001);
        assertEquals(secondOperation.apply(2),Math.pow(2,1./2), 0.0001);
        assertEquals(secondOperation.applyTriple(2), Math.pow(2,1./8), 0.0001);
    }
    @Test(groups={"unit1"})
    public void testTangentOperation(){
        assertEquals(thirdOperation.apply((Math.PI)/2), 1.633123935319537E16, 0.0001);
        assertEquals(thirdOperation.apply(0), 0, 0.0001);
        assertEquals(thirdOperation.applyTriple(3), Math.tan(Math.tan(Math.tan(3))), 0.0001);
    }
}
