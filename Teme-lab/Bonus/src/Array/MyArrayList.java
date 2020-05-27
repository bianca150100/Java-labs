package Array;

import javax.swing.plaf.TreeUI;
import java.util.Arrays;

public class MyArrayList {
    private int Nrmax;
    private float[] v;
    private int n;

    public MyArrayList()
    {
        this.Nrmax=0;
        this.n=0;
    }

    public MyArrayList (int k)
    {
        this.Nrmax=k;
        this.v =new float[k];

    }

    public void creeaza_vector(int k)
    {
        if (k>n)
        {
            Nrmax=k;
            v =Arrays.copyOf(v,k);

        }
    }

    public void add(float w)
    {
        if (n<Nrmax)
        {
            v[n++] = w;
        }
        if (n==Nrmax)
        {
            creeaza_vector(n+1);
            v[n++] =w;

        }
    }

    public boolean contains (float vv)
    {
        for (int i=0;i <n;i++)
        {
            if (v[i] ==vv)
                return true;
        }
        return false;
    }

    public float get(int index)
    {
        return v[index];
    }

    public int size()
    {
        return n;
    }

    public void remove(int index)
    {
        for (int i=index;i<n-1;i++)
        {
            v[i]=v[i+1];
        }
        n--;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "Nrmax=" + Nrmax +
                ", v=" + Arrays.toString(v) +
                ", n=" + n +
                '}';
    }

}
