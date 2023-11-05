package arrays;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class Array3DPrinter {
    public static void main(String[] args) {
        int[][][] numArray = {{{1, 2, 3, 4, 5}},{{1, 2}},{{2}, {2}}};

        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                for (int k = 0; k < numArray[i][j].length; k++) {
                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = " );
                    System.out.println(numArray[i][j][k]);
                }

            }
        }
    }
}
