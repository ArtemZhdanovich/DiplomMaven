package generator;

import generator.lfsr.LFSRGenerator;

public interface Generator {
    double nextDouble();
    int nextBit();
    double[] doubleArray(int count);
    int[] bitArray(int count);
    String getState();

}
