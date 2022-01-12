public class SingleLoopPrintableImpl implements MaxtrixPrintable{

    public void print(int[][] data) {

        if (data == null){
            System.out.println(data);
            return;
        }

        for (int i = 0,j = 0;i < data.length; ){

            if(data[i] == null){
                System.out.println(data[i]);
                i++;
                continue;
            }

            if (data[i].length == 0){
                System.out.println("empty");
                i++;
                continue;
            }

            System.out.print(data[i][j++] + " ");

            if(j == data[i].length){
                System.out.println();
                j = 0;
                i++;
            }
        }

    }
}
