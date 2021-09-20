public class Java15 {
    public static void main(String[] args) {
        //2D array = an array of arrays
        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Silverado";
        cars[0][2] = "Mustang";

        cars[1][0] = "Ranber";
        cars[1][1] = "F-150";
        cars[1][2] = "Ferrari";

        cars[2][0] = "Lamborgin";
        cars[2][1] = "Silverado";
        cars[2][2] = "Tesla";

        for (int i=0; i< cars.length;i++){
            System.out.println();
            for (int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }

        String[][] cars1 =  {{"Camero","Corvette","Silverado"},
                            {"Mustang","Ranger","F-150"},
                            {"Ferrari","Lanborgini","Tesla"}};

        for (int k=0; k< cars.length;k++){
            System.out.println();
            for (int l=0; l<cars[k].length; l++){
                System.out.print(cars[k][l] + " ");
            }
        }


    }
}
