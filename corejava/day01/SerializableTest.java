package com.valtech.training.corejava.day01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;



import org.junit.Test;



import com.valtech.training.corejava.day01.point;
import com.valtech.training.corejava.day0.point3D;



public class SerializableTest {
    
    @Test
    public void test() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream
                (new FileOutputStream(new File("objects.txt")));
        point p = new point(2, 3);
        point p1 = new Point3d(1, 2, 3);
        oos.writeObject(p);
        oos.writeObject(p1);
        oos.flush();
        oos.close();
        ObjectInputStream ois = new ObjectInputStream
                (new FileInputStream(new File("objects.txt")));
        point r = (point)ois.readObject();
        Point3d r1 = (Point3D)ois.readObject();
        assertEquals(p, r);
        assertEquals(p1, r1);
        assertEquals(p.hashCode(), r.hashCode());
        assertFalse(p == r);
}
}

