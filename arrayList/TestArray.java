public class TestArray
{
    public static void main(String a[]){
        
        System.out.println("1D Array");
        //1D Array
        int nums[] = new int[3];

        for (int i = 0; i < nums.length; i++){
            nums[i] = (int) (Math.random() * 100);
        }

        for(int n : nums)
        {
            System.out.print(n + " ");
        }

        // space between 1D and 2D
        System.out.println();
        System.out.println();
        System.out.println("2D Array");


        //2D Array
        int nums2D[][] = new int[2][3];

        for(int i = 0; i < nums2D.length;i++)
        {
            for(int j = 0; j < nums2D[i].length; j++)
            {
                nums2D[i][j] = (int) (Math.random() * 100);
            }
        }

        for(int n[] : nums2D)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        // space between 2D Arrays
        System.out.println();
        System.out.println("2D Jagged Array");


        //2D Array (Jagged)
        int nums2DJ[][] = new int[2][];

        nums2DJ[0] = new int[4];
        nums2DJ[1] = new int[6];

        for(int i = 0; i < nums2DJ.length;i++)
        {
            for(int j = 0; j < nums2DJ[i].length; j++)
            {
                nums2DJ[i][j] = (int) (Math.random() * 100);
            }
        }

        // Enhance forloop (using in java its work as a for each loop in another lng) 
        for(int n[] : nums2DJ)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }


        // space between 2D and 3D
        System.out.println();
        System.out.println("3D Array");


        //3D Array
        int nums3D[][][] = new int[3][4][5];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                for(int k = 0; k < 5; k++)
                {
                    nums3D[i][j][k] = (int) (Math.random() * 100);
                }
            }
        }

        for(int n[][] : nums3D)
        {
            for(int m[] : n)
            {
                for(int l : m)
                {
                    System.out.print(l + " ");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println();
        }
    }
}