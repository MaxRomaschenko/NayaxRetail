public class NestedLoopsPrintableImpl implements MaxtrixPrintable{

    public void print(int[][] data) {

        if (data == null){
            System.out.println(data);
            return;
        }

        for (int i = 0; i < data.length; i++) {

            if(data[i] == null){
                System.out.println(data[i]);
                continue;
            }

            if (data[i].length == 0){
                System.out.println("empty");
                continue;
            }

            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t" );
            }

            System.out.println();

        }
    }

}
