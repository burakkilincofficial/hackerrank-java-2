package telenity;

public class Shipping {
    private static final int LARGE_PACKAGE_SIZE = 5;
    private static final int SMALL_PACKAGE_SIZE = 1;

    public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
        int largeA = LARGE_PACKAGE_SIZE * availableLargePackages;
        int smallA = SMALL_PACKAGE_SIZE * availableSmallPackages;
        int remainderAForSmalls = items - largeA;
        if(largeA==0 || smallA==0){
            return -1;
        }
        if((largeA+smallA) < items){
            return -1;
        }


        return availableLargePackages + remainderAForSmalls;


    }

    public static void main(String[] args) {
        System.out.println(minimalNumberOfPackages(16, 2, 10));
    }
}