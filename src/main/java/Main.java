public class Main {
    public static void main(String[] args) {
        NestedLoopsPrintableImpl nestedLoopsPrintable = new NestedLoopsPrintableImpl();
        SingleLoopPrintableImpl singleLoopPrintable = new SingleLoopPrintableImpl();

        int[][] data1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] data2 = {
                {1,2,3},
                {4,5,6,7,8},
                {10}
        };

        int[][] data3 = {
                null,
                {},
                {10}
        };

        int[][] data4 = null;

        if(Math.random() < 0.5){

            nestedLoopsPrintable.print(data1);
            System.out.println();

            nestedLoopsPrintable.print(data2);
            System.out.println();

            nestedLoopsPrintable.print(data3);
            System.out.println();

            nestedLoopsPrintable.print(data4);

        }else{

            singleLoopPrintable.print(data1);
            System.out.println();

            singleLoopPrintable.print(data2);
            System.out.println();

            singleLoopPrintable.print(data3);
            System.out.println();

            singleLoopPrintable.print(data4);
        }

    }
}
